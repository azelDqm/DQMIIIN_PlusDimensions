package DQMIIDim;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import DQMII.DqmItemList;
import DQMIIDim.items.ItemBuilderTicket;
import DQMIIDim.items.ItemBuilderTicketB;
import DQMIIDim.items.ItemGateKey2;
import DQMIIDim.items.ItemRakuenKey;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemList extends DqmNextDim {

	public static int ItemRakuenKeyID = cfgDimItem2ID;
	public static int ItemGateKey2ID = cfgDimItem1ID;
	public static int ItemDimConstructID = cfgDimItemConstructID;
	public static Item itemRakuenKey;
	public static Item itemGateKey2;

	public static Item itemDebugKey;
	public static Item itemBuilderTicket;
	public static Item itemBuilderTicketB;

	public static void registItems()
    {
		itemRakuenKey = new ItemRakuenKey(ItemRakuenKeyID);
		itemGateKey2 = new ItemGateKey2(ItemGateKey2ID);
		itemBuilderTicket = new ItemBuilderTicket(ItemDimConstructID);
		itemBuilderTicketB = new ItemBuilderTicketB(ItemDimConstructID + 1);
		//itemDebugKey = new ItemDebugKey(19997);

    }

    public static void setName()
    {
    	GameRegistry.registerItem(itemRakuenKey, "RakuenKey");
    	LanguageRegistry.instance().addNameForObject(itemRakuenKey, "ja_JP", "火打石とダイヤの打ち金");

    	GameRegistry.registerItem(itemGateKey2, "itemGateKey2");
    	LanguageRegistry.instance().addNameForObject(itemGateKey2, "ja_JP", "異界の水差し");


    	GameRegistry.registerItem(itemBuilderTicket, "itemBuilderTicket");
    	for(int cnt = 0; cnt < builderName.length; cnt++)
    	{
	    	LanguageRegistry.addName(new ItemStack(itemBuilderTicket, 1, cnt), "Sekkeizu_(" + DqmNextDim.builderNameE[cnt] + ")");
			LanguageRegistry.instance().addNameForObject(new ItemStack(itemBuilderTicket, 1, cnt), "ja_JP", "構造物設計図(" + DqmNextDim.builderName[cnt] + ")");
    	}

    	GameRegistry.registerItem(itemBuilderTicketB, "itemBuilderTicketB");

    	for(int cnt = 0; cnt < builderBName.length; cnt++)
    	{
	    	LanguageRegistry.addName(new ItemStack(itemBuilderTicketB, 1, cnt), "Sekkeizu_(" + DqmNextDim.builderBNameE[cnt] + ")");
			LanguageRegistry.instance().addNameForObject(new ItemStack(itemBuilderTicketB, 1, cnt), "ja_JP", "構造物設計図(" + DqmNextDim.builderBName[cnt] + ")");
    	}

    	LanguageRegistry.instance().addNameForObject(itemBuilderTicket, "ja_JP", "構造物設計図");


    	//GameRegistry.registerItem(itemDebugKey, "itemDebugKey");
    	//LanguageRegistry.instance().addNameForObject(itemDebugKey, "ja_JP", "デバッグキー");
    }

    public static void addRecipe()
    {
    	GameRegistry.addShapelessRecipe(new ItemStack(itemRakuenKey, 1), new Object[] {new ItemStack(Item.diamond, 1), new ItemStack(Item.flint,1)});

    	GameRegistry.addRecipe(new ItemStack(itemGateKey2 , 1), new Object[]
                {
                    "AXA",
                    "BCB",
                    " C ",
                    'A', Item.slimeBall, 'B', Item.magmaCream, 'X', Item.ghastTear, 'C', new ItemStack(Item.potion,1, 16)
                });

    	for(int cnt = 0; cnt < 9; cnt++)
    	{
    		GameRegistry.addShapelessRecipe(new ItemStack(BlockList.DqmBlockWood, 4, cnt), new Object[] {new ItemStack(BlockList.DqmBlockLog, 1, cnt)});
    	}

    	GameRegistry.addRecipe(new ItemStack(Item.stick , 4), new Object[]
                {
                    "   ",
                    " A ",
                    " A ",
                    'A', BlockList.DqmBlockWood
                });

    	GameRegistry.addRecipe(new ItemStack(Block.workbench , 1), new Object[]
                {
                    "   ",
                    "AA ",
                    "AA ",
                    'A', BlockList.DqmBlockWood
                });
    	GameRegistry.addRecipe(new ItemStack(Block.chest , 1), new Object[]
                {
                    "AAA",
                    "A A",
                    "AAA",
                    'A', BlockList.DqmBlockWood
                });
    	GameRegistry.addRecipe(new ItemStack(Block.chest , 1), new Object[]
                {
                    "   ",
                    "BBB",
                    "AAA",
                    'A', BlockList.DqmBlockWood, 'B', Block.cloth
                });
    	GameRegistry.addRecipe(new ItemStack(Block.chest , 1), new Object[]
                {
                    "AAA",
                    "BBB",
                    "AAA",
                    'A', BlockList.DqmBlockWood, 'B', Item.book
                });
    	GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood , 1), new Object[]
                {
                    "AAA",
                    " B ",
                    " B ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Item.axeWood , 1), new Object[]
                {
                    "AA ",
                    "AB ",
                    " B ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Item.shovelWood , 1), new Object[]
                {
                    " A ",
                    " B ",
                    " B ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Item.swordWood , 1), new Object[]
                {
                    " A ",
                    " A ",
                    " B ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Item.hoeWood , 1), new Object[]
                {
                    "AA ",
                    " B ",
                    " B ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(DqmItemList.Bsword1 , 1), new Object[]
                {
                    "AAB",
                    "   ",
                    "   ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Item.boat , 1), new Object[]
                {
                    "   ",
                    "A A",
                    "AAA",
                    'A', BlockList.DqmBlockWood
                });
    	GameRegistry.addRecipe(new ItemStack(DqmItemList.Kinobousi , 1), new Object[]
                {
                    "AAA",
                    "AAA",
                    "A A",
                    'A', BlockList.DqmBlockWood
                });
    	GameRegistry.addRecipe(new ItemStack(Item.doorWood , 1), new Object[]
                {
                    "AA ",
                    "AA ",
                    "AA ",
                    'A', BlockList.DqmBlockWood
                });
    	GameRegistry.addRecipe(new ItemStack(Block.trapdoor , 2), new Object[]
                {
                    "   ",
                    "AAA",
                    "AAA",
                    'A', BlockList.DqmBlockWood
                });
    	GameRegistry.addRecipe(new ItemStack(Block.fenceGate , 1), new Object[]
                {
                    "   ",
                    "BAB",
                    "BAB",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks , 1), new Object[]
                {
                    "   ",
                    "   ",
                    "AA ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Block.woodenButton , 1), new Object[]
                {
                    "   ",
                    " A ",
                    "   ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Block.jukebox , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', BlockList.DqmBlockWood, 'B', Item.diamond
                });
    	GameRegistry.addRecipe(new ItemStack(Block.music , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', BlockList.DqmBlockWood, 'B', Item.redstone
                });
    	GameRegistry.addRecipe(new ItemStack(Block.pistonBase , 1), new Object[]
                {
                    "AAA",
                    "BCB",
                    "BDB",
                    'A', BlockList.DqmBlockWood, 'B', Block.cobblestone, 'C', Item.ingotIron, 'D', Item.redstone
                });
    	GameRegistry.addRecipe(new ItemStack(Block.tripWireSource , 2), new Object[]
                {
                    " C ",
                    " B ",
                    " A ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick, 'C', Item.ingotIron
                });
    	GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty , 4), new Object[]
                {
                    "   ",
                    "A A",
                    " A ",
                    'A', BlockList.DqmBlockWood
                });
    	GameRegistry.addRecipe(new ItemStack(Item.sign , 3), new Object[]
                {
                    "AAA",
                    "AAA",
                    " B ",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });
    	GameRegistry.addRecipe(new ItemStack(Block.fence , 3), new Object[]
                {
                    "   ",
                    "ABA",
                    "ABA",
                    'A', BlockList.DqmBlockWood, 'B', Item.stick
                });

    	for(int cnt = 0; cnt < 9; cnt++)
    	{
        	GameRegistry.addRecipe(new ItemStack(BlockList.DqmBlockStairsDim, 4, cnt), new Object[]
                    {
                        "  A",
                        " AA",
                        "AAA",
                        'A', new ItemStack(BlockList.DqmBlockWood, 1, cnt)
                    });

    		//GameRegistry.addShapelessRecipe(new ItemStack(BlockList.DqmBlockWood, 4, cnt), new Object[] {new ItemStack(BlockList.DqmBlockLog, 1, cnt)});
    	}

    	for(int cnt = 0; cnt < 9; cnt++)
    	{
    		if (cnt <=7)
    		{
	        	GameRegistry.addRecipe(new ItemStack(BlockList.DqmDimWoodHalf, 6, cnt), new Object[]
	                    {
	                        "   ",
	                        "   ",
	                        "AAA",
	                        'A', new ItemStack(BlockList.DqmBlockWood, 1, cnt)
	                    });
    		}else
    		{
	        	GameRegistry.addRecipe(new ItemStack(BlockList.DqmDimWoodHalf2, 6, cnt - 8), new Object[]
	                    {
	                        "   ",
	                        "   ",
	                        "AAA",
	                        'A', new ItemStack(BlockList.DqmBlockWood, 1, cnt)
	                    });
    		}

    		//GameRegistry.addShapelessRecipe(new ItemStack(BlockList.DqmBlockWood, 4, cnt), new Object[] {new ItemStack(BlockList.DqmBlockLog, 1, cnt)});
    	}
    }
}
