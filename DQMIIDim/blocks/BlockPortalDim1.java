package DQMIIDim.blocks;

import java.util.Random;

import net.minecraft.block.BlockPortal;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import DQMII.DQM;
import DQMII.DqmTabNextBlock;
import DQMIIDim.DqmNextDim;
import DQMIIDim.world.TeleporterRakuenDim;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockPortalDim1 extends BlockPortal
{
	private int constructID;
	private int toDimID;

	@SideOnly(Side.CLIENT)
	//public Icon portalIcon;
	public Icon portalIcon;

    public BlockPortalDim1(int par1, int par2, int par3)
    {
        super(par1);
        this.setTickRandomly(true);
        this.constructID = par2;
        this.toDimID = par3;

        this.setHardness(-1.0F);
        this.setStepSound(soundGlassFootstep);
        this.setLightValue(0.75F);
        this.setCreativeTab(DqmTabNextBlock.DqmTabNBlock);
        this.setUnlocalizedName("BlockPortalDim1_" + par1);

    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);

        if (par1World.provider.isSurfaceWorld() && par5Random.nextInt(2000) < par1World.difficultySetting)
        {
            int l;

            for (l = par3; !par1World.doesBlockHaveSolidTopSurface(par2, l, par4) && l > 0; --l)
            {
                ;
            }

            if (l > 0 && !par1World.isBlockNormalCube(par2, l + 1, par4))
            {
                Entity entity = ItemMonsterPlacer.spawnCreature(par1World, 57, (double)par2 + 0.5D, (double)l + 1.1D, (double)par4 + 0.5D);

                if (entity != null)
                {
                   // entity.timeUntilPortal = entity.getPortalCooldown();
                }
            }
        }
    }


    /**
     * Checks to see if this location is valid to create a portal and will return True if it does. Args: world, x, y, z
     */
    public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4)
    {
    	//System.out.println("TEST4" + this.constructID + "/" + this.toDimID);
        byte b0 = 0;
        byte b1 = 0;


        int xC = 0;
        int zC = 0;
        int xC2 = 0;
        int zC2 = 0;

        if (par1World.getBlockId(par2 + 3, par3, par4) == this.constructID && par1World.isAirBlock(par2 + 1, par3, par4) && par1World.isAirBlock(par2 + 2, par3, par4))
        {
            xC = 1;
        }else if (par1World.getBlockId(par2 - 3, par3, par4) == this.constructID && par1World.isAirBlock(par2 - 1, par3, par4) && par1World.isAirBlock(par2 - 2, par3, par4))
		{
        	xC = -1;
		}

        if (par1World.getBlockId(par2 , par3, par4 + 3) == this.constructID && par1World.isAirBlock(par2, par3, par4 + 1) && par1World.isAirBlock(par2, par3, par4 + 2))
        {
            zC = 1;
        }else if (par1World.getBlockId(par2 , par3, par4 - 3) == this.constructID && par1World.isAirBlock(par2, par3, par4 - 1) && par1World.isAirBlock(par2, par3, par4 - 2))
		{
        	zC = -1;
		}

//System.out.println("TEST5");
        if(xC != 0)
        {
            if (par1World.getBlockId(par2 + (3 * xC), par3, par4 + 1) == this.constructID && par1World.isAirBlock(par2 + (1 * xC), par3, par4 + 1) && par1World.isAirBlock(par2 + (2 * xC), par3, par4 + 1))
            {
                xC2 = 1;
            }else if (par1World.getBlockId(par2 + (3 * xC), par3, par4 - 1) == this.constructID && par1World.isAirBlock(par2 + (1 * xC), par3, par4 - 1) && par1World.isAirBlock(par2 + (2 * xC), par3, par4 - 1))
    		{
            	xC2 = -1;
    		}else
    		{
    			xC = 0;
    		}
        }else if(zC != 0)
        {
            if (par1World.getBlockId(par2 + 1, par3, par4 + (3 * zC)) == this.constructID && par1World.isAirBlock(par2 + 1, par3, par4 + (1 * zC)) && par1World.isAirBlock(par2 + 1, par3, par4 + (2 * zC)))
            {
                zC2 = 1;
            }else if (par1World.getBlockId(par2 - 1, par3, par4 + (3 * zC)) == this.constructID && par1World.isAirBlock(par2 - 1, par3, par4 + (1 * zC)) && par1World.isAirBlock(par2 - 1, par3, par4 + (2 * zC)))
    		{
            	zC2 = -1;
    		}else
    		{
    			zC = 0;
    		}
        }
        //System.out.println("TEST6");
        if(xC == 0 && zC == 0 && zC2 == 0 && xC2 == 0)
        {
        	return false;
        }

        //System.out.println("TEST7");
        if(xC != 0)
        {
        	if (par1World.getBlockId(par2 + (1 * xC), par3, par4 + (2 * xC2)) == this.constructID && par1World.getBlockId(par2 + (2 * xC), par3, par4 + (2 * xC2)) == this.constructID &&
        		par1World.getBlockId(par2 + (1 * xC), par3, par4 - (1 * xC2)) == this.constructID && par1World.getBlockId(par2 + (2 * xC), par3, par4 - (1 * xC2)) == this.constructID)
        	{
        		par1World.setBlock(par2 + (1 * xC), par3, par4, this.blockID, 0, 2);
        		par1World.setBlock(par2 + (2 * xC), par3, par4, this.blockID, 0, 2);

        		par1World.setBlock(par2 + (1 * xC), par3, par4 + (1 * xC2), this.blockID, 0, 2);
        		par1World.setBlock(par2 + (2 * xC), par3, par4 + (1 * xC2), this.blockID, 0, 2);
        	}else
        	{
        		return false;
        	}

        }else if(zC != 0)
        {
        	if (par1World.getBlockId(par2 + (2 * zC2), par3, par4 + (1 * zC)) == this.constructID && par1World.getBlockId(par2 + (2 * zC2), par3, par4 + (2 * zC)) == this.constructID &&
        		par1World.getBlockId(par2 - (1 * zC2), par3, par4 + (1 * zC)) == this.constructID && par1World.getBlockId(par2 - (1 * zC2), par3, par4 + (2 * zC)) == this.constructID)
        	{
        		par1World.setBlock(par2, par3, par4 + (1 * zC), this.blockID, 0, 2);
        		par1World.setBlock(par2, par3, par4 + (2 * zC), this.blockID, 0, 2);

        		par1World.setBlock(par2 + (1 * zC2), par3, par4 + (1 * zC), this.blockID, 0, 2);
        		par1World.setBlock(par2 + (1 * zC2), par3, par4 + (2 * zC), this.blockID, 0, 2);
        	}else
        	{
        		return false;
        	}
        }

            return true;
        //}
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
    	for (int xl = -1; xl <= 1; xl++)
    	{
        	for (int zl = -1; zl <= 1; zl++)
        	{
		        if (par1World.getBlockId(par2 + xl, par3, par4 + zl) != this.blockID && par1World.getBlockId(par2 +xl , par3, par4 + zl) != this.constructID)
		        {
		        	par1World.setBlockToAir(par2, par3, par4);
		        	return;
		        }
        	}
    	}

    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    /*
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return par5 != 0 ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

    */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par1IBlockAccess.getBlockId(par2, par3, par4) == this.blockID)
        {
            return false;
        }
        else
        {

        	return par5 == 0 || par5 == 1;
        }
    }


	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{
		if (!world.isRemote && entity.isEntityAlive() && entity.riddenByEntity == null && entity.ridingEntity == null)
		{
			//entity.posY = 128;
			//entity.prevPosY = 128;
			MinecraftServer server = DQM.proxy.getServer();
			int dimOld = entity.dimension;
			int idx = -1;

			int dimNew;

			if(dimOld == 0)
			{
				dimNew = toDimID;
			}
			else
			{
				dimNew = 0;
			}

			for(int cnt = 0; cnt < DqmNextDim.cfgDimensionID.length; cnt++)
			{
				if(DqmNextDim.cfgDimensionID[cnt] == toDimID)
				{
					idx = cnt;
					break;
				}
			}

			WorldServer worldOld = server.worldServerForDimension(dimOld);
			WorldServer worldNew = server.worldServerForDimension(dimNew);

			Teleporter teleporter = new TeleporterRakuenDim(worldNew, idx, dimOld, dimNew);

//DEBUG
//			Teleporter teleporter = null;

			//if (entity.timeUntilPortal <= 0 && (dimOld == 0 || dimOld == -49))
			if (entity.timeUntilPortal <= 0)
			{
				if (entity instanceof EntityPlayerMP)
				{
					EntityPlayerMP player = (EntityPlayerMP)entity;

					if (!player.isSneaking() && !player.isPotionActive(Potion.confusion))
					{

	                    if(player.dimension == 0)
	                    {
	                        player.mcServer.getConfigurationManager().transferPlayerToDimension(player, this.toDimID, new TeleporterRakuenDim(player.mcServer.worldServerForDimension(this.toDimID), idx, dimOld, dimNew));
	                        player.timeUntilPortal = 200;
	                        player.addPotionEffect(new PotionEffect(Potion.confusion.id, 150, 0));
	                    }
	                    else
	                    {
	                        player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterRakuenDim(player.mcServer.worldServerForDimension(0), idx, dimOld, dimNew));
	                        player.timeUntilPortal = 200;
	                        player.addPotionEffect(new PotionEffect(Potion.confusion.id, 150, 0));
	                    }


						//server.getConfigurationManager().transferPlayerToDimension(player, dimNew, teleporter);


						player.timeUntilPortal = player.getPortalCooldown();
					}
				}
				else
				{

					entity.dimension = dimNew;
					server.getConfigurationManager().transferEntityToWorld(entity, dimOld, worldOld, worldNew, teleporter);
					//server.getConfigurationManager().transferEntityToWorld(entity, dimNew, worldOld, worldNew, teleporter);

					//Entity target = EntityList.createEntityByID(EntityList.getEntityID(entity), worldNew);
					Entity target = EntityList.createEntityByName(EntityList.getEntityString(entity), worldNew);

					if (target != null)
					{
						target.copyDataFrom(entity, true);
						target.isDead = false;
						target.field_98038_p = true;
						target.timeUntilPortal = target.getPortalCooldown();

						worldNew.spawnEntityInWorld(target);
						worldNew.updateEntity(target);
					}

					entity.setDead();

					worldOld.resetUpdateEntityTick();
					worldNew.resetUpdateEntityTick();

				}
			}
			else
			{
				entity.timeUntilPortal = entity.getPortalCooldown();
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon("portal_next");
		portalIcon = iconRegister.registerIcon("portal_next");
	}


    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */

    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        //float f = 0.0625F;
        //float f2 = 0.0F
        float f2 = 0.4F;
    	float f = 0.5F;
        this.setBlockBounds(0.0F, f2, 0.0F, 1.0F, f, 1.0F);
    }


    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    //public int getRenderType()
    //{
    //    return -1;
    //}
}


