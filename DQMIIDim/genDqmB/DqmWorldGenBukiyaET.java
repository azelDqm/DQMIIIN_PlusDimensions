package DQMIIDim.genDqmB;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmEventBukiyaEnd;
import DQMII.DqmItemList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenBukiyaET implements IWorldGenerator
{
	private int Hougaku = 0;
	private int yMain = 0;
    public DqmWorldGenBukiyaET(boolean b) {	}
    public DqmWorldGenBukiyaET() {}
    public DqmWorldGenBukiyaET(int face, int par2)
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

        switch(this.Hougaku)
        {
        	case 1: xxx = xxx - 5; break;
        	case 2: zzz = zzz - 5; break;
        	case 3: xxx = xxx + 5; break;
        	case 0: zzz = zzz + 5; break;
        }

        //int yyy = par3World.getHeightValue(xxx, zzz);
        int yyy = this.yMain;

        for (int x = -4; x <= 4; ++x)
        {
            for (int z = -4; z <= 4; ++z)
            {
                for (int y = 0; y <= 2; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                }
            }
        }

        for (int x = -3; x <= 3; ++x)
        {
            for (int z = -3; z <= 3; ++z)
            {
                for (int y = -1; y <= 2; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y, zzz + z, Block.whiteStone.blockID, 0, 2);
                }
            }
        }

        int xStart = -2;
        int xEnd = 2;
        int zStart = -2;
        int zEnd = 2;
        int metaV = 0;

        switch(this.Hougaku)
        {
        	case 1: ++xEnd; break;
        	case 2: ++zEnd; break;
        	case 3: --xStart; break;
        	case 0: --zStart; break;
        }


        for (int x = xStart; x <= xEnd; ++x)
        {
            for (int z = zStart; z <= zEnd; ++z)
            {
                par3World.setBlock(xxx + x, yyy - 1, zzz + z, Block.brick.blockID, 0, 2);
            }
        }

        for (int x = xStart; x <= xEnd; ++x)
        {
            for (int z = zStart; z <= zEnd; ++z)
            {
                for (int y = 0; y <= 2; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                }
            }
        }

        xStart = -2;
        xEnd = 2;
        zStart = -2;
        zEnd = 2;

        switch(this.Hougaku)
        {
        	case 1: zStart = -2; zEnd = 2; xStart = -2; xEnd = 0; break;
        	case 2: zStart = -2; zEnd = 0; xStart = -2; xEnd = 2; break;
        	case 3:  zStart = -2; zEnd = 2; xStart = 0; xEnd = 2; break;
        	case 0: zStart = 0; zEnd = 2; xStart = -2; xEnd = 2; break;
        }
        //*******************************************************************************
        for (int x = xStart; x <= xEnd; ++x)
        {
            for (int z = zStart; z <= zEnd; ++z)
            {
                for (int y = 0; y <= 0; ++y)
                {
                    //par3World.setBlock(xxx + x, yyy + y, zzz + z, DqmItemList.Toumei.blockID, 0, 2);
                	par3World.setBlock(xxx + x, yyy + y, zzz + z, DqmItemList.Toumei.blockID, 0, 2);
                }
            }
        }
        par3World.setBlock(xxx, yyy, zzz, 0, 0, 2);

        //*******************************************************************************

        xStart = 0;
        xEnd = 0;
        zStart = 0;
        zEnd = 0;
        //System.out.println("方角:" + this.Hougaku);
        switch(this.Hougaku)
        {
        	case 1: zStart = -2; zEnd = 2; xStart = 1; xEnd = 1; metaV = 5; break;
        	case 2: zStart = 1; zEnd = 1; xStart = -2; xEnd = 2; metaV = 7; break;
        	case 3:  zStart = -2; zEnd = 2; xStart = -1; xEnd = -1; metaV = 4; break;
        	case 0: zStart = -1; zEnd = -1; xStart = -2; xEnd = 2; metaV = 6; break;
        }

        for (int x = xStart; x <= xEnd; ++x)
        {
        	for (int z = zStart; z <= zEnd; z++)
        	{
        		par3World.setBlock(xxx + x, yyy, zzz + z, Block.stairsWoodOak.blockID, metaV, 2);
        	}
        }

        int byV = 0;
        int tai1 = 0;
        int tai2 = 0;

        if(this.Hougaku == 0 ||this.Hougaku == 2)
        {

        	if (this.Hougaku == 2)
        	{
        		byV = 1;
        		tai1 = 3;
        		tai2 = 1;
        	}else
        	{
        		byV = -1;
        		tai1 = 1;
        		tai2 = 3;
        	}

	        par3World.setBlock(xxx - (2 * byV), yyy, zzz, DqmItemList.Maki.blockID, 0, 2);
	        par3World.setBlock(xxx - (1 * byV), yyy, zzz + (2 * byV), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx + (1 * byV), yyy, zzz + (2 * byV), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx + (2 * byV), yyy, zzz + (2 * byV), DqmItemList.Taimatu2.blockID, 0, 2);
	        par3World.setBlock(xxx - (2 * byV), yyy, zzz + (2 * byV), DqmItemList.Taimatu2.blockID, 0, 2);
	        par3World.setBlock(xxx + (2 * byV), yyy, zzz - (2 * byV), DqmItemList.TaruK.blockID, 0, 2);
	        par3World.setBlock(xxx - (2 * byV), yyy, zzz - (1 * byV), DqmItemList.TuboK.blockID, 0, 2);
	        par3World.setBlock(xxx - (2 * byV), yyy, zzz - (2 * byV), DqmItemList.TuboK.blockID, 0, 2);
	        par3World.setBlock(xxx + (1 * byV), yyy + 1, zzz + (1 * byV), DqmItemList.Hepaitosu.blockID, 0, 2);
	        par3World.setBlock(xxx, yyy, zzz - (2 * byV), DqmItemList.Hondana.blockID, this.Hougaku, 2);
	        par3World.setBlock(xxx - (4 * byV), yyy + 1, zzz + (2 * byV), DqmItemList.Taimatu.blockID, tai1, 2);
	        par3World.setBlock(xxx - (4 * byV), yyy + 1, zzz - (2 * byV), DqmItemList.Taimatu.blockID, tai1, 2);
	        par3World.setBlock(xxx + (4 * byV), yyy + 1, zzz + (2 * byV), DqmItemList.Taimatu.blockID, tai2, 2);
	        par3World.setBlock(xxx + (4 * byV), yyy + 1, zzz - (2 * byV), DqmItemList.Taimatu.blockID, tai2, 2);
	        par3World.setBlock(xxx + (3 * byV), yyy + 1, zzz + (4 * byV), DqmItemList.Bukiya.blockID, this.Hougaku, 2);
	        par3World.setBlock(xxx - (3 * byV), yyy + 1, zzz + (4 * byV), DqmItemList.Bukiya.blockID, this.Hougaku, 2);
        }else
        {
        	if (this.Hougaku == 3)
        	{
        		byV = -1;
        		tai1 = 2;
        		tai2 = 0;
        	}else
        	{
        		byV = 1;
        		tai1 = 0;
        		tai2 = 2;
        	}
	        par3World.setBlock(xxx, yyy, zzz - (2 * byV), DqmItemList.Maki.blockID, 0, 2);
	        par3World.setBlock(xxx + (2 * byV), yyy, zzz - (1 * byV), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx + (2 * byV), yyy, zzz + (1 * byV), DqmItemList.Isu.blockID, 0, 2);
	        par3World.setBlock(xxx + (2 * byV), yyy, zzz + (2 * byV), DqmItemList.Taimatu2.blockID, 0, 2);
	        par3World.setBlock(xxx + (2 * byV), yyy, zzz - (2 * byV), DqmItemList.Taimatu2.blockID, 0, 2);
	        par3World.setBlock(xxx - (2 * byV), yyy, zzz + (2 * byV), DqmItemList.TaruK.blockID, 0, 2);
	        par3World.setBlock(xxx - (1 * byV), yyy, zzz - (2 * byV), DqmItemList.TuboK.blockID, 0, 2);
	        par3World.setBlock(xxx - (2 * byV), yyy, zzz - (2 * byV), DqmItemList.TuboK.blockID, 0, 2);
	        par3World.setBlock(xxx + (1 * byV), yyy + 1, zzz + (1 * byV), DqmItemList.Hepaitosu.blockID, 0, 2);
	        par3World.setBlock(xxx - (2 * byV), yyy, zzz + (1 * byV), DqmItemList.Hondana.blockID, this.Hougaku, 2);
	        par3World.setBlock(xxx + (2 * byV), yyy + 1, zzz - (4 * byV), DqmItemList.Taimatu.blockID, tai1, 2);
	        par3World.setBlock(xxx - (2 * byV), yyy + 1, zzz - (4 * byV), DqmItemList.Taimatu.blockID, tai1, 2);
	        par3World.setBlock(xxx + (2 * byV), yyy + 1, zzz + (4 * byV), DqmItemList.Taimatu.blockID, tai2, 2);
	        par3World.setBlock(xxx - (2 * byV), yyy + 1, zzz + (4 * byV), DqmItemList.Taimatu.blockID, tai2, 2);
	        par3World.setBlock(xxx + (4 * byV), yyy + 1, zzz + (3 * byV), DqmItemList.Bukiya.blockID, this.Hougaku, 2);
	        par3World.setBlock(xxx + (4 * byV), yyy + 1, zzz - (3 * byV), DqmItemList.Bukiya.blockID, this.Hougaku, 2);
        }

        DqmEventBukiyaEnd entitysilverfish = new DqmEventBukiyaEnd(par3World);
        entitysilverfish.setLocationAndAngles(xxx + 0.5F, yyy, zzz + 0.5F, 0.0F, 0.0F);
        par3World.spawnEntityInWorld(entitysilverfish);
    }
}
