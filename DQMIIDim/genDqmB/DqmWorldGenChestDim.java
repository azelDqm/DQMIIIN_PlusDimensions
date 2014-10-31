package DQMIIDim.genDqmB;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMIIDim.BlockList;
import DQMIIDim.DqmNextDim;
import DQMIIDim.ItemList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenChestDim implements IWorldGenerator
{
    public static final String DUNGEON_CHEST = null;

    public DqmWorldGenChestDim(boolean b) {	}
    public DqmWorldGenChestDim() {}
    public void setScale(int i, int j, int k) {	}
    public void generate(World par1World, Random rand, int xPos, int yPos, int zPos) {}

    @Override
    public void generate(Random par2Random, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int ran = par2Random.nextInt(750);
        int i = 0;
        int x = par1 * 16 + par2Random.nextInt(16);
        int z = par2 * 16 + par2Random.nextInt(16);
        int y = par3World.getHeightValue(x, z);

        int metaCnt = -1;

        for(int cnt = 0; cnt < BlockList.DqmDimBlocks_grass.length; cnt++)
        {
        	//System.out.println("ファイル名3:" + par3World.getBlockId(x, y - 1, z));
        	if(par3World.getBlockId(x, y - 1, z) == BlockList.DqmDimBlocks_grass[cnt].blockID)
        	{
        		metaCnt = cnt;
        		//break;
        	}
        }

        if (ran >= 745  && metaCnt != -1)
        {
        	//System.out.println("ファイル名5:" + x + "/" + y + "/" + z + ":" + metaCnt);
            int Kakuritu = par2Random.nextInt(4);

            par3World.setBlock(x, y, z, Block.chest.blockID, par2Random.nextInt(4), 2);
            TileEntityChest chest = (TileEntityChest) par3World.getBlockTileEntity(x, y, z);

            int setMeta = 0;

            if(metaCnt == DqmNextDim.idxAkuma)
            {
            	switch(par2Random.nextInt(5))
            	{
            		case 0: setMeta = 0;break;
            		case 1: setMeta = 1;break;
            		case 2: setMeta = 2;break;
            		case 3: setMeta = 5;break;
            		case 4: setMeta = 6;break;
            	}
            }else if(metaCnt == DqmNextDim.idxBussitu)
            {
            	switch(par2Random.nextInt(5))
            	{
            		case 0: setMeta = 1;break;
            		case 1: setMeta = 2;break;
            		case 2: setMeta = 3;break;
            		case 3: setMeta = 4;break;
            		case 4: setMeta = 8;break;
            	}
            }else if(metaCnt == DqmNextDim.idxMaju)
            {
            	switch(par2Random.nextInt(4))
            	{
            		case 0: setMeta = 3;break;
            		case 1: setMeta = 7;break;
            		case 2: setMeta = 8;break;
            		case 3: setMeta = 11;break;
            	}
            }else if(metaCnt == DqmNextDim.idxMetaru)
            {
            	switch(par2Random.nextInt(12))
            	{
            		case 0: setMeta = 0;break;
            		case 1: setMeta = 1;break;
            		case 2: setMeta = 2;break;
            		case 3: setMeta = 31;break;
            		case 4: setMeta = 4;break;
            		case 5: setMeta = 5;break;
            		case 6: setMeta = 6;break;
            		case 7: setMeta = 7;break;
            		case 8: setMeta = 8;break;
            		case 9: setMeta = 9;break;
            		case 10: setMeta = 10;break;
            		case 11: setMeta = 11;break;
            	}
            }else if(metaCnt == DqmNextDim.idxSizen)
            {
            	switch(par2Random.nextInt(4))
            	{
            		case 0: setMeta = 5;break;
            		case 1: setMeta = 7;break;
            		case 2: setMeta = 8;break;
            		case 3: setMeta = 6;break;
            	}
            }else if(metaCnt == DqmNextDim.idxSuraimu)
            {
            	switch(par2Random.nextInt(4))
            	{
            		case 0: setMeta = 0;break;
            		case 1: setMeta = 1;break;
            		case 2: setMeta = 4;break;
            		case 3: setMeta = 7;break;
            	}
            }else if(metaCnt == DqmNextDim.idxTokusyu)
            {
            	switch(par2Random.nextInt(5))
            	{
            		case 0: setMeta = 0;break;
            		case 1: setMeta = 1;break;
            		case 2: setMeta = 2;break;
            		case 3: setMeta = 9;break;
            		case 4: setMeta = 10;break;
            	}
            }else if(metaCnt == DqmNextDim.idxZonbi)
            {
            	switch(par2Random.nextInt(4))
            	{
            		case 0: setMeta = 9;break;
            		case 1: setMeta = 10;break;
            		case 2: setMeta = 11;break;
            		case 3: setMeta = 4;break;
            	}
            }else if(metaCnt == DqmNextDim.idxDragon)
            {
            	switch(par2Random.nextInt(5))
            	{
            		case 0: setMeta = 2;break;
            		case 1: setMeta = 3;break;
            		case 2: setMeta = 7;break;
            		case 3: setMeta = 8;break;
            		case 4: setMeta = 11;break;
            	}
            }

            int ChestNo = par2Random.nextInt(26);
            chest.setInventorySlotContents(ChestNo, new ItemStack(ItemList.itemBuilderTicket.itemID, 1 , setMeta));
        }
    }

    public static DqmWorldGenChestDim getInfo(String dungeonChest)
    {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }
}
