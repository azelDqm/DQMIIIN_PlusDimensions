package DQMIIDim.world;
import net.minecraft.block.Block;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import DQMIIDim.DqmNextDim;
import DQMIIDim.biomes.BiomeRakuen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderRakuenDim7 extends WorldProvider
{

	public static final BiomeGenBase biomeRakuen = new BiomeRakuen(DqmNextDim.cfgDimBiomeID[DqmNextDim.idxZonbi]);

    @Override
    public void registerWorldChunkManager()
    {
    	//this.worldChunkMgr = new  WorldChunkManager(this.worldObj);
    	//this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.biomeList[99], 0.5F, 0.0F);
    	this.worldChunkMgr = new WorldChunkManagerHell(this.biomeRakuen, 0.5F, 0.0F);
    	this.dimensionId = DqmNextDim.cfgDimensionID[DqmNextDim.idxZonbi];
    }

    @Override
    public String getDimensionName()
    {
        return "RakuenOfZombi";
    }

    /**
     * Returns a new chunk provider which generates chunks for this world
     */
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderRakuenDim(this.worldObj, this.worldObj.getSeed(), this.worldObj.getWorldInfo().isMapFeaturesEnabled(), DqmNextDim.idxZonbi);
    	//return new ChunkProviderRakuenDim(this.worldObj, this.worldObj.getSeed(), this.worldObj.getWorldInfo().isMapFeaturesEnabled());
    }

    @Override
    /**
     * Will check if the x, z position specified is alright to be set as the map spawn point
     */
    public boolean canCoordinateBeSpawn(int par1, int par2)
    {
        int k = this.worldObj.getFirstUncoveredBlock(par1, par2);
        return k == 0 ? false : Block.blocksList[k].blockMaterial.blocksMovement();
    }


    @Override
    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    public boolean canRespawnHere()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    /**
     * the y level at which clouds are rendered.
     */
    public float getCloudHeight()
    {
        return 128F;
    }

    @Override
    public int getAverageGroundLevel()
    {
        return 64;
    }

    @SideOnly(Side.CLIENT)
    @Override
    /**
     * returns true if this dimension is supposed to display void particles and pull in the far plane based on the
     * user's Y offset.
     */
    public boolean getWorldHasVoidParticles()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Returns a double value representing the Y value relative to the top of the map at which void fog is at its
     * maximum. The default factor of 0.03125 relative to 256, for example, means the void fog will be at its maximum at
     * (256*0.03125), or 8.
     */
    public double getVoidFogYFactor()
    {
        return 0.03125;
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Returns true if the given X,Z coordinate should show environmental fog.
     */
    public boolean doesXZShowFog(int par1, int par2)
    {
        return false;
    }

    /**
     * Sets the providers current dimension ID, used in default getSaveFolder()
     * Added to allow default providers to be registered for multiple dimensions.
     *
     * @param dim Dimension ID
     */
    @Override
    public void setDimension(int dim)
    {
        this.dimensionId = dim;
    }

    /**
     * Returns the sub-folder of the world folder that this WorldProvider saves to.
     * EXA: DIM1, DIM-1
     * @return The sub-folder name to save this world's chunks to.
     */
    public String getSaveFolder()
    {
        return "DIM_RakuenZonbi";
    }

    /**
     * A message to display to the user when they transfer to this dimension.
     *
     * @return The message to be displayed
     */
    @Override
    public String getWelcomeMessage()
    {
        return "";
    }

    /**
     * A Message to display to the user when they transfer out of this dismension.
     *
     * @return The message to be displayed
     */
    @Override
    public String getDepartMessage()
    {
        return "";
    }

    /**
     * The dimensions movement factor. Relative to normal overworld.
     * It is applied to the players position when they transfer dimensions.
     * Exa: Nether movement is 8.0
     * @return The movement factor
     */
    @Override
    public double getMovementFactor()
    {
        return 1;
    }

    @Override
    public double getHorizon()
    {
        return 63;
    }

    @Override
    public boolean canDoLightning(Chunk chunk)
    {
        return true;
    }

    @Override
    public boolean canDoRainSnowIce(Chunk chunk)
    {
        return true;
    }
}

