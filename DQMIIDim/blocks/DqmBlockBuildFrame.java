package DQMIIDim.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import DQMII.DqmTabNextBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DqmBlockBuildFrame extends Block
{

	public DqmBlockBuildFrame(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setCreativeTab(DqmTabNextBlock.DqmTabNBlock);//クリエイティブタブの選択
		this.setUnlocalizedName("buildFrame");	//システム名の設定
		//いらないものは消してください
		this.setHardness(0.1F);			//硬さ
		this.setResistance(5000.0F);		//爆破耐性
		this.setStepSound(Block.soundGlassFootstep);	//ブロックの音
		this.setLightValue(15.0F);		//明るさ 1.0F = 15
	}

	@Override
	public int idDropped(int metadata, Random rand, int fortune)
	{
		//ブロックを壊した時にドロップするもの
		return this.blockID;
	}

	@Override
	public int quantityDropped(Random rand)
	{
		//ブロックを壊した時にドロップする量
		return 0;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float disX, float disY, float disZ)
	{
		//ブロックが右クリックされた時
		return false;
	}

    @Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("buildFrame");
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    public int getRenderBlockPass()
    {
        return 1;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return false;
    }

}