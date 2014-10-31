package DQMIIDim.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import DQMII.DqmTabNextBlock;
import DQMIIDim.DqmNextDim;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//public class dqb_BlockDirt extends Block {
public class DqmDimBlockDirt extends BlockDirt {
	private Icon blockIcon;
	public DqmDimBlockDirt(int par1, Material par2Material) {
		super(par1);
        //this.setLightValue(1.0F);
        this.setHardness(0.6F);
        this.setResistance(300);
        this.setStepSound(Block.soundGravelFootstep);
        this.setUnlocalizedName("DqmDimBlockDirt_" + (par1 - DqmNextDim.cfgDimBlockID1D));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		//return super.getIcon(par1, par2);
		return this.blockIcon;
	}

	@Override
	public int damageDropped(int par1)
	{
		return par1;
	}

    @Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister par1IconRegister) {
            //テクスチャのパス指定。
            //メタデータは0から2でつまり3未満
            //src/minecraft/assets/samplemod/items/itemsample_(メタデータ).png

		this.blockIcon = par1IconRegister.registerIcon("DqmDimBlockDirt_" + (this.blockID - DqmNextDim.cfgDimBlockID1D));
		this.setCreativeTab(DqmTabNextBlock.DqmTabNBlock);

    }

    @Override
    public int idDropped(int metadata, Random rand, int fortune)
    {
    	 return this.blockID;
    }

    @Override
    public int quantityDropped(Random rand)
    {
        //ブロックを壊した時にドロップする量
        return 1;
    }


    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float disX, float disY, float disZ)
    {
        //ブロックが右クリックされた時
        return false;
    }

}