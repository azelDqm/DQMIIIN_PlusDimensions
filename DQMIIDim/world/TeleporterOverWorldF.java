package DQMIIDim.world;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.util.LongHashMap;
import net.minecraft.world.PortalPosition;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

import com.google.common.collect.Lists;

public class TeleporterOverWorldF extends Teleporter
{
    private WorldServer worldServerInstance;
    private final LongHashMap destinationCoordinateCache = new LongHashMap();
    private final List destinationCoordinateKeys = new ArrayList();
    private Random random;
    private final List<Long> coordKeys = Lists.newArrayList();
    private final LongHashMap coordCache = new LongHashMap();
    private int dimIdx;
    private int oldDimID;
    private int newDimID;

    public TeleporterOverWorldF(WorldServer par1WorldServer, int oldDim, int newDim)
    {
        super(par1WorldServer);
        this.worldServerInstance = par1WorldServer;
        this.worldServerInstance.customTeleporters.add(this);
        this.random = new Random(par1WorldServer.getSeed());
        this.oldDimID = oldDim;
        this.newDimID = newDim;
    }


	@Override
	public void placeInPortal(Entity entity, double posX, double posY, double posZ, float rotationYaw)
	{
		placeInExistingPortal(entity, posX, posY, posZ, rotationYaw);
	}

    public boolean placeInExistingPortal(Entity par1Entity, double par2, double par4, double par6, float par8)
    {
    	//System.out.println("ファイル名Z:" + this.dimIdx);
        //short short1 = 128;
    	/*
    	short short1 = 128;
        double d3 = -1.0D;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = MathHelper.floor_double(par1Entity.posX);
        int i1 = MathHelper.floor_double(par1Entity.posZ);
        long j1 = ChunkCoordIntPair.chunkXZ2Int(l, i1);
        boolean flag = true;
        double d4;
        int k1;

    	//System.out.println("ファイル名R4");
        if (flag)
        {
            this.destinationCoordinateCache.add(j1, new PortalPosition(this, i, j, k, this.worldServerInstance.getTotalWorldTime()));
            this.destinationCoordinateKeys.add(Long.valueOf(j1));
        }

        double d8 = (double)i + 0.5D;
        double d9 = (double)j + 0.5D;
        d4 = (double)k + 0.5D;
        int j2 = -1;

        if (this.worldServerInstance.getBlockId(i - 1, j, k) == BlockList.DqmDimGateBlockID[this.dimIdx])
        {
            j2 = 2;
        }

        if (this.worldServerInstance.getBlockId(i + 1, j, k) == BlockList.DqmDimGateBlockID[this.dimIdx])
        {
            j2 = 0;
        }

        if (this.worldServerInstance.getBlockId(i, j, k - 1) == BlockList.DqmDimGateBlockID[this.dimIdx])
        {
            j2 = 3;
        }

        if (this.worldServerInstance.getBlockId(i, j, k + 1) == BlockList.DqmDimGateBlockID[this.dimIdx])
        {
            j2 = 1;
        }

        int k2 = par1Entity.getTeleportDirection();

        if (j2 > -1)
        {
            int l2 = Direction.rotateLeft[j2];
            int i3 = Direction.offsetX[j2];
            int j3 = Direction.offsetZ[j2];
            int k3 = Direction.offsetX[l2];
            int l3 = Direction.offsetZ[l2];
            boolean flag1 = !this.worldServerInstance.isAirBlock(i + i3 + k3, j, k + j3 + l3) || !this.worldServerInstance.isAirBlock(i + i3 + k3, j + 1, k + j3 + l3);
            boolean flag2 = !this.worldServerInstance.isAirBlock(i + i3, j, k + j3) || !this.worldServerInstance.isAirBlock(i + i3, j + 1, k + j3);

            if (flag1 && flag2)
            {
                j2 = Direction.rotateOpposite[j2];
                l2 = Direction.rotateOpposite[l2];
                i3 = Direction.offsetX[j2];
                j3 = Direction.offsetZ[j2];
                k3 = Direction.offsetX[l2];
                l3 = Direction.offsetZ[l2];
                k1 = i - k3;
                d8 -= (double)k3;
                int i4 = k - l3;
                d4 -= (double)l3;
                flag1 = !this.worldServerInstance.isAirBlock(k1 + i3 + k3, j, i4 + j3 + l3) || !this.worldServerInstance.isAirBlock(k1 + i3 + k3, j + 1, i4 + j3 + l3);
                flag2 = !this.worldServerInstance.isAirBlock(k1 + i3, j, i4 + j3) || !this.worldServerInstance.isAirBlock(k1 + i3, j + 1, i4 + j3);
            }

            float f1 = 0.5F;
            float f2 = 0.5F;

            if (!flag1 && flag2)
            {
                f1 = 1.0F;
            }
            else if (flag1 && !flag2)
            {
                f1 = 0.0F;
            }
            else if (flag1 && flag2)
            {
                f2 = 0.0F;
            }

            d8 += (double)((float)k3 * f1 + f2 * (float)i3);
            d4 += (double)((float)l3 * f1 + f2 * (float)j3);
            float f3 = 0.0F;
            float f4 = 0.0F;
            float f5 = 0.0F;
            float f6 = 0.0F;

            if (j2 == k2)
            {
                f3 = 1.0F;
                f4 = 1.0F;
            }
            else if (j2 == Direction.rotateOpposite[k2])
            {
                f3 = -1.0F;
                f4 = -1.0F;
            }
            else if (j2 == Direction.rotateRight[k2])
            {
                f5 = 1.0F;
                f6 = -1.0F;
            }
            else
            {
                f5 = -1.0F;
                f6 = 1.0F;
            }

            double d10 = par1Entity.motionX;
            double d11 = par1Entity.motionZ;
            par1Entity.motionX = d10 * (double)f3 + d11 * (double)f6;
            par1Entity.motionZ = d10 * (double)f5 + d11 * (double)f4;
            par1Entity.rotationYaw = par8 - (float)(k2 * 90) + (float)(j2 * 90);
        }
        else
        {
            par1Entity.motionX = par1Entity.motionY = par1Entity.motionZ = 0.0D;
        }
        */
        //System.out.println("ファイル名E2");
        par1Entity.setLocationAndAngles(par2 , 256, par6, par1Entity.rotationYaw, par1Entity.rotationPitch);
        //System.out.println("ファイル名E3");
        return true;

    }

	@Override
	public void removeStalePortalLocations(long time)
	{
		if (time % 100L == 0L)
		{
			Iterator<Long> iterator = coordKeys.iterator();
			long var1 = time - 600L;

			while (iterator.hasNext())
			{
				Long chunkSeed = iterator.next();
				PortalPosition portal = (PortalPosition)coordCache.getValueByKey(chunkSeed);

				if (portal == null || portal.lastUpdateTime < var1)
				{
					iterator.remove();
					coordCache.remove(chunkSeed);
				}
			}
		}
	}

	public boolean checkPosSafely(Entity par1Entity, int x, int y, int z)
	{
		int xA = x;
		int yA = y;
		int zA = z;
		for (int yP = 0; yP <= 1; yP++)
		{
			if(this.worldServerInstance.getBlockId(xA, yA + yP, zA) != 0)
			{
				this.worldServerInstance.setBlock(xA, yA + yP, zA, 0, 0, 2);
			}
		}
		return true;

	}
}

