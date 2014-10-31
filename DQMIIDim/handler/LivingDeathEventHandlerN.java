package DQMIIDim.handler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
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
import DQMII.Client.MobEntityBoss.DqmEntityBazuzu;
import DQMII.Client.MobEntityBoss.DqmEntityDarkRamia;
import DQMII.Client.MobEntityBoss.DqmEntityDesupisaro1;
import DQMII.Client.MobEntityBoss.DqmEntityEsterk;
import DQMII.Client.MobEntityBoss.DqmEntityKiramajinga;
import DQMII.Client.MobEntityBoss.DqmEntityMasterdoragon;
import DQMII.Client.MobEntityBoss.DqmEntityNorowaretaturugi;
import DQMII.Client.MobEntityBoss.DqmEntityRyuuou;
import DQMII.Client.MobEntityBoss.DqmEntitySuraimujeneraru;
import DQMII.Client.MobEntityBoss.DqmEntityYamatanooroti;
import DQMII.Client.MobEntityBoss.DqmEntityZoma;
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
import DQMIIDim.BlockList;
import DQMIIDim.DqmNextDim;
import DQMIIDim.ItemList;

public class LivingDeathEventHandlerN {

	@ForgeSubscribe
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if(event.entityLiving.worldObj.isRemote) {
			return;
		}

		if(event.entityLiving instanceof DqmEntityMomon){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityOnikozou){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityOomedama){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityRiripat){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySukippaa){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySunomon){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTukaima){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityAkumanosyo){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBebisatan){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDokuyazukin){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDoraki){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDorakima){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMeijidoraki){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMinidemon){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityNightwalker){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPinkmomon){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySupekutetto){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTahodoraki){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDebirurodo){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGigantesu){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityAroinpu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBarakku){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKemunkurusu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMaporena){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPikusi){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySaikuropusu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySirubadebiru){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityAtorasu){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKuinmomon){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityReddoatya){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityWanpakusatan){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDesupisaro1){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 2.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 2), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityEsterk){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxAkuma].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 3.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 3), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityAyasiikage){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDorozara){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGizumo){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGizumoAZ){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHitokuisaberu){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMadohando){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySirudokozou){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySupini){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTogebouzu){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityWaraibukuro){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBakudanbebi){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBakudaniwa){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBuraddihando){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityFgizumo){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityFurosutogizumo){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHgizumo){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHiitogizumo){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHitokuibako){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHoroghost){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHyouganmajin){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMimikku){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityObakekyandoru){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityOdoruhouseki){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySibiredanbira){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySumairurokku){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySyado){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTomosibikozou){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityYouganmajin){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBiggumoai){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDakuhobitto){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityAnkokumajin){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBiggufeisu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBuraddosodo){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDgizumo){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGoldman){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGoremu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKiramasin){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMaounokage){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMegazarurokku){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMetaruhanta){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMetaruhantaken){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPandorabox){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityStonman){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGodonheddo){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKiratoti){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMashougumo){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTaipug){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKiramajinga){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxBussitu].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 4.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 4), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityDasudragon){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDragondarknaito){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGamegonrejendo){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBatorurex){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDqmdragon){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDragonnaito){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDragonraida){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGamegon){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGamegonload){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKisudragon){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMasterdoragon){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 5.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 5), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityRyuuou){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 6.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 6), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityYamatanooroti){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxDragon].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 8.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 8), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityBigguhatto){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBurauni){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDokuroarai){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDucksbill){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityIkkakuusagi){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityItamogu){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKirapan){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMomonja){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityOokiduti){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPurizunyan){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySimasimacat){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityArumiraji){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBeronyaago){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKirapan2){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKirasuko){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySkullgaroo){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTonburero){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHotatewarabi){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMagemomonja){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMajikaruhatto){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityArukemisuton){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGorudenkon){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKirapike){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMaaburun){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySeigin){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTogekonbou){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBazuzu){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMaju].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 0.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 0), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityBigCrow){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDoronuba){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGuntaigani){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKimera){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKirikabuobake){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityObakekinoko){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityObakeumiusi){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityOokutibasi){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityOonamekuji){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityRippusu){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityUzusioking){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityZinmentyou){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityZukkinya){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBuchunpa){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityButtizukinya){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDesufuratta){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHitokuiga){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityJeriman){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMatango){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMeijikimera){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMrippusu){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySibireageha){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityUmiusi){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityAkairai){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBurakkubejita){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDeddopekka){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGanirasu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityJigokunohasami){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKirakurabu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMagematango){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMagumaron){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityRedsaikuron){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityStarkimera){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityUmibouzu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMoonkimera){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTyokonuba){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDarkRamia){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSizen].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 1.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 1), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityBubsura){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityButisuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDragosuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHoimisura){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySibirekurage){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySura){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimubesu){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimunaito){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimutawa){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimutumuri){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBehoimisuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBehoimusuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityEnzeruslime){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGorudentotemu){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKingsura){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMarinsuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMetaruraida){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySura2){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimubogu){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimuburesu){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimuking){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDenga){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGodraida){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBaburuking){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBehomasuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDarkslime){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGorudensuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKuinsuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimubehomazun){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimuhaitawa){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimumadyura){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySuraimujeneraru){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxSuraimu].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 7.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 7), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityGorudentotemu){
			if (event.entityLiving.worldObj.rand.nextInt(250) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGorudensuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(240) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDaiyamondosuraimu){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDragometaru){
			if (event.entityLiving.worldObj.rand.nextInt(160) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHagumeta){
			if (event.entityLiving.worldObj.rand.nextInt(120) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHaguremetaruking){
			if (event.entityLiving.worldObj.rand.nextInt(50) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMetaking){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMetaruburazazu){
			if (event.entityLiving.worldObj.rand.nextInt(170) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMetasura){
			if (event.entityLiving.worldObj.rand.nextInt(200) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPuratinaking){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxMetaru].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHitokuikibako){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPapetkozou){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTubo){
			if (event.entityLiving.worldObj.rand.nextInt(100) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityAkumanotubo){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMapetman){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMimikkukibako){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDollmaster){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPandorakibako){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTubokku){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityNorowaretaturugi){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxTokusyu].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 10.0F);
				event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 10), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityZoma){
			if (event.entityLiving.worldObj.rand.nextInt(2) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  //event.entityLiving.dropItemWithOffset(ItemList.itemBuilderTicketB.itemID, 1, 9.0F);
			  event.entityLiving.entityDropItem(new ItemStack(ItemList.itemBuilderTicketB.itemID, 1, 9), 0.0F);
			}
		}else if(event.entityLiving instanceof DqmEntityAnimaruzonbi){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBaburin){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBerobero){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGaikotukensi){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityGhost){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityHerughost){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMeragosuto){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityMetoroghost){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySamayoutamasii){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySumoruguru){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityTutiwarasi){
			if (event.entityLiving.worldObj.rand.nextInt(70) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDakunaito){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityDesujakkaru){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityKagenokisi){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityRyuiso){
			if (event.entityLiving.worldObj.rand.nextInt(15) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBariidodog){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityBoureikensi){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPombom){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntityPuyon){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySiryounokisi){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySodofantomu){
			if (event.entityLiving.worldObj.rand.nextInt(40) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}else if(event.entityLiving instanceof DqmEntitySirubamanto){
			if (event.entityLiving.worldObj.rand.nextInt(10) == 0)
			{
			  event.entityLiving.dropItem(BlockList.DqmDimBlocks_dirt[DqmNextDim.idxZonbi].blockID, 1);
			}
		}
	}
}