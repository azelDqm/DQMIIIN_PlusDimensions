package DQMIIDim.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityBlockInfo  extends TileEntity{

	int hougaku=0;

	public void setHougaku(int par1)
	{

	}

	public void processActivate(EntityPlayer par5EntityPlayer, World world) {
		//if(!visitor1.equals(par5EntityPlayer.getEntityName()))
		//{
			//visitor5=visitor4;
			//visitor4=visitor3;
			//visitor3=visitor2;
			//visitor2=visitor1;
			//visitor1=par5EntityPlayer.getEntityName();
		//}
		//System.out.println("Visitors: " + visitor1 + ", " + visitor2 + ", " + visitor3 + ", " + visitor4 + ", " + visitor5);
                //par5EntityPlayer.addChatMessage("Visitors: " + visitor1 + ", " + visitor2 + ", " + visitor3 + ", " + visitor4 + ", " + visitor5);
		world.notifyBlockChange(xCoord, yCoord, zCoord, 2);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        this.hougaku = nbt.getInteger("hougaku");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
    	super.writeToNBT(nbt);
    	nbt.setInteger("hougaku", hougaku);
    }

}
