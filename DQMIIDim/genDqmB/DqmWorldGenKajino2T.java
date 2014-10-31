package DQMIIDim.genDqmB;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmEventKajino;
import DQMII.DqmEventKajinoKou;
import DQMII.DqmEventKajinoTei;
import DQMII.DqmItemList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenKajino2T implements IWorldGenerator
{
	private int Hougaku = 0;
	private int yMain = 0;

    public DqmWorldGenKajino2T(boolean b) {	}
    public DqmWorldGenKajino2T() {}
    public DqmWorldGenKajino2T(int face, int par2)
    {
    	this.Hougaku = face;
    	this.yMain = par2;
    }

    public void setScale(int i, int j, int k) {	}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int xxx = par1;
        int zzz = par2;
        int yyy = yMain;
        //int ran1 = rand.nextInt(100000);
        //int ran2 = rand.nextInt(100);
        //int xxxl = xxx;
        //int zzzl = zzz;
        //int yyyl = yyy;
        switch(this.Hougaku)
        {
        	case 1: xxx = xxx - 11; break;
        	case 2: zzz = zzz - 11; break;
        	case 3: xxx = xxx + 11; break;
        	case 0: zzz = zzz + 11; break;
        }



        for (int x = -10; x <= 10; ++x)
        {
            for (int z = -10; z <= 10; ++z)
            {
                for (int y = 0; y <= 10; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                }
            }
        }

        int byVal = 1;
        int metaV1 = 2;
        int metaV2 = 0;

        //壁
        if(this.Hougaku == 0 || this.Hougaku == 2)
        {
        	//System.out.println("方角:" + this.Hougaku);

        	if(this.Hougaku == 0)
        	{
        		byVal = 1;
        		metaV1 = 2;
        		metaV2 = 0;
        	}else
        	{
        		byVal = -1;
        		metaV1 = 3;
        		metaV2 = -1;
        	}

	        for (int x = -10; x <= 10; ++x)
	        {
	            for (int z = -10; z <= 10; ++z)
	            {
	                for (int y = 0; y <= 9; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), DqmItemList.EmeraldB.blockID, 0, 2);
	                }
	            }
	        }

	        //
	        for (int x = -10; x <= 10; ++x)
	        {
	            for (int z = -10; z <= 10; ++z)
	            {
	                for (int y = 8; y <= 8; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), DqmItemList.Kajino3B.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -9; x <= 9; ++x)
	        {
	            for (int z = -9; z <= 9; ++z)
	            {
	                for (int y = 8; y <= 8; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -10; x <= 10; ++x)
	        {
	            for (int z = -10; z <= 10; ++z)
	            {
	                for (int y = 6; y <= 6; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), DqmItemList.Kajino3B.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -9; x <= 9; ++x)
	        {
	            for (int z = -9; z <= 9; ++z)
	            {
	                for (int y = 6; y <= 6; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -10; x <= 10; ++x)
	        {
	            for (int z = -10; z <= 10; ++z)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), DqmItemList.Kajino3B.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -9; x <= 9; ++x)
	        {
	            for (int z = -9; z <= 9; ++z)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -10; x <= 10; ++x)
	        {
	            for (int z = -10; z <= 10; ++z)
	            {
	                for (int y = 2; y <= 2; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), DqmItemList.Kajino3B.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -9; x <= 9; ++x)
	        {
	            for (int z = -9; z <= 9; ++z)
	            {
	                for (int y = 2; y <= 2; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -10; x <= 10; ++x)
	        {
	            for (int z = -10; z <= 10; ++z)
	            {
	                for (int y = 0; y <= 0; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), DqmItemList.Kajino3B.blockID, 0, 2);
	                }
	            }
	        }

	        //
	        for (int x = -9; x <= 9; ++x)
	        {
	            for (int z = -9; z <= 9; ++z)
	            {
	                for (int y = 1; y <= 8; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -9; x <= 5; ++x)
	        {
	            for (int z = 6; z <= 6; ++z)
	            {
	                for (int y = 1; y <= 1; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), DqmItemList.EmeraldB.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = 5; x <= 5; ++x)
	        {
	            for (int z = 6; z <= 9; ++z)
	            {
	                for (int y = 1; y <= 1; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y, zzz + (z * byVal), DqmItemList.EmeraldB.blockID, 0, 2);
	                }
	            }
	        }

	        par3World.setBlock(xxx - 8, yyy + 1, zzz + (5 * byVal), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx - 6, yyy + 1, zzz + (5 * byVal), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx - 4, yyy + 1, zzz + (5 * byVal), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx - 2, yyy + 1, zzz + (5 * byVal), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx + 0, yyy + 1, zzz + (5 * byVal), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx + 2, yyy + 1, zzz + (5 * byVal), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx + 4, yyy + 1, zzz + (5 * byVal), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx - 8 + metaV2, yyy + 1, zzz + (9 * byVal), DqmItemList.Hondana.blockID, this.Hougaku, 2);
	        par3World.setBlock(xxx - 6 + metaV2, yyy + 1, zzz + (9 * byVal), DqmItemList.Hondana.blockID, this.Hougaku, 2);
	        par3World.setBlock(xxx + 0 + metaV2, yyy + 1, zzz + (9 * byVal), DqmItemList.Hondana.blockID, this.Hougaku, 2);
	        par3World.setBlock(xxx + 2 + metaV2, yyy + 1, zzz + (9 * byVal), DqmItemList.Hondana.blockID, this.Hougaku, 2);
	        par3World.setBlock(xxx - 5, yyy + 1, zzz + (9 * byVal), DqmItemList.TuboK.blockID, 0, 2);
	        par3World.setBlock(xxx - 4, yyy + 1, zzz + (9 * byVal), DqmItemList.TuboK.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 1, zzz + (9 * byVal), DqmItemList.TaruK.blockID, 0, 2);
	        par3World.setBlock(xxx + 4, yyy + 1, zzz + (9 * byVal), DqmItemList.Maki.blockID, 0, 2);
	        par3World.setBlock(xxx - 9, yyy + 2, zzz + (6 * byVal), DqmItemList.Hepaitosu.blockID, 0, 2);
	        par3World.setBlock(xxx + 4, yyy + 2, zzz + (6 * byVal), DqmItemList.Hepaitosu.blockID, 0, 2);
	        {
	            int z = 1;
	            {
	                int x = 0;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	            {
	                int x = 3;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	            {
	                int x = 6;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	            {
	                int x = -3;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	            {
	                int x = -6;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	        }
	        {
	            int z = -5;
	            {
	                int x = 0;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	            {
	                int x = 3;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	            {
	                int x = 6;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	            {
	                int x = -3;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	            {
	                int x = -6;
	                par3World.setBlock(xxx + x, yyy + 1, zzz + (z * byVal), DqmItemList.Kajino2B.blockID, 0, 2);
	                par3World.setBlock(xxx + x, yyy + 2, zzz + (z * byVal), DqmItemList.Kajino2.blockID, 0, 2);
	            }
	        }
	        Block block;
	        block = DqmItemList.KowarenaiDoor;
	        //int i3 = MathHelper.floor_double((double)((180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
	        par3World.setBlock(xxx, yyy + 1, zzz - (10 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx, yyy + 2, zzz - (10 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx, yyy, zzz - (11 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        DqmEventKajino entitysilverfish = new DqmEventKajino(par3World);
	        entitysilverfish.setLocationAndAngles(xxx + 0.5F, yyy + 1, zzz + (7 * byVal) + 0.5F, 0.0F, 0.0F);
	        par3World.spawnEntityInWorld(entitysilverfish);
	        DqmEventKajinoTei entitysilverfish2 = new DqmEventKajinoTei(par3World);
	        entitysilverfish2.setLocationAndAngles(xxx + 0.5F + 2, yyy + 1, zzz + (7 * byVal) + 0.5F, 0.0F, 0.0F);
	        par3World.spawnEntityInWorld(entitysilverfish2);
	        DqmEventKajinoKou entitysilverfish3 = new DqmEventKajinoKou(par3World);
	        entitysilverfish3.setLocationAndAngles(xxx + 0.5F - 2, yyy + 1, zzz + (7 * byVal) + 0.5F, 0.0F, 0.0F);
	        par3World.spawnEntityInWorld(entitysilverfish3);
        }else
        {
        	{
            	//System.out.println("方角:" + this.Hougaku);

            	if(this.Hougaku == 3)
            	{
            		byVal = 1;
            		metaV1 = 0;
            		metaV2 = -1;
            	}else
            	{
            		byVal = -1;
            		metaV1 = 1;
            		metaV2 = 0;
            	}

    	        for (int x = -10; x <= 10; ++x)
    	        {
    	            for (int z = -10; z <= 10; ++z)
    	            {
    	                for (int y = 0; y <= 9; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, DqmItemList.EmeraldB.blockID, 0, 2);
    	                }
    	            }
    	        }

    	        //
    	        for (int x = -10; x <= 10; ++x)
    	        {
    	            for (int z = -10; z <= 10; ++z)
    	            {
    	                for (int y = 8; y <= 8; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, DqmItemList.Kajino3B.blockID, 0, 2);
    	                }
    	            }
    	        }

    	        for (int x = -9; x <= 9; ++x)
    	        {
    	            for (int z = -9; z <= 9; ++z)
    	            {
    	                for (int y = 8; y <= 8; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, 0, 0, 2);
    	                }
    	            }
    	        }

    	        for (int x = -10; x <= 10; ++x)
    	        {
    	            for (int z = -10; z <= 10; ++z)
    	            {
    	                for (int y = 6; y <= 6; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, DqmItemList.Kajino3B.blockID, 0, 2);
    	                }
    	            }
    	        }

    	        for (int x = -9; x <= 9; ++x)
    	        {
    	            for (int z = -9; z <= 9; ++z)
    	            {
    	                for (int y = 6; y <= 6; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, 0, 0, 2);
    	                }
    	            }
    	        }

    	        for (int x = -10; x <= 10; ++x)
    	        {
    	            for (int z = -10; z <= 10; ++z)
    	            {
    	                for (int y = 4; y <= 4; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, DqmItemList.Kajino3B.blockID, 0, 2);
    	                }
    	            }
    	        }

    	        for (int x = -9; x <= 9; ++x)
    	        {
    	            for (int z = -9; z <= 9; ++z)
    	            {
    	                for (int y = 4; y <= 4; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, 0, 0, 2);
    	                }
    	            }
    	        }

    	        for (int x = -10; x <= 10; ++x)
    	        {
    	            for (int z = -10; z <= 10; ++z)
    	            {
    	                for (int y = 2; y <= 2; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, DqmItemList.Kajino3B.blockID, 0, 2);
    	                }
    	            }
    	        }

    	        for (int x = -9; x <= 9; ++x)
    	        {
    	            for (int z = -9; z <= 9; ++z)
    	            {
    	                for (int y = 2; y <= 2; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, 0, 0, 2);
    	                }
    	            }
    	        }

    	        for (int x = -10; x <= 10; ++x)
    	        {
    	            for (int z = -10; z <= 10; ++z)
    	            {
    	                for (int y = 0; y <= 0; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, DqmItemList.Kajino3B.blockID, 0, 2);
    	                }
    	            }
    	        }

    	        //
    	        for (int z = -9; z <= 9; ++z)
    	        {
    	            for (int x = -9; x <= 9; ++x)
    	            {
    	                for (int y = 1; y <= 8; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, 0, 0, 2);
    	                }
    	            }
    	        }

    	        for (int z = -9; z <= 5; ++z)
    	        {
    	            for (int x = 6; x <= 6; ++x)
    	            {
    	                for (int y = 1; y <= 1; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, DqmItemList.EmeraldB.blockID, 0, 2);
    	                }
    	            }
    	        }

    	        for (int z = 5; z <= 5; ++z)
    	        {
    	            for (int x = 6; x <= 9; ++x)
    	            {
    	                for (int y = 1; y <= 1; ++y)
    	                {
    	                    par3World.setBlock(xxx + (x * byVal), yyy + y, zzz + z, DqmItemList.EmeraldB.blockID, 0, 2);
    	                }
    	            }
    	        }

    	        par3World.setBlock(xxx + (5 * byVal), yyy + 1, zzz - 8, DqmItemList.Isu.blockID, 0, 2);
    	        par3World.setBlock(xxx + (5 * byVal), yyy + 1, zzz - 6, DqmItemList.Isu.blockID, 0, 2);
    	        par3World.setBlock(xxx + (5 * byVal), yyy + 1, zzz - 4, DqmItemList.Isu.blockID, 0, 2);
    	        par3World.setBlock(xxx + (5 * byVal), yyy + 1, zzz - 2, DqmItemList.Isu.blockID, 0, 2);
    	        par3World.setBlock(xxx + (5 * byVal), yyy + 1, zzz + 0, DqmItemList.Isu.blockID, 0, 2);
    	        par3World.setBlock(xxx + (5 * byVal), yyy + 1, zzz + 2, DqmItemList.Isu.blockID, 0, 2);
    	        par3World.setBlock(xxx + (5 * byVal), yyy + 1, zzz + 4, DqmItemList.Isu.blockID, 0, 2);
    	        par3World.setBlock(xxx + (9 * byVal), yyy + 1, zzz - 8 + metaV2, DqmItemList.Hondana.blockID, this.Hougaku, 2);
    	        par3World.setBlock(xxx + (9 * byVal), yyy + 1, zzz - 6 + metaV2, DqmItemList.Hondana.blockID, this.Hougaku, 2);
    	        par3World.setBlock(xxx + (9 * byVal), yyy + 1, zzz + 0 + metaV2, DqmItemList.Hondana.blockID, this.Hougaku, 2);
    	        par3World.setBlock(xxx + (9 * byVal), yyy + 1, zzz + 2 + metaV2, DqmItemList.Hondana.blockID, this.Hougaku, 2);
    	        par3World.setBlock(xxx + (9 * byVal), yyy + 1, zzz - 5, DqmItemList.TuboK.blockID, 0, 2);
    	        par3World.setBlock(xxx + (9 * byVal), yyy + 1, zzz - 4, DqmItemList.TuboK.blockID, 0, 2);
    	        par3World.setBlock(xxx + (9 * byVal), yyy + 1, zzz - 3, DqmItemList.TaruK.blockID, 0, 2);
    	        par3World.setBlock(xxx + (9 * byVal), yyy + 1, zzz + 4, DqmItemList.Maki.blockID, 0, 2);
    	        par3World.setBlock(xxx + (6 * byVal), yyy + 2, zzz - 9, DqmItemList.Hepaitosu.blockID, 0, 2);
    	        par3World.setBlock(xxx + (6 * byVal), yyy + 2, zzz + 4, DqmItemList.Hepaitosu.blockID, 0, 2);
    	        {
    	            int x = 1;
    	            {
    	                int z = 0;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	            {
    	                int z = 3;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	            {
    	                int z = 6;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	            {
    	                int z = -3;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	            {
    	                int z = -6;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	        }
    	        {
    	            int x = -5;
    	            {
    	                int z = 0;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	            {
    	                int z = 3;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	            {
    	                int z = 6;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	            {
    	                int z = -3;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	            {
    	                int z = -6;
    	                par3World.setBlock(xxx + (x * byVal), yyy + 1, zzz + z, DqmItemList.Kajino2B.blockID, 0, 2);
    	                par3World.setBlock(xxx + (x * byVal), yyy + 2, zzz + z, DqmItemList.Kajino2.blockID, 0, 2);
    	            }
    	        }
    	        Block block;
    	        block = DqmItemList.KowarenaiDoor;
    	        //int i3 = MathHelper.floor_double((double)((180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
    	        par3World.setBlock(xxx - (10 * byVal), yyy + 1, zzz, 0, 0, 2);
    	        par3World.setBlock(xxx - (10 * byVal), yyy + 2, zzz, 0, 0, 2);
    	        par3World.setBlock(xxx - (11 * byVal), yyy, zzz, Block.stairsNetherQuartz.blockID, metaV1, 2);
    	        DqmEventKajino entitysilverfish = new DqmEventKajino(par3World);
    	        entitysilverfish.setLocationAndAngles(xxx + (7 * byVal) + 0.5F, yyy + 1, zzz + 0.5F, 0.0F, 0.0F);
    	        par3World.spawnEntityInWorld(entitysilverfish);
    	        DqmEventKajinoTei entitysilverfish2 = new DqmEventKajinoTei(par3World);
    	        entitysilverfish2.setLocationAndAngles(xxx + (7 * byVal) + 0.5F, yyy + 1, zzz + 2 + 0.5F, 0.0F, 0.0F);
    	        par3World.spawnEntityInWorld(entitysilverfish2);
    	        DqmEventKajinoKou entitysilverfish3 = new DqmEventKajinoKou(par3World);
    	        entitysilverfish3.setLocationAndAngles(xxx + (7 * byVal) + 0.5F, yyy + 1, zzz - 2 + 0.5F, 0.0F, 0.0F);
    	        par3World.spawnEntityInWorld(entitysilverfish3);
            }
        }
    }
    public static void placeDoorBlock(World par0World, int par1, int par2, int par3, int par4, Block par5Block)
    {
        byte b0 = 0;
        byte b1 = 0;

        if (par4 == 0)
        {
            b1 = 1;
        }

        if (par4 == 1)
        {
            b0 = -1;
        }

        if (par4 == 2)
        {
            b1 = -1;
        }

        if (par4 == 3)
        {
            b0 = 1;
        }

        int i1 = (par0World.isBlockNormalCube(par1 - b0, par2, par3 - b1) ? 1 : 0) + (par0World.isBlockNormalCube(par1 - b0, par2 + 1, par3 - b1) ? 1 : 0);
        int j1 = (par0World.isBlockNormalCube(par1 + b0, par2, par3 + b1) ? 1 : 0) + (par0World.isBlockNormalCube(par1 + b0, par2 + 1, par3 + b1) ? 1 : 0);
        boolean flag = par0World.getBlockId(par1 - b0, par2, par3 - b1) == par5Block.blockID || par0World.getBlockId(par1 - b0, par2 + 1, par3 - b1) == par5Block.blockID;
        boolean flag1 = par0World.getBlockId(par1 + b0, par2, par3 + b1) == par5Block.blockID || par0World.getBlockId(par1 + b0, par2 + 1, par3 + b1) == par5Block.blockID;
        boolean flag2 = false;

        if (flag && !flag1)
        {
            flag2 = true;
        }
        else if (j1 > i1)
        {
            flag2 = true;
        }

        par0World.setBlock(par1, par2, par3, par5Block.blockID, par4, 2);
        par0World.setBlock(par1, par2 + 1, par3, par5Block.blockID, 8 | (flag2 ? 1 : 0), 2);
        par0World.notifyBlocksOfNeighborChange(par1, par2, par3, par5Block.blockID);
        par0World.notifyBlocksOfNeighborChange(par1, par2 + 1, par3, par5Block.blockID);
    }
}
