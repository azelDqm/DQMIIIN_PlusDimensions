package DQMIIDim.handler;


import java.util.Random;

import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import DQMIIDim.BlockList;
import DQMIIDim.blocks.DqmBlockSapling;

public class BonemealHandler
{
@ForgeSubscribe
public void onUseBonemeal(BonemealEvent event)
{
	if (!event.world.isRemote)
	{
		World par1World = event.world;
		int par2 = event.X;
		int par3 = event.Y;
		int par4 = event.Z;
		Random par5Random = new Random();

		if (par1World.getBlockId(par2, par3, par4) == BlockList.DqmBlockSapling.blockID)
		{
			((DqmBlockSapling)BlockList.DqmBlockSapling).fertilize(par1World, par2, par3, par4, par5Random);
			event.setResult(Result.ALLOW);
		}
	}

}
}