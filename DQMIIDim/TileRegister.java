package DQMIIDim;

import net.minecraft.src.ModLoader;
import DQMIIDim.model.DqmTileEntityRenderStairDim;
import DQMIIDim.model.DqmTileEntityStairDim;

public class TileRegister {
    public static void registTileEntity()
    {
    	ModLoader.registerTileEntity(DqmTileEntityStairDim.class, "DqmBlocStairDimID", new DqmTileEntityRenderStairDim());
    }
}
