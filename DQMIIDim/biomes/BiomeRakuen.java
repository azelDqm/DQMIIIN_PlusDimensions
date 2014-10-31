package DQMIIDim.biomes;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import DQMII.DQM;
import DQMII.Client.MobEntity.DqmEntityAyasiikage;
import DQMII.Client.MobEntity.DqmEntityBigCrow;
import DQMII.Client.MobEntity.DqmEntityBigguhatto;
import DQMII.Client.MobEntity.DqmEntityBubsura;
import DQMII.Client.MobEntity.DqmEntityBurauni;
import DQMII.Client.MobEntity.DqmEntityButisuraimu;
import DQMII.Client.MobEntity.DqmEntityDokuroarai;
import DQMII.Client.MobEntity.DqmEntityDoronuba;
import DQMII.Client.MobEntity.DqmEntityDorozara;
import DQMII.Client.MobEntity.DqmEntityDragosuraimu;
import DQMII.Client.MobEntity.DqmEntityDucksbill;
import DQMII.Client.MobEntity.DqmEntityGizumo;
import DQMII.Client.MobEntity.DqmEntityGizumoAZ;
import DQMII.Client.MobEntity.DqmEntityGuntaigani;
import DQMII.Client.MobEntity.DqmEntityHitokuikibako;
import DQMII.Client.MobEntity.DqmEntityHitokuisaberu;
import DQMII.Client.MobEntity.DqmEntityHoimisura;
import DQMII.Client.MobEntity.DqmEntityIkkakuusagi;
import DQMII.Client.MobEntity.DqmEntityItamogu;
import DQMII.Client.MobEntity.DqmEntityKimera;
import DQMII.Client.MobEntity.DqmEntityKirapan;
import DQMII.Client.MobEntity.DqmEntityKirikabuobake;
import DQMII.Client.MobEntity.DqmEntityMadohando;
import DQMII.Client.MobEntity.DqmEntityMomon;
import DQMII.Client.MobEntity.DqmEntityMomonja;
import DQMII.Client.MobEntity.DqmEntityObakekinoko;
import DQMII.Client.MobEntity.DqmEntityObakeumiusi;
import DQMII.Client.MobEntity.DqmEntityOnikozou;
import DQMII.Client.MobEntity.DqmEntityOokiduti;
import DQMII.Client.MobEntity.DqmEntityOokutibasi;
import DQMII.Client.MobEntity.DqmEntityOomedama;
import DQMII.Client.MobEntity.DqmEntityOonamekuji;
import DQMII.Client.MobEntity.DqmEntityPapetkozou;
import DQMII.Client.MobEntity.DqmEntityPurizunyan;
import DQMII.Client.MobEntity.DqmEntityRippusu;
import DQMII.Client.MobEntity.DqmEntityRiripat;
import DQMII.Client.MobEntity.DqmEntitySibirekurage;
import DQMII.Client.MobEntity.DqmEntitySimasimacat;
import DQMII.Client.MobEntity.DqmEntitySirudokozou;
import DQMII.Client.MobEntity.DqmEntitySukippaa;
import DQMII.Client.MobEntity.DqmEntitySunomon;
import DQMII.Client.MobEntity.DqmEntitySupini;
import DQMII.Client.MobEntity.DqmEntitySura;
import DQMII.Client.MobEntity.DqmEntitySuraimubesu;
import DQMII.Client.MobEntity.DqmEntitySuraimunaito;
import DQMII.Client.MobEntity.DqmEntitySuraimutawa;
import DQMII.Client.MobEntity.DqmEntitySuraimutumuri;
import DQMII.Client.MobEntity.DqmEntityTogebouzu;
import DQMII.Client.MobEntity.DqmEntityTubo;
import DQMII.Client.MobEntity.DqmEntityTukaima;
import DQMII.Client.MobEntity.DqmEntityUzusioking;
import DQMII.Client.MobEntity.DqmEntityWaraibukuro;
import DQMII.Client.MobEntity.DqmEntityZinmentyou;
import DQMII.Client.MobEntity.DqmEntityZukkinya;
import DQMII.Client.MobEntity2.DqmEntityAkumanosyo;
import DQMII.Client.MobEntity2.DqmEntityAkumanotubo;
import DQMII.Client.MobEntity2.DqmEntityAnimaruzonbi;
import DQMII.Client.MobEntity2.DqmEntityArumiraji;
import DQMII.Client.MobEntity2.DqmEntityBaburin;
import DQMII.Client.MobEntity2.DqmEntityBakudanbebi;
import DQMII.Client.MobEntity2.DqmEntityBakudaniwa;
import DQMII.Client.MobEntity2.DqmEntityBebisatan;
import DQMII.Client.MobEntity2.DqmEntityBehoimisuraimu;
import DQMII.Client.MobEntity2.DqmEntityBehoimusuraimu;
import DQMII.Client.MobEntity2.DqmEntityBerobero;
import DQMII.Client.MobEntity2.DqmEntityBeronyaago;
import DQMII.Client.MobEntity2.DqmEntityBuchunpa;
import DQMII.Client.MobEntity2.DqmEntityBuraddihando;
import DQMII.Client.MobEntity2.DqmEntityButtizukinya;
import DQMII.Client.MobEntity2.DqmEntityDesufuratta;
import DQMII.Client.MobEntity2.DqmEntityDokuyazukin;
import DQMII.Client.MobEntity2.DqmEntityDoraki;
import DQMII.Client.MobEntity2.DqmEntityDorakima;
import DQMII.Client.MobEntity2.DqmEntityEnzeruslime;
import DQMII.Client.MobEntity2.DqmEntityFgizumo;
import DQMII.Client.MobEntity2.DqmEntityFurosutogizumo;
import DQMII.Client.MobEntity2.DqmEntityGaikotukensi;
import DQMII.Client.MobEntity2.DqmEntityGhost;
import DQMII.Client.MobEntity2.DqmEntityGorudentotemu;
import DQMII.Client.MobEntity2.DqmEntityHerughost;
import DQMII.Client.MobEntity2.DqmEntityHgizumo;
import DQMII.Client.MobEntity2.DqmEntityHiitogizumo;
import DQMII.Client.MobEntity2.DqmEntityHitokuibako;
import DQMII.Client.MobEntity2.DqmEntityHitokuiga;
import DQMII.Client.MobEntity2.DqmEntityHoroghost;
import DQMII.Client.MobEntity2.DqmEntityHyouganmajin;
import DQMII.Client.MobEntity2.DqmEntityJeriman;
import DQMII.Client.MobEntity2.DqmEntityKingsura;
import DQMII.Client.MobEntity2.DqmEntityKirapan2;
import DQMII.Client.MobEntity2.DqmEntityKirasuko;
import DQMII.Client.MobEntity2.DqmEntityMapetman;
import DQMII.Client.MobEntity2.DqmEntityMarinsuraimu;
import DQMII.Client.MobEntity2.DqmEntityMatango;
import DQMII.Client.MobEntity2.DqmEntityMeijidoraki;
import DQMII.Client.MobEntity2.DqmEntityMeijikimera;
import DQMII.Client.MobEntity2.DqmEntityMeragosuto;
import DQMII.Client.MobEntity2.DqmEntityMetaruraida;
import DQMII.Client.MobEntity2.DqmEntityMetoroghost;
import DQMII.Client.MobEntity2.DqmEntityMimikku;
import DQMII.Client.MobEntity2.DqmEntityMimikkukibako;
import DQMII.Client.MobEntity2.DqmEntityMinidemon;
import DQMII.Client.MobEntity2.DqmEntityMrippusu;
import DQMII.Client.MobEntity2.DqmEntityNightwalker;
import DQMII.Client.MobEntity2.DqmEntityObakekyandoru;
import DQMII.Client.MobEntity2.DqmEntityOdoruhouseki;
import DQMII.Client.MobEntity2.DqmEntityPinkmomon;
import DQMII.Client.MobEntity2.DqmEntitySamayoutamasii;
import DQMII.Client.MobEntity2.DqmEntitySibireageha;
import DQMII.Client.MobEntity2.DqmEntitySibiredanbira;
import DQMII.Client.MobEntity2.DqmEntitySkullgaroo;
import DQMII.Client.MobEntity2.DqmEntitySumairurokku;
import DQMII.Client.MobEntity2.DqmEntitySumoruguru;
import DQMII.Client.MobEntity2.DqmEntitySupekutetto;
import DQMII.Client.MobEntity2.DqmEntitySura2;
import DQMII.Client.MobEntity2.DqmEntitySuraimubogu;
import DQMII.Client.MobEntity2.DqmEntitySuraimuburesu;
import DQMII.Client.MobEntity2.DqmEntitySuraimuking;
import DQMII.Client.MobEntity2.DqmEntitySyado;
import DQMII.Client.MobEntity2.DqmEntityTahodoraki;
import DQMII.Client.MobEntity2.DqmEntityTomosibikozou;
import DQMII.Client.MobEntity2.DqmEntityTonburero;
import DQMII.Client.MobEntity2.DqmEntityTutiwarasi;
import DQMII.Client.MobEntity2.DqmEntityUmiusi;
import DQMII.Client.MobEntity2.DqmEntityYouganmajin;
import DQMII.Client.MobEntityEnd.DqmEntityAkairai;
import DQMII.Client.MobEntityEnd.DqmEntityBiggumoai;
import DQMII.Client.MobEntityEnd.DqmEntityDakuhobitto;
import DQMII.Client.MobEntityEnd.DqmEntityDakunaito;
import DQMII.Client.MobEntityEnd.DqmEntityDasudragon;
import DQMII.Client.MobEntityEnd.DqmEntityDebirurodo;
import DQMII.Client.MobEntityEnd.DqmEntityDenga;
import DQMII.Client.MobEntityEnd.DqmEntityDesujakkaru;
import DQMII.Client.MobEntityEnd.DqmEntityDragondarknaito;
import DQMII.Client.MobEntityEnd.DqmEntityGamegonrejendo;
import DQMII.Client.MobEntityEnd.DqmEntityGigantesu;
import DQMII.Client.MobEntityEnd.DqmEntityGodraida;
import DQMII.Client.MobEntityEnd.DqmEntityKagenokisi;
import DQMII.Client.MobEntityEnd.DqmEntityRyuiso;
import DQMII.Client.MobEntityHell.DqmEntityAnkokumajin;
import DQMII.Client.MobEntityHell.DqmEntityAroinpu;
import DQMII.Client.MobEntityHell.DqmEntityBaburuking;
import DQMII.Client.MobEntityHell.DqmEntityBarakku;
import DQMII.Client.MobEntityHell.DqmEntityBariidodog;
import DQMII.Client.MobEntityHell.DqmEntityBatorurex;
import DQMII.Client.MobEntityHell.DqmEntityBehomasuraimu;
import DQMII.Client.MobEntityHell.DqmEntityBiggufeisu;
import DQMII.Client.MobEntityHell.DqmEntityBoureikensi;
import DQMII.Client.MobEntityHell.DqmEntityBuraddosodo;
import DQMII.Client.MobEntityHell.DqmEntityBurakkubejita;
import DQMII.Client.MobEntityHell.DqmEntityDarkslime;
import DQMII.Client.MobEntityHell.DqmEntityDeddopekka;
import DQMII.Client.MobEntityHell.DqmEntityDgizumo;
import DQMII.Client.MobEntityHell.DqmEntityDollmaster;
import DQMII.Client.MobEntityHell.DqmEntityDqmdragon;
import DQMII.Client.MobEntityHell.DqmEntityDragonnaito;
import DQMII.Client.MobEntityHell.DqmEntityDragonraida;
import DQMII.Client.MobEntityHell.DqmEntityGamegon;
import DQMII.Client.MobEntityHell.DqmEntityGamegonload;
import DQMII.Client.MobEntityHell.DqmEntityGanirasu;
import DQMII.Client.MobEntityHell.DqmEntityGoldman;
import DQMII.Client.MobEntityHell.DqmEntityGoremu;
import DQMII.Client.MobEntityHell.DqmEntityGorudensuraimu;
import DQMII.Client.MobEntityHell.DqmEntityHotatewarabi;
import DQMII.Client.MobEntityHell.DqmEntityJigokunohasami;
import DQMII.Client.MobEntityHell.DqmEntityKemunkurusu;
import DQMII.Client.MobEntityHell.DqmEntityKirakurabu;
import DQMII.Client.MobEntityHell.DqmEntityKiramasin;
import DQMII.Client.MobEntityHell.DqmEntityKisudragon;
import DQMII.Client.MobEntityHell.DqmEntityKuinsuraimu;
import DQMII.Client.MobEntityHell.DqmEntityMagematango;
import DQMII.Client.MobEntityHell.DqmEntityMagemomonja;
import DQMII.Client.MobEntityHell.DqmEntityMagumaron;
import DQMII.Client.MobEntityHell.DqmEntityMajikaruhatto;
import DQMII.Client.MobEntityHell.DqmEntityMaounokage;
import DQMII.Client.MobEntityHell.DqmEntityMaporena;
import DQMII.Client.MobEntityHell.DqmEntityMegazarurokku;
import DQMII.Client.MobEntityHell.DqmEntityMetaruhanta;
import DQMII.Client.MobEntityHell.DqmEntityMetaruhantaken;
import DQMII.Client.MobEntityHell.DqmEntityPandorabox;
import DQMII.Client.MobEntityHell.DqmEntityPandorakibako;
import DQMII.Client.MobEntityHell.DqmEntityPikusi;
import DQMII.Client.MobEntityHell.DqmEntityPombom;
import DQMII.Client.MobEntityHell.DqmEntityPuyon;
import DQMII.Client.MobEntityHell.DqmEntityRedsaikuron;
import DQMII.Client.MobEntityHell.DqmEntitySaikuropusu;
import DQMII.Client.MobEntityHell.DqmEntitySirubadebiru;
import DQMII.Client.MobEntityHell.DqmEntitySiryounokisi;
import DQMII.Client.MobEntityHell.DqmEntitySodofantomu;
import DQMII.Client.MobEntityHell.DqmEntityStarkimera;
import DQMII.Client.MobEntityHell.DqmEntityStonman;
import DQMII.Client.MobEntityHell.DqmEntitySuraimubehomazun;
import DQMII.Client.MobEntityHell.DqmEntitySuraimuhaitawa;
import DQMII.Client.MobEntityHell.DqmEntitySuraimumadyura;
import DQMII.Client.MobEntityHell.DqmEntityTubokku;
import DQMII.Client.MobEntityHell.DqmEntityUmibouzu;
import DQMII.Client.MobEntityMetaru.DqmEntityDaiyamondosuraimu;
import DQMII.Client.MobEntityMetaru.DqmEntityDragometaru;
import DQMII.Client.MobEntityMetaru.DqmEntityHagumeta;
import DQMII.Client.MobEntityMetaru.DqmEntityHaguremetaruking;
import DQMII.Client.MobEntityMetaru.DqmEntityMetaking;
import DQMII.Client.MobEntityMetaru.DqmEntityMetaruburazazu;
import DQMII.Client.MobEntityMetaru.DqmEntityMetasura;
import DQMII.Client.MobEntityMetaru.DqmEntityPuratinaking;
import DQMII.Client.RareMob.DqmEntityArukemisuton;
import DQMII.Client.RareMob.DqmEntityAtorasu;
import DQMII.Client.RareMob.DqmEntityGodonheddo;
import DQMII.Client.RareMob.DqmEntityGorudenkon;
import DQMII.Client.RareMob.DqmEntityKirapike;
import DQMII.Client.RareMob.DqmEntityKiratoti;
import DQMII.Client.RareMob.DqmEntityKuinmomon;
import DQMII.Client.RareMob.DqmEntityMaaburun;
import DQMII.Client.RareMob.DqmEntityMashougumo;
import DQMII.Client.RareMob.DqmEntityMoonkimera;
import DQMII.Client.RareMob.DqmEntityReddoatya;
import DQMII.Client.RareMob.DqmEntitySeigin;
import DQMII.Client.RareMob.DqmEntitySirubamanto;
import DQMII.Client.RareMob.DqmEntityTaipug;
import DQMII.Client.RareMob.DqmEntityTogekonbou;
import DQMII.Client.RareMob.DqmEntityTyokonuba;
import DQMII.Client.RareMob.DqmEntityWanpakusatan;
import DQMIIDim.DqmNextDim;
import DQMIIDim.gen.WorldGenBigTreeX;
import DQMIIDim.gen.WorldGenForestX;
import DQMIIDim.gen.WorldGenTreesX;

public class BiomeRakuen extends BiomeGenBase
{
	public static String strCode;
	private static Minecraft minecraft;
	private static int debugCode;

	private String BiomeName;
	private byte topBlockID;
	private byte fillerBlockID;
	private int biomeIdx;

    public BiomeRakuen(int par1)
    {

    	super(par1);

    	for (int i = 0; i < DqmNextDim.cfgDimBiomeID.length; i ++)
    	{
    		if(par1 == DqmNextDim.cfgDimBiomeID[i])
    		{
    			biomeIdx = i;
    		}
    	}

		BiomeName = "RAKUEN_" + DqmNextDim.DimNameE[biomeIdx];
		topBlockID = (byte) (DqmNextDim.cfgDimBlockID1G + biomeIdx);
		fillerBlockID = (byte) (DqmNextDim.cfgDimBlockID1D + biomeIdx);


        this.setBiomeName(BiomeName);
        this.topBlock = (byte)topBlockID;
        this.fillerBlock = (byte)fillerBlockID;
        this.setTemperatureRainfall(0.7F, 0.8F);
        this.setColor(2250011);

        this.spawnableCaveCreatureList.clear();
        this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityBat.class, 4, 0, 2));
        this.spawnableCreatureList.clear();

        //this.spawnableCreatureList.add(new SpawnListEntry(EntitySnowman.class, 1, 0, 1));

        //this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 2, 0, 5));
        //this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 2, 0, 5));
        //this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 2, 0, 5));
        //this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 2, 0, 5));
        //this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 1, 0, 5));
        //this.spawnableCreatureList.add(new SpawnListEntry(EntityMooshroom.class, 1, 0, 2));

        //this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 1, 0, 2));
        this.spawnableMonsterList.clear();

        //this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 5, 0, 3));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, 2, 0, 2));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntitySpider.class, 2, 0, 1));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityGiantZombie.class, 1, 0, 1));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 2, 0, 2));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntitySlime.class, 1, 0, 1));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityGhast.class, 1, 0, 1));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityPigZombie.class, 2, 0, 1));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 2, 0, 2));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityCaveSpider.class, 2, 0, 2));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntitySilverfish.class, 1, 0, 2));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityBlaze.class, 2, 0, 2));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityMagmaCube.class, 1, 0, 1));
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, 1, 0, 1));

        this.worldGeneratorTrees = new WorldGenTreesX(true);
        this.worldGeneratorBigTree = new WorldGenBigTreeX(true);
        //this.worldGeneratorSwamp = new WorldGenSwampX();
        this.worldGeneratorForest = new WorldGenForestX(true);
        this.worldGeneratorTrees = new WorldGenTreesX(true, this.topBlockID, this.fillerBlockID);


    	if(biomeIdx == DqmNextDim.idxAkuma)
    	{
    		this.waterColorMultiplier = 0xff0000;

    		this.spawnableCreatureList.add(new SpawnListEntry(EntityMooshroom.class, 1, 0, 2));
    		this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 2, 0, 5));

    		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 5, 0, 3));
    		this.spawnableMonsterList.add(new SpawnListEntry(EntityGhast.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, 1, 0, 1));

	        this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMomon.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDoraki.class, 20, 0, 1));
	        this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityOnikozou.class, 20, 0, 1));
	        this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTukaima.class, 20, 0, 1));
	        this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySukippaa.class, 20, 0, 1));
	        this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySunomon.class, 20, 0, 1));
	        this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityOomedama.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDorakima.class, 20, 0, 1));
	        this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityRiripat.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTahodoraki.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPinkmomon.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBebisatan.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDokuyazukin.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityAkumanosyo.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySupekutetto.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityNightwalker.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMeijidoraki.class, 20, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMinidemon.class, 20, 0, 1));

        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityAroinpu.class, 10, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMaporena.class, 10, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPikusi.class, 10, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBarakku.class, 10, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKemunkurusu.class, 10, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySirubadebiru.class, 10, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySaikuropusu.class, 10, 0, 1));

        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDebirurodo.class, 5, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGigantesu.class, 5, 0, 1));

        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityWanpakusatan.class, 1, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKuinmomon.class, 1, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityReddoatya.class, 1, 0, 1));
        	this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityAtorasu.class, 1, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 5;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 2;
            this.theBiomeDecorator.flowersPerChunk = 2;
            this.setMinMaxHeight(0.2F, 0.9F);
    	}else if(biomeIdx == DqmNextDim.idxBussitu)
    	{
    		this.waterColorMultiplier = 0x666666;

    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityAyasiikage.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDorozara.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGizumo.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGizumoAZ.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHitokuisaberu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMadohando.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySirudokozou.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySupini.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTogebouzu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityWaraibukuro.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBakudanbebi.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBakudaniwa.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBuraddihando.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityFgizumo.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityFurosutogizumo.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHgizumo.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHiitogizumo.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHitokuibako.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHoroghost.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHyouganmajin.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMimikku.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityObakekyandoru.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityOdoruhouseki.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySibiredanbira.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySumairurokku.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySyado.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTomosibikozou.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityYouganmajin.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBiggumoai.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDakuhobitto.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityAnkokumajin.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBiggufeisu.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBuraddosodo.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDgizumo.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGoldman.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGoremu.class, 10, 0, 1));
    		if(DQM.killKiramasin == 1)
    		{
    			this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKiramasin.class, 10, 0, 1));
    		}
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMaounokage.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMegazarurokku.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMetaruhanta.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMetaruhantaken.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPandorabox.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityStonman.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGodonheddo.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKiratoti.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMashougumo.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTaipug.class, 1, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 2;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 1;
            this.theBiomeDecorator.flowersPerChunk = 1;
            this.setMinMaxHeight(0.3F, 0.6F);
    	}else if(biomeIdx == DqmNextDim.idxMaju)
    	{
    		this.waterColorMultiplier = 0x660033;

    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBigguhatto.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBurauni.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDokuroarai.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDucksbill.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityIkkakuusagi.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityItamogu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKirapan.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMomonja.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityOokiduti.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPurizunyan.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySimasimacat.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityArumiraji.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBeronyaago.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKirapan2.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKirasuko.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySkullgaroo.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTonburero.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHotatewarabi.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMagemomonja.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMajikaruhatto.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityArukemisuton.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGorudenkon.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKirapike.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMaaburun.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySeigin.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTogekonbou.class, 1, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 7;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 5;
            this.theBiomeDecorator.flowersPerChunk = 3;
            this.setMinMaxHeight(0.2F, 0.9F);
    	}else if(biomeIdx == DqmNextDim.idxMetaru)
    	{
    		this.waterColorMultiplier = 0xffff00;

    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGorudentotemu.class, 100, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGorudensuraimu.class, 100, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMetaruburazazu.class, 50, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMetasura.class, 50, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMetaking.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDragometaru.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHagumeta.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHaguremetaruking.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPuratinaking.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDaiyamondosuraimu.class, 1, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 1;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 5;
            this.theBiomeDecorator.flowersPerChunk = 0;
            this.setMinMaxHeight(0.1F, 0.9F);
    	}else if(biomeIdx == DqmNextDim.idxSizen)
    	{
    		this.waterColorMultiplier = 0x33ffff;

    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBigCrow.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDoronuba.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGuntaigani.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKimera.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKirikabuobake.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityObakekinoko.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityObakeumiusi.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityOokutibasi.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityOonamekuji.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityRippusu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityUzusioking.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityZinmentyou.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityZukkinya.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBuchunpa.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityButtizukinya.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDesufuratta.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHitokuiga.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityJeriman.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMatango.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMeijikimera.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMrippusu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySibireageha.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityUmiusi.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityAkairai.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBurakkubejita.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDeddopekka.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGanirasu.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityJigokunohasami.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKirakurabu.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMagematango.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMagumaron.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityRedsaikuron.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityStarkimera.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityUmibouzu.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMoonkimera.class, 1, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTyokonuba.class, 1, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 4;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 4;
            this.theBiomeDecorator.flowersPerChunk = 4;
            this.setMinMaxHeight(0.4F, 0.6F);
    	}else if(biomeIdx == DqmNextDim.idxSuraimu)
    	{
    		this.waterColorMultiplier = 0x33ff99;

    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBubsura.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityButisuraimu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDragosuraimu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHoimisura.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySibirekurage.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySura.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimubesu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimunaito.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimutawa.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimutumuri.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBehoimisuraimu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBehoimusuraimu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityEnzeruslime.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGorudentotemu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKingsura.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMarinsuraimu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMetaruraida.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySura2.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimubogu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimuburesu.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimuking.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDenga.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGodraida.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBaburuking.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBehomasuraimu.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDarkslime.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGorudensuraimu.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKuinsuraimu.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimubehomazun.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimuhaitawa.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySuraimumadyura.class, 10, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 3;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 2;
            this.theBiomeDecorator.flowersPerChunk = 4;
            this.setMinMaxHeight(0.4F, 0.5F);
    	}else if(biomeIdx == DqmNextDim.idxTokusyu)
    	{
    		this.waterColorMultiplier = 0x9933ff;

    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHitokuikibako.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPapetkozou.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTubo.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityAkumanotubo.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMapetman.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMimikkukibako.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDollmaster.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPandorakibako.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTubokku.class, 10, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 5;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 2;
            this.theBiomeDecorator.flowersPerChunk = 2;
            this.setMinMaxHeight(0.1F, 0.6F);
    	}else if(biomeIdx == DqmNextDim.idxZonbi)
    	{
    		this.waterColorMultiplier = 0x663333;

    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityAnimaruzonbi.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBaburin.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBerobero.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGaikotukensi.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGhost.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityHerughost.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMeragosuto.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityMetoroghost.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySamayoutamasii.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySumoruguru.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityTutiwarasi.class, 20, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDakunaito.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDesujakkaru.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKagenokisi.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityRyuiso.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBariidodog.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBoureikensi.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPombom.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityPuyon.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySiryounokisi.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySodofantomu.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntitySirubamanto.class, 1, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 5;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 2;
            this.theBiomeDecorator.flowersPerChunk = 2;
            this.setMinMaxHeight(0.2F, 0.7F);
    	}else if(biomeIdx == DqmNextDim.idxDragon)
    	{
    		this.waterColorMultiplier = 0xff0000;

    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDasudragon.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDragondarknaito.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGamegonrejendo.class, 5, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityBatorurex.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDqmdragon.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDragonnaito.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityDragonraida.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGamegon.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityGamegonload.class, 10, 0, 1));
    		this.spawnableMonsterList.add(new SpawnListEntry(DqmEntityKisudragon.class, 10, 0, 1));

            this.theBiomeDecorator.treesPerChunk = 3;
            this.theBiomeDecorator.generateLakes = true;

            this.theBiomeDecorator.grassPerChunk = 4;
            this.theBiomeDecorator.flowersPerChunk = 3;
            this.setMinMaxHeight(0.1F, 0.9F);
    	}


        this.spawnableWaterCreatureList.clear();
        this.spawnableWaterCreatureList.add(new SpawnListEntry(EntitySquid.class, 3, 0, 5));



        //this.theBiomeDecorator.reedGen = new WorldGenReed();
        //this.theBiomeDecorator.treesPerChunk = 5;
        //this.theBiomeDecorator.generateLakes = true;

        //this.theBiomeDecorator.grassPerChunk = 2;
        //this.theBiomeDecorator.flowersPerChunk = 2;

    }
}
