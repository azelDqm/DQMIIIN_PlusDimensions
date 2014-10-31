package DQMIIDim.genDqmB;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmItemList;
import DQMIIDim.BlockList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenBossT implements IWorldGenerator
{
	private int Hougaku = 0;
	private int yMain = 0;
	private int metaVal = 0;
    public DqmWorldGenBossT(boolean b) {	}
    public DqmWorldGenBossT() {}
    public DqmWorldGenBossT(int hougaku, int y, int meta)
    {
    	this.Hougaku = hougaku;
    	this.yMain = y;
    	this.metaVal = meta;
    }
    public void setScale(int i, int j, int k) {	}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        //int xxx = par1 * 16 + rand.nextInt(16);
        //int zzz = par2 * 16 + rand.nextInt(16);
        //int yyy = par3World.getHeightValue(xxx, zzz);
    	int xxx = par1;
    	int zzz = par2;
    	int yyy = yMain;
    	int metaV = this.Hougaku;

    	int meta1 = 3;
    	int meta2 = 2;
    	int meta3 = 1;
    	int meta4 = 0;


    	//System.out.println("方角:" + this.Hougaku);
        switch(this.Hougaku)
        {
        	case 1: xxx = xxx - 6; meta1 = 3; meta2 = 2; meta3 = 1; meta4 = 0; break;
        	case 2: zzz = zzz - 6; break;
        	case 3: xxx = xxx + 6; meta1 = 3; meta2 = 2; meta3 = 1; meta4 = 0; break;
        	case 0: zzz = zzz + 6; break;
        }

        for (int x = -5; x <= 5; ++x)
        {
            for (int z = -5; z <= 5; ++z)
            {
                for (int y = 0; y <= 10; ++y)
                {
                    par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                }
            }
        }

        for (int x = -3; x <= 3; ++x)
        {
        	for (int z = -3; z <= 3; ++z)
        	{
        		par3World.setBlock(xxx + x, yyy - 1, zzz + z, BlockList.DqmDimCloud.blockID, 3, 2);
        	}
        }

        for (int x = -2; x <= 2; ++x)
        {
            for (int z = -2; z <= 2; ++z)
            {
                par3World.setBlock(xxx + x, yyy, zzz + z, Block.waterStill.blockID, 0, 2);
            }
        }

        for (int x = -3; x <= 3; ++x)
        {
            par3World.setBlock(xxx + x, yyy, zzz + 3, Block.stairsStoneBrick.blockID, meta1, 2);
        }

        for (int x = -3; x <= 3; ++x)
        {
            par3World.setBlock(xxx + x, yyy, zzz - 3, Block.stairsStoneBrick.blockID, meta2, 2);
        }

        for (int z = -3; z <= 3; ++z)
        {
            par3World.setBlock(xxx + 3, yyy, zzz + z, Block.stairsStoneBrick.blockID, meta3, 2);
        }

        for (int z = -3; z <= 3; ++z)
        {
            par3World.setBlock(xxx - 3, yyy, zzz + z, Block.stairsStoneBrick.blockID, meta4, 2);
        }

        par3World.setBlock(xxx + 2, yyy + 1, zzz + 2, DqmItemList.Kagaribidai.blockID, 0, 2);
        par3World.setBlock(xxx + 2, yyy + 1, zzz - 2, DqmItemList.Kagaribidai.blockID, 0, 2);
        par3World.setBlock(xxx - 2, yyy + 1, zzz + 2, DqmItemList.Kagaribidai.blockID, 0, 2);
        par3World.setBlock(xxx - 2, yyy + 1, zzz - 2, DqmItemList.Kagaribidai.blockID, 0, 2);
        par3World.setBlock(xxx + 2, yyy + 2, zzz + 2, BlockFire.fire.blockID, 0, 2);
        par3World.setBlock(xxx + 2, yyy + 2, zzz - 2, BlockFire.fire.blockID, 0, 2);
        par3World.setBlock(xxx - 2, yyy + 2, zzz + 2, BlockFire.fire.blockID, 0, 2);
        par3World.setBlock(xxx - 2, yyy + 2, zzz - 2, BlockFire.fire.blockID, 0, 2);

        switch(this.metaVal)
        {
        	case 0:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.BazuzuSekizou.blockID, metaV, 2); break;
        	case 1: par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.DarkRamiaSekizou.blockID, metaV, 2); break;
        	case 2:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.Desupisaro1Sekizou.blockID, metaV, 2); break;
        	case 3:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.EsterkSekizou.blockID, metaV, 2); break;
        	case 4:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.KiramajingaSekizou.blockID, metaV, 2); break;
        	case 5:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.MasterdoragonSekizou.blockID, metaV, 2); break;
        	case 6:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.RyuuouSekizou.blockID, metaV, 2); break;
        	case 7:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.SuraimujeneraruSekizou.blockID, metaV, 2); break;
        	case 8:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.YamatanoorotiSekizou.blockID, metaV, 2); break;
        	case 9:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.ZomaSekizou.blockID, metaV, 2); break;
        	case 10:par3World.setBlock(xxx, yyy + 1, zzz, DqmItemList.RotonoturugiMob.blockID, metaV, 2); break;
        }
    }

}
