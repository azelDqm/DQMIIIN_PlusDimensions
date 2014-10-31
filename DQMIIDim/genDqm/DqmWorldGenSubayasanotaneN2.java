package DQMIIDim.genDqm;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmItemList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenSubayasanotaneN2 implements IWorldGenerator
{
    public DqmWorldGenSubayasanotaneN2(boolean b) {	}
    public DqmWorldGenSubayasanotaneN2() {}
    public void setScale(int i, int j, int k) {	}
    public void generate(World par1World, Random rand, int xPos, int yPos, int zPos) {}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int x = par1 * 16 + rand.nextInt(16);
        int z = par2 * 16 + rand.nextInt(16);
        int y = par3World.getHeightValue(x, z);
        int ran = rand.nextInt(100);

        if (ran >= 80 && WorldGenFunctions.canGenerate(rand, par3World, x, y, z, 1))
        {
            par3World.setBlock(x, y, z, DqmItemList.SubayasaSeed.blockID, rand.nextInt(4), 2);
        }
    }
}
