package DQMIIDim;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;
import DQMII.DQM;
import DQMII.DqmTabNextBlock;
import DQMII.Block.ItemBlockArray;
import DQMIIDim.blocks.BlockPortalDim0;
import DQMIIDim.blocks.BlockPortalDim1;
import DQMIIDim.blocks.BlockPortalDim2;
import DQMIIDim.blocks.DqmBlockBuildFrame;
import DQMIIDim.blocks.DqmBlockHalfSlabDim;
import DQMIIDim.blocks.DqmBlockHalfSlabDim2;
import DQMIIDim.blocks.DqmBlockLeaves;
import DQMIIDim.blocks.DqmBlockLog;
import DQMIIDim.blocks.DqmBlockSapling;
import DQMIIDim.blocks.DqmBlockWood;
import DQMIIDim.blocks.DqmDimBlockDirt;
import DQMIIDim.blocks.DqmDimBlockGrass;
import DQMIIDim.blocks.DqmDimCloud;
import DQMIIDim.blocks.DqmDimStone;
import DQMIIDim.model.DqmBlockModelStairDim;
import DQMIIDim.world.WorldProviderRakuenDim0;
import DQMIIDim.world.WorldProviderRakuenDim1;
import DQMIIDim.world.WorldProviderRakuenDim2;
import DQMIIDim.world.WorldProviderRakuenDim3;
import DQMIIDim.world.WorldProviderRakuenDim4;
import DQMIIDim.world.WorldProviderRakuenDim5;
import DQMIIDim.world.WorldProviderRakuenDim6;
import DQMIIDim.world.WorldProviderRakuenDim7;
import DQMIIDim.world.WorldProviderRakuenDim8;
import DQMIIDim.world.WorldProviderTenkuDim;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockList extends DqmNextDim {

    public static int DqmDimBlocks_grassID = cfgDimBlockID1G;
    public static int DqmDimBlocks_dirtID = cfgDimBlockID1D;
    public static int DqmDimStonrID = cfgDimBlockID1D + 15;
    public static int[] DqmDimGateBlockID = cfgDimGateID;
    public static int DqmDimBlockID = cfgDimBlockID1;

    public static int[] DqmNextDimID = cfgDimensionID;
    public static BlockPortal[] DqmDimGate;

    public static Block[] DqmDimBlocks_grass;
    public static Block[] DqmDimBlocks_dirt;
    public static Block DqmDimStone;
    public static Block DqmBlockLog;
    public static Block DqmBlockLeaves;
    public static Block DqmBlockVine;
    public static Block DqmBlockWood;
    public static Block DqmBlockSapling;


    public static int DqmDimGateBlock2ID  = cfgDimGate2ID;
    public static BlockPortal DqmDimGate2;
    public static Block DqmDimGate2F;
    public static Block DqmDimCloud;
    public static int DqmDimCloudID = cfgDimBlock2ID;

    public static Block DqmDimWoodHalf;
    public static Block DqmDimWoodHalf2;

    public static Block DqmBlockStairsDim;
    public static Block DqmBuildFrame;

    //public static Block DqmBlockStairDim;
    //public static int DqmBlocStairDimID = DqmDimBlockID + 10;


    public static void registBlocks()
    {
        DqmDimBlocks_grass = new Block[9];
        DqmDimBlocks_dirt = new Block[9];
        DqmDimGate = new BlockPortal[9];

		for (int i = 0; i < 9 ; i++)
		{
			DqmDimBlocks_grass[i] = new DqmDimBlockGrass(DqmDimBlocks_grassID + i).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setStepSound(Block.soundGrassFootstep);
			DqmDimBlocks_dirt[i] = new DqmDimBlockDirt(DqmDimBlocks_dirtID + i ,Material.ground).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setStepSound(Block.soundGravelFootstep);
		}

		for(int i = 0; i < DqmNextDimID.length; i++)
		{
			if (DqmNextDimID[i] != 0)
			{
				DqmDimGate[i] = new BlockPortalDim1(DqmDimGateBlockID[i], DqmDimBlocks_dirtID + i, DqmNextDimID[i]);
			}
		}

		DqmDimGate2 = new BlockPortalDim2(DqmDimGateBlock2ID);
		//DqmDimGate[1] = new BlockPortalDim2(DqmDimGateBlockID[0] + 1);

		DqmDimStone = new DqmDimStone(DqmDimStonrID).setHardness(1.5F).setUnlocalizedName("DqmDimStone").setResistance(10.0F).setStepSound(Block.soundStoneFootstep);
		DqmDimCloud = new DqmDimCloud(DqmDimCloudID, Material.grass, false).setUnlocalizedName("DqmDimCloud");
		DqmDimGate2F = new BlockPortalDim0(DqmDimCloudID + 1, 0, 0);

        DimensionManager.registerProviderType(DqmNextDimID[0], WorldProviderRakuenDim0.class, false);
        DimensionManager.registerDimension(DqmNextDimID[0], DqmNextDimID[0]);


        DimensionManager.registerProviderType(DqmNextDimID[1], WorldProviderRakuenDim1.class, false);
        DimensionManager.registerDimension(DqmNextDimID[1], DqmNextDimID[1]);
        DimensionManager.registerProviderType(DqmNextDimID[2], WorldProviderRakuenDim2.class, false);
        DimensionManager.registerDimension(DqmNextDimID[2], DqmNextDimID[2]);
        DimensionManager.registerProviderType(DqmNextDimID[3], WorldProviderRakuenDim3.class, false);
        DimensionManager.registerDimension(DqmNextDimID[3], DqmNextDimID[3]);
        DimensionManager.registerProviderType(DqmNextDimID[4], WorldProviderRakuenDim4.class, false);
        DimensionManager.registerDimension(DqmNextDimID[4], DqmNextDimID[4]);
        DimensionManager.registerProviderType(DqmNextDimID[5], WorldProviderRakuenDim5.class, false);
        DimensionManager.registerDimension(DqmNextDimID[5], DqmNextDimID[5]);
        DimensionManager.registerProviderType(DqmNextDimID[6], WorldProviderRakuenDim6.class, false);
        DimensionManager.registerDimension(DqmNextDimID[6], DqmNextDimID[6]);
        DimensionManager.registerProviderType(DqmNextDimID[7], WorldProviderRakuenDim7.class, false);
        DimensionManager.registerDimension(DqmNextDimID[7], DqmNextDimID[7]);
        DimensionManager.registerProviderType(DqmNextDimID[8], WorldProviderRakuenDim8.class, false);
        DimensionManager.registerDimension(DqmNextDimID[8], DqmNextDimID[8]);

        DimensionManager.registerProviderType(DqmNextDim.cfgDimension2ID, WorldProviderTenkuDim.class, false);
        DimensionManager.registerDimension(DqmNextDim.cfgDimension2ID, DqmNextDim.cfgDimension2ID);

        DqmBlockLog = new DqmBlockLog(DqmDimBlockID).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("DqmBlockLog");
        DqmBlockLeaves = new DqmBlockLeaves(DqmDimBlockID + 1).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setUnlocalizedName("DqmBlockLeaves").setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep);
        DqmBlockWood = new DqmBlockWood(DqmDimBlockID + 2).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setUnlocalizedName("DqmBlockWood").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);
        DqmBlockSapling = new DqmBlockSapling(DqmDimBlockID + 3).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setUnlocalizedName("DqmBlockSapling").setStepSound(Block.soundGrassFootstep);
        //GameRegistry.registerBlock(DqmBlockLog, ItemBlockArray.class, "DqmBlockLog");

        DqmDimWoodHalf = new DqmBlockHalfSlabDim(DqmDimBlockID + 4, false, Material.wood).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setUnlocalizedName("DqmDimWoodHalfSlab").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);
        DqmDimWoodHalf2 = new DqmBlockHalfSlabDim2(DqmDimBlockID + 5, false, Material.wood).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setUnlocalizedName("DqmDimWoodHalfSlab2").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);

        //DqmBlockStairsDim = new DqmBlockStairsDim(DqmDimBlockID + 6, DqmBlockWood).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setUnlocalizedName("DqmDimStairsDim").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);
        DqmBlockStairsDim = new DqmBlockModelStairDim(DqmDimBlockID + 6, Material.wood).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setUnlocalizedName("DqmDimStairsDim").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);
        DqmBuildFrame= new DqmBlockBuildFrame(DqmDimBlockID + 7, Material.glass).setCreativeTab(DqmTabNextBlock.DqmTabNBlock).setUnlocalizedName("DqmBlockBuildFrame").setStepSound(Block.soundGlassFootstep);

        //DqmBlockStairDim = new DqmBlockModelStairDim(DqmBlocStairDimID, Material.wood).setHardness(0.6F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("DqmBlockStairDim").setCreativeTab(DqmTabNextBlock.DqmTabNBlock);

        DQM.AddGrowthBlock.addGrowthBlock(DqmDimCloudID);
        DQM.CheckBassai.addBassaiWoodBlock(DqmDimBlockID);
        DQM.CheckBassai.addBassaiLeaveBlock(DqmDimBlockID + 1);
    }

    public static void setName()
    {
		for (int i = 0; i < DqmDimBlocks_grass.length ; i++)
		{
	    	GameRegistry.registerBlock(DqmDimBlocks_grass[i], "DqmDimBlockGrass_" + i);

	        LanguageRegistry.addName(new ItemStack(DqmDimBlocks_grass[i], 1), "DqmDimBlockGrass_" + i);
	        LanguageRegistry.instance().addNameForObject(new ItemStack(DqmDimBlocks_grass[i], 1), "ja_JP", "異次元の草地(" + DimName[i] + ")");
		}

		for (int i = 0; i < DqmDimBlocks_dirt.length ; i++)
		{
	    	GameRegistry.registerBlock(DqmDimBlocks_dirt[i], "DqmDimBlockDirt_" + i);

	    	//LanguageRegistry.addName(new ItemStack(DqmOreBlocks, 1, 0), "BakudanisiBlock");

	        LanguageRegistry.addName(new ItemStack(DqmDimBlocks_dirt[i], 1), "DqmDimBlockDirt_" + i);
	        LanguageRegistry.instance().addNameForObject(new ItemStack(DqmDimBlocks_dirt[i], 1), "ja_JP", "異次元の土(" + DimName[i] + ")");
		}


		for(int i = 0; i < DqmNextDimID.length; i++)
		{
			if (DqmNextDimID[i] != 0)
			{
		        GameRegistry.registerBlock(DqmDimGate[i]);
		        LanguageRegistry.addName(DqmDimGate[i], "DimGate1_" + i);
		        LanguageRegistry.instance().addNameForObject(DqmDimGate[i], "ja_JP",  "異世界ゲート(" + DimName[i] + ")");
			}
		}

        GameRegistry.registerBlock(DqmDimGate2);
        LanguageRegistry.addName(DqmDimGate2, "DimGate2");
        LanguageRegistry.instance().addNameForObject(DqmDimGate2, "ja_JP",  "天空ゲート");

        GameRegistry.registerBlock(DqmDimStone);
        LanguageRegistry.addName(DqmDimStone, "DqmDimStone");
        LanguageRegistry.instance().addNameForObject(DqmDimStone, "ja_JP",  "異界の石");

        GameRegistry.registerBlock(DqmDimCloud);
        LanguageRegistry.addName(DqmDimCloud, "DqmDimCloud");
        LanguageRegistry.instance().addNameForObject(DqmDimCloud, "ja_JP",  "天空の雲");

        GameRegistry.registerBlock(DqmDimGate2F);
        LanguageRegistry.addName(DqmDimGate2F, "DqmDimGate2F");
        LanguageRegistry.instance().addNameForObject(DqmDimGate2F, "ja_JP",  "天空岩盤ゲート");
        /*
        GameRegistry.registerBlock(DqmDimGate[1]);
        LanguageRegistry.addName(DqmDimGate[1], "Gate2");
        LanguageRegistry.instance().addNameForObject(DqmDimGate[1], "ja_JP", "ゲート2");
        */

		GameRegistry.registerBlock(DqmBlockLog, ItemBlockArray.class, "DqmBlockLog");
        for(int i = 0; i < 9; i++)
		{
			LanguageRegistry.addName(new ItemStack(DqmBlockLog, 1, i), "DqmBlockLog_" + i);
			LanguageRegistry.instance().addNameForObject(new ItemStack(DqmBlockLog, 1, i), "ja_JP", "異世界の原木(" + DqmNextDim.DimName[i] + ")");
	        //LanguageRegistry.addName(DqmBlockLog, "DimGate1_" + i);
	        //LanguageRegistry.instance().addNameForObject(DqmDimGate[i], "ja_JP",  "異世界ゲート(" + DimName[i] + ")");
		}

		GameRegistry.registerBlock(DqmBlockLeaves, ItemBlockArray.class, "DqmBlockLeaves");
        for(int i = 0; i < 9; i++)
		{
			LanguageRegistry.addName(new ItemStack(DqmBlockLeaves, 1, i), "DqmBlockLeaves_" + i);
			LanguageRegistry.instance().addNameForObject(new ItemStack(DqmBlockLeaves, 1, i), "ja_JP", "異世界の木の葉(" + DqmNextDim.DimName[i] + ")");
	        //LanguageRegistry.addName(DqmBlockLog, "DimGate1_" + i);
	        //LanguageRegistry.instance().addNameForObject(DqmDimGate[i], "ja_JP",  "異世界ゲート(" + DimName[i] + ")");
		}

		GameRegistry.registerBlock(DqmBlockWood, ItemBlockArray.class, "DqmBlockWood");
        for(int i = 0; i < 9; i++)
		{
			LanguageRegistry.addName(new ItemStack(DqmBlockWood, 1, i), "DqmBlockWoos_" + i);
			LanguageRegistry.instance().addNameForObject(new ItemStack(DqmBlockWood, 1, i), "ja_JP", "異世界の木材(" + DqmNextDim.DimName[i] + ")");
		}

		GameRegistry.registerBlock(DqmBlockSapling, ItemBlockArray.class, "DqmBlockSapling");
        for(int i = 0; i < 9; i++)
		{
			LanguageRegistry.addName(new ItemStack(DqmBlockSapling, 1, i), "DqmBlockSapling_" + i);
			LanguageRegistry.instance().addNameForObject(new ItemStack(DqmBlockSapling, 1, i), "ja_JP", "異世界の苗木(" + DqmNextDim.DimName[i] + ")");
		}

		GameRegistry.registerBlock(DqmDimWoodHalf, ItemBlockArray.class, "DqmDimWoodHalfSlab");
        for(int i = 0; i < 16; i++)
		{
			LanguageRegistry.addName(new ItemStack(DqmDimWoodHalf, 1, i), "DqmDimWoodHalfSlab_" + i);
			if(i <= 7)
			{
				LanguageRegistry.instance().addNameForObject(new ItemStack(DqmDimWoodHalf, 1, i), "ja_JP", "異世界の木材(" + DqmNextDim.DimName[i] + ")ハーフブロック");
			}else
			{
				LanguageRegistry.instance().addNameForObject(new ItemStack(DqmDimWoodHalf, 1, i), "ja_JP", "異世界の木材(" + DqmNextDim.DimName[i - 8] + ")ハーフブロック");
			}
		}

		GameRegistry.registerBlock(DqmDimWoodHalf2, ItemBlockArray.class, "DqmDimWoodHalfSlab2");
        for(int i = 0; i < 16; i++)
		{
			LanguageRegistry.addName(new ItemStack(DqmDimWoodHalf2, 1, i), "DqmDimWoodHalfSlab2_" + i);
			if(i <= 7)
			{
				LanguageRegistry.instance().addNameForObject(new ItemStack(DqmDimWoodHalf2, 1, i), "ja_JP", "異世界の木材(" + DqmNextDim.DimName[i + 8] + ")ハーフブロック");
			}else
			{
				LanguageRegistry.instance().addNameForObject(new ItemStack(DqmDimWoodHalf2, 1, i), "ja_JP", "異世界の木材(" + DqmNextDim.DimName[i] + ")ハーフブロック");
			}
		}

		GameRegistry.registerBlock(DqmBlockStairsDim, ItemBlockArray.class, "DqmBlockStairsDim");
		//GameRegistry.registerTileEntity(TileEntityBlockInfo.class, "TileEntityBlockInfo");
        for(int i = 0; i < 16; i++)
		{
        	LanguageRegistry.addName(new ItemStack(DqmBlockStairsDim, 1, i), "DqmBlockStairsDim_" + i);
        	LanguageRegistry.instance().addNameForObject(new ItemStack(DqmBlockStairsDim, 1, i), "ja_JP", "異世界の木材(" + DqmNextDim.DimName[i] + ")階段");
		}

        GameRegistry.registerBlock(DqmBuildFrame);
        LanguageRegistry.addName(DqmBuildFrame, "DqmBuildFrame");
        LanguageRegistry.instance().addNameForObject(DqmBuildFrame, "ja_JP",  "建築ガイドライン");


        /*
        GameRegistry.registerBlock(DqmBlockStairDim, "DqmBlockStairDim");
        LanguageRegistry.addName(new ItemStack(DqmBlockStairDim, 1), "DqmBlockStairDim");
        LanguageRegistry.instance().addNameForObject(new ItemStack(DqmBlockStairDim, 1), "ja_JP", "テスト階段");
        */
    }

    public static void setCanSpawn()
    {
		for (int i = 0; i < 9 ; i++)
		{
			DQM.CheckBlock.FieldBlockIDTb.put(DqmDimBlocks_grassID + i, true);
			DQM.CheckBlock.FieldBlockIDTb.put(DqmDimBlocks_dirtID + i, true);
			DQM.CheckBlock.DungeonStructBlockIDTb.put(DqmDimBlocks_grassID + i, true);
			DQM.CheckBlock.DungeonStructBlockIDTb.put(DqmDimBlocks_dirtID + i, true);
		}
		DQM.CheckBlock.FieldBlockIDTb.put(DqmBlockLeaves.blockID, true);
		DQM.CheckBlock.DungeonStructBlockIDTb.put(DqmDimStonrID, true);
		DQM.CheckBlock.DungeonStructBlockIDTb.put(DqmDimStonrID, true);

    }
}
