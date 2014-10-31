package DQMIIDim.genDqm;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import DQMII.DQM;
import DQMII.DQM_Classic;
import DQMIIDim.BlockList;
import DQMIIDim.DqmNextDim;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ModContainer;

public class WorldGenFunctions {

	public static boolean canGenerate(Random par1Random, World par2World, int par3, int par4, int par5, int flg)
	{
		BiomeGenBase biome = par2World.getBiomeGenForCoords(par3, par5);
		int idx = 0;

    	for (int cnt = 0; cnt < DqmNextDim.cfgDimBiomeID.length; cnt++)
    	{
    		if(biome.biomeID == DqmNextDim.cfgDimBiomeID[cnt])
    		{
    			idx = cnt;
    			break;
    		}
    	}

		if(flg == 1)
		{
			if(par2World.getBlockId(par3, par4 - 1, par5) == BlockList.DqmDimBlocks_grass[idx].blockID)
			{
				return true;
			}
		}

		return false;
	}

    public static String pickMobName(Random par1Random, World par2World, int par3, int par4, int par5)
    {
    	BiomeGenBase biome = par2World.getBiomeGenForCoords(par3, par5);
    	int idx = 0;
    	int var2 = 0;
    	int var3 = 0;
        String MobName = "";

    	for (int cnt = 0; cnt < DqmNextDim.cfgDimBiomeID.length; cnt++)
    	{
    		if(biome.biomeID == DqmNextDim.cfgDimBiomeID[cnt])
    		{
    			idx = cnt;
    			break;
    		}
    	}


    	if (idx == DqmNextDim.idxAkuma)
    	{
    		var2 = par1Random.nextInt(50);

    		if(var2 < 1)
    		{
    			String[] mobPat = {"アトラス","クイーンモーモン","レッドアーチャー","わんぱくサタン"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 5)
    		{
    			String[] mobPat = {"デビルロード","ギガンテス"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 20)
    		{
    			String[] mobPat = {"アローインプ","バアラック","ケムンクルス","マポレーナ","ピクシー","サイクロプス","シルバーデビル"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"モーモン","おにこぞう","おおめだま","リリパット","スキッパー","スノーモン","つかいま","あくまの書","ベビーサタン","どくやずきん","ドラキー","ドラキーマ","メイジドラキー","ミニデーモン","ナイトウォーカー","ピンクモーモン","スペクテット","タホドラキー"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}else if (idx == DqmNextDim.idxBussitu)
    	{
    		var2 = par1Random.nextInt(50);

    		if(var2 < 1)
    		{
    			String[] mobPat = {"ゴードンヘッド","キラートーチ","ましょうぐも","タイプG"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 5)
    		{
    			String[] mobPat = {"ビッグモアイ","ダークホビット"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 20)
    		{
    			String kiramaTmp = DQM.killKiramasin == 0 ? "メタルハンター" :"キラーマシン";
    			String[] mobPat = {"あんこくまじん","ビッグフェイス","ブラッドソード","ダースギズモ","ゴールドマン","ゴーレム",kiramaTmp,"まおうのかげ","メガザルロック","メタルハンター","メタルハンター","パンドラボックス","ストーンマン"};

    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"あやしいかげ","ドロザラー","ギズモ","ギズモ","ひとくいサーベル","マドハンド","シールドこぞう","スピニー","とげぼうず","わらいぶくろ","ばくだんベビー","ばくだんいわ","ブラッディハンド","フロストギズモ","フロストギズモ","ヒートギズモ","ヒートギズモ","ひとくいばこ","ホロゴースト","ひょうがまじん","ミミック","おばけキャンドル","おどるほうせき","しびれだんびら","スマイルロック","シャドー","ともしびこぞう","ようがんまじん"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}else if (idx == DqmNextDim.idxMaju)
    	{
    		var2 = par1Random.nextInt(50);

    		if(var2 < 1)
    		{
    			String[] mobPat = {"アルケミストン","ゴールデンコーン","キラーピッケル","マーブルン","とげこんぼう"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 20)
    		{
    			String[] mobPat = {"ほたてワラビー","メイジももんじゃ","マジカルハット"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"ビッグハット","ブラウニー","どくろあらい","ダックスビル","いっかくうさぎ","いたずらもぐら","ベビーパンサー","ももんじゃ","おおきづち","プリズニャン","しましまキャット","アルミラージ","ベロニャーゴ","キラーパンサー","キラースコップ","スカルガルー","トンブレロ"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}else if (idx == DqmNextDim.idxMetaru)
    	{
    		var2 = par1Random.nextInt(150);

    		if(var2 < 1)
    		{
    			String[] mobPat = {"はぐれメタルキング","プラチナキング","ダイヤモンドスライム"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 5)
    		{
    			String[] mobPat = {"メタルキング","ドラゴメタル","はぐれメタル","聖銀のどくろあらい"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 50)
    		{
    			String[] mobPat = {"メタルブラザーズ","メタルスライム"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"ゴールデンスライム","ゴールデントーテム"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}else if (idx == DqmNextDim.idxSizen)
    	{
    		var2 = par1Random.nextInt(50);

    		if(var2 < 1)
    		{
    			String[] mobPat = {"ムーンキメラ","チョコヌーバ"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 5)
    		{
    			String[] mobPat = {"アカイライ"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 20)
    		{
    			String[] mobPat = {"ブラックベジター","デッドペッカー","ガニラス","じごくのハサミ","キラークラブ","マージマタンゴ","マグマトロン","レッドサイクロン","スターキメラ","うみぼうず"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"おおがらす","ドロヌーバ","ぐんたいガニ","キメラ","きりかぶおばけ","おばけきのこ","おばけうみうし","おおくちばし","おおなめくじ","リップス","うずしおキング","じんめんちょう","ズッキーニャ","ブチュンパ","ぶっちズッキーニャ","デスフラッター","ひとくいが","ジェリーマン","マタンゴ","メイジキメラ","マジックリップス","しびれあげは","うみうし"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}else if (idx == DqmNextDim.idxSuraimu)
    	{
    		var2 = par1Random.nextInt(50);

    		if(var2 < 5)
    		{
    			String[] mobPat = {"デンガー","ゴッドライダー"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 20)
    		{
    			String[] mobPat = {"バブルキング","ベホマスライム","ダークスライム","ゴールデンスライム","クイーンスライム","スライムベホマズン","スライムカラー","スライムマデュラ"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"バブルスライム","ぶちスライム","ドラゴスライム","ホイミスライム","しびれくらげ","スライム","スライムベス","スライムナイト","スライムタワー","スライムつむり","ベホイミスライム","ベホイムスライム","エンゼルスライム","ゴールデントーテム","キングスライム","マリンスライム","メタルライダー","強スライム","スライムボーグ","スライムブレス","キングスライムもどき"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}else if (idx == DqmNextDim.idxTokusyu)
    	{
    		var2 = par1Random.nextInt(50);

    		if(var2 < 20)
    		{
    			String[] mobPat = {"ドールマスター","パンドラ木箱","ツボック"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"ひとくい木箱","パペットこぞう","つぼ","あくまのツボ","マペットマン","ミミック木箱"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}else if (idx == DqmNextDim.idxZonbi)
    	{
    		var2 = par1Random.nextInt(50);

    		if(var2 < 1)
    		{
    			String[] mobPat = {"シルバーマント"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 5)
    		{
    			String[] mobPat = {"ダークナイト","デスジャッカル","かげのきし","リューイーソー"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else if(var2 < 20)
    		{
    			String[] mobPat = {"バリイドドッグ","ぼうれい剣士","ポムポムボム","プヨンターゲット","しりょうのきし","ソードファントム"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"アニマルゾンビ","バブリン","ベロベロ","がいこつ剣士","ゴースト","ヘルゴースト","メラゴースト","メトロゴースト","さまようたましい","スモールグール","つちわらし"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}else if (idx == DqmNextDim.idxDragon)
    	{
    		var2 = par1Random.nextInt(10);

    		if(var2 < 1)
    		{
    			String[] mobPat = {"ダースドラゴン","ドラゴンダーク","ガメゴンレジェンド"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}else
    		{
    			String[] mobPat = {"バトルレックス","ドラゴン","ドラゴンナイト","ドラゴンライダー","ガメゴン","ガメゴンロード","キースドラゴン"};
    			var3 = par1Random.nextInt(mobPat.length);
    			MobName = mobPat[var3];
    		}
    	}


        //ModContainer mc = FMLCommonHandler.instance().findContainerFor(DQM.instance);
        ModContainer mc;
        if (DQM.ClassicDataLoad == 0)
        {
        	 mc = FMLCommonHandler.instance().findContainerFor(DQM.instance);
        }else
        {
        	mc = FMLCommonHandler.instance().findContainerFor(DQM_Classic.instance);
        }
        String entityModName = String.format("%s.%s", mc.getModId(), MobName);
        if(DqmNextDim.cfgDimDebugMode == 1)
    	{
        	System.out.println("DEBUGLINE名前:" + MobName + "/" + entityModName);
    	}
        return entityModName;
    }
}
