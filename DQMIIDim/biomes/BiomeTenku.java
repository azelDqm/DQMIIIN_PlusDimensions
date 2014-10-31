package DQMIIDim.biomes;

import net.minecraft.client.Minecraft;
import net.minecraft.world.biome.BiomeGenBase;
import DQMIIDim.BlockList;
import DQMIIDim.gen.WorldGenTreesX;

public class BiomeTenku extends BiomeGenBase
{
	public static String strCode;
	private static Minecraft minecraft;
	private static int debugCode;

	private String BiomeName;
	private byte topBlockID;
	private byte fillerBlockID;
	private int biomeIdx;

    public BiomeTenku(int par1)
    {

    	super(par1);


		BiomeName = "TENKU";
		topBlockID = (byte) (BlockList.DqmDimCloud.blockID);
		fillerBlockID = (byte) (BlockList.DqmDimCloud.blockID);


        this.setBiomeName(BiomeName);
        this.topBlock = (byte)topBlockID;
        this.fillerBlock = (byte)fillerBlockID;
        this.setMinMaxHeight(0.2F, 0.4F);
        this.setTemperatureRainfall(0.7F, 0.8F);
        this.setColor(2250011);
		this.waterColorMultiplier = 0x88FF88;

        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();

        this.spawnableMonsterList.clear();


        this.worldGeneratorTrees = new WorldGenTreesX(true);
        //this.worldGeneratorBigTree = new WorldGenBigTreeX(true);
        //this.worldGeneratorSwamp = new WorldGenSwampX();
        //this.worldGeneratorForest = new WorldGenForestX(true);
        this.worldGeneratorTrees = new WorldGenTreesX(true, this.topBlockID, this.fillerBlockID);

        //this.theBiomeDecorator.reedGen = new WorldGenReed();
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.generateLakes = true;

        this.theBiomeDecorator.grassPerChunk = 0;
        this.theBiomeDecorator.flowersPerChunk = 0;

    }
}
