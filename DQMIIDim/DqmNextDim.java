package DQMIIDim;

import java.io.File;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import DQMII.CommonProxy;
import DQMIIDim.genDqm.DqmWorldGenChestN2;
import DQMIIDim.genDqm.DqmWorldGenDokukesisouN2;
import DQMIIDim.genDqm.DqmWorldGenGenkotuN2;
import DQMIIDim.genDqm.DqmWorldGenHako11N2;
import DQMIIDim.genDqm.DqmWorldGenHako12N2;
import DQMIIDim.genDqm.DqmWorldGenHako13N2;
import DQMIIDim.genDqm.DqmWorldGenHako2N2;
import DQMIIDim.genDqm.DqmWorldGenHako3N2;
import DQMIIDim.genDqm.DqmWorldGenHakoN2;
import DQMIIDim.genDqm.DqmWorldGenHoumotukoN2;
import DQMIIDim.genDqm.DqmWorldGenIdoN2;
import DQMIIDim.genDqm.DqmWorldGenMamorinotaneN2;
import DQMIIDim.genDqm.DqmWorldGenSikabaneMobN2;
import DQMIIDim.genDqm.DqmWorldGenSikabaneN2;
import DQMIIDim.genDqm.DqmWorldGenSubayasanotaneN2;
import DQMIIDim.genDqm.DqmWorldGenSword2MobN2;
import DQMIIDim.genDqm.DqmWorldGenSword2N2;
import DQMIIDim.genDqm.DqmWorldGenSwordMobN2;
import DQMIIDim.genDqm.DqmWorldGenSwordN2;
import DQMIIDim.genDqm.DqmWorldGenTaruMobN2;
import DQMIIDim.genDqm.DqmWorldGenTaruN2;
import DQMIIDim.genDqm.DqmWorldGenTikaranotaneN2;
import DQMIIDim.genDqm.DqmWorldGenTubo11N2;
import DQMIIDim.genDqm.DqmWorldGenTubo12N2;
import DQMIIDim.genDqm.DqmWorldGenTubo13N2;
import DQMIIDim.genDqm.DqmWorldGenTubo2N2;
import DQMIIDim.genDqm.DqmWorldGenTubo3N2;
import DQMIIDim.genDqm.DqmWorldGenTuboN2;
import DQMIIDim.genDqm.DqmWorldGenTueN2;
import DQMIIDim.genDqm.DqmWorldGenYakusouN2;
import DQMIIDim.genDqmB.DqmWorldGenChestDim;
import DQMIIDim.handler.BonemealHandler;
import DQMIIDim.handler.LivingDeathEventHandlerN;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "DQMPlusDimensions", name = "DQMPlusDimensions", version = "0.8.2",dependencies="after:DQMⅢ")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)

public class DqmNextDim
{
	//@SidedProxy(modId = "DQMIIDimension1", clientSide = "DQMIIDim.ClientProxyD", serverSide = "DQMIIDim.CommonProxyD")

	public static CommonProxy proxy;
	public static Configuration cfg1;

    public static int cfgDimBlockID1D = 210;
    public static int cfgDimBlockID1G = 230;
    public static int cfgDimItem1ID = 20001;
    public static int cfgDimDebugMode = 0;
    public static int[] cfgDimensionID =  {2, 3, 4, 10, 5, 6, 7, 8, 9, 0, 0, 0};
    public static int[] cfgDimGateID = {1780, 1781, 1782, 1788, 1783, 1784, 1785, 1786, 1787, 0, 0, 0};
    public static int[] cfgDimBiomeID = {80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91};

    public static int cfgDimItem2ID = 20000;
    public static int cfgDimension2ID = -6;
    public static int cfgDimBlock2ID = 226;
    public static int cfgDimGate2ID = 1799;
    public static int cfgDimBiome2ID = 92;
    public static int cfgDimBlockID1 = 1820;

    public static int cfgDimItemConstructID = 20005;

    public static int idxAkuma = 0;
    public static int idxBussitu = 1;
    public static int idxMaju = 2;
    public static int idxMetaru = 3;
    public static int idxSizen = 4;
    public static int idxSuraimu = 5;
    public static int idxTokusyu = 6;
    public static int idxZonbi = 7;
    public static int idxDragon = 8;



    public static int debugCode1;
    public static int debugCode2;
    public static int debugCode3;
    public static int debugCode4;
    public static int debugCode5;
    public static int debugCode6;

	public static String[] GrassName = {"異次元の草地(悪魔)","異次元の草地(物質)","異次元の草地(魔獣)","異次元の草地(メタル)","異次元の草地(自然)","異次元の草地(スライム)","異次元の草地(特殊)","異次元の草地(ゾンビ)","異次元の草地(ドラゴン)"};
	public static String[] DirtName = {"異次元の土(悪魔)","異次元の土(物質)","異次元の土(魔獣)","異次元の土(メタル)","異次元の土(自然)","異次元の土(スライム)","異次元の土(特殊)","異次元の土(ゾンビ)","異次元の土(ドラゴン)"};
	public static String[] DimName = {"悪魔","物質","魔獣","メタル","自然","スライム","特殊","ゾンビ","ドラゴン","Dummy","Dummy","Dummy","Dummy","Dummy","Dummy","Dummy","Dummy"};
	public static String[] DimNameE = {"DEMON","MATERIAL","RABIDFANG","METAL","NATURE","SLIME","SPECIAL","UNDEAD","DRAGON"};
	public static String[] builderName = {"武器屋","武器屋(夜)","武器屋(ネザー)","武器屋(エンド)","修理屋","ゴールド交換","買取屋","ダーマ神殿(転職)","ダーマ神殿(特技習得)","カジノ1","カジノ2","カジノ3"};
	public static String[] builderNameE = {"Bukiya","Bukiya2","BukiyaHell","BukiyaEnd","Syuriya","Ginko","Kaitori","Dama","DamaSkill","Kazino","Kazino2","Kazino3"};
	public static String[] builderBName = {"バズズ","ダークラーミア","デスピサロ","エスターク","キラーマジンガ","マスタードラゴン","竜王","スライムジェネラル","ヤマタノオロチ","ゾーマ","呪いの剣"};
	public static String[] builderBNameE = {"Bazuzu","DarkRamia","DeathPisaro","Esterk","KillerMaginga","MasterDoragon","Ryuou","SlimeGeneral","Yamatanoorochi","Zoma","RotonoTurugi"};

    @Mod.Init
    public void load(FMLInitializationEvent event)
    {
		cfg1 = new Configuration(new File(DQMII.DQM.proxy.getDir(), "config/DQMⅢNext/DQMⅢNext_Dimension.cfg"));
		getConfigDim(cfg1);

		BlockList.registBlocks();
		ItemList.registItems();

		BlockList.setName();
		ItemList.setName();

		ItemList.addRecipe();

		BlockList.setCanSpawn();

		/*
        GameRegistry.registerWorldGenerator(new DqmWorldGenKajinoN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenKajino2N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenKajino3N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenDamaN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenDamaSkillN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenRandanLv1N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenRandanLv2N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenRandanLv3N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenRandanLv4N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenRandanLv5N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenRandanLvAN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenHakodanN2());
*/
        GameRegistry.registerWorldGenerator(new DqmWorldGenHoumotukoN2());
        //GameRegistry.registerWorldGenerator(new DqmWorldGenBossN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenIdoN2());
        //GameRegistry.registerWorldGenerator(new DqmWorldGenBukiyaN2());
        //GameRegistry.registerWorldGenerator(new DqmWorldGenSyuuriN2());
        //GameRegistry.registerWorldGenerator(new DqmWorldGenKaitoriN2());
        //GameRegistry.registerWorldGenerator(new DqmWorldGenOkaneN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenChestDim());
        GameRegistry.registerWorldGenerator(new DqmWorldGenSwordN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenSword2N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenSwordMobN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenSword2MobN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTueN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenChestN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenSikabaneMobN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenGenkotuN2());
        //GameRegistry.registerWorldGenerator(new DqmGenerateSurfaceOreN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenHakoN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenHako2N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenHako3N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenHako11N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenHako12N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenHako13N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTuboN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTubo2N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTubo3N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTubo11N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTubo12N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTubo13N2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenSikabaneN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenYakusouN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenDokukesisouN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTikaranotaneN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenMamorinotaneN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenSubayasanotaneN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTaruN2());
        GameRegistry.registerWorldGenerator(new DqmWorldGenTaruMobN2());


        MinecraftForge.EVENT_BUS.register(new LivingDeathEventHandlerN());
        MinecraftForge.EVENT_BUS.register(new BonemealHandler());

        //System.out.println("ファイル名3:" + event.getSide().toString());

        if(event.getSide().toString() == "CLIENT")
        {
        	TileRegister.registTileEntity();
        }

    }

    @Mod.PreInit
    public void preLoad(FMLPreInitializationEvent event)
    {

    }


    @Mod.PostInit
    public void postLoad(FMLPostInitializationEvent event)
    {
    }

    public void loadConfiguration(Configuration c1)
    {

    }

    public void getConfigDim(Configuration config)
    {
    	config.load();
    	/*
        cfgDimBlockID1D =  config.get("追加dimension1設定", "構成基本ブロックID(+15まで使用)", cfgDimBlockID1D).getInt();
        cfgDimBlockID1G =  config.get("追加dimension1設定", "構成草ブロックID(+15まで使用)", cfgDimBlockID1G).getInt();
        cfgDimItem1ID =  config.get("追加dimension1設定", "キーアイテムID", cfgDimItem1ID).getInt();

        cfgDimensionID[0] =  config.get("追加dimension1DimensinID設定", "悪魔系種族次元ID", cfgDimensionID[0]).getInt();
        cfgDimensionID[1] =  config.get("追加dimension1DimensinID設定", "物質系種族次元ID", cfgDimensionID[1]).getInt();
        cfgDimensionID[2] =  config.get("追加dimension1DimensinID設定", "魔獣系種族次元ID", cfgDimensionID[2]).getInt();
        cfgDimensionID[4] =  config.get("追加dimension1DimensinID設定", "自然系種族次元ID", cfgDimensionID[4]).getInt();
        cfgDimensionID[5] =  config.get("追加dimension1DimensinID設定", "スライム系種族次元ID", cfgDimensionID[5]).getInt();
        cfgDimensionID[6] =  config.get("追加dimension1DimensinID設定", "特殊系種族次元ID", cfgDimensionID[6]).getInt();
        cfgDimensionID[7] =  config.get("追加dimension1DimensinID設定", "ゾンビ系種族次元ID", cfgDimensionID[7]).getInt();
        cfgDimensionID[8] =  config.get("追加dimension1DimensinID設定", "ドラゴン系種族次元ID", cfgDimensionID[8]).getInt();

        cfgDimGateID[0] =  config.get("追加dimension1ゲートID設定", "悪魔系種族次元ゲートID", cfgDimGateID[0]).getInt();
        cfgDimGateID[1] =  config.get("追加dimension1ゲートID設定", "物質系種族次元ゲートID", cfgDimGateID[1]).getInt();
        cfgDimGateID[2] =  config.get("追加dimension1ゲートID設定", "魔獣系種族次元ゲートID", cfgDimGateID[2]).getInt();
        cfgDimGateID[4] =  config.get("追加dimension1ゲートID設定", "自然系種族次元ゲートID", cfgDimGateID[4]).getInt();
        cfgDimGateID[5] =  config.get("追加dimension1ゲートID設定", "スライム系種族次元ゲートID", cfgDimGateID[5]).getInt();
        cfgDimGateID[6] =  config.get("追加dimension1ゲートID設定", "特殊系種族次元ゲートID", cfgDimGateID[6]).getInt();
        cfgDimGateID[7] =  config.get("追加dimension1ゲートID設定", "ゾンビ系種族次元ゲートID", cfgDimGateID[7]).getInt();
        cfgDimGateID[8] =  config.get("追加dimension1ゲートID設定", "ドラゴン系種族次元ゲートID", cfgDimGateID[8]).getInt();
        */

        cfgDimBlock2ID =  config.get("天空次元設定", "構成基本ブロックID(+3まで使用)", cfgDimBlock2ID).getInt();
        //cfgDimBlockID1G =  config.get("天空次元設定", "構成草ブロックID(+15まで使用)", cfgDimBlockID1G).getInt();
        cfgDimItem2ID =  config.get("天空次元設定", "キーアイテムID", cfgDimItem2ID).getInt();
        cfgDimension2ID =  config.get("天空次元設定", "天空次元ID", cfgDimension2ID).getInt();
        cfgDimBiome2ID =  config.get("天空次元設定", "天空次元BiomeID", cfgDimBiome2ID).getInt();


        cfgDimBlockID1D =  config.get("種族別次元設定", "構成基本ブロックID(+15まで使用)", cfgDimBlockID1D).getInt();
        cfgDimBlockID1G =  config.get("種族別次元設定", "構成草ブロックID(+15まで使用)", cfgDimBlockID1G).getInt();
        cfgDimItem1ID =  config.get("種族別次元設定", "キーアイテムID", cfgDimItem1ID).getInt();
        if(cfgDimItem1ID < 0)
        {
        	cfgDimItem1ID = cfgDimItem1ID * -1;
        	cfgDimDebugMode = 1;
        }
        cfgDimBlockID1 =  config.get("種族別次元設定", "追加ブロックID(+10まで使用)", cfgDimBlockID1).getInt();

        cfgDimensionID[0] =  config.get("種族別次元DimensinID設定", "悪魔系種族次元ID", cfgDimensionID[0]).getInt();
        cfgDimensionID[1] =  config.get("種族別次元DimensinID設定", "物質系種族次元ID", cfgDimensionID[1]).getInt();
        cfgDimensionID[2] =  config.get("種族別次元DimensinID設定", "魔獣系種族次元ID", cfgDimensionID[2]).getInt();
        cfgDimensionID[4] =  config.get("種族別次元DimensinID設定", "自然系種族次元ID", cfgDimensionID[4]).getInt();
        cfgDimensionID[5] =  config.get("種族別次元DimensinID設定", "スライム系種族次元ID", cfgDimensionID[5]).getInt();
        cfgDimensionID[6] =  config.get("種族別次元DimensinID設定", "特殊系種族次元ID", cfgDimensionID[6]).getInt();
        cfgDimensionID[7] =  config.get("種族別次元DimensinID設定", "ゾンビ系種族次元ID", cfgDimensionID[7]).getInt();
        cfgDimensionID[8] =  config.get("種族別次元DimensinID設定", "ドラゴン系種族次元ID", cfgDimensionID[8]).getInt();

        cfgDimGateID[0] =  config.get("種族別次元ゲートID設定", "悪魔系種族次元ゲートID", cfgDimGateID[0]).getInt();
        cfgDimGateID[1] =  config.get("種族別次元ゲートID設定", "物質系種族次元ゲートID", cfgDimGateID[1]).getInt();
        cfgDimGateID[2] =  config.get("種族別次元ゲートID設定", "魔獣系種族次元ゲートID", cfgDimGateID[2]).getInt();
        cfgDimGateID[4] =  config.get("種族別次元ゲートID設定", "自然系種族次元ゲートID", cfgDimGateID[4]).getInt();
        cfgDimGateID[5] =  config.get("種族別次元ゲートID設定", "スライム系種族次元ゲートID", cfgDimGateID[5]).getInt();
        cfgDimGateID[6] =  config.get("種族別次元ゲートID設定", "特殊系種族次元ゲートID", cfgDimGateID[6]).getInt();
        cfgDimGateID[7] =  config.get("種族別次元ゲートID設定", "ゾンビ系種族次元ゲートID", cfgDimGateID[7]).getInt();
        cfgDimGateID[8] =  config.get("種族別次元ゲートID設定", "ドラゴン系種族次元ゲートID", cfgDimGateID[8]).getInt();

        cfgDimBiomeID[0] =  config.get("種族別次元BiomeID設定", "悪魔系種族別次元BiomeID", cfgDimBiomeID[0]).getInt();
        cfgDimBiomeID[1] =  config.get("種族別次元BiomeID設定", "物質系種族別次元BiomeID", cfgDimBiomeID[1]).getInt();
        cfgDimBiomeID[2] =  config.get("種族別次元BiomeID設定", "魔獣系種族別次元BiomeID", cfgDimBiomeID[2]).getInt();
        cfgDimBiomeID[4] =  config.get("種族別次元BiomeID設定", "自然系種族別次元BiomeID", cfgDimBiomeID[4]).getInt();
        cfgDimBiomeID[5] =  config.get("種族別次元BiomeID設定", "スライム系種族別次元BiomeID", cfgDimBiomeID[5]).getInt();
        cfgDimBiomeID[6] =  config.get("種族別次元BiomeID設定", "特殊系種族別次元BiomeID", cfgDimBiomeID[6]).getInt();
        cfgDimBiomeID[7] =  config.get("種族別次元BiomeID設定", "ゾンビ系種族別次元BiomeID", cfgDimBiomeID[7]).getInt();
        cfgDimBiomeID[8] =  config.get("種族別次元BiomeID設定", "ドラゴン系種族別次元BiomeID", cfgDimBiomeID[8]).getInt();
        config.save();
    }

    public void registerSmelting(Object object, ItemStack itemStack, float xp)
    {
    	/*
        if(object instanceof ItemStack)
        {
            //Have sub types.
            ItemStack stack = (ItemStack)object;
            FurnaceRecipes.smelting().addSmelting(stack.itemID, stack.getItemDamage(), itemStack, xp);
            return;
        }
        if(object instanceof Block)
        {
            Block block = (Block)object;
            FurnaceRecipes.smelting().addSmelting(block.blockID, itemStack, xp);
            return;
        }
        if(object instanceof Item)
        {
            Item item = (Item)object;
            FurnaceRecipes.smelting().addSmelting(item.itemID, itemStack, xp);
            return;
        }
        System.out.println("Object is not ItemStack, Block or Item!!");
        System.out.println("Can not register smelting recipe.");
        return;
        */
    }
}

