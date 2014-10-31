package DQMIIDim.world;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.*;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.*;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.SpawnerAnimals;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.MapGenScatteredFeature;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import DQMII.DQM;
import DQMII.DqmItemList;
import DQMIIDim.BlockList;
import DQMIIDim.DqmNextDim;
import DQMIIDim.biomes.BiomeRakuen;
import DQMIIDim.gen.MapGenCavesX;
import DQMIIDim.gen.MapGenRavineX;
import DQMIIDim.gen.WorldGenLakesX;
import DQMIIDim.gen.WorldGenMinableX;
import DQMIIDim.genDqm.DqmWorldGenDungeonsN2;

public class ChunkProviderRakuenDim implements IChunkProvider
{
    /** RNG. */
    private Random rand;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen1;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen2;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen3;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen4;

    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen5;

    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen6;
    public NoiseGeneratorOctaves mobSpawnerNoise;

    /** Reference to the World object. */
    private World worldObj;

    /** are map structures going to be generated (e.g. strongholds) */
    private final boolean mapFeaturesEnabled;

    /** Holds the overall noise array used in chunk generation */
    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new MapGenCavesX();

    /** Holds Stronghold Generator */
    //private MapGenStronghold strongholdGenerator = new MapGenStronghold();

    /** Holds Village Generator */
    private MapGenVillage villageGenerator = new MapGenVillage();

    /** Holds Mineshaft Generator */
    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();

    /** Holds ravine generator */
    private MapGenBase ravineGenerator = new MapGenRavineX();

    /** The biomes that are used to generate the chunk */
    private BiomeGenBase[] biomesForGeneration;

    /** A double array that hold terrain noise from noiseGen3 */
    double[] noise3;

    /** A double array that hold terrain noise */
    double[] noise1;

    /** A double array that hold terrain noise from noiseGen2 */
    double[] noise2;

    /** A double array that hold terrain noise from noiseGen5 */
    double[] noise5;

    /** A double array that holds terrain noise from noiseGen6 */
    double[] noise6;

    private int setIdx;
    /**
     * Used to store the 5x5 parabolic field that is used during terrain generation.
     */
    float[] parabolicField;
    int[][] field_73219_j = new int[32][32];

    {
        caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, CAVE);
        //strongholdGenerator = (MapGenStronghold) TerrainGen.getModdedMapGen(strongholdGenerator, STRONGHOLD);
        villageGenerator = (MapGenVillage) TerrainGen.getModdedMapGen(villageGenerator, VILLAGE);
        mineshaftGenerator = (MapGenMineshaft) TerrainGen.getModdedMapGen(mineshaftGenerator, MINESHAFT);
        scatteredFeatureGenerator = (MapGenScatteredFeature) TerrainGen.getModdedMapGen(scatteredFeatureGenerator, SCATTERED_FEATURE);
        ravineGenerator = TerrainGen.getModdedMapGen(ravineGenerator, RAVINE);
    }

    //public ChunkProviderRakuenDim(World par1World, long par2, boolean par4)
    public ChunkProviderRakuenDim(World par1World, long par2, boolean par4, int idx)
    {
        this.worldObj = par1World;
        this.mapFeaturesEnabled = par4;
        this.rand = new Random(par2);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
        NoiseGeneratorOctaves[] noiseGens = {noiseGen1, noiseGen2, noiseGen3, noiseGen4, noiseGen5, noiseGen6, mobSpawnerNoise};
        noiseGens = TerrainGen.getModdedNoiseGenerators(par1World, this.rand, noiseGens);
        this.noiseGen1 = noiseGens[0];
        this.noiseGen2 = noiseGens[1];
        this.noiseGen3 = noiseGens[2];
        this.noiseGen4 = noiseGens[3];
        this.noiseGen5 = noiseGens[4];
        this.noiseGen6 = noiseGens[5];
        this.mobSpawnerNoise = noiseGens[6];
        this.setIdx = idx;
    }

    /**
     * Generates the shape of the terrain for the chunk though its all stone though the water is frozen if the
     * temperature is low enough
     */
    public void generateTerrain(int par1, int par2, byte[] par3ArrayOfByte)
    {
        byte b0 = 4;
        byte b1 = 16;
        byte b2 = 63;
        int k = b0 + 1;
        byte b3 = 17;
        int l = b0 + 1;
        //this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, par1 * 4 - 2, par2 * 4 - 2, k + 5, l + 5);
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, par1 * 4 - 2, par2 * 4 - 2, k + 5, l + 5);

        for(int cnt = 0; cnt < this.biomesForGeneration.length; cnt++)
        {
        	//biomesForGeneration[cnt] = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[DqmNextDim.idxAkuma]);
        	biomesForGeneration[cnt] = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[this.setIdx]);
        }
        this.noiseArray = this.initializeNoiseField(this.noiseArray, par1 * b0, 0, par2 * b0, k, b3, l);

        for (int i1 = 0; i1 < b0; ++i1)
        {
            for (int j1 = 0; j1 < b0; ++j1)
            {
                for (int k1 = 0; k1 < b1; ++k1)
                {
                    double d0 = 0.125D;
                    double d1 = this.noiseArray[((i1 + 0) * l + j1 + 0) * b3 + k1 + 0];
                    double d2 = this.noiseArray[((i1 + 0) * l + j1 + 1) * b3 + k1 + 0];
                    double d3 = this.noiseArray[((i1 + 1) * l + j1 + 0) * b3 + k1 + 0];
                    double d4 = this.noiseArray[((i1 + 1) * l + j1 + 1) * b3 + k1 + 0];
                    double d5 = (this.noiseArray[((i1 + 0) * l + j1 + 0) * b3 + k1 + 1] - d1) * d0;
                    double d6 = (this.noiseArray[((i1 + 0) * l + j1 + 1) * b3 + k1 + 1] - d2) * d0;
                    double d7 = (this.noiseArray[((i1 + 1) * l + j1 + 0) * b3 + k1 + 1] - d3) * d0;
                    double d8 = (this.noiseArray[((i1 + 1) * l + j1 + 1) * b3 + k1 + 1] - d4) * d0;

                    for (int l1 = 0; l1 < 8; ++l1)
                    {
                        double d9 = 0.25D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;

                        for (int i2 = 0; i2 < 4; ++i2)
                        {
                            int j2 = i2 + i1 * 4 << 11 | 0 + j1 * 4 << 7 | k1 * 8 + l1;
                            short short1 = 128;
                            j2 -= short1;
                            double d14 = 0.25D;
                            double d15 = (d11 - d10) * d14;
                            double d16 = d10 - d15;

                            for (int k2 = 0; k2 < 4; ++k2)
                            {
                                if ((d16 += d15) > 0.0D)
                                {
                                    par3ArrayOfByte[j2 += short1] = (byte)BlockList.DqmDimStone.blockID;
                                }
                                else if (k1 * 8 + l1 < b2)
                                {
                                    par3ArrayOfByte[j2 += short1] = (byte)Block.waterStill.blockID;
                                }
                                else
                                {
                                    par3ArrayOfByte[j2 += short1] = 0;
                                }
                            }

                            d10 += d12;
                            d11 += d13;
                        }

                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                    }
                }
            }
        }
    }

    /**
     * Replaces the stone that was placed in with blocks that match the biome
     */
    public void replaceBlocksForBiome(int par1, int par2, byte[] par3ArrayOfByte, BiomeGenBase[] par4ArrayOfBiomeGenBase)
    {
        ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks(this, par1, par2, par3ArrayOfByte, par4ArrayOfBiomeGenBase);
        MinecraftForge.EVENT_BUS.post(event);

        if (event.getResult() == Result.DENY)
        {
            return;
        }

        byte b0 = 63;
        double d0 = 0.03125D;
        this.stoneNoise = this.noiseGen4.generateNoiseOctaves(this.stoneNoise, par1 * 16, par2 * 16, 0, 16, 16, 1, d0 * 2.0D, d0 * 2.0D, d0 * 2.0D);

        for (int k = 0; k < 16; ++k)
        {
            for (int l = 0; l < 16; ++l)
            {
                //BiomeGenBase biomegenbase = par4ArrayOfBiomeGenBase[l + k * 16];
                //BiomeGenBase biomegenbase = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[DqmNextDim.idxAkuma]);
            	BiomeGenBase biomegenbase = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[this.setIdx]);
                float f = biomegenbase.getFloatTemperature();
                int i1 = (int)(this.stoneNoise[k + l * 16] / 3.0D + 3.0D + this.rand.nextDouble() * 0.25D);
                int j1 = -1;
                byte b1 = biomegenbase.topBlock;
                byte b2 = biomegenbase.fillerBlock;

                for (int k1 = 127; k1 >= 0; --k1)
                {
                    int l1 = (l * 16 + k) * 128 + k1;

                    if (k1 <= 0 + this.rand.nextInt(5))
                    {
                        par3ArrayOfByte[l1] = (byte)Block.bedrock.blockID;
                    }
                    else
                    {
                        byte b3 = par3ArrayOfByte[l1];

                        if (b3 == 0)
                        {
                            j1 = -1;
                        }
                        else if (b3 == (byte)BlockList.DqmDimStone.blockID)
                        {
                            if (j1 == -1)
                            {
                                if (i1 <= 0)
                                {
                                    b1 = 0;
                                    b2 = (byte)BlockList.DqmDimStone.blockID;
                                }
                                else if (k1 >= b0 - 4 && k1 <= b0 + 1)
                                {
                                    b1 = biomegenbase.topBlock;
                                    b2 = biomegenbase.fillerBlock;
                                }

                                if (k1 < b0 && b1 == 0)
                                {
                                    if (f < 0.15F)
                                    {
                                        b1 = (byte)Block.ice.blockID;
                                    }
                                    else
                                    {
                                        b1 = (byte)Block.waterStill.blockID;
                                    }
                                }

                                j1 = i1;

                                if (k1 >= b0 - 1)
                                {
                                    par3ArrayOfByte[l1] = b1;
                                }
                                else
                                {
                                    par3ArrayOfByte[l1] = b2;
                                }
                            }
                            else if (j1 > 0)
                            {
                                --j1;
                                par3ArrayOfByte[l1] = b2;

                                if (j1 == 0 && b2 == Block.sand.blockID)
                                {
                                    j1 = this.rand.nextInt(4);
                                    b2 = (byte)Block.sandStone.blockID;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * loads or generates the chunk at the chunk location specified
     */
    public Chunk loadChunk(int par1, int par2)
    {
        return this.provideChunk(par1, par2);
    }

    /**
     * Will return back a chunk, if it doesn't exist and its not a MP client it will generates all the blocks for the
     * specified chunk from the map seed and chunk seed
     */
    public Chunk provideChunk(int par1, int par2)
    {
        this.rand.setSeed((long)par1 * 341873128712L + (long)par2 * 132897987541L);
        byte[] abyte = new byte[32768];
        this.generateTerrain(par1, par2, abyte);
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, par1 * 16, par2 * 16, 16, 16);
        for(int cnt = 0; cnt < this.biomesForGeneration.length; cnt++)
        {
        	//biomesForGeneration[cnt] = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[DqmNextDim.idxAkuma]);
        	biomesForGeneration[cnt] = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[this.setIdx]);
        }
        this.replaceBlocksForBiome(par1, par2, abyte, this.biomesForGeneration);
        //this.caveGenerator.generate(this, this.worldObj, par1, par2, abyte);
        //this.ravineGenerator.generate(this, this.worldObj, par1, par2, abyte);

        if (this.mapFeaturesEnabled)
        {
            this.mineshaftGenerator.generate(this, this.worldObj, par1, par2, abyte);
            this.villageGenerator.generate(this, this.worldObj, par1, par2, abyte);
            //this.strongholdGenerator.generate(this, this.worldObj, par1, par2, abyte);
            this.scatteredFeatureGenerator.generate(this, this.worldObj, par1, par2, abyte);
        }


        this.caveGenerator.generate(this, this.worldObj, par1, par2, abyte);
        this.ravineGenerator.generate(this, this.worldObj, par1, par2, abyte);

        Chunk chunk = new Chunk(this.worldObj, abyte, par1, par2);
        byte[] abyte1 = chunk.getBiomeArray();

        for (int k = 0; k < abyte1.length; ++k)
        {
            //abyte1[k] = (byte)DqmNextDim.cfgDimBiomeID[DqmNextDim.idxAkuma];
        	abyte1[k] = (byte)DqmNextDim.cfgDimBiomeID[this.setIdx];
        }

        chunk.generateSkylightMap();
        return chunk;
    }

    /**
     * generates a subset of the level's terrain data. Takes 7 arguments: the [empty] noise array, the position, and the
     * size.
     */
    private double[] initializeNoiseField(double[] par1ArrayOfDouble, int par2, int par3, int par4, int par5, int par6, int par7)
    {
        ChunkProviderEvent.InitNoiseField event = new ChunkProviderEvent.InitNoiseField(this, par1ArrayOfDouble, par2, par3, par4, par5, par6, par7);
        MinecraftForge.EVENT_BUS.post(event);

        if (event.getResult() == Result.DENY)
        {
            return event.noisefield;
        }

        if (par1ArrayOfDouble == null)
        {
            par1ArrayOfDouble = new double[par5 * par6 * par7];
        }

        if (this.parabolicField == null)
        {
            this.parabolicField = new float[25];

            for (int k1 = -2; k1 <= 2; ++k1)
            {
                for (int l1 = -2; l1 <= 2; ++l1)
                {
                    float f = 10.0F / MathHelper.sqrt_float((float)(k1 * k1 + l1 * l1) + 0.2F);
                    this.parabolicField[k1 + 2 + (l1 + 2) * 5] = f;
                }
            }
        }

        double d0 = 684.412D;
        double d1 = 684.412D;
        this.noise5 = this.noiseGen5.generateNoiseOctaves(this.noise5, par2, par4, par5, par7, 1.121D, 1.121D, 0.5D);
        this.noise6 = this.noiseGen6.generateNoiseOctaves(this.noise6, par2, par4, par5, par7, 200.0D, 200.0D, 0.5D);
        this.noise3 = this.noiseGen3.generateNoiseOctaves(this.noise3, par2, par3, par4, par5, par6, par7, d0 / 80.0D, d1 / 160.0D, d0 / 80.0D);
        this.noise1 = this.noiseGen1.generateNoiseOctaves(this.noise1, par2, par3, par4, par5, par6, par7, d0, d1, d0);
        this.noise2 = this.noiseGen2.generateNoiseOctaves(this.noise2, par2, par3, par4, par5, par6, par7, d0, d1, d0);
        boolean flag = false;
        boolean flag1 = false;
        int i2 = 0;
        int j2 = 0;

        for (int k2 = 0; k2 < par5; ++k2)
        {
            for (int l2 = 0; l2 < par7; ++l2)
            {
                float f1 = 0.0F;
                float f2 = 0.0F;
                float f3 = 0.0F;
                byte b0 = 2;
                //BiomeGenBase biomegenbase = this.biomesForGeneration[k2 + 2 + (l2 + 2) * (par5 + 5)];
                //BiomeGenBase biomegenbase = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[DqmNextDim.idxAkuma]);
                BiomeGenBase biomegenbase = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[this.setIdx]);

                for (int i3 = -b0; i3 <= b0; ++i3)
                {
                    for (int j3 = -b0; j3 <= b0; ++j3)
                    {
                        //BiomeGenBase biomegenbase1 = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[DqmNextDim.idxAkuma]);//this.biomesForGeneration[k2 + i3 + 2 + (l2 + j3 + 2) * (par5 + 5)];
                    	BiomeGenBase biomegenbase1 = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[this.setIdx]);//this.biomesForGeneration[k2 + i3 + 2 + (l2 + j3 + 2) * (par5 + 5)];
                        float f4 = this.parabolicField[i3 + 2 + (j3 + 2) * 5] / (biomegenbase1.minHeight + 2.0F);

                        if (biomegenbase1.minHeight > biomegenbase.minHeight)
                        {
                            f4 /= 2.0F;
                        }

                        f1 += biomegenbase1.maxHeight * f4;
                        f2 += biomegenbase1.minHeight * f4;
                        f3 += f4;
                    }
                }

                f1 /= f3;
                f2 /= f3;
                f1 = f1 * 0.9F + 0.1F;
                f2 = (f2 * 4.0F - 1.0F) / 8.0F;
                double d2 = this.noise6[j2] / 8000.0D;

                if (d2 < 0.0D)
                {
                    d2 = -d2 * 0.3D;
                }

                d2 = d2 * 3.0D - 2.0D;

                if (d2 < 0.0D)
                {
                    d2 /= 2.0D;

                    if (d2 < -1.0D)
                    {
                        d2 = -1.0D;
                    }

                    d2 /= 1.4D;
                    d2 /= 2.0D;
                }
                else
                {
                    if (d2 > 1.0D)
                    {
                        d2 = 1.0D;
                    }

                    d2 /= 8.0D;
                }

                ++j2;

                for (int k3 = 0; k3 < par6; ++k3)
                {
                    double d3 = (double)f2;
                    double d4 = (double)f1;
                    d3 += d2 * 0.2D;
                    d3 = d3 * (double)par6 / 16.0D;
                    double d5 = (double)par6 / 2.0D + d3 * 4.0D;
                    double d6 = 0.0D;
                    double d7 = ((double)k3 - d5) * 12.0D * 128.0D / 128.0D / d4;

                    if (d7 < 0.0D)
                    {
                        d7 *= 4.0D;
                    }

                    double d8 = this.noise1[i2] / 512.0D;
                    double d9 = this.noise2[i2] / 512.0D;
                    double d10 = (this.noise3[i2] / 10.0D + 1.0D) / 2.0D;

                    if (d10 < 0.0D)
                    {
                        d6 = d8;
                    }
                    else if (d10 > 1.0D)
                    {
                        d6 = d9;
                    }
                    else
                    {
                        d6 = d8 + (d9 - d8) * d10;
                    }

                    d6 -= d7;

                    if (k3 > par6 - 4)
                    {
                        double d11 = (double)((float)(k3 - (par6 - 4)) / 3.0F);
                        d6 = d6 * (1.0D - d11) + -10.0D * d11;
                    }

                    par1ArrayOfDouble[i2] = d6;
                    ++i2;
                }
            }
        }

        return par1ArrayOfDouble;
    }

    /**
     * Checks to see if a chunk exists at x, y
     */
    public boolean chunkExists(int par1, int par2)
    {
        return true;
    }

    /**
     * Populates chunk with ores etc etc
     */
    public void populate(IChunkProvider par1IChunkProvider, int par2, int par3)
    {
        BlockSand.fallInstantly = true;
        int k = par2 * 16;
        int l = par3 * 16;
        //BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(k + 16, l + 16);
        //BiomeGenBase biomegenbase = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[DqmNextDim.idxAkuma]);
        BiomeGenBase biomegenbase = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[this.setIdx]);
        this.rand.setSeed(this.worldObj.getSeed());
        long i1 = this.rand.nextLong() / 2L * 2L + 1L;
        long j1 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)par2 * i1 + (long)par3 * j1 ^ this.worldObj.getSeed());
        boolean flag = false;
        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(par1IChunkProvider, worldObj, rand, par2, par3, flag));

        if (this.mapFeaturesEnabled)
        {
            this.mineshaftGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
            flag = this.villageGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
            //this.strongholdGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
            this.scatteredFeatureGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
        }

        int k1;
        int l1;
        int i2;

        if (TerrainGen.populate(par1IChunkProvider, worldObj, rand, par2, par3, flag, LAKE) &&
                !flag && this.rand.nextInt(4) == 0)
        {
            k1 = k + this.rand.nextInt(16) + 8;
            l1 = this.rand.nextInt(128);
            i2 = l + this.rand.nextInt(16) + 8;
            (new WorldGenLakesX(Block.waterStill.blockID)).generate(this.worldObj, this.rand, k1, l1, i2);
        }

        if (TerrainGen.populate(par1IChunkProvider, worldObj, rand, par2, par3, flag, LAVA) &&
                !flag && this.rand.nextInt(8) == 0)
        {
            k1 = k + this.rand.nextInt(16) + 8;
            l1 = this.rand.nextInt(this.rand.nextInt(120) + 8);
            i2 = l + this.rand.nextInt(16) + 8;

            if (l1 < 63 || this.rand.nextInt(10) == 0)
            {
                (new WorldGenLakesX(Block.lavaStill.blockID)).generate(this.worldObj, this.rand, k1, l1, i2);
            }
        }


        boolean var002 = true;// Generate CoalOre
        boolean var003 = true;// Generate IronOre
        boolean var004 = true;// Generate GoldOre
        boolean var005 = true;// Generate Redstone
        boolean var006 = true;// Generate Diamond
        boolean var007 = true;// Generate Lapis
        boolean var008 = true;;// Generate Emerald
        boolean var009 = true;// Generate Dungeon

        boolean var010 = true; //溶岩の鉱石
        boolean var011 = true; //時の水晶石
        boolean var012 = true; //爆弾鉱石
        boolean var013 = true; //光の原石
        boolean var014 = true; //星の砂の塊
        boolean var015 = true; //命の原石
        boolean var016 = true; //鏡の石の鉱石
        boolean var017 = true; //氷の結晶の塊
        boolean var018 = true; //メダルが埋もれた石
        boolean var019 = true; //メタルの原石
        boolean var020 = true; //磨き砂の塊
        boolean var021 = true; //ミスリルの原石
        boolean var022 = true; //月の原石
        boolean var023 = true; //プラチナの原石
        boolean var024 = true; //ルビーの原石
        boolean var025 = true; //太陽の原石
        boolean var026 = true; //鉄の鉱石

        boolean var027 = true; //ネザークォーツ
        boolean var028 = true; //グロウストーン

        int var12;
        int var13;
        int var14;
        int var15;
        WorldGenerator generator;


        boolean doGen = TerrainGen.populate(par1IChunkProvider, worldObj, rand, par2, par3, flag, DUNGEON);

        for (k1 = 0; doGen && k1 < 8; ++k1)
        {
            l1 = k + this.rand.nextInt(16) + 8;
            i2 = this.rand.nextInt(128);
            int j2 = l + this.rand.nextInt(16) + 8;

	            if ((new WorldGenDungeons()).generate(this.worldObj, this.rand, l1, i2, j2))
	            {
	                ;
	            }

        }


        if(var003)
        {
            generator = new WorldGenMinableX(Block.oreIron.blockID, 10);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.IRON);
            if(doGen)
            {
                for(int i = 0; i < 10; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 1 + this.rand.nextInt(120);
                    //l1 = 1 + this.rand.nextInt(16);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var004)
        {
            generator = new WorldGenMinableX(Block.oreGold.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < 3; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 1 + this.rand.nextInt(50);
                    //l1 = 1 + this.rand.nextInt(16);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var005)
        {
            generator = new WorldGenMinableX(Block.oreRedstone.blockID, 8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.REDSTONE);
            if(doGen)
            {
                for(int i = 0; i < 10; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 1 + this.rand.nextInt(20);
                    //l1 = 1 + this.rand.nextInt(16);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var006)
        {
            generator = new WorldGenMinableX(Block.oreDiamond.blockID, 8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.DIAMOND);
            if(doGen)
            {
                for(int i = 0; i < 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 1 + this.rand.nextInt(30);
                    //l1 = 1 + this.rand.nextInt(16);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var007)
        {
            generator = new WorldGenMinableX(Block.oreLapis.blockID, 5);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.LAPIS);
            if(doGen)
            {
                for(int i = 0; i < 3; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 0 + this.rand.nextInt(20);
                    //l1 = 0 + this.rand.nextInt(16);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var008)
        {
            generator = new WorldGenMinableX(Block.oreEmerald.blockID, 2);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.CUSTOM);
            if(doGen)
            {
                for(int i = 0; i < 1; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 0 + this.rand.nextInt(30);
                    //l1 = 0 + this.rand.nextInt(16);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var009)
        {
            for (var12 = 0; var12 < 8; ++var12)
            {
                var13 = k + this.rand.nextInt(16) + 8;
                var14 = this.rand.nextInt(128);
                int var16 = l + this.rand.nextInt(16) + 8;

                if ((new WorldGenDungeons()).generate(this.worldObj, this.rand, var13, var14, var16))
                {
                    ;
                }
            }
        	/*
            doGen = TerrainGen.populate(par1IChunkProvider, worldObj, rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.DUNGEON);
            for (k1 = 0; doGen && k1 < 8; ++k1)
            {
                l1 = k + this.rand.nextInt(16) + 8;
                i2 = 0 + this.rand.nextInt(0);
                int j2 = l + this.rand.nextInt(16) + 8;

                if ((new WorldGenDungeons()).generate(this.worldObj, this.rand, l1, i2, j2))
                {
                    ;
                }
            }
            */
        }

        if(var010)
        {
        	//var15 = rand.nextInt(6);
        	var15 = rand.nextInt(8);
        	//溶岩の鉱石
            generator = new WorldGenMinableX(DqmItemList.OreYougansekinokakera.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 4; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 0 + this.rand.nextInt(72);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var011)
        {
        	var15 = rand.nextInt(4);
        	//時の水晶
            generator = new WorldGenMinableX(DqmItemList.OreTokinosuisyou.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 10 + this.rand.nextInt(50);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var012)
        {
        	var15 = rand.nextInt(4);
        	//爆弾鉱石
            generator = new WorldGenMinableX(DqmItemList.OreBakudanisi.blockID,6);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 2 + this.rand.nextInt(25);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var013)
        {
        	var15 = rand.nextInt(2);
        	//光の原石
            generator = new WorldGenMinableX(DqmItemList.OreHikarinoisi.blockID,4);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 1; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 5 + this.rand.nextInt(15);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var014)
        {
        	var15 = rand.nextInt(3);
        	//星の砂の塊
            generator = new WorldGenMinableX(DqmItemList.OreHosinokakera.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 30 + this.rand.nextInt(16);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var015)
        {
        	var15 = rand.nextInt(3);
        	//命の原石
            generator = new WorldGenMinableX(DqmItemList.OreInotinoisi.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 4 ; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 20 + this.rand.nextInt(40);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var016)
        {
        	var15 = rand.nextInt(3);
        	//鏡の石の鉱石
            generator = new WorldGenMinableX(DqmItemList.OreKagaminoisi.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 15 + this.rand.nextInt(40);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var017)
        {
        	var15 = rand.nextInt(3);
        	//氷の結晶の塊
            generator = new WorldGenMinableX(DqmItemList.OreKoorinokessyou.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 30 + this.rand.nextInt(40);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var018)
        {
        	var15 = rand.nextInt(2);
        	//メダルが埋もれた石
            generator = new WorldGenMinableX(DqmItemList.OreMetaru.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 1; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 5 + this.rand.nextInt(25);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var019)
        {
        	var15 = rand.nextInt(3);
        	//メタルの原石
            generator = new WorldGenMinableX(DqmItemList.OreMetaru.blockID,4);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 5 + this.rand.nextInt(70);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var020)
        {
        	var15 = rand.nextInt(4);
        	//磨き砂の塊
            generator = new WorldGenMinableX(DqmItemList.OreMigakizuna.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 30 + this.rand.nextInt(35);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var021)
        {
        	var15 = rand.nextInt(3);
        	//ミスリル
            generator = new WorldGenMinableX(DqmItemList.OreMisuriru.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 1 + this.rand.nextInt(10);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var022)
        {
        	var15 = rand.nextInt(5);
        	//月の原石
            generator = new WorldGenMinableX(DqmItemList.OreMoon.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 20 + this.rand.nextInt(50);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var023)
        {
        	var15 = rand.nextInt(3);
        	//プラチナの原石
            generator = new WorldGenMinableX(DqmItemList.OrePuratina.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 1; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 10 + this.rand.nextInt(15);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var024)
        {
        	//var15 = rand.nextInt(6);
        	var15 = rand.nextInt(12);
        	//ルビーの原石
            generator = new WorldGenMinableX(DqmItemList.OreRubi.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 15 + this.rand.nextInt(40);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var025)
        {
        	var15 = rand.nextInt(4);
        	//太陽の原石
            generator = new WorldGenMinableX(DqmItemList.OreTaiyounoisi.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 2; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 1 + this.rand.nextInt(30);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var026)
        {
        	var15 = rand.nextInt(4);
        	//鉄の鉱石
            generator = new WorldGenMinableX(DqmItemList.OreTekkouseki.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15 + 4; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 15 + this.rand.nextInt(60);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var027)
        {
        	var15 = rand.nextInt(8);
        	//ネザー水晶
            generator = new WorldGenMinableX(Block.blockNetherQuartz.blockID,8);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 20 + this.rand.nextInt(20);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }

        if(var028)
        {
        	var15 = rand.nextInt(8);
        	//グロウストーン
            generator = new WorldGenMinableX(Block.glowStone.blockID,12);
            doGen = TerrainGen.generateOre(this.worldObj, this.rand, generator, par2, par3, OreGenEvent.GenerateMinable.EventType.GOLD);
            if(doGen)
            {
                for(int i = 0; i < var15; i++)
                {
                    k1 = k + this.rand.nextInt(16);
                    l1 = 30 + this.rand.nextInt(20);
                    i2 = l + this.rand.nextInt(16);
                    generator.generate(this.worldObj, this.rand, k1, l1, i2);
                }
            }
        }



        //TOP************************************************************************************************
        for (k1 = 0; doGen && k1 < DQM.Sponar; ++k1)
        {
            l1 = k + this.rand.nextInt(8) + 16;
            i2 = this.rand.nextInt(50) + 16;
            int var16 = l + this.rand.nextInt(8) + 16;


            if ((new DqmWorldGenDungeonsN2()).generate(this.worldObj, this.rand, l1, i2, var16))
            {
                ;
            }
        }

        //UNDER**********************************************************************************************
        biomegenbase.decorate(this.worldObj, this.rand, k, l);
        SpawnerAnimals.performWorldGenSpawning(this.worldObj, biomegenbase, k + 8, l + 8, 16, 16, this.rand);
        k += 8;
        l += 8;
        doGen = TerrainGen.populate(par1IChunkProvider, worldObj, rand, par2, par3, flag, ICE);

        for (k1 = 0; doGen && k1 < 16; ++k1)
        {
            for (l1 = 0; l1 < 16; ++l1)
            {
                i2 = this.worldObj.getPrecipitationHeight(k + k1, l + l1);

                if (this.worldObj.isBlockFreezable(k1 + k, i2 - 1, l1 + l))
                {
                    this.worldObj.setBlock(k1 + k, i2 - 1, l1 + l, Block.ice.blockID, 0, 2);
                }

                if (this.worldObj.canSnowAt(k1 + k, i2, l1 + l))
                {
                    this.worldObj.setBlock(k1 + k, i2, l1 + l, Block.snow.blockID, 0, 2);
                }
            }
        }





        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(par1IChunkProvider, worldObj, rand, par2, par3, flag));
        BlockSand.fallInstantly = false;
    }

    /**
     * Two modes of operation: if passed true, save all Chunks in one go.  If passed false, save up to two chunks.
     * Return true if all chunks have been saved.
     */
    public boolean saveChunks(boolean par1, IProgressUpdate par2IProgressUpdate)
    {
        return true;
    }

    public void func_104112_b() {}

    /**
     * Unloads chunks that are marked to be unloaded. This is not guaranteed to unload every such chunk.
     */
    public boolean unloadQueuedChunks()
    {
        return false;
    }

    /**
     * Returns if the IChunkProvider supports saving.
     */
    public boolean canSave()
    {
        return true;
    }

    /**
     * Converts the instance data to a readable string.
     */
    public String makeString()
    {
        return "RandomLevelSource";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    public List getPossibleCreatures(EnumCreatureType par1EnumCreatureType, int par2, int par3, int par4)
    {
        BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(par2, par4);
        return biomegenbase == null ? null : (biomegenbase == BiomeGenBase.swampland && par1EnumCreatureType == EnumCreatureType.monster && this.scatteredFeatureGenerator.hasStructureAt(par2, par3, par4) ? this.scatteredFeatureGenerator.getScatteredFeatureSpawnList() : biomegenbase.getSpawnableList(par1EnumCreatureType));
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    public ChunkPosition findClosestStructure(World par1World, String par2Str, int par3, int par4, int par5)
    {
        //return "Stronghold".equals(par2Str) && this.strongholdGenerator != null ? this.strongholdGenerator.getNearestInstance(par1World, par3, par4, par5) : null;
        return null;
    }

    public int getLoadedChunkCount()
    {
        return 0;
    }

    public void recreateStructures(int par1, int par2)
    {
        if (this.mapFeaturesEnabled)
        {
        	//this.caveGenerator.generate(this, this.worldObj, par1, par2, (byte[])null);
            this.mineshaftGenerator.generate(this, this.worldObj, par1, par2, (byte[])null);
            this.villageGenerator.generate(this, this.worldObj, par1, par2, (byte[])null);
            //this.strongholdGenerator.generate(this, this.worldObj, par1, par2, (byte[])null);
            this.scatteredFeatureGenerator.generate(this, this.worldObj, par1, par2, (byte[])null);
        }
    }
}
