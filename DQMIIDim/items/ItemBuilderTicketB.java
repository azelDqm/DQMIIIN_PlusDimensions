package DQMIIDim.items;

import java.util.List;
import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmTabNextTutu;
import DQMIIDim.DqmNextDim;
import DQMIIDim.genDqmB.DqmWorldGenBossT;
import DQMIIDim.genDqmB.DqmWorldGenBuildFrame;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBuilderTicketB extends Item
{
	public static int damagePoint;

    public ItemBuilderTicketB(int par1)
    {
        super(par1);
        this.setUnlocalizedName("item.BuilderTicketB.name");
        //this.setCreativeTab(CreativeTabs.tabTools);

        this.setCreativeTab(DqmTabNextTutu.DqmTabNTutu);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.maxStackSize = 64;
    }

    @Override
    public boolean isBookEnchantable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return false;
    }

    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    	if(par2EntityPlayer.dimension != DqmNextDim.cfgDimension2ID)
    	{
    		if(!par3World.isRemote)
    		{
    			par2EntityPlayer.sendChatToPlayer("この世界では使用できないようだ。");
    		}

    		return false;
    	}

    	damagePoint = this.getDamage(par1ItemStack);

        if (par7 == 0)
        {
            --par5;
        }

        if (par7 == 1)
        {
            ++par5;
        }

        if (par7 == 2)
        {
            --par6;
        }

        if (par7 == 3)
        {
            ++par6;
        }

        if (par7 == 4)
        {
            --par4;
        }

        if (par7 == 5)
        {
            ++par4;
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
        	IChunkProvider iChunk = par3World.getChunkProvider();
        	int l = MathHelper.floor_double((double)(par2EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        	if(!par2EntityPlayer.isSneaking())
        	{

        		NBTTagCompound nbt = par1ItemStack.getTagCompound();

	        	if(nbt == null || nbt.getInteger("settingY") == -1)
	        	{
	        		//フレーム設置処理クラスをここでCALL

	            	nbt = new NBTTagCompound();
	            	nbt.setInteger("settingX", par4);
	            	nbt.setInteger("settingY", par5);
	            	nbt.setInteger("settingZ", par6);
	            	par1ItemStack.setTagCompound(nbt);
	            	DqmWorldGenBuildFrame obj = new DqmWorldGenBuildFrame(l, par5, 5, 10, -1);
	            	obj.generate(new Random(), par4, par6, par3World, iChunk, iChunk);

	        		if(!par3World.isRemote)
	        		{
	        			par2EntityPlayer.sendChatToPlayer("この範囲に建築して良い場合はスニーク&右クリックをして下さい。");
	        			par2EntityPlayer.sendChatToPlayer("もう一度右クリックで指定範囲を解除します。");
	        		}
	        	}else
	        	{
	        		//フレーム削除処理
	        		DqmWorldGenBuildFrame obj = new DqmWorldGenBuildFrame(l, nbt.getInteger("settingY"), 5, 10, -1);
	        		obj.remove(new Random(), nbt.getInteger("settingX"), nbt.getInteger("settingZ"), par3World, iChunk, iChunk);
	            	par1ItemStack.setTagCompound(null);
	        	}
	        	return true;
        	}else
        	{
             	NBTTagCompound nbt = par1ItemStack.getTagCompound();
	        	if(nbt == null || nbt.getInteger("settingY") == -1)
	        	{
	        		DqmWorldGenBossT obj = new DqmWorldGenBossT(l, par5, damagePoint);
	        		obj.generate(new Random(), par4, par6, par3World, iChunk, iChunk);
	        	}else
	        	{
	        		DqmWorldGenBuildFrame objR = new DqmWorldGenBuildFrame(l, nbt.getInteger("settingY"), 5, 10, -1);
	        		objR.remove(new Random(), nbt.getInteger("settingX"), nbt.getInteger("settingZ"), par3World, iChunk, iChunk);

	        		DqmWorldGenBossT obj = new DqmWorldGenBossT(l, nbt.getInteger("settingY"), damagePoint);
	        		obj.generate(new Random(), nbt.getInteger("settingX"), nbt.getInteger("settingZ"), par3World, iChunk, iChunk);

	        	}
	            --par1ItemStack.stackSize;
	            return true;
        	}

        }
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("BuilderTicketR");
    }

    @Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		return super.getIconFromDamage(par1);
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		//名前の登録
		return this.getUnlocalizedName() + "_" + par1ItemStack.getItemDamage();
		//return this.getUnlocalizedName();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		//メタデータでアイテムを追加する
		//par3List.add(new ItemStack(this, 1, <メタデータ>));
		for(int cnt = 0; cnt < DqmNextDim.builderBName.length; cnt++)
		{
			par3List.add(new ItemStack(this, 1, cnt));
		}
	}


}
