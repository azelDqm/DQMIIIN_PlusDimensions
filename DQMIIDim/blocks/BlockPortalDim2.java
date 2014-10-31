package DQMIIDim.blocks;

import java.util.Random;

import net.minecraft.block.Block;
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
import DQMII.DqmItemList;
import DQMIIDim.DqmNextDim;
import DQMIIDim.world.TeleporterTenkuDim;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockPortalDim2 extends BlockPortal
{
	@SideOnly(Side.CLIENT)
	public Icon portalIcon;

    public BlockPortalDim2(int par1)
    {
        super(par1);
        this.setUnlocalizedName("BlockPortalDim2_" + par1);
        //this.setCreativeTab(DqmTabNextBlock.DqmTabNBlock);
        this.setTickRandomly(true);
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
        int cX = 0;
        int cZ = 0;

        //1段目
        if (par1World.getBlockId(par2 - 1, par3, par4) == Block.blockNetherQuartz.blockID &&
        	par1World.getBlockId(par2 + 1, par3, par4) == Block.blockNetherQuartz.blockID)
        {
        	if(par1World.getBlockId(par2 - 2, par3 + 1, par4) == DqmItemList.HasiraQ.blockID)
        	{
        		cX = -1;
        	}else if(par1World.getBlockId(par2 + 2, par3 + 1, par4) == DqmItemList.HasiraQ.blockID)
        	{
        		cX = 1;
        	}
        }

        if(cX == 0)
        {
            if (par1World.getBlockId(par2, par3, par4 - 1) == Block.blockNetherQuartz.blockID &&
                par1World.getBlockId(par2, par3, par4 - 1) == Block.blockNetherQuartz.blockID)
            {
            	if(par1World.getBlockId(par2, par3 + 1, par4 - 2) == DqmItemList.HasiraQ.blockID)
            	{
            		cZ = -1;
            	}else if(par1World.getBlockId(par2, par3 + 1, par4 + 2) == DqmItemList.HasiraQ.blockID)
            	{
            		cZ = 1;
            	}
            }
        }
        if(cX == 0 && cZ == 0)
        {
        	return false;
        }

        //3段目
        if(!(par1World.getBlockId(par2 + (2 * cX), par3 + 2, par4 + (2 * cZ)) == DqmItemList.HasiranakaQ.blockID) ||
           !(par1World.getBlockId(par2 - (1 * cX), par3 + 2, par4 - (1 * cZ)) == DqmItemList.HasiranakaQ.blockID))
        {
        	return false;
        }

        //4段目
        if(!(par1World.getBlockId(par2 + (2 * cX), par3 + 3, par4 + (2 * cZ)) == DqmItemList.HasiraueQ.blockID) ||
           !(par1World.getBlockId(par2 - (1 * cX), par3 + 3, par4 - (1 * cZ)) == DqmItemList.HasiraueQ.blockID))
        {
        	return false;
        }

        //5段目
        if(par1World.getBlockId(par2, par3 + 4, par4) == Block.stoneSingleSlab.blockID &&
       	   par1World.getBlockMetadata(par2, par3 + 4, par4) == 7 &&
           par1World.getBlockId(par2 + cX, par3 + 4, par4 + cZ) == Block.stoneSingleSlab.blockID &&
           par1World.getBlockMetadata(par2 + cX, par3 + 4, par4 + cZ) == 7)
        {
        }else
        {
        	return false;
        }

        for (int i = 1; i <= 3; i++ )
        {
        	par1World.setBlock(par2, par3 + i, par4, this.blockID, 0, 2);
        	par1World.setBlock(par2 + cX, par3 + i, par4 + cZ, this.blockID, 0, 2);
        }

        return true;
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        int cX = 0;
        int cZ = 0;

    	int par3f;

    	if (par1World.getBlockId(par2, par3 - 1, par4) != this.blockID)
    	{
    		par3f = par3 - 1;
    	}else if (par1World.getBlockId(par2, par3 - 2, par4) != this.blockID)
    	{
    		par3f = par3 - 2;
    	}else
    	{
    		par3f = par3 - 3;
    	}

    	  //1段目
        if (par1World.getBlockId(par2 - 1, par3f, par4) == Block.blockNetherQuartz.blockID &&
        	par1World.getBlockId(par2 + 1, par3f, par4) == Block.blockNetherQuartz.blockID)
        {
        	if(par1World.getBlockId(par2 - 2, par3f + 1, par4) == DqmItemList.HasiraQ.blockID)
        	{
        		cX = -1;
        	}else if(par1World.getBlockId(par2 + 2, par3f + 1, par4) == DqmItemList.HasiraQ.blockID)
        	{
        		cX = 1;
        	}
        }

        if(cX == 0)
        {
            if (par1World.getBlockId(par2, par3f, par4 - 1) == Block.blockNetherQuartz.blockID &&
                par1World.getBlockId(par2, par3f, par4 - 1) == Block.blockNetherQuartz.blockID)
            {
            	if(par1World.getBlockId(par2, par3f + 1, par4 - 2) == DqmItemList.HasiraQ.blockID)
            	{
            		cZ = -1;
            	}else if(par1World.getBlockId(par2, par3f + 1, par4 + 2) == DqmItemList.HasiraQ.blockID)
            	{
            		cZ = 1;
            	}
            }
        }
        if(cX == 0 && cZ == 0)
        {
        	par1World.setBlockToAir(par2, par3, par4);
        	return;
        }
        //3段目
        if(!(par1World.getBlockId(par2 + (2 * cX), par3f + 2, par4 + (2 * cZ)) == DqmItemList.HasiranakaQ.blockID) ||
           !(par1World.getBlockId(par2 - (1 * cX), par3f + 2, par4 - (1 * cZ)) == DqmItemList.HasiranakaQ.blockID))
        {
        	par1World.setBlockToAir(par2, par3, par4);
        	return;
        }
        //4段目
        if(!(par1World.getBlockId(par2 + (2 * cX), par3f + 3, par4 + (2 * cZ)) == DqmItemList.HasiraueQ.blockID) ||
           !(par1World.getBlockId(par2 - (1 * cX), par3f + 3, par4 - (1 * cZ)) == DqmItemList.HasiraueQ.blockID))
        {
        	par1World.setBlockToAir(par2, par3, par4);
        	return;
        }

        //5段目
        if(par1World.getBlockId(par2, par3f + 4, par4) == Block.stoneSingleSlab.blockID &&
       	   par1World.getBlockMetadata(par2, par3f + 4, par4) == 7 &&
           par1World.getBlockId(par2 + cX, par3f + 4, par4 + cZ) == Block.stoneSingleSlab.blockID &&
           par1World.getBlockMetadata(par2 + cX, par3f + 4, par4 + cZ) == 7)
        {
        }else
        {
        	par1World.setBlockToAir(par2, par3, par4);
        	return;
        }

        for (int i = 1; i <= 3; i++ )
        {
        	if(par1World.getBlockId(par2, par3f + i, par4) != this.blockID ||
        	   par1World.getBlockId(par2 + cX, par3f + i, par4 + cZ) != this.blockID)
        	{
        		par1World.setBlockToAir(par2, par3, par4);
            	return;
        	}
        }

    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par1IBlockAccess.getBlockId(par2, par3, par4) == this.blockID)
        {
            return false;
        }
        else
        {
            boolean flag = par1IBlockAccess.getBlockId(par2 - 1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2 - 2, par3, par4) != this.blockID;
            boolean flag1 = par1IBlockAccess.getBlockId(par2 + 1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2 + 2, par3, par4) != this.blockID;
            boolean flag2 = par1IBlockAccess.getBlockId(par2, par3, par4 - 1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4 - 2) != this.blockID;
            boolean flag3 = par1IBlockAccess.getBlockId(par2, par3, par4 + 1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4 + 2) != this.blockID;
            boolean flag4 = flag || flag1;
            boolean flag5 = flag2 || flag3;
            return flag4 && par5 == 4 ? true : (flag4 && par5 == 5 ? true : (flag5 && par5 == 2 ? true : flag5 && par5 == 3));
        }
    }


	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{

		if (!world.isRemote && entity.isEntityAlive() && entity.riddenByEntity == null && entity.ridingEntity == null)
		{
			//entity.posY = 128;
			//entity.prevPosY = 128;
			MinecraftServer server = DQMII.DQM.proxy.getServer();
			int dimOld = entity.dimension;
			//int dimNew = dimOld == -49 ? 0 : -49;
			int dimNew;

			if(dimOld == 0)
			{
				dimNew = DqmNextDim.cfgDimension2ID;
			}
			else
			{
				dimNew = 0;
			}
			WorldServer worldOld = server.worldServerForDimension(dimOld);
			WorldServer worldNew = server.worldServerForDimension(dimNew);
			Teleporter teleporter = new TeleporterTenkuDim(worldNew, dimOld, dimNew);

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
	                        player.mcServer.getConfigurationManager().transferPlayerToDimension(player, DqmNextDim.cfgDimension2ID, new TeleporterTenkuDim(player.mcServer.worldServerForDimension(DqmNextDim.cfgDimension2ID), dimOld, dimNew));
	                        player.timeUntilPortal = 100;
	                        player.addPotionEffect(new PotionEffect(Potion.confusion.id, 150, 0));
	                    }
	                    else
	                    {
	                        player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterTenkuDim(player.mcServer.worldServerForDimension(0), dimOld, dimNew));
	                        player.timeUntilPortal = 100;
	                        player.addPotionEffect(new PotionEffect(Potion.confusion.id, 150, 0));
	                    }

						//worldOld.playSoundToNearExcept(player, "caveworld.caveworld_portal", 0.5F, 1.0F);

						//server.getConfigurationManager().transferPlayerToDimension(player, dimNew, teleporter);

						//player.addExperienceLevel(0);
						//player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 120));
						//player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 20));

						//worldNew.playSoundAtEntity(player, "caveworld.caveworld_portal", 0.75F, 1.0F);

						player.timeUntilPortal = player.getPortalCooldown();
					}
				}
				else
				{
					entity.dimension = dimNew;
					server.getConfigurationManager().transferEntityToWorld(entity, dimOld, worldOld, worldNew, teleporter);

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
		blockIcon = iconRegister.registerIcon("portal2_next");
		portalIcon = iconRegister.registerIcon("portal2_next");
	}
}

