package DQMIIDim.model;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class DqmTileEntityStairDim extends TileEntity
{
	int hougaku=0;
	int muki = 0;

    public Block getBlock()
    {
        return Block.blocksList[this.worldObj.getBlockId(this.xCoord, this.yCoord, this.zCoord)];
    }

    /**
     * Returns block data at the location of this entity (client-only).
     */
    public int getBlockMetadata()
    {
        return this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
    }

    public int getHougakuData()
    {
    	return this.hougaku;
    }

    public void setHougakuData(int par1, World world)
    {
    	this.hougaku = par1;
    	world.notifyBlockChange(xCoord, yCoord, zCoord, 2);
    }

    public int getMuki()
    {
    	return this.muki;
    }

    public void setMukiData(int par1, World world)
    {
    	this.muki = par1;
    	world.notifyBlockChange(xCoord, yCoord, zCoord, 2);
    }


	@Override
	public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        this.hougaku = nbt.getInteger("hougaku");
        this.muki = nbt.getInteger("muki");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
    	super.writeToNBT(nbt);
    	nbt.setInteger("hougaku", this.hougaku);
    	nbt.setInteger("muki", this.muki);
    }

	@Override
	public Packet getDescriptionPacket() {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        this.writeToNBT(nbtTagCompound);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, nbtTagCompound);
	}

	@Override
    public void onDataPacket(INetworkManager net, Packet132TileEntityData pkt) {
        this.readFromNBT(pkt.customParam1);
    }
}
