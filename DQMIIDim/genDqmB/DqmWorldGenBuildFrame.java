package DQMIIDim.genDqmB;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMIIDim.BlockList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenBuildFrame implements IWorldGenerator
{
	private int Hougaku = 0;
	private int yMain = 0;
	private int size = 0;
	private int height = 0;
	private int under = 0;

    public DqmWorldGenBuildFrame(boolean b) {	}
    public DqmWorldGenBuildFrame() {}
    public DqmWorldGenBuildFrame(int face, int par2, int size, int height, int under)
    {
    	this.Hougaku = face;
    	this.yMain = par2;
    	this.size = size;
    	this.height = height;
    	this.under = under;
    }
    public void setScale(int i, int j, int k) {	}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int xxx = par1;
        int zzz = par2;

        switch(this.Hougaku)
        {
        	case 1: xxx = xxx - (this.size + 1); break;
        	case 2: zzz = zzz - (this.size + 1); break;
        	case 3: xxx = xxx + (this.size + 1); break;
        	case 0: zzz = zzz + (this.size + 1); break;
        }

        //int yyy = par3World.getHeightValue(xxx, zzz);
        int yyy = this.yMain;

        for (int x = (this.size * -1); x <= this.size; ++x)
        {
        	if(par3World.isAirBlock(xxx + x, yyy + this.height, zzz + this.size))
        		par3World.setBlock(xxx + x, yyy + this.height, zzz + this.size, BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + x, yyy + this.height, zzz + (this.size * -1)))
        		par3World.setBlock(xxx + x, yyy + this.height, zzz + (this.size * -1), BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + x, yyy + under, zzz + this.size))
        		par3World.setBlock(xxx + x, yyy + under, zzz + this.size, BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + x, yyy + under, zzz + (this.size * -1)))
        		par3World.setBlock(xxx + x, yyy + under, zzz + (this.size * -1), BlockList.DqmBuildFrame.blockID, 0, 2);
        }

        for (int z = (this.size * -1); z <= this.size; ++z)
        {
        	if(par3World.isAirBlock(xxx + this.size, yyy + this.height, zzz + z))
        		par3World.setBlock(xxx + this.size, yyy + this.height, zzz + z, BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + (this.size * -1), yyy + this.height, zzz + z))
        		par3World.setBlock(xxx + (this.size * -1), yyy + this.height, zzz + z, BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + this.size, yyy + under, zzz + z))
        		par3World.setBlock(xxx + this.size, yyy + under, zzz + z, BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + (this.size * -1), yyy + under, zzz + z))
        		par3World.setBlock(xxx + (this.size * -1), yyy + under, zzz + z, BlockList.DqmBuildFrame.blockID, 0, 2);
        }

        for (int y = this.under; y <= this.height; ++y)
        {
        	if(par3World.isAirBlock(xxx + this.size, yyy + y, zzz + this.size))
        		par3World.setBlock(xxx + this.size, yyy + y, zzz + this.size, BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + this.size, yyy + y, zzz + (this.size * -1)))
        		par3World.setBlock(xxx + this.size, yyy + y, zzz + (this.size * -1), BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + (this.size * -1), yyy + y, zzz + this.size))
        		par3World.setBlock(xxx + (this.size * -1), yyy + y, zzz + this.size, BlockList.DqmBuildFrame.blockID, 0, 2);

        	if(par3World.isAirBlock(xxx + (this.size * -1), yyy + y, zzz + (this.size * -1)))
        		par3World.setBlock(xxx + (this.size * -1), yyy + y, zzz + (this.size * -1), BlockList.DqmBuildFrame.blockID, 0, 2);
        }
    }

    public void remove(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int xxx = par1;
        int zzz = par2;

        switch(this.Hougaku)
        {
        	case 1: xxx = xxx - (this.size + 1); break;
        	case 2: zzz = zzz - (this.size + 1); break;
        	case 3: xxx = xxx + (this.size + 1); break;
        	case 0: zzz = zzz + (this.size + 1); break;
        }

        //int yyy = par3World.getHeightValue(xxx, zzz);
        int yyy = this.yMain;

        for (int x = (this.size * -1); x <= this.size; ++x)
        {
        	if(par3World.getBlockId(xxx + x, yyy + this.height, zzz + this.size) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + x, yyy + this.height, zzz + this.size, 0, 0, 2);

        	if(par3World.getBlockId(xxx + x, yyy + this.height, zzz + (this.size * -1)) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + x, yyy + this.height, zzz + (this.size * -1), 0, 0, 2);

        	if(par3World.getBlockId(xxx + x, yyy + under, zzz + this.size) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + x, yyy + under, zzz + this.size, 0, 0, 2);

        	if(par3World.getBlockId(xxx + x, yyy + under, zzz + (this.size * -1)) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + x, yyy + under, zzz + (this.size * -1), 0, 0, 2);
        }

        for (int z = (this.size * -1); z <= this.size; ++z)
        {
        	if(par3World.getBlockId(xxx + this.size, yyy + this.height, zzz + z) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + this.size, yyy + this.height, zzz + z, 0, 0, 2);

        	if(par3World.getBlockId(xxx + (this.size * -1), yyy + this.height, zzz + z) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + (this.size * -1), yyy + this.height, zzz + z, 0, 0, 2);

        	if(par3World.getBlockId(xxx + this.size, yyy + under, zzz + z) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + this.size, yyy + under, zzz + z, 0, 0, 2);

        	if(par3World.getBlockId(xxx + (this.size * -1), yyy + under, zzz + z) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + (this.size * -1), yyy + under, zzz + z, 0, 0, 2);
        }

        for (int y = this.under; y <= this.height; ++y)
        {
        	if(par3World.getBlockId(xxx + this.size, yyy + y, zzz + this.size) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + this.size, yyy + y, zzz + this.size,0, 0, 2);

        	if(par3World.getBlockId(xxx + this.size, yyy + y, zzz + (this.size * -1)) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + this.size, yyy + y, zzz + (this.size * -1), 0, 0, 2);

        	if(par3World.getBlockId(xxx + (this.size * -1), yyy + y, zzz + this.size) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + (this.size * -1), yyy + y, zzz + this.size, 0, 0, 2);

        	if(par3World.getBlockId(xxx + (this.size * -1), yyy + y, zzz + (this.size * -1)) == BlockList.DqmBuildFrame.blockID)
        		par3World.setBlock(xxx + (this.size * -1), yyy + y, zzz + (this.size * -1), 0, 0, 2);
        }
    }
}
