package DQMIIDim.genDqm;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmItemList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenSword2MobN2 implements IWorldGenerator
{
    public DqmWorldGenSword2MobN2(boolean b) {	}
    public DqmWorldGenSword2MobN2() {}
    public void setScale(int i, int j, int k) {	}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int xxx = par1 * 16 + rand.nextInt(16);
        int zzz = par2 * 16 + rand.nextInt(16);
        int yyy = par3World.getHeightValue(xxx, zzz);
        int ran1 = rand.nextInt(10000);

        if (ran1 >= 9998 && WorldGenFunctions.canGenerate(rand, par3World, xxx, yyy, zzz, 1))
        {
            //土
            /*		      	for (int x = -3; x <= 3; ++x)
            		    	{
            		        	for (int z = -3; z <= 3; ++z)
            		        	{
            		        		for (int y = -1; y <= -1; ++y)
            		        		{
            		            		par3World.setBlock(xxx+x, yyy+y, zzz+z, Block.grass.blockID, 0, 2);
            		        		}
            		        	}
            		    	}
            		      	for (int x = -4; x <= 4; ++x)
            		    	{
            		        	for (int z = -4; z <= 4; ++z)
            		        	{
            		        		for (int y = -2; y <= -2; ++y)
            		        		{
            		            		par3World.setBlock(xxx+x, yyy+y, zzz+z, Block.grass.blockID, 0, 2);
            		        		}
            		        	}
            		    	}
            		      	for (int x = -5; x <= 5; ++x)
            		    	{
            		        	for (int z = -5; z <= 5; ++z)
            		        	{
            		        		for (int y = -3; y <= -3; ++y)
            		        		{
            		            		par3World.setBlock(xxx+x, yyy+y, zzz+z, Block.grass.blockID, 0, 2);
            		        		}
            		        	}
            		    	}
            */
            for (int x = -2; x <= 2; ++x)
            {
                for (int z = -2; z <= 2; ++z)
                {
                    for (int y = 0; y <= 4; ++y)
                    {
                        par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                    }
                }
            }

            for (int x = -1; x <= 1; ++x)
            {
                for (int z = -1; z <= 1; ++z)
                {
                    par3World.setBlock(xxx + x, yyy, zzz + z, Block.waterStill.blockID, 0, 2);
                }
            }

            for (int x = -2; x <= 2; ++x)
            {
                par3World.setBlock(xxx + x, yyy, zzz + 2, Block.stairsNetherQuartz.blockID, 3, 2);
            }

            for (int x = -2; x <= 2; ++x)
            {
                par3World.setBlock(xxx + x, yyy, zzz - 2, Block.stairsNetherQuartz.blockID, 2, 2);
            }

            for (int z = -2; z <= 2; ++z)
            {
                par3World.setBlock(xxx + 2, yyy, zzz + z, Block.stairsNetherQuartz.blockID, 1, 2);
            }

            for (int z = -2; z <= 2; ++z)
            {
                par3World.setBlock(xxx - 2, yyy, zzz + z, Block.stairsNetherQuartz.blockID, 0, 2);
            }

            par3World.setBlock(xxx, yyy, zzz, DqmItemList.DaizaQ.blockID, 0, 2);
            par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.Sword2Mob.blockID, 0, 2);
        }
    }
}
