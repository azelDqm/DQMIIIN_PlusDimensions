package DQMIIDim.genDqmB;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmEventDama;
import DQMII.DqmItemList;
import DQMIIDim.BlockList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenDamaT implements IWorldGenerator
{
	private int Hougaku = 0;
	private int yMain = 0;

    public DqmWorldGenDamaT(int face, int par2)
    {
    	this.Hougaku = face;
    	this.yMain = par2;
    }
    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int xxx = par1;
        int zzz = par2;

        switch(this.Hougaku)
        {
        	case 1: xxx = xxx - 23; break;
        	case 2: zzz = zzz - 23; break;
        	case 3: xxx = xxx + 23; break;
        	case 0: zzz = zzz + 23; break;
        }

        int takasa = 0;
        int yyy = this.yMain;
        //int yyy = par3World.getHeightValue(xxx, zzz);


        //土

        for (int x = -22; x <= 22; ++x)
        {
            for (int z = -22; z <= 22; ++z)
            {
                for (int y = -1; y <= -1; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + z, BlockList.DqmDimCloud.blockID, 0, 2);
                }
            }
        }
/*
        for (int x = -23; x <= 23; ++x)
        {
            for (int z = -23; z <= 23; ++z)
            {
                for (int y = -2; y <= -2; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), Block.grass.blockID, 0, 2);
                }
            }
        }

        for (int x = -24; x <= 24; ++x)
        {
            for (int z = -24; z <= 24; ++z)
            {
                for (int y = -3; y <= -3; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), Block.grass.blockID, 0, 2);
                }
            }
        }
*/
        int byVal = 1;
        int metaV1 = 2;
        int metaV2 = 3;
        int metaV3 = 6;
        //壁
        if(this.Hougaku == 0 || this.Hougaku == 2)
        {
        	//System.out.println("方角:" + this.Hougaku);

        	if(this.Hougaku == 0)
        	{
        		byVal = 1;
        		metaV1 = 2;
        		metaV2 = 3;
        		metaV3 = 6;
        	}else
        	{
        		byVal = -1;
        		metaV1 = 3;
        		metaV2 = 2;
        		metaV3 = 7;
        	}

	        for (int x = -20; x <= 20; ++x)
	        {
	            for (int z = -20; z <= 20; ++z)
	            {
	                for (int y = 0; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -17; x <= 17; ++x)
	        {
	            for (int z = -17; z <= 17; ++z)
	            {
	                for (int y = 0; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -7; x <= 7; ++x)
	        {
	            for (int z = -20; z <= -16;++z)
	            {
	                for (int y = 0; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -20; x <= 20; ++x)
	        {
	            for (int z = -20; z <= 20; ++z)
	            {
	                for (int y = 2; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -11; x <= 11; ++x)
	        {
	            for (int z = -20; z <= -18; ++z)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -8; x <= 8; ++x)
	        {
	            for (int z = -20; z <= -18; ++z)
	            {
	                for (int y = 15; y <= 15; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -5; x <= 5; ++x)
	        {
	            for (int z = -20; z <= -18; ++z)
	            {
	                for (int y = 16; y <= 16; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            for (int z = -20; z <= -18; ++z)
	            {
	                for (int y = 17; y <= 17; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = 0; x <= 0; ++x)
	        {
	            for (int z = -20; z <= -18; ++z)
	            {
	                for (int y = 18; y <= 18; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -4; x <= 4; ++x)
	        {
	            for (int z = -20; z <= -18; ++z)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            for (int z = -20; z <= -18; ++z)
	            {
	                for (int y = 15; y <= 15; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -21; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx - 7, yyy + 0 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	        }

	        for (int z = -21; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 7, yyy + 0 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int x = -21; x <= -7; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 0 + takasa, zzz - (21 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = 7; x <= 21; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 0 + takasa, zzz - (21 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -21; x <= 21; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 0 + takasa, zzz + (21 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	        }

	        for (int z = -21; z <= 21; ++z)
	        {
	            par3World.setBlock(xxx + 21, yyy + 0 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	        }

	        for (int z = -21; z <= 21; ++z)
	        {
	            par3World.setBlock(xxx - 21, yyy + 0 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int x = -20; x <= 20; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 13 + takasa, zzz + (20 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	        }

	        for (int z = -20; z <= 20; ++z)
	        {
	            par3World.setBlock(xxx + 20, yyy + 13 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 20, yyy + 13 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int z = -20; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 11, yyy + 14 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 11, yyy + 14 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int z = -20; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 8, yyy + 15 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 8, yyy + 15 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int z = -20; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 5, yyy + 16 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 5, yyy + 16 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int z = -20; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 2, yyy + 17 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 2, yyy + 17 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int z = -20; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 1, yyy + 18 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 1, yyy + 18 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int z = -20; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 1, yyy + 15 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 4, 2);
	            par3World.setBlock(xxx - 1, yyy + 15 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 5, 2);
	        }

	        for (int z = -20; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 4, yyy + 14 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 4, 2);
	            par3World.setBlock(xxx - 4, yyy + 14 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 5, 2);
	        }

	        for (int z = -20; z <= -18; ++z)
	        {
	            par3World.setBlock(xxx + 7, yyy + 13 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 4, 2);
	            par3World.setBlock(xxx - 7, yyy + 13 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 5, 2);
	        }

	        par3World.setBlock(xxx, yyy + 17 + takasa, zzz - (20 * byVal), DqmItemList.Kowarenai7.blockID, 0, 2);
	        //炎と聖杯
	        par3World.setBlock(xxx + 5, yyy + 0 + takasa, zzz - (21 * byVal), DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx + 5, yyy + 1 + takasa, zzz - (21 * byVal), Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - 5, yyy + 0 + takasa, zzz - (21 * byVal), DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - 5, yyy + 1 + takasa, zzz - (21 * byVal), Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx + 5, yyy + 0 + takasa, zzz - (17 * byVal), DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx + 5, yyy + 1 + takasa, zzz - (17 * byVal), Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - 5, yyy + 0 + takasa, zzz - (17 * byVal), DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - 5, yyy + 1 + takasa, zzz - (17 * byVal), Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 4 + takasa, zzz - (8 * byVal), DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 5 + takasa, zzz - (8 * byVal), Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 4 + takasa, zzz - (8 * byVal), DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 5 + takasa, zzz - (8 * byVal), Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 4 + takasa, zzz - (3 * byVal), DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 5 + takasa, zzz - (3 * byVal), Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 4 + takasa, zzz - (3 * byVal), DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 5 + takasa, zzz - (3 * byVal), Block.fire.blockID, 0, 2);

	        //前柱
	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 9, yyy + y + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 9, yyy + 11 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 9, yyy + 2 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 9, yyy + y + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 9, yyy + 11 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 9, yyy + 2 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 19, yyy + y + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 19, yyy + 11 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 19, yyy + 2 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 19, yyy + y + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 19, yyy + 11 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 19, yyy + 2 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        //横柱
	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 19, yyy + y + takasa, zzz, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 19, yyy + 11 + takasa, zzz, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 19, yyy + 2 + takasa, zzz, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 19, yyy + y + takasa, zzz - (9 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 19, yyy + 11 + takasa, zzz - (9 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 19, yyy + 2 + takasa, zzz - (9 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 19, yyy + y + takasa, zzz + (9 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 19, yyy + 11 + takasa, zzz + (9 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 19, yyy + 2 + takasa, zzz + (9 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 19, yyy + y + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 19, yyy + 11 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 19, yyy + 2 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 19, yyy + y + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 19, yyy + 11 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 19, yyy + 2 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        //
	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 19, yyy + y + takasa, zzz, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 19, yyy + 11 + takasa, zzz, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 19, yyy + 2 + takasa, zzz, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 19, yyy + y + takasa, zzz - (9 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 19, yyy + 11 + takasa, zzz - (9 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 19, yyy + 2 + takasa, zzz - (9 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 19, yyy + y + takasa, zzz + (9 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 19, yyy + 11 + takasa, zzz + (9 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 19, yyy + 2 + takasa, zzz + (9 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 19, yyy + y + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 19, yyy + 11 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 19, yyy + 2 + takasa, zzz - (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 19, yyy + y + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 19, yyy + 11 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 19, yyy + 2 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        //後柱
	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx, yyy + y + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx, yyy + 11 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 2 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 9, yyy + y + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 9, yyy + 11 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 9, yyy + 2 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 9, yyy + y + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 9, yyy + 11 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 9, yyy + 2 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - 19, yyy + y + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 19, yyy + 11 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 19, yyy + 2 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + 19, yyy + y + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 19, yyy + 11 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 19, yyy + 2 + takasa, zzz + (19 * byVal), DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        //床
	        for (int x = -10; x <= 10; ++x)
	        {
	            for (int z = -10; z <= 10; ++z)
	            {
	                for (int y = 3; y <= 3; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -11; x <= 11; ++x)
	        {
	            for (int z = -11; z <= 11; ++z)
	            {
	                for (int y = 2; y <= 2; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -12; x <= 12; ++x)
	        {
	            for (int z = -12; z <= 12; ++z)
	            {
	                for (int y = 1; y <= 1; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -15; x <= 15; ++x)
	        {
	            for (int z = -15; z <= 15; ++z)
	            {
	                for (int y = -1; y <= 0; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -14; x <= 14; ++x)
	        {
	            for (int z = -14; z <= 14; ++z)
	            {
	                for (int y = 0; y <= 0; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), Block.waterStill.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -13; x <= 13; ++x)
	        {
	            for (int z = -13; z <= 13; ++z)
	            {
	                for (int y = 0; y <= 0; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        //階段
	        par3World.setBlock(xxx + 3, yyy + 3 + takasa, zzz - (11 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 3 + takasa, zzz - (11 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 3 + takasa, zzz - (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 3 + takasa, zzz - (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 2 + takasa, zzz - (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 2 + takasa, zzz - (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 2 + takasa, zzz - (13 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 2 + takasa, zzz - (13 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 1 + takasa, zzz - (13 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 1 + takasa, zzz - (13 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 1 + takasa, zzz - (14 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 1 + takasa, zzz - (14 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 0 + takasa, zzz - (14 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 0 + takasa, zzz - (14 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 0 + takasa, zzz - (15 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 0 + takasa, zzz - (15 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 3, yyy - 1 + takasa, zzz - (15 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 3, yyy - 1 + takasa, zzz - (15 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);

	        for (int x = -2; x <= 2; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 3 + takasa, zzz - (11 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 2 + takasa, zzz - (12 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 1 + takasa, zzz - (13 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 0 + takasa, zzz - (14 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 0 + takasa, zzz - (15 * byVal), 0, 2, 2);
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy - 1 + takasa, zzz - (15 * byVal), DqmItemList.Kowarenai6.blockID, 2, 2);
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy - 1 + takasa, zzz - (21 * byVal), DqmItemList.Kowarenai6.blockID, 2, 2);
	        }

	        for (int z = -20; z <= -15; ++z)
	        {
	            par3World.setBlock(xxx + 2, yyy - 1 + takasa, zzz + (z * byVal), DqmItemList.Kowarenai6.blockID, 2, 2);
	            par3World.setBlock(xxx - 2, yyy - 1 + takasa, zzz + (z * byVal), DqmItemList.Kowarenai6.blockID, 2, 2);
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            for (int z = -20; z <= -15; ++z)
	            {
	                par3World.setBlock(xxx + x, yyy - 1 + takasa, zzz + (z * byVal), DqmItemList.Kowarenai5.blockID, 11, 2);
	            }
	        }

	        for (int z = -21; z <= -16; ++z)
	        {
	            par3World.setBlock(xxx + 3, yyy + 0 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 3, yyy + 0 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        //中絨毯
	        for (int x = -1; x <= 1; ++x)
	        {
	            for (int z = -10; z <= -2; ++z)
	            {
	                par3World.setBlock(xxx + x, yyy + 3 + takasa, zzz + (z * byVal), DqmItemList.Kowarenai5.blockID, 11, 2);
	            }
	        }

	        for (int z = -10; z <= -2; ++z)
	        {
	            par3World.setBlock(xxx + 2, yyy + 3 + takasa, zzz + (z * byVal), DqmItemList.Kowarenai6.blockID, 11, 2);
	            par3World.setBlock(xxx - 2, yyy + 3 + takasa, zzz + (z * byVal), DqmItemList.Kowarenai6.blockID, 11, 2);
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 3 + takasa, zzz - (1 * byVal), DqmItemList.Kowarenai6.blockID, 11, 2);
	        }

	        //高台
	        for (int x = -5; x <= 5; ++x)
	        {
	            for (int z = 0; z <= 9; ++z)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), Block.waterStill.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -4; x <= 4; ++x)
	        {
	            for (int z = 1; z <= 8; ++z)
	            {
	                for (int y = 4; y <= 5; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -3; x <= 3; ++x)
	        {
	            for (int z = 2; z <= 8; ++z)
	            {
	                for (int y = 6; y <= 7; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            for (int z = 3; z <= 7; ++z)
	            {
	                for (int y = 8; y <= 9; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -6; x <= 6; ++x)
	        {
	            for (int z = -1; z <= -1; ++z)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	                }
	            }
	        }

	        for (int x = -6; x <= 6; ++x)
	        {
	            for (int z = 10; z <= 10; ++z)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	                }
	            }
	        }

	        for (int x = 6; x <= 6; ++x)
	        {
	            for (int z = -1; z <= 10; ++z)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	                }
	            }
	        }

	        for (int x = -6; x <= -6; ++x)
	        {
	            for (int z = -1; z <= 10; ++z)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	                }
	            }
	        }

	        par3World.setBlock(xxx + 5, yyy + 4 + takasa, zzz + 0, DqmItemList.Kowarenai4.blockID, 2, 2);
	        par3World.setBlock(xxx - 5, yyy + 4 + takasa, zzz + 0, DqmItemList.Kowarenai4.blockID, 2, 2);
	        par3World.setBlock(xxx + 2, yyy + 4 + takasa, zzz + 0, DqmItemList.Kowarenai4.blockID, 2, 2);
	        par3World.setBlock(xxx - 2, yyy + 4 + takasa, zzz + 0, DqmItemList.Kowarenai4.blockID, 2, 2);

	        for (int x = -1; x <= 1; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 4 + takasa, zzz + 0, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 5 + takasa, zzz + (1 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 6 + takasa, zzz + (2 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 7 + takasa, zzz + (3 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 8 + takasa, zzz + (4 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 4 + takasa, zzz - (1 * byVal), 0, 2, 2);
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            for (int z = 1; z <= 4; ++z)
	            {
	                for (int y = 9; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            for (int z = 1; z <= +3; ++z)
	            {
	                for (int y = 8; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            for (int z = 1; z <= +2; ++z)
	            {
	                for (int y = 7; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        //内柱
	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + 5, yyy + y + takasa, zzz - (8 * byVal), DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 5, yyy + 9 + takasa, zzz - (8 * byVal), DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 5, yyy + 4 + takasa, zzz - (8 * byVal), DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - 5, yyy + y + takasa, zzz - (8 * byVal), DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 5, yyy + 9 + takasa, zzz - (8 * byVal), DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 5, yyy + 4 + takasa, zzz - (8 * byVal), DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + 5, yyy + y + takasa, zzz - (4 * byVal), DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 5, yyy + 9 + takasa, zzz - (4 * byVal), DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 5, yyy + 4 + takasa, zzz - (4 * byVal), DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - 5, yyy + y + takasa, zzz - (4 * byVal), DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 5, yyy + 9 + takasa, zzz - (4 * byVal), DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 5, yyy + 4 + takasa, zzz - (4 * byVal), DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 6; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + 5, yyy + y + takasa, zzz, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 5, yyy + 9 + takasa, zzz, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 5, yyy + 5 + takasa, zzz, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 6; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - 5, yyy + y + takasa, zzz, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 5, yyy + 9 + takasa, zzz, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 5, yyy + 5 + takasa, zzz, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + 9, yyy + y + takasa, zzz, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 9, yyy + 9 + takasa, zzz, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 9, yyy + 4 + takasa, zzz, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - 9, yyy + y + takasa, zzz, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 9, yyy + 9 + takasa, zzz, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 9, yyy + 4 + takasa, zzz, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + 9, yyy + y + takasa, zzz + (5 * byVal), DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 9, yyy + 9 + takasa, zzz + (5 * byVal), DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 9, yyy + 4 + takasa, zzz + (5 * byVal), DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - 9, yyy + y + takasa, zzz + (5 * byVal), DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 9, yyy + 9 + takasa, zzz + (5 * byVal), DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 9, yyy + 4 + takasa, zzz + (5 * byVal), DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + 9, yyy + y + takasa, zzz + (9 * byVal), DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 9, yyy + 9 + takasa, zzz + (9 * byVal), DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 9, yyy + 4 + takasa, zzz + (9 * byVal), DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - 9, yyy + y + takasa, zzz + (9 * byVal), DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - 9, yyy + 9 + takasa, zzz + (9 * byVal), DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 9, yyy + 4 + takasa, zzz + (9 * byVal), DqmItemList.HasiraQ.blockID, 0, 2);

	        //屋根後ろ
	        for (int x = -9; x <= 9; ++x)
	        {
	            for (int z = 0; z <= 9; ++z)
	            {
	                for (int y = 10; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -8; x <= 8; ++x)
	        {
	            for (int z = 1; z <= 8; ++z)
	            {
	                for (int y = 11; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -6; x <= 6; ++x)
	        {
	            for (int z = 1; z <= 7; ++z)
	            {
	                for (int y = 12; y <= 12; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -4; x <= 4; ++x)
	        {
	            for (int z = 1; z <= 6; ++z)
	            {
	                for (int y = 13; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            for (int z = 1; z <= 5; ++z)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = 0; x <= 0; ++x)
	        {
	            for (int z = 1; z <= 3; ++z)
	            {
	                for (int y = 15; y <= 15; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        //屋根後ろ穴
	        for (int x = -8; x <= 8; ++x)
	        {
	            for (int z = 2; z <= 8; ++z)
	            {
	                for (int y = 10; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -6; x <= 6; ++x)
	        {
	            for (int z = 2; z <= 7; ++z)
	            {
	                for (int y = 11; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -4; x <= 4; ++x)
	        {
	            for (int z = 2; z <= 6; ++z)
	            {
	                for (int y = 12; y <= 12; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -2; x <= 2; ++x)
	        {
	            for (int z = 2; z <= 5; ++z)
	            {
	                for (int y = 13; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = 0; x <= 0; ++x)
	        {
	            for (int z = 2; z <= 3; ++z)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        //屋根前
	        for (int x = -5; x <= 5; ++x)
	        {
	            for (int z = -8; z <= -1; ++z)
	            {
	                for (int y = 10; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -4; x <= 4; ++x)
	        {
	            for (int z = -8; z <= 0; ++z)
	            {
	                for (int y = 11; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -3; x <= 3; ++x)
	        {
	            for (int z = -8; z <= 0; ++z)
	            {
	                for (int y = 12; y <= 12; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            for (int z = -7; z <= 0; ++z)
	            {
	                for (int y = 13; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = 0; x <= 0; ++x)
	        {
	            for (int z = -6; z <= 0; ++z)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -8; z <= -1; ++z)
	        {
	            par3World.setBlock(xxx + 6, yyy + 10 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 6, yyy + 10 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int z = -6; z <= 0; ++z)
	        {
	            par3World.setBlock(xxx + 2, yyy + 13 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 2, yyy + 13 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + 1, yyy + 13 + takasa, zzz - (7 * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	        par3World.setBlock(xxx - 1, yyy + 13 + takasa, zzz - (7 * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 13 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx + 1, yyy + 13 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx - 1, yyy + 13 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx + 3, yyy + 12 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	        par3World.setBlock(xxx - 3, yyy + 12 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        par3World.setBlock(xxx + 5, yyy + 11 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	        par3World.setBlock(xxx - 5, yyy + 11 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 14 + takasa, zzz - (7 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx, yyy + 12 + takasa, zzz - (8 * byVal), DqmItemList.Kowarenai7.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 10 + takasa, zzz - (8 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx - 1, yyy + 10 + takasa, zzz - (8 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx + 3, yyy + 10 + takasa, zzz - (8 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx - 3, yyy + 10 + takasa, zzz - (8 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx, yyy + 10 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, metaV3, 2);
	        par3World.setBlock(xxx + 2, yyy + 10 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, metaV3, 2);
	        par3World.setBlock(xxx - 2, yyy + 10 + takasa, zzz - (8 * byVal), Block.stairsNetherQuartz.blockID, metaV3, 2);
	        par3World.setBlock(xxx, yyy + 15 + takasa, zzz, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx, yyy + 15 + takasa, zzz + (4 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);

	        for (int z = 2; z <= 4; ++z)
	        {
	            par3World.setBlock(xxx + 1, yyy + 15 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 1, yyy + 15 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int z = -6; z <= 0; ++z)
	        {
	            par3World.setBlock(xxx + 1, yyy + 14 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 1, yyy + 14 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int x = 6; x <= 10; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 10 + takasa, zzz - (1 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -10; x <= -6; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 10 + takasa, zzz - (1 * byVal), Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -1; z <= 10; ++z)
	        {
	            par3World.setBlock(xxx + 10, yyy + 10 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	            par3World.setBlock(xxx - 10, yyy + 10 + takasa, zzz + (z * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        }

	        for (int x = -10; x <= 10; ++x)
	        {
	            par3World.setBlock(xxx + x, yyy + 10 + takasa, zzz + (10 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	        }

	        //屋根前穴
	        for (int x = -4; x <= 4; ++x)
	        {
	            for (int z = -7; z <= 1; ++z)
	            {
	                for (int y = 10; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -3; x <= 3; ++x)
	        {
	            for (int z = -7; z <= 1; ++z)
	            {
	                for (int y = 11; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -1; x <= 1; ++x)
	        {
	            for (int z = -7; z <= 1; ++z)
	            {
	                for (int y = 12; y <= 12; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        //高台椅子
	        par3World.setBlock(xxx, yyy + 9 + takasa, zzz + (6 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx, yyy + 9 + takasa, zzz + (5 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 9 + takasa, zzz + (5 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx - 1, yyy + 9 + takasa, zzz + (5 * byVal), 0, 0, 2);
	        par3World.setBlock(xxx, yyy + 10 + takasa, zzz + (7 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx + 1, yyy + 10 + takasa, zzz + (6 * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	        par3World.setBlock(xxx - 1, yyy + 10 + takasa, zzz + (6 * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 9 + takasa, zzz +(5 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 9 + takasa, zzz + (5 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 1, yyy + 9 + takasa, zzz + (5 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        DqmEventDama entitysilverfish = new DqmEventDama(par3World);
	        entitysilverfish.setLocationAndAngles(xxx + 0.5F, yyy + 9 + takasa, zzz + (6 * byVal) + 0.5F, 0.0F, 0.0F);
	        par3World.spawnEntityInWorld(entitysilverfish);
	        //裏の隠し扉
	        par3World.setBlock(xxx, yyy + 0 + takasa, zzz + (14 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 0 + takasa, zzz + (14 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 1, yyy + 0 + takasa, zzz + (14 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 1 + takasa, zzz + (13 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 1, yyy + 1 + takasa, zzz + (13 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 2 + takasa, zzz + (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 1, yyy + 2 + takasa, zzz + (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 2, yyy + 2 + takasa, zzz + (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 2, yyy + 2 + takasa, zzz + (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 3 + takasa, zzz + (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 1, yyy + 3 + takasa, zzz + (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 3 + takasa, zzz + (11 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - 1, yyy + 3 + takasa, zzz + (11 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 3 + takasa, zzz + (12 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 3 + takasa, zzz + (11 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 4 + takasa, zzz + (11 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 4 + takasa, zzz + (10 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 4 + takasa, zzz + (11 * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	        par3World.setBlock(xxx - 1, yyy + 4 + takasa, zzz + (11 * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        par3World.setBlock(xxx + 1, yyy + 4 + takasa, zzz + (12 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx - 1, yyy + 4 + takasa, zzz + (12 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx, yyy + 4 + takasa, zzz + (12 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx, yyy + 3 + takasa, zzz + (13 * byVal), Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx + 1, yyy + 2 + takasa, zzz + (13 * byVal), Block.stairsNetherQuartz.blockID, 1, 2);
	        par3World.setBlock(xxx - 1, yyy + 2 + takasa, zzz + (13 * byVal), Block.stairsNetherQuartz.blockID, 0, 2);
	        Block block;
	        //block = DqmItemList.KowarenaiDoor3;
	        //int i0 = MathHelper.floor_double((double)((180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
	        //placeDoorBlock(par3World, xxx, yyy + 1 + takasa, zzz + 13, i0, block);

	        for (int z = 9; z <= 12; ++z)
	        {
	            for (int y = 1; y <= 2; ++y)
	            {
	                par3World.setBlock(xxx, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	            }
	        }

	        for (int x = -3; x <= 3; ++x)
	        {
	            for (int z = 1; z <= 8; ++z)
	            {
	                for (int y = 1; y <= 3; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), 0, 0, 2);
	                }
	            }
	        }

	        //par3World.setBlock(xxx, yyy + 1, zzz + 4, Block.chest.blockID, 0, 2);
	        //DqmWorldChest.Chest4(rand, xxx, yyy + 1, zzz + 4, par3World);
	        //像
	        par3World.setBlock(xxx + 8, yyy + 4 + takasa, zzz - (9 * byVal), DqmItemList.DaizaQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 8, yyy + 5 + takasa, zzz - (9 * byVal), DqmItemList.SKirapan.blockID, 3, 2);
	        par3World.setBlock(xxx - 8, yyy + 4 + takasa, zzz - (9 * byVal), DqmItemList.DaizaQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 8, yyy + 5 + takasa, zzz - (9 * byVal), DqmItemList.SKirapan.blockID, 1, 2);
	        par3World.setBlock(xxx + 7, yyy + 4 + takasa, zzz - (3 * byVal), DqmItemList.DaizaQ.blockID, 0, 2);
	        par3World.setBlock(xxx + 7, yyy + 5 + takasa, zzz - (3 * byVal), DqmItemList.SKirapan.blockID, 3, 2);
	        par3World.setBlock(xxx - 7, yyy + 4 + takasa, zzz - (3 * byVal), DqmItemList.DaizaQ.blockID, 0, 2);
	        par3World.setBlock(xxx - 7, yyy + 5 + takasa, zzz - (3 * byVal), DqmItemList.SKirapan.blockID, 1, 2);
        }else
        {
        	//System.out.println("方角:" + this.Hougaku);

        	if(this.Hougaku == 3)
        	{
        		byVal = 1;
        		//metaV1 = 2;
        		//metaV2 = 3;
        		//metaV3 = 6;
        		metaV1 = 0;
        		metaV2 = 1;
        		metaV3 = 4;
        	}else
        	{
        		byVal = -1;
        		//metaV1 = 3;
        		//metaV2 = 2;
        		//metaV3 = 7;
        		metaV1 = 1;
        		metaV2 = 0;
        		metaV3 = 5;
        	}

	        for (int z = -20; z <= 20; ++z)
	        {
	            for (int x = -20; x <= 20; ++x)
	            {
	                for (int y = 0; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -17; z <= 17; ++z)
	        {
	            for (int x = -17; x <= 17; ++x)
	            {
	                for (int y = 0; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -7; z <= 7; ++z)
	        {
	            for (int x = -20; x <= -16;++x)
	            {
	                for (int y = 0; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -20; z <= 20; ++z)
	        {
	            for (int x = -20; x <= 20; ++x)
	            {
	                for (int y = 2; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -11; z <= 11; ++z)
	        {
	            for (int x = -20; x <= -18; ++x)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -8; z <= 8; ++z)
	        {
	            for (int x = -20; x <= -18; ++x)
	            {
	                for (int y = 15; y <= 15; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -5; z <= 5; ++z)
	        {
	            for (int x = -20; x <= -18; ++x)
	            {
	                for (int y = 16; y <= 16; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            for (int x = -20; x <= -18; ++x)
	            {
	                for (int y = 17; y <= 17; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = 0; z <= 0; ++z)
	        {
	            for (int x = -20; x <= -18; ++x)
	            {
	                for (int y = 18; y <= 18; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -4; z <= 4; ++z)
	        {
	            for (int x = -20; x <= -18; ++x)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            for (int x = -20; x <= -18; ++x)
	            {
	                for (int y = 15; y <= 15; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int x = -21; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 0 + takasa, zzz - 7, Block.stairsNetherQuartz.blockID, 3, 2);
	        }

	        for (int x = -21; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 0 + takasa, zzz + 7, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int z = -21; z <= -7; ++z)
	        {
	            par3World.setBlock(xxx - (21 * byVal), yyy + 0 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = 7; z <= 21; ++z)
	        {
	            par3World.setBlock(xxx - (21 * byVal), yyy + 0 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -21; z <= 21; ++z)
	        {
	            par3World.setBlock(xxx + (21 * byVal), yyy + 0 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV2, 2);
	        }

	        for (int x = -21; x <= 21; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 0 + takasa, zzz + 21, Block.stairsNetherQuartz.blockID, 3, 2);
	        }

	        for (int x = -21; x <= 21; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 0 + takasa, zzz - 21, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int z = -20; z <= 20; ++z)
	        {
	            par3World.setBlock(xxx + (20 * byVal), yyy + 13 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV2, 2);
	        }

	        for (int x = -20; x <= 20; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 13 + takasa, zzz + 20, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 13 + takasa, zzz - 20, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int x = -20; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 14 + takasa, zzz + 11, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 14 + takasa, zzz - 11, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int x = -20; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 15 + takasa, zzz + 8, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 15 + takasa, zzz - 8, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int x = -20; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 16 + takasa, zzz + 5, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 16 + takasa, zzz - 5, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int x = -20; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 17 + takasa, zzz + 2, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 17 + takasa, zzz - 2, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int x = -20; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 18 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 18 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int x = -20; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 15 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, 6, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 15 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, 7, 2);
	        }

	        for (int x = -20; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 14 + takasa, zzz + 4, Block.stairsNetherQuartz.blockID, 6, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 14 + takasa, zzz - 4, Block.stairsNetherQuartz.blockID, 7, 2);
	        }

	        for (int x = -20; x <= -18; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 13 + takasa, zzz + 7, Block.stairsNetherQuartz.blockID, 6, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 13 + takasa, zzz - 7, Block.stairsNetherQuartz.blockID, 7, 2);
	        }

	        par3World.setBlock(xxx - (20 * byVal), yyy + 17 + takasa, zzz, DqmItemList.Kowarenai7.blockID, 0, 2);
	        //炎と聖杯
	        par3World.setBlock(xxx - (21 * byVal), yyy + 0 + takasa, zzz + 5, DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - (21 * byVal), yyy + 1 + takasa, zzz + 5, Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - (21 * byVal), yyy + 0 + takasa, zzz - 5, DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - (21 * byVal), yyy + 1 + takasa, zzz - 5, Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - (17 * byVal), yyy + 0 + takasa, zzz + 5, DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - (17 * byVal), yyy + 1 + takasa, zzz + 5, Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - (17 * byVal), yyy + 0 + takasa, zzz - 5, DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - (17 * byVal), yyy + 1 + takasa, zzz - 5, Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 4 + takasa, zzz + 3, DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 5 + takasa, zzz + 3, Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 4 + takasa, zzz - 3, DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 5 + takasa, zzz - 3, Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - (3 * byVal), yyy + 4 + takasa, zzz + 3, DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - (3 * byVal), yyy + 5 + takasa, zzz + 3, Block.fire.blockID, 0, 2);
	        par3World.setBlock(xxx - (3 * byVal), yyy + 4 + takasa, zzz - 3, DqmItemList.Kagaribidai.blockID, 0, 2);
	        par3World.setBlock(xxx - (3 * byVal), yyy + 5 + takasa, zzz - 3, Block.fire.blockID, 0, 2);

	        //前柱
	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - (19 * byVal), yyy + y + takasa, zzz - 9, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (19 * byVal), yyy + 11 + takasa, zzz - 9, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (19 * byVal), yyy + 2 + takasa, zzz - 9, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - (19 * byVal), yyy + y + takasa, zzz + 9, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (19 * byVal), yyy + 11 + takasa, zzz + 9, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (19 * byVal), yyy + 2 + takasa, zzz + 9, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - (19 * byVal), yyy + y + takasa, zzz - 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (19 * byVal), yyy + 11 + takasa, zzz - 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (19 * byVal), yyy + 2 + takasa, zzz - 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - (19 * byVal), yyy + y + takasa, zzz + 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (19 * byVal), yyy + 11 + takasa, zzz + 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (19 * byVal), yyy + 2 + takasa, zzz + 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        //横柱
	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx, yyy + y + takasa, zzz - 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx, yyy + 11 + takasa, zzz - 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 2 + takasa, zzz - 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - (9 * byVal), yyy + y + takasa, zzz - 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (9 * byVal), yyy + 11 + takasa, zzz - 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (9 * byVal), yyy + 2 + takasa, zzz - 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (9 * byVal), yyy + y + takasa, zzz - 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (9 * byVal), yyy + 11 + takasa, zzz - 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (9 * byVal), yyy + 2 + takasa, zzz - 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - (19 * byVal), yyy + y + takasa, zzz - 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (19 * byVal), yyy + 11 + takasa, zzz - 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (19 * byVal), yyy + 2 + takasa, zzz - 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (19 * byVal), yyy + y + takasa, zzz - 19 , DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (19 * byVal), yyy + 11 + takasa, zzz - 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (19 * byVal), yyy + 2 + takasa, zzz - 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        //
	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx, yyy + y + takasa, zzz + 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx, yyy + 11 + takasa, zzz + 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 2 + takasa, zzz + 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - (9 * byVal), yyy + y + takasa, zzz + 19 , DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (9 * byVal), yyy + 11 + takasa, zzz + 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (9 * byVal), yyy + 2 + takasa, zzz +19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (9 * byVal), yyy + y + takasa, zzz + 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (9 * byVal), yyy + 11 + takasa, zzz + 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (9 * byVal), yyy + 2 + takasa, zzz + 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx - (19 * byVal), yyy + y + takasa, zzz + 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (19 * byVal), yyy + 11 + takasa, zzz + 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (19 * byVal), yyy + 2 + takasa, zzz + 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (19 * byVal), yyy + y + takasa, zzz + 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (19 * byVal), yyy + 11 + takasa, zzz + 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (19 * byVal), yyy + 2 + takasa, zzz + 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        //後柱
	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (19 * byVal), yyy + y + takasa, zzz, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (19 * byVal), yyy + 11 + takasa, zzz, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (19 * byVal), yyy + 2 + takasa, zzz, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (19 * byVal), yyy + y + takasa, zzz - 9, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (19 * byVal), yyy + 11 + takasa, zzz - 9, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (19 * byVal), yyy + 2 + takasa, zzz - 9, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (19 * byVal), yyy + y + takasa, zzz + 9, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (19 * byVal), yyy + 11 + takasa, zzz + 9, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (19 * byVal), yyy + 2 + takasa, zzz + 9, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (19 * byVal), yyy + y + takasa, zzz - 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (19 * byVal), yyy + 11 + takasa, zzz - 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (19 * byVal), yyy + 2 + takasa, zzz - 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        for (int y = 3; y <= 10; ++y)
	        {
	            par3World.setBlock(xxx + (19 * byVal), yyy + y + takasa, zzz + 19, DqmItemList.OokiihasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (19 * byVal), yyy + 11 + takasa, zzz + 19, DqmItemList.OokiihasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (19 * byVal), yyy + 2 + takasa, zzz + 19, DqmItemList.OokiihasirasitaQ.blockID, 0, 2);

	        //床
	        for (int z = -10; z <= 10; ++z)
	        {
	            for (int x = -10; x <= 10; ++x)
	            {
	                for (int y = 3; y <= 3; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -11; x <= 11; ++x)
	        {
	            for (int z = -11; z <= 11; ++z)
	            {
	                for (int y = 2; y <= 2; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -12; x <= 12; ++x)
	        {
	            for (int z = -12; z <= 12; ++z)
	            {
	                for (int y = 1; y <= 1; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -15; x <= 15; ++x)
	        {
	            for (int z = -15; z <= 15; ++z)
	            {
	                for (int y = -1; y <= 0; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -14; x <= 14; ++x)
	        {
	            for (int z = -14; z <= 14; ++z)
	            {
	                for (int y = 0; y <= 0; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, Block.waterStill.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -13; x <= 13; ++x)
	        {
	            for (int z = -13; z <= 13; ++z)
	            {
	                for (int y = 0; y <= 0; ++y)
	                {
	                    par3World.setBlock(xxx + x, yyy + y + takasa, zzz + (z * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        //階段
	        par3World.setBlock(xxx - (11 * byVal), yyy + 3 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (11 * byVal), yyy + 3 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (12 * byVal), yyy + 3 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (12 * byVal), yyy + 3 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (12 * byVal), yyy + 2 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (12 * byVal), yyy + 2 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (13 * byVal), yyy + 2 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (13 * byVal), yyy + 2 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (13 * byVal), yyy + 1 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (13 * byVal), yyy + 1 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (14 * byVal), yyy + 1 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (14 * byVal), yyy + 1 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (14 * byVal), yyy + 0 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (14 * byVal), yyy + 0 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (15 * byVal), yyy + 0 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (15 * byVal), yyy + 0 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (15 * byVal), yyy - 1 + takasa, zzz + 3, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx - (15 * byVal), yyy - 1 + takasa, zzz - 3, DqmItemList.Kowarenai4.blockID, 0, 2);

	        for (int z = -2; z <= 2; ++z)
	        {
	            par3World.setBlock(xxx - (11 * byVal), yyy + 3 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            par3World.setBlock(xxx - (12 * byVal), yyy + 2 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            par3World.setBlock(xxx - (13 * byVal), yyy + 1 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            par3World.setBlock(xxx - (14 * byVal), yyy + 0 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            par3World.setBlock(xxx - (15 * byVal), yyy + 0 + takasa, zzz + z, 0, 2, 2);
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            par3World.setBlock(xxx - (15 * byVal), yyy - 1 + takasa, zzz + z, DqmItemList.Kowarenai6.blockID, 2, 2);
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            par3World.setBlock(xxx - (21 * byVal), yyy - 1 + takasa, zzz + z, DqmItemList.Kowarenai6.blockID, 2, 2);
	        }

	        for (int x = -20; x <= -15; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy - 1 + takasa, zzz + 2, DqmItemList.Kowarenai6.blockID, 2, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy - 1 + takasa, zzz - 2, DqmItemList.Kowarenai6.blockID, 2, 2);
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            for (int x = -20; x <= -15; ++x)
	            {
	                par3World.setBlock(xxx + (x * byVal), yyy - 1 + takasa, zzz + z, DqmItemList.Kowarenai5.blockID, 11, 2);
	            }
	        }

	        for (int x = -21; x <= -16; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 0 + takasa, zzz + 3, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 0 + takasa, zzz - 3, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        //中絨毯
	        for (int z = -1; z <= 1; ++z)
	        {
	            for (int x = -10; x <= -2; ++x)
	            {
	                par3World.setBlock(xxx + (x * byVal), yyy + 3 + takasa, zzz + (z * byVal), DqmItemList.Kowarenai5.blockID, 11, 2);
	            }
	        }

	        for (int x = -10; x <= -2; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 3 + takasa, zzz + 2, DqmItemList.Kowarenai6.blockID, 11, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 3 + takasa, zzz - 2, DqmItemList.Kowarenai6.blockID, 11, 2);
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            par3World.setBlock(xxx - (1 * byVal), yyy + 3 + takasa, zzz + z, DqmItemList.Kowarenai6.blockID, 11, 2);
	        }

	        //高台

	        for (int z = -5; z <= 5; ++z)
	        {
	            for (int x = 0; x <= 9; ++x)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, Block.waterStill.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -4; z <= 4; ++z)
	        {
	            for (int x = 1; x <= 8; ++x)
	            {
	                for (int y = 4; y <= 5; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -3; z <= 3; ++z)
	        {
	            for (int x = 2; x <= 8; ++x)
	            {
	                for (int y = 6; y <= 7; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            for (int x = 3; x <= 7; ++x)
	            {
	                for (int y = 8; y <= 9; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -6; z <= 6; ++z)
	        {
	            for (int x = -1; x <= -1; ++x)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	                }
	            }
	        }

	        for (int z = -6; z <= 6; ++z)
	        {
	            for (int x = 10; x <= 10; ++x)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV2, 2);
	                }
	            }
	        }

	        for (int z = 6; z <= 6; ++z)
	        {
	            for (int x = -1; x <= 10; ++x)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, Block.stairsNetherQuartz.blockID, 3, 2);
	                }
	            }
	        }

	        for (int z = -6; z <= -6; ++z)
	        {
	            for (int x = -1; x <= 10; ++x)
	            {
	                for (int y = 4; y <= 4; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, Block.stairsNetherQuartz.blockID, 2, 2);
	                }
	            }
	        }

	        par3World.setBlock(xxx + 0, yyy + 4 + takasa, zzz + 5, DqmItemList.Kowarenai4.blockID, 2, 2);
	        par3World.setBlock(xxx - 0, yyy + 4 + takasa, zzz - 5, DqmItemList.Kowarenai4.blockID, 2, 2);
	        par3World.setBlock(xxx + 0, yyy + 4 + takasa, zzz + 2, DqmItemList.Kowarenai4.blockID, 2, 2);
	        par3World.setBlock(xxx - 0, yyy + 4 + takasa, zzz - 2, DqmItemList.Kowarenai4.blockID, 2, 2);

	        for (int z = -1; z <= 1; ++z)
	        {
	            par3World.setBlock(xxx + 0, yyy + 4 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            par3World.setBlock(xxx + (1 * byVal), yyy + 5 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            par3World.setBlock(xxx + (2 * byVal), yyy + 6 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            par3World.setBlock(xxx + (3 * byVal), yyy + 7 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            par3World.setBlock(xxx + (4 * byVal), yyy + 8 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            par3World.setBlock(xxx - (1 * byVal), yyy + 4 + takasa, zzz + z, 0, 2, 2);
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            for (int x = 1; x <= 4; ++x)
	            {
	                for (int y = 9; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            for (int x = 1; x <= +3; ++x)
	            {
	                for (int y = 8; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            for (int x = 1; x <= +2; ++x)
	            {
	                for (int y = 7; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        //内柱
	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - (8 * byVal), yyy + y + takasa, zzz + 5, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (8 * byVal), yyy + 9 + takasa, zzz + 5, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 4 + takasa, zzz + 5, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - (8 * byVal), yyy + y + takasa, zzz - 5, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (8 * byVal), yyy + 9 + takasa, zzz - 5, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 4 + takasa, zzz - 5, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - (4 * byVal), yyy + y + takasa, zzz + 5, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (4 * byVal), yyy + 9 + takasa, zzz + 5, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (4 * byVal), yyy + 4 + takasa, zzz + 5, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx - (4 * byVal), yyy + y + takasa, zzz - 5, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx - (4 * byVal), yyy + 9 + takasa, zzz - 5, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (4 * byVal), yyy + 4 + takasa, zzz - 5, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 6; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx, yyy + y + takasa, zzz + 5, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx, yyy + 9 + takasa, zzz + 5, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 5 + takasa, zzz + 5, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 6; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx, yyy + y + takasa, zzz - 5, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx, yyy + 9 + takasa, zzz - 5, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 5 + takasa, zzz - 5, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx, yyy + y + takasa, zzz + 9, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx, yyy + 9 + takasa, zzz + 9, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 4 + takasa, zzz + 9, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx, yyy + y + takasa, zzz - 9, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx, yyy + 9 + takasa, zzz - 9, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy + 4 + takasa, zzz - 9, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + (5 * byVal), yyy + y + takasa, zzz + 9, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (5 * byVal), yyy + 9 + takasa, zzz + 9, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (5 * byVal), yyy + 4 + takasa, zzz + 9, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + (5 * byVal), yyy + y + takasa, zzz - 9, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (5 * byVal), yyy + 9 + takasa, zzz - 9, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (5 * byVal), yyy + 4 + takasa, zzz - 9, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + (9 * byVal), yyy + y + takasa, zzz + 9, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (9 * byVal), yyy + 9 + takasa, zzz + 9, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (9 * byVal), yyy + 4 + takasa, zzz + 9, DqmItemList.HasiraQ.blockID, 0, 2);

	        for (int y = 5; y <= 8; ++y)
	        {
	            par3World.setBlock(xxx + (9 * byVal), yyy + y + takasa, zzz - 9, DqmItemList.HasiranakaQ.blockID, 0, 2);
	        }

	        par3World.setBlock(xxx + (9 * byVal), yyy + 9 + takasa, zzz - 9, DqmItemList.HasiraueQ.blockID, 0, 2);
	        par3World.setBlock(xxx + (9 * byVal), yyy + 4 + takasa, zzz - 9, DqmItemList.HasiraQ.blockID, 0, 2);

	        //屋根後ろ
	        for (int z = -9; z <= 9; ++z)
	        {
	            for (int x = 0; x <= 9; ++x)
	            {
	                for (int y = 10; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -8; z <= 8; ++z)
	        {
	            for (int x = 1; x <= 8; ++x)
	            {
	                for (int y = 11; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -6; z <= 6; ++z)
	        {
	            for (int x = 1; x <= 7; ++x)
	            {
	                for (int y = 12; y <= 12; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -4; z <= 4; ++z)
	        {
	            for (int x = 1; x <= 6; ++x)
	            {
	                for (int y = 13; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            for (int x = 1; x <= 5; ++x)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = 0; z <= 0; ++z)
	        {
	            for (int x = 1; x <= 3; ++x)
	            {
	                for (int y = 15; y <= 15; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        //屋根後ろ穴
	        for (int z = -8; z <= 8; ++z)
	        {
	            for (int x = 2; x <= 8; ++x)
	            {
	                for (int y = 10; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -6; z <= 6; ++z)
	        {
	            for (int x = 2; x <= 7; ++x)
	            {
	                for (int y = 11; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -4; z <= 4; ++z)
	        {
	            for (int x = 2; x <= 6; ++x)
	            {
	                for (int y = 12; y <= 12; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -2; z <= 2; ++z)
	        {
	            for (int x = 2; x <= 5; ++x)
	            {
	                for (int y = 13; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = 0; z <= 0; ++z)
	        {
	            for (int x = 2; x <= 3; ++x)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        //屋根前
	        for (int z = -5; z <= 5; ++z)
	        {
	            for (int x = -8; x <= -1; ++x)
	            {
	                for (int y = 10; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -4; z <= 4; ++z)
	        {
	            for (int x = -8; x <= 0; ++x)
	            {
	                for (int y = 11; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -3; z <= 3; ++z)
	        {
	            for (int x = -8; x <= 0; ++x)
	            {
	                for (int y = 12; y <= 12; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            for (int x = -7; x <= 0; ++x)
	            {
	                for (int y = 13; y <= 13; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int z = 0; z <= 0; ++z)
	        {
	            for (int x = -6; x <= 0; ++x)
	            {
	                for (int y = 14; y <= 14; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, DqmItemList.Kowarenai4.blockID, 0, 2);
	                }
	            }
	        }

	        for (int x = -8; x <= -1; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 10 + takasa, zzz + 6, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 10 + takasa, zzz - 6, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int x = -6; x <= 0; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 13 + takasa, zzz + 2, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 13 + takasa, zzz - 2, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        par3World.setBlock(xxx - (7 * byVal), yyy + 13 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, 3, 2);
	        par3World.setBlock(xxx - (7 * byVal), yyy + 13 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, 2, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 13 + takasa, zzz , Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 13 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 13 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 12 + takasa, zzz + 3, Block.stairsNetherQuartz.blockID, 3, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 12 + takasa, zzz - 3, Block.stairsNetherQuartz.blockID, 2, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 11 + takasa, zzz + 5, Block.stairsNetherQuartz.blockID, 3, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 11 + takasa, zzz - 5, Block.stairsNetherQuartz.blockID, 2, 2);
	        par3World.setBlock(xxx - (7 * byVal), yyy + 14 + takasa, zzz, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 12 + takasa, zzz, DqmItemList.Kowarenai7.blockID, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 10 + takasa, zzz + 1, 0, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 10 + takasa, zzz - 1, 0, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 10 + takasa, zzz + 3, 0, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 10 + takasa, zzz - 3, 0, 0, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 10 + takasa, zzz, Block.stairsNetherQuartz.blockID, metaV3, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 10 + takasa, zzz + 2, Block.stairsNetherQuartz.blockID, metaV3, 2);
	        par3World.setBlock(xxx - (8 * byVal), yyy + 10 + takasa, zzz - 2, Block.stairsNetherQuartz.blockID, metaV3, 2);
	        par3World.setBlock(xxx, yyy + 15 + takasa, zzz, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        par3World.setBlock(xxx + (4 * byVal), yyy + 15 + takasa, zzz, Block.stairsNetherQuartz.blockID, metaV2, 2);

	        for (int x = 2; x <= 4; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 15 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 15 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, 3, 2);
	        }

	        for (int x = -6; x <= 0; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 14 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 14 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int z = 6; z <= 10; ++z)
	        {
	            par3World.setBlock(xxx  - (1 * byVal), yyy + 10 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int z = -10; z <= -6; ++z)
	        {
	            par3World.setBlock(xxx - (1 * byVal), yyy + 10 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV1, 2);
	        }

	        for (int x = -1; x <= 10; ++x)
	        {
	            par3World.setBlock(xxx + (x * byVal), yyy + 10 + takasa, zzz + 10, Block.stairsNetherQuartz.blockID, 3, 2);
	            par3World.setBlock(xxx + (x * byVal), yyy + 10 + takasa, zzz - 10, Block.stairsNetherQuartz.blockID, 2, 2);
	        }

	        for (int z = -10; z <= 10; ++z)
	        {
	            par3World.setBlock(xxx + (10 * byVal), yyy + 10 + takasa, zzz + z, Block.stairsNetherQuartz.blockID, metaV2, 2);
	        }

	        //屋根前穴
	        for (int z = -4; z <= 4; ++z)
	        {
	            for (int x = -7; x <= 1; ++x)
	            {
	                for (int y = 10; y <= 10; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -3; z <= 3; ++z)
	        {
	            for (int x = -7; x <= 1; ++x)
	            {
	                for (int y = 11; y <= 11; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        for (int z = -1; z <= 1; ++z)
	        {
	            for (int x = -7; x <= 1; ++x)
	            {
	                for (int y = 12; y <= 12; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        //高台椅子
	        par3World.setBlock(xxx + (6 * byVal), yyy + 9 + takasa, zzz, 0, 0, 2);
	        par3World.setBlock(xxx + (5 * byVal), yyy + 9 + takasa, zzz, 0, 0, 2);
	        par3World.setBlock(xxx + (5 * byVal), yyy + 9 + takasa, zzz + 1, 0, 0, 2);
	        par3World.setBlock(xxx + (5 * byVal), yyy + 9 + takasa, zzz  - 1, 0, 0, 2);
	        par3World.setBlock(xxx + (7 * byVal), yyy + 10 + takasa, zzz, Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx + (6 * byVal), yyy + 10 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, 3, 2);
	        par3World.setBlock(xxx + (6 * byVal), yyy + 10 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, 2, 2);
	        par3World.setBlock(xxx + (5 * byVal), yyy + 9 + takasa, zzz, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (5 * byVal), yyy + 9 + takasa, zzz + 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (5 * byVal), yyy + 9 + takasa, zzz - 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        DqmEventDama entitysilverfish = new DqmEventDama(par3World);
	        entitysilverfish.setLocationAndAngles(xxx + (6 * byVal) + 0.5F, yyy + 9 + takasa, zzz + 0.5F, 0.0F, 0.0F);
	        par3World.spawnEntityInWorld(entitysilverfish);
	        //裏の隠し扉
	        par3World.setBlock(xxx + (14 * byVal), yyy + 0 + takasa, zzz + (14 * byVal), DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (14 * byVal), yyy + 0 + takasa, zzz + 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (14 * byVal), yyy + 0 + takasa, zzz - 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (13 * byVal), yyy + 1 + takasa, zzz + 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (13 * byVal), yyy + 1 + takasa, zzz - 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 2 + takasa, zzz + 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 2 + takasa, zzz - 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 2 + takasa, zzz + 2, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 2 + takasa, zzz - 2, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 3 + takasa, zzz + 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 3 + takasa, zzz - 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (11 * byVal), yyy + 3 + takasa, zzz + 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (11 * byVal), yyy + 3 + takasa, zzz - 1, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 3 + takasa, zzz, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (11 * byVal), yyy + 3 + takasa, zzz, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (11 * byVal), yyy + 4 + takasa, zzz, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (10 * byVal), yyy + 4 + takasa, zzz, DqmItemList.Kowarenai4.blockID, 0, 2);
	        par3World.setBlock(xxx + (11 * byVal), yyy + 4 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, 3, 2);
	        par3World.setBlock(xxx + (11 * byVal), yyy + 4 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, 2, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 4 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 4 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx + (12 * byVal), yyy + 4 + takasa, zzz , Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx + (13 * byVal), yyy + 3 + takasa, zzz, Block.stairsNetherQuartz.blockID, metaV2, 2);
	        par3World.setBlock(xxx + (13 * byVal), yyy + 2 + takasa, zzz + 1, Block.stairsNetherQuartz.blockID, 3, 2);
	        par3World.setBlock(xxx + (13 * byVal), yyy + 2 + takasa, zzz - 1, Block.stairsNetherQuartz.blockID, 2, 2);
	        Block block;
	        //block = DqmItemList.KowarenaiDoor3;
	        //int i0 = MathHelper.floor_double((double)((180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
	        //placeDoorBlock(par3World, xxx, yyy + 1 + takasa, zzz + 13, i0, block);

	        for (int x = 9; x <= 12; ++x)
	        {
	            for (int y = 1; y <= 2; ++y)
	            {
	                par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz, 0, 0, 2);
	            }
	        }

	        for (int z = -3; z <= 3; ++z)
	        {
	            for (int x = 1; x <= 8; ++x)
	            {
	                for (int y = 1; y <= 3; ++y)
	                {
	                    par3World.setBlock(xxx + (x * byVal), yyy + y + takasa, zzz + z, 0, 0, 2);
	                }
	            }
	        }

	        //par3World.setBlock(xxx, yyy + 1, zzz + 4, Block.chest.blockID, 0, 2);
	        //DqmWorldChest.Chest4(rand, xxx, yyy + 1, zzz + 4, par3World);
	        //像
	        par3World.setBlock(xxx - (9 * byVal), yyy + 4 + takasa, zzz + 8, DqmItemList.DaizaQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (9 * byVal), yyy + 5 + takasa, zzz + 8, DqmItemList.SKirapan.blockID, 0, 2);
	        par3World.setBlock(xxx - (9 * byVal), yyy + 4 + takasa, zzz - 8, DqmItemList.DaizaQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (9 * byVal), yyy + 5 + takasa, zzz - 8, DqmItemList.SKirapan.blockID, 2, 2);
	        par3World.setBlock(xxx - (3 * byVal), yyy + 4 + takasa, zzz + 7, DqmItemList.DaizaQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (3 * byVal), yyy + 5 + takasa, zzz + 7, DqmItemList.SKirapan.blockID, 0, 2);
	        par3World.setBlock(xxx - (3 * byVal), yyy + 4 + takasa, zzz - 7, DqmItemList.DaizaQ.blockID, 0, 2);
	        par3World.setBlock(xxx - (3 * byVal), yyy + 5 + takasa, zzz - 7, DqmItemList.SKirapan.blockID, 2, 2);
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
