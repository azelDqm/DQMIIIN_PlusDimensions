package DQMIIDim.genDqm2;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import DQMII.DqmItemList;
import DQMIIDim.BlockList;

public class DqmGenGateHouse //implements IWorldGenerator
{
    public DqmGenGateHouse(boolean b) {	}
    public DqmGenGateHouse() {}
    //public void setScale(int i, int j, int k) {	}

    public void generate(int par1, int par4, int par2, World par3World, int idx)
    {
    	//System.out.println("ファイル名3" + par3World.getWorldInfo().getDimension() + "/" + par1 + "/" + par4 + "/" + par2 + "(" + idx + ")");
        int xxx = par1;
        int zzz = par2;
        //int yyy = par3World.getHeightValue(xxx, zzz);
        int yyy = par4;
        int y = 0;
        //int ran1 = rand.nextInt(10000);
        //int ran2 = rand.nextInt(100);
        //int door = rand.nextInt(100);


        for(y = 0; y <= 10; y++)
        {
	        for(int x = -7; x <= 8; x++  )
	        {
		        for(int z = -7; z <= 8; z++  )
		        {
		        	par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
		        }
	        }
        }


        y = 0;
        for(int x = -5; x <= 6; x++  )
        {
            for (int z = -5; z <= 6; ++z)
            {
                par3World.setBlock(xxx + x, yyy + y, zzz + z, Block.blockNetherQuartz.blockID, 0, 2);
            }
        }

        for(int x = -6; x <= 7; x++  )
        {
                par3World.setBlock(xxx + x, yyy + y, zzz - 6, Block.stairsNetherQuartz.blockID, 2, 2);
                par3World.setBlock(xxx + x, yyy + y, zzz + 7, Block.stairsNetherQuartz.blockID, 3, 2);
        }

        for(int z = -6; z <= 7; z++  )
        {
                par3World.setBlock(xxx - 6, yyy + y, zzz + z, Block.stairsNetherQuartz.blockID, 0, 2);
                par3World.setBlock(xxx + 7, yyy + y, zzz + z, Block.stairsNetherQuartz.blockID, 1, 2);
        }

        y = 1;
        for(int x = -4; x <= 5; x++  )
        {
            for (int z = -4; z <= 5; ++z)
            {
                par3World.setBlock(xxx + x, yyy + y, zzz + z, Block.blockNetherQuartz.blockID, 0, 2);
            }
        }

        for(int x = -5; x <= 6; x++  )
        {
                par3World.setBlock(xxx + x, yyy + y, zzz - 5, Block.stoneSingleSlab.blockID, 7, 2);
                par3World.setBlock(xxx + x, yyy + y, zzz + 6, Block.stoneSingleSlab.blockID, 7, 2);
        }

        for(int z = -5; z <= 6; z++  )
        {
                par3World.setBlock(xxx - 5, yyy + y, zzz + z, Block.stoneSingleSlab.blockID, 7, 2);
                par3World.setBlock(xxx + 6, yyy + y, zzz + z, Block.stoneSingleSlab.blockID, 7, 2);
        }

        for(y = 2; y <= 5; y++)
        {
        	for(int x = -4; x <= 5; x++)
        	{
        		if(x == -4 || x == -1 ||x == 2 || x == -5)
        		{
        			if(y == 2)
        			{
        				par3World.setBlock(xxx + x, yyy + y, zzz - 4, DqmItemList.HasiraQ.blockID, 0, 2);
        				par3World.setBlock(xxx + x, yyy + y, zzz + 5, DqmItemList.HasiraQ.blockID, 0, 2);
        			}else if(y == 5)
        			{
        				par3World.setBlock(xxx + x, yyy + y, zzz - 4, DqmItemList.HasiraueQ.blockID, 0, 2);
        				par3World.setBlock(xxx + x, yyy + y, zzz + 5, DqmItemList.HasiraueQ.blockID, 0, 2);
        			}else
        			{
        				par3World.setBlock(xxx + x, yyy + y, zzz - 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
        				par3World.setBlock(xxx + x, yyy + y, zzz + 5, DqmItemList.HasiranakaQ.blockID, 0, 2);
        			}
        		}else if(x != 0 && x != 1)
        		{
                    par3World.setBlock(xxx + x, yyy + y, zzz - 4, Block.blockNetherQuartz.blockID, 1, 2);
                    par3World.setBlock(xxx + x, yyy + y, zzz + 5, Block.blockNetherQuartz.blockID, 1, 2);
        		}
        	}

        	for(int z = -4; z <= 5; z++)
        	{
        		if(z == -4 || z == -1 ||z == 2 || z == 5)
        		{
        			if(y == 2)
        			{
        				par3World.setBlock(xxx - 4, yyy + y, zzz + z, DqmItemList.HasiraQ.blockID, 0, 2);
        				par3World.setBlock(xxx + 5, yyy + y, zzz + z, DqmItemList.HasiraQ.blockID, 0, 2);
        			}else if(y == 5)
        			{
        				par3World.setBlock(xxx - 4, yyy + y, zzz + z, DqmItemList.HasiraueQ.blockID, 0, 2);
        				par3World.setBlock(xxx + 5, yyy + y, zzz + z, DqmItemList.HasiraueQ.blockID, 0, 2);
        			}else
        			{
        				par3World.setBlock(xxx - 4, yyy + y, zzz + z, DqmItemList.HasiranakaQ.blockID, 0, 2);
        				par3World.setBlock(xxx + 5, yyy + y, zzz + z, DqmItemList.HasiranakaQ.blockID, 0, 2);
        			}
        		}else if(z != 0 && z != 1)
        		{
                    par3World.setBlock(xxx - 4, yyy + y, zzz + z, Block.blockNetherQuartz.blockID, 1, 2);
                    par3World.setBlock(xxx + 5, yyy + y, zzz + z, Block.blockNetherQuartz.blockID, 1, 2);
        		}
        	}
        }

        y = 6;
        for(int x = -4; x <= 5; x++  )
        {
            for (int z = -4; z <= 5; ++z)
            {
                par3World.setBlock(xxx + x, yyy + y, zzz + z, Block.blockNetherQuartz.blockID, 0, 2);
            }
        }

        for(int x = -5; x <= 6; x++  )
        {
                par3World.setBlock(xxx + x, yyy + y, zzz - 5, Block.stairsNetherQuartz.blockID, 6, 2);
                par3World.setBlock(xxx + x, yyy + y, zzz + 6, Block.stairsNetherQuartz.blockID, 7, 2);
        }

        for(int z = -5; z <= 6; z++  )
        {
                par3World.setBlock(xxx - 5, yyy + y, zzz + z, Block.stairsNetherQuartz.blockID, 4, 2);
                par3World.setBlock(xxx + 6, yyy + y, zzz + z, Block.stairsNetherQuartz.blockID, 5, 2);
        }

        y = 7;
        for(int x = -6; x <= 7; x++  )
        {
            for (int z = -6; z <= 7; ++z)
            {
            	if(((x ==0 || x ==1) && (z <= 4 && z >= -3)) ||
            	   ((z ==0 || z ==1) && (x <= 4 && x >= -3)))
            	{
            		par3World.setBlock(xxx + x, yyy + y, zzz + z, Block.blockNetherQuartz.blockID, 0, 2);
            	}else
            	{
            		par3World.setBlock(xxx + x, yyy + y, zzz + z, Block.stoneSingleSlab.blockID, 7, 2);
            	}
            }
        }

        par3World.setBlock(xxx - 4 , yyy + y, zzz - 5 , Block.stairsNetherQuartz.blockID, 2, 2);
        par3World.setBlock(xxx + 5 , yyy + y, zzz - 5 , Block.stairsNetherQuartz.blockID, 2, 2);
        par3World.setBlock(xxx - 4 , yyy + y, zzz - 4 , Block.blockNetherQuartz.blockID, 0, 2);
        par3World.setBlock(xxx + 5 , yyy + y, zzz - 4 , Block.blockNetherQuartz.blockID, 0, 2);
        par3World.setBlock(xxx - 4 , yyy + y, zzz - 3 , Block.stairsNetherQuartz.blockID, 3, 2);
        par3World.setBlock(xxx + 5 , yyy + y, zzz - 3 , Block.stairsNetherQuartz.blockID, 3, 2);

        par3World.setBlock(xxx - 4 , yyy + y, zzz + 4 , Block.stairsNetherQuartz.blockID, 2, 2);
        par3World.setBlock(xxx + 5 , yyy + y, zzz + 4 , Block.stairsNetherQuartz.blockID, 2, 2);
        par3World.setBlock(xxx - 4 , yyy + y, zzz + 5 , Block.blockNetherQuartz.blockID, 0, 2);
        par3World.setBlock(xxx + 5 , yyy + y, zzz + 5 , Block.blockNetherQuartz.blockID, 0, 2);
        par3World.setBlock(xxx - 4 , yyy + y, zzz + 6 , Block.stairsNetherQuartz.blockID, 3, 2);
        par3World.setBlock(xxx + 5 , yyy + y, zzz + 6 , Block.stairsNetherQuartz.blockID, 3, 2);


        par3World.setBlock(xxx - 5 , yyy + y, zzz - 4 , Block.stairsNetherQuartz.blockID, 0, 2);
        par3World.setBlock(xxx - 5 , yyy + y, zzz + 5 , Block.stairsNetherQuartz.blockID, 0, 2);
        par3World.setBlock(xxx - 3 , yyy + y, zzz - 4 , Block.stairsNetherQuartz.blockID, 1, 2);
        par3World.setBlock(xxx - 3 , yyy + y, zzz + 5 , Block.stairsNetherQuartz.blockID, 1, 2);

        par3World.setBlock(xxx + 4 , yyy + y, zzz - 4 , Block.stairsNetherQuartz.blockID, 0, 2);
        par3World.setBlock(xxx + 4 , yyy + y, zzz + 5 , Block.stairsNetherQuartz.blockID, 0, 2);
        par3World.setBlock(xxx + 6 , yyy + y, zzz - 4 , Block.stairsNetherQuartz.blockID, 1, 2);
        par3World.setBlock(xxx + 6 , yyy + y, zzz + 5 , Block.stairsNetherQuartz.blockID, 1, 2);

        for(int x = -1; x <= 2; x++)
        {
        	par3World.setBlock(xxx + x , yyy + y, zzz - 4 , Block.stairsNetherQuartz.blockID, 2, 2);
        	par3World.setBlock(xxx + x , yyy + y, zzz + 5 , Block.stairsNetherQuartz.blockID, 3, 2);
        }
        for(int z = -1; z <= 2; z++)
        {
        	par3World.setBlock(xxx - 4, yyy + y, zzz + z , Block.stairsNetherQuartz.blockID, 0, 2);
        	par3World.setBlock(xxx + 5 , yyy + y, zzz + z , Block.stairsNetherQuartz.blockID, 1, 2);
        }

        for( int x = -3; x <= 4; x++)
        {
        	if(x < -1 || x > 2)
        	{
            	par3World.setBlock(xxx + x , yyy + y, zzz - 1 , Block.stairsNetherQuartz.blockID, 2, 2);
            	par3World.setBlock(xxx + x , yyy + y, zzz + 2 , Block.stairsNetherQuartz.blockID, 3, 2);
        	}else
        	{
            	par3World.setBlock(xxx + x , yyy + y, zzz - 1 , Block.blockNetherQuartz.blockID, 0, 2);
            	par3World.setBlock(xxx + x , yyy + y, zzz + 2 , Block.blockNetherQuartz.blockID, 0, 2);
        	}
        }

        for( int z = -3; z <= 4; z++)
        {
        	if(z < -1 || z > 2)
        	{
            	par3World.setBlock(xxx - 1 , yyy + y, zzz + z , Block.stairsNetherQuartz.blockID, 0, 2);
            	par3World.setBlock(xxx + 2 , yyy + y, zzz + z , Block.stairsNetherQuartz.blockID, 1, 2);
        	}else
        	{
            	par3World.setBlock(xxx - 1 , yyy + y, zzz + z , Block.blockNetherQuartz.blockID, 0, 2);
            	par3World.setBlock(xxx + 2 , yyy + y, zzz + z , Block.blockNetherQuartz.blockID, 0, 2);
        	}
        }

        y = 8;
        par3World.setBlock(xxx - 4, yyy + y, zzz - 4, Block.stoneSingleSlab.blockID, 7, 2);
        par3World.setBlock(xxx + 5, yyy + y, zzz + 5, Block.stoneSingleSlab.blockID, 7, 2);
        par3World.setBlock(xxx + 5, yyy + y, zzz - 4, Block.stoneSingleSlab.blockID, 7, 2);
        par3World.setBlock(xxx - 4, yyy + y, zzz + 5, Block.stoneSingleSlab.blockID, 7, 2);

        for(int x = -3; x <= 4; x++)
        {
        	for(int z = -3; z <= 4; z++)
        	{
        		if(x >= 0 && 1 >= x && z >= 0 && 1 >= z)
        		{
        			par3World.setBlock(xxx + x , yyy + y, zzz + z , Block.blockNetherQuartz.blockID, 0, 2);
        		}else if (((x < -1 || x > 2) && (z == 0 || z == 1)) ||
        				  ((z < -1 || z > 2) && (x == 0 || x == 1)))
        		{
        			par3World.setBlock(xxx + x, yyy + y, zzz + z, Block.stoneSingleSlab.blockID, 7, 2);
        		}
        	}
        }

        for(int x = -1; x <= 2; x++)
        {
        	par3World.setBlock(xxx + x , yyy + y, zzz - 1 , Block.stairsNetherQuartz.blockID, 2, 2);
        	par3World.setBlock(xxx + x , yyy + y, zzz + 2 , Block.stairsNetherQuartz.blockID, 3, 2);
        }

        for(int z = 0; z <= 1; z++)
        {
        	par3World.setBlock(xxx - 1 , yyy + y, zzz + z , Block.stairsNetherQuartz.blockID, 0, 2);
        	par3World.setBlock(xxx + 2 , yyy + y, zzz + z , Block.stairsNetherQuartz.blockID, 1, 2);
        }

        y = 9;
        par3World.setBlock(xxx + 0, yyy + y, zzz + 0, Block.stoneSingleSlab.blockID, 7, 2);
        par3World.setBlock(xxx + 0, yyy + y, zzz + 1, Block.stoneSingleSlab.blockID, 7, 2);
        par3World.setBlock(xxx + 1, yyy + y, zzz + 0, Block.stoneSingleSlab.blockID, 7, 2);
        par3World.setBlock(xxx + 1, yyy + y, zzz + 1, Block.stoneSingleSlab.blockID, 7, 2);


        y= 1;
        par3World.setBlock(xxx - 1, yyy + y, zzz + 0, BlockList.DqmDimBlocks_dirt[idx].blockID, 0, 2);
        par3World.setBlock(xxx - 1, yyy + y, zzz + 1, BlockList.DqmDimBlocks_dirt[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 0, yyy + y, zzz - 1, BlockList.DqmDimBlocks_dirt[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 0, yyy + y, zzz + 2, BlockList.DqmDimBlocks_dirt[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 1, yyy + y, zzz - 1, BlockList.DqmDimBlocks_dirt[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 1, yyy + y, zzz + 2, BlockList.DqmDimBlocks_dirt[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 2, yyy + y, zzz + 0, BlockList.DqmDimBlocks_dirt[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 2, yyy + y, zzz + 1, BlockList.DqmDimBlocks_dirt[idx].blockID, 0, 2);

        par3World.setBlock(xxx + 0, yyy + y, zzz + 0, BlockList.DqmDimGate[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 0, yyy + y, zzz + 1, BlockList.DqmDimGate[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 1, yyy + y, zzz + 0, BlockList.DqmDimGate[idx].blockID, 0, 2);
        par3World.setBlock(xxx + 1, yyy + y, zzz + 1, BlockList.DqmDimGate[idx].blockID, 0, 2);

        y= 2;
        par3World.setBlock(xxx + 3, yyy + y, zzz + 3, DqmItemList.Kagaribidai.blockID, 0, 2);
        par3World.setBlock(xxx + 3, yyy + y, zzz - 2, DqmItemList.Kagaribidai.blockID, 0, 2);
        par3World.setBlock(xxx - 2, yyy + y, zzz + 3, DqmItemList.Kagaribidai.blockID, 0, 2);
        par3World.setBlock(xxx - 2, yyy + y, zzz - 2, DqmItemList.Kagaribidai.blockID, 0, 2);

        y= 3;
        par3World.setBlock(xxx + 3, yyy + y, zzz + 3, Block.fire.blockID);
        par3World.setBlock(xxx + 3, yyy + y, zzz - 2, Block.fire.blockID);
        par3World.setBlock(xxx - 2, yyy + y, zzz + 3, Block.fire.blockID);
        par3World.setBlock(xxx - 2, yyy + y, zzz - 2, Block.fire.blockID);
        /*
        for (int x = -3; x <= 3; ++x)
        {
            for (int z = -5; z <= 5; ++z)
            {
                for (int y = 0; y <= 4; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                }
            }
        }

        for (int x = -1; x <= 1; ++x)
        {
            for (int z = -4; z <= 4; ++z)
            {
                for (int y = +1; y <= 3; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y, zzz + z, DqmItemList.Kowarenai1.blockID, 0, 2);
                }
            }
        }

        for (int z = -4; z <= 3; ++z)
        {
            for (int y = +1; y <= 2; ++y)
            {
                par3World.setBlock(xxx, yyy + y, zzz + z, 0, 0, 2);
            }
        }

            for (int x = -2; x <= 2; ++x)
            {
                for (int z = -4; z <= 4; ++z)
                {
                    par3World.setBlock(xxx + x, yyy, zzz + z, DqmItemList.Kowarenai1.blockID, 0, 2);
                }
            }

            for (int z = -3; z <= 1; ++z)
            {
                par3World.setBlock(xxx, yyy, zzz + z, DqmItemList.ToramanaYuka.blockID, 0, 2);
            }

            for (int x = -2; x <= 2; ++x)
            {
                for (int z = -4; z <= 4; ++z)
                {
                    par3World.setBlock(xxx + x, yyy + 4, zzz + z, DqmItemList.Kowarenai1.blockID, 0, 2);
                }
            }

            for (int z = -4; z <= 4; ++z)
            {
                par3World.setBlock(xxx + 3, yyy, zzz + z, Block.stairsStoneBrick.blockID, 1, 2);
                par3World.setBlock(xxx - 3, yyy, zzz + z, Block.stairsStoneBrick.blockID, 0, 2);
            }

            for (int z = -4; z <= 4; ++z)
            {
                par3World.setBlock(xxx + 3, yyy + 4, zzz + z, Block.stairsStoneBrick.blockID, 5, 2);
                par3World.setBlock(xxx - 3, yyy + 4, zzz + z, Block.stairsStoneBrick.blockID, 4, 2);
            }

            for (int x = -3; x <= 3; ++x)
            {
                par3World.setBlock(xxx + x, yyy, zzz + 5, Block.stairsStoneBrick.blockID, 3, 2);
                par3World.setBlock(xxx + x, yyy, zzz - 5, Block.stairsStoneBrick.blockID, 2, 2);
            }

            for (int x = -3; x <= 3; ++x)
            {
                par3World.setBlock(xxx + x, yyy + 4, zzz + 5, Block.stairsStoneBrick.blockID, 7, 2);
                par3World.setBlock(xxx + x, yyy + 4, zzz - 5, Block.stairsStoneBrick.blockID, 6, 2);
            }

            par3World.setBlock(xxx + 2, yyy + 1, zzz, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 1, zzz + 4, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 1, zzz - 4, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 1, zzz, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 1, zzz + 4, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 1, zzz - 4, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz + 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz - 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz + 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz - 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 3, zzz, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 3, zzz + 4, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 3, zzz - 4, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 3, zzz, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 3, zzz + 4, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 3, zzz - 4, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz + 2, DqmItemList.Taimatu.blockID, 1, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz - 2, DqmItemList.Taimatu.blockID, 1, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz + 2, DqmItemList.Taimatu.blockID, 3, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz - 2, DqmItemList.Taimatu.blockID, 3, 2);
            par3World.setBlock(xxx + 1, yyy + 2, zzz + 5, DqmItemList.Taimatu.blockID, 2, 2);
            par3World.setBlock(xxx - 1, yyy + 2, zzz + 5, DqmItemList.Taimatu.blockID, 2, 2);
            par3World.setBlock(xxx + 1, yyy + 2, zzz - 5, DqmItemList.Taimatu.blockID, 0, 2);
            par3World.setBlock(xxx - 1, yyy + 2, zzz - 5, DqmItemList.Taimatu.blockID, 0, 2);
*/

        }

}
