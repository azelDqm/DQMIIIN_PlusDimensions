package DQMIIDim.genDqm;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmItemList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenChestN2 implements IWorldGenerator
{
    public static final String DUNGEON_CHEST = null;

    public DqmWorldGenChestN2(boolean b) {	}
    public DqmWorldGenChestN2() {}
    public void setScale(int i, int j, int k) {	}
    public void generate(World par1World, Random rand, int xPos, int yPos, int zPos) {}

    @Override
    public void generate(Random par2Random, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int ran = par2Random.nextInt(300);
        int i = 0;
        int x = par1 * 16 + par2Random.nextInt(16);
        int z = par2 * 16 + par2Random.nextInt(16);
        int y = par3World.getHeightValue(x, z);

        if (ran >= 295  && WorldGenFunctions.canGenerate(par2Random, par3World, x, y, z, 1))
        {
            int Kakuritu = par2Random.nextInt(300);
            int Kakuritu1 = par2Random.nextInt(300);
            int Kakuritu2 = par2Random.nextInt(300);
            int Kakuritu3 = par2Random.nextInt(300);
            int Kakuritu4 = par2Random.nextInt(300);
            int Kakuritu5 = par2Random.nextInt(300);
            int Kakuritu6 = par2Random.nextInt(300);
            int Kakuritu7 = par2Random.nextInt(300);
            int Kakuritu8 = par2Random.nextInt(300);
            par3World.setBlock(x, y, z, Block.chest.blockID, par2Random.nextInt(4), 2);
            TileEntityChest chest = (TileEntityChest) par3World.getBlockTileEntity(x, y, z);

            //素材1
            if (Kakuritu8 >= 250)
            {
                for (i = 0; i <= 2; i++)
                {
                    int ItemNo = par2Random.nextInt(57);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akaisango.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ayakasisou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bakudanisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bannouyaku.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bekkou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokuganokona.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Doragonnonamida.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gamanoabura.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Genmaseki.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoobane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hananomitu.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hebinonukegara.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Honehone.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hosinokakera.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Jouyakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kazekirinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kingdaiya.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kiyomenomizu.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koorinokessyou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koumorinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodainakiba.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 23)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Madarakumonoito.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 24)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunokawa.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 25)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunotuno.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 26)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Maryokunotuti.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 27)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Meijikimeranohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 28)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Midorinokoke.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 29)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Migakizuna.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 30)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Moon.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 31)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nebanebazeri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 32)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nekozuna.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 33)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nijiirononunokire.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 34)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rengokunohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 35)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Risaikurusuton.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 36)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seijanohai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 37)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yougansekinokakera.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 36)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yorunotobari.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 39)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seisui.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 40)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Siroikaigara.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 41)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 42)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 43)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuzeri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 44)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tensinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 45)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tetunokugi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 46)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Togetogenokiba.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 47)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokinosuisyou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 48)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokuyakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 49)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukemonoisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 50)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukinomegumi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 51)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tyounohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 52)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Umanofun.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 53)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Uruwasikinoko.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 54)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usaginosippo.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 55)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usinofun.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 56)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yawarakauru.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 57)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yogoretahoutai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }
                }
            }

            //素材2
            if (Kakuritu >= 50)
            {
                for (i = 0; i <= 2; i++)
                {
                    int ItemNo = par2Random.nextInt(57);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akaisango.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ayakasisou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bakudanisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bannouyaku.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bekkou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokuganokona.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Doragonnonamida.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gamanoabura.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Genmaseki.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoobane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hananomitu.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hebinonukegara.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Honehone.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hosinokakera.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Jouyakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kazekirinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kingdaiya.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kiyomenomizu.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koorinokessyou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koumorinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodainakiba.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 23)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Madarakumonoito.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 24)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunokawa.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 25)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunotuno.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 26)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Maryokunotuti.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 27)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Meijikimeranohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 28)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Midorinokoke.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 29)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Migakizuna.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 30)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Moon.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 31)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nebanebazeri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 32)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nekozuna.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 33)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nijiirononunokire.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 34)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rengokunohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 35)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Risaikurusuton.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 36)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seijanohai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 37)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yougansekinokakera.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 36)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yorunotobari.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 39)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seisui.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 40)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Siroikaigara.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 41)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 42)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 43)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuzeri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 44)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tensinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 45)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tetunokugi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 46)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Togetogenokiba.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 47)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokinosuisyou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 48)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokuyakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 49)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukemonoisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 50)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukinomegumi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 51)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tyounohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 52)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Umanofun.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 53)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Uruwasikinoko.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 54)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usaginosippo.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 55)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usinofun.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 56)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yawarakauru.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 57)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yogoretahoutai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }
                }
            }

            //鉱石
            if (Kakuritu1 >= 250)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(12);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Littlemedal.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kinkai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Misriru.itemID, par2Random.nextInt(2) + 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Oriharukon.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Metaru.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Puratina.itemID, par2Random.nextInt(2) + 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tekkouseki.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ikazutinotama.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ryuunonamida.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Taiyounoisi.itemID, par2Random.nextInt(2) + 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Inotinoisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kagaminoisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rubinogenseki.itemID, par2Random.nextInt(1) + 1 , 0));
                    }
                }
            }

            //種
            if (Kakuritu2 >= 150)
            {
                for (i = 0; i <= 1; i++)
                {
                    int ItemNo = par2Random.nextInt(9);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokukesisou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tikaranotane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Mamorinotane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Subayasanotane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemYakusouSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemDokukesisouSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemTikaraSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemMamoriSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemSubayasaSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }
                }
            }

            //上位素材
            if (Kakuritu3 >= 295)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(22);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Amatuyunoito.itemID, 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ayasiikobin.itemID, 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Budouekisu.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Furubitaring.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Goldburesuretto.itemID, 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Goldring.itemID, 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hepaitosu.blockID, 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hikarinoisi.itemID, 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hyoutyounohane.itemID, 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Juryokunomoto.itemID, 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kenjanoisi.itemID, 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kenjanoseisui.itemID, 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kimeranotubasa.itemID, 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.MysteryEgg.itemID, 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ryuunohizake.itemID, 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Saezurinomitu.itemID, 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sekaijunoha.itemID, 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sinkanohiseki.itemID, 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tensinosoma.itemID, 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Toukonekisu.itemID, 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Uraminohouju.itemID, 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seinarusizuku.itemID, 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seireiseki.itemID, 1 , 0));
                    }
                }
            }

            //オーブ
            if (Kakuritu4 == 298)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(6);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Buruoubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gurinoubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ierooubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Metaloubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Paapuruoubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Redoubu.itemID, 1 , 0));
                    }
                }
            }

            //武具
            if (Kakuritu5 >= 285)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(31);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akumanotume.itemID, 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bumeran.itemID, par2Random.nextInt(16) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokubari.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Doragonkira.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ginnoyubiwa.itemID, 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenokon.itemID, 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoono.itemID, 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoturugi.itemID, 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Heisinoken.itemID, 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Inotinoyubiwa.itemID, 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kazekirinoyumi.itemID, 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Konbou.itemID, 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koorinoyaiba.itemID, 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunotume.itemID, 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seinarunaifu.itemID, 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Toraidento.itemID, 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yaibanobumeran.itemID, par2Random.nextInt(16) + 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Monosasizao.itemID, 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tenbinbou.itemID, 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanomuti.itemID, 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kudamononaifu.itemID, 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Isinotume.itemID, 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Takenoyari.itemID, 1 , 0));
                    }

                    if (ItemNo == 23)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Jaiantokurabu.itemID, 1 , 0));
                    }

                    if (ItemNo == 24)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Reipia.itemID, 1 , 0));
                    }

                    if (ItemNo == 25)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Batoruribon.itemID, 1 , 0));
                    }

                    if (ItemNo == 26)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kinoono.itemID, 1 , 0));
                    }

                    if (ItemNo == 27)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tekkoukagi.itemID, 1 , 0));
                    }

                    if (ItemNo == 28)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tetunoyari.itemID, 1 , 0));
                    }

                    if (ItemNo == 29)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Syotobou.itemID, 1 , 0));
                    }

                    if (ItemNo == 30)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Karyuudonoyumi.itemID, 1 , 0));
                    }

                    if (ItemNo == 31)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kurosubumeran.itemID, 1 , 0));
                    }
                }
            }

            //防具
            if (Kakuritu6 >= 285)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(22);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenokabuto.itemID, 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenokote.itemID, 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenokutu.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoyoroi.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanobousi.itemID, 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanokote.itemID, 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanokutu.itemID, 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanoyoroi.itemID, 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitakabuto.itemID, 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitakote.itemID, 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitakutu.itemID, 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitatate.itemID, 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitayoroi.itemID, 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimupiasu.itemID, 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimutorei.itemID, 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tikaranoyubiwa.itemID, 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Howaitosirudo.itemID, 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanotate.itemID, 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Keikoginobandana.itemID, 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kinobousi.itemID, 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Oberonnokutu.itemID, 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tabibitonofuku.itemID, 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tabibitonotebukuro.itemID, 1 , 0));
                    }
                }
            }

            //魔法
            if (Kakuritu7 >= 290)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(4);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hikarinotue.itemID, 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hoimi.itemID, 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Io.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Mera.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Raidein.itemID, 1 , 0));
                    }
                }
            }
        }

        if (ran >= 295  && WorldGenFunctions.canGenerate(par2Random, par3World, x, y, z, 2))
        {
            int Kakuritu = par2Random.nextInt(300);
            int Kakuritu1 = par2Random.nextInt(300);
            int Kakuritu2 = par2Random.nextInt(300);
            int Kakuritu3 = par2Random.nextInt(300);
            int Kakuritu4 = par2Random.nextInt(300);
            int Kakuritu5 = par2Random.nextInt(300);
            int Kakuritu6 = par2Random.nextInt(300);
            int Kakuritu7 = par2Random.nextInt(300);
            int Kakuritu8 = par2Random.nextInt(300);
            par3World.setBlock(x, y, z, Block.chest.blockID, par2Random.nextInt(4), 2);
            TileEntityChest chest = (TileEntityChest) par3World.getBlockTileEntity(x, y, z);

            //素材1
            if (Kakuritu8 >= 250)
            {
                for (i = 0; i <= 2; i++)
                {
                    int ItemNo = par2Random.nextInt(57);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akaisango.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ayakasisou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bakudanisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bannouyaku.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bekkou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokuganokona.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Doragonnonamida.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gamanoabura.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Genmaseki.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoobane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hananomitu.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hebinonukegara.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Honehone.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hosinokakera.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Jouyakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kazekirinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kingdaiya.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kiyomenomizu.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koorinokessyou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koumorinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodainakiba.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 23)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Madarakumonoito.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 24)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunokawa.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 25)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunotuno.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 26)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Maryokunotuti.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 27)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Meijikimeranohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 28)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Midorinokoke.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 29)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Migakizuna.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 30)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Moon.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 31)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nebanebazeri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 32)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nekozuna.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 33)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nijiirononunokire.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 34)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rengokunohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 35)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Risaikurusuton.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 36)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seijanohai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 37)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yougansekinokakera.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 36)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yorunotobari.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 39)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seisui.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 40)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Siroikaigara.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 41)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 42)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 43)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuzeri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 44)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tensinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 45)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tetunokugi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 46)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Togetogenokiba.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 47)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokinosuisyou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 48)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokuyakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 49)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukemonoisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 50)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukinomegumi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 51)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tyounohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 52)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Umanofun.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 53)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Uruwasikinoko.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 54)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usaginosippo.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 55)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usinofun.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 56)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yawarakauru.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 57)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yogoretahoutai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }
                }
            }

            //素材2
            if (Kakuritu >= 50)
            {
                for (i = 0; i <= 2; i++)
                {
                    int ItemNo = par2Random.nextInt(57);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akaisango.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ayakasisou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bakudanisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bannouyaku.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bekkou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokuganokona.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Doragonnonamida.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gamanoabura.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Genmaseki.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoobane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hananomitu.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hebinonukegara.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Honehone.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hosinokakera.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Jouyakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kazekirinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kingdaiya.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kiyomenomizu.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koorinokessyou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koumorinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodainakiba.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 23)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Madarakumonoito.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 24)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunokawa.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 25)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunotuno.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 26)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Maryokunotuti.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 27)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Meijikimeranohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 28)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Midorinokoke.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 29)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Migakizuna.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 30)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Moon.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 31)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nebanebazeri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 32)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nekozuna.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 33)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nijiirononunokire.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 34)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rengokunohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 35)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Risaikurusuton.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 36)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seijanohai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 37)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yougansekinokakera.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 36)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yorunotobari.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 39)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seisui.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 40)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Siroikaigara.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 41)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 42)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 43)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuzeri.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 44)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tensinohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 45)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tetunokugi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 46)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Togetogenokiba.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 47)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokinosuisyou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 48)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokuyakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 49)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukemonoisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 50)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukinomegumi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 51)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tyounohane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 52)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Umanofun.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 53)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Uruwasikinoko.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 54)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usaginosippo.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 55)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usinofun.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 56)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yawarakauru.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 57)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yogoretahoutai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }
                }
            }

            //鉱石
            if (Kakuritu1 >= 250)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(12);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Littlemedal.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kinkai.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Misriru.itemID, par2Random.nextInt(2) + 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Oriharukon.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Metaru.itemID, par2Random.nextInt(1) + 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Puratina.itemID, par2Random.nextInt(2) + 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tekkouseki.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ikazutinotama.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ryuunonamida.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Taiyounoisi.itemID, par2Random.nextInt(2) + 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Inotinoisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kagaminoisi.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rubinogenseki.itemID, par2Random.nextInt(1) + 1 , 0));
                    }
                }
            }

            //種
            if (Kakuritu2 >= 150)
            {
                for (i = 0; i <= 1; i++)
                {
                    int ItemNo = par2Random.nextInt(9);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yakusou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokukesisou.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tikaranotane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Mamorinotane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Subayasanotane.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemYakusouSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemDokukesisouSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemTikaraSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemMamoriSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemSubayasaSeed.itemID, par2Random.nextInt(3) + 1 , 0));
                    }
                }
            }

            //上位素材
            if (Kakuritu3 >= 295)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(22);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Amatuyunoito.itemID, 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ayasiikobin.itemID, 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Budouekisu.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Furubitaring.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Goldburesuretto.itemID, 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Goldring.itemID, 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hepaitosu.blockID, 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hikarinoisi.itemID, 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hyoutyounohane.itemID, 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Juryokunomoto.itemID, 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kenjanoisi.itemID, 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kenjanoseisui.itemID, 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kimeranotubasa.itemID, 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.MysteryEgg.itemID, 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ryuunohizake.itemID, 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Saezurinomitu.itemID, 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sekaijunoha.itemID, 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sinkanohiseki.itemID, 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tensinosoma.itemID, 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Toukonekisu.itemID, 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Uraminohouju.itemID, 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seinarusizuku.itemID, 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seireiseki.itemID, 1 , 0));
                    }
                }
            }

            //オーブ
            if (Kakuritu4 == 298)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(6);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Buruoubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gurinoubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ierooubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Metaloubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Paapuruoubu.itemID, 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Redoubu.itemID, 1 , 0));
                    }
                }
            }

            //武具
            if (Kakuritu5 >= 285)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(31);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akumanotume.itemID, 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bumeran.itemID, par2Random.nextInt(16) + 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokubari.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Doragonkira.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ginnoyubiwa.itemID, 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenokon.itemID, 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoono.itemID, 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoturugi.itemID, 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Heisinoken.itemID, 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Inotinoyubiwa.itemID, 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kazekirinoyumi.itemID, 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Konbou.itemID, 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koorinoyaiba.itemID, 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunotume.itemID, 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seinarunaifu.itemID, 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Toraidento.itemID, 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yaibanobumeran.itemID, par2Random.nextInt(16) + 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Monosasizao.itemID, 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tenbinbou.itemID, 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanomuti.itemID, 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kudamononaifu.itemID, 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Isinotume.itemID, 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Takenoyari.itemID, 1 , 0));
                    }

                    if (ItemNo == 23)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Jaiantokurabu.itemID, 1 , 0));
                    }

                    if (ItemNo == 24)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Reipia.itemID, 1 , 0));
                    }

                    if (ItemNo == 25)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Batoruribon.itemID, 1 , 0));
                    }

                    if (ItemNo == 26)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kinoono.itemID, 1 , 0));
                    }

                    if (ItemNo == 27)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tekkoukagi.itemID, 1 , 0));
                    }

                    if (ItemNo == 28)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tetunoyari.itemID, 1 , 0));
                    }

                    if (ItemNo == 29)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Syotobou.itemID, 1 , 0));
                    }

                    if (ItemNo == 30)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Karyuudonoyumi.itemID, 1 , 0));
                    }

                    if (ItemNo == 31)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kurosubumeran.itemID, 1 , 0));
                    }
                }
            }

            //防具
            if (Kakuritu6 >= 285)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(22);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenokabuto.itemID, 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenokote.itemID, 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenokutu.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoyoroi.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanobousi.itemID, 1 , 0));
                    }

                    if (ItemNo == 5)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanokote.itemID, 1 , 0));
                    }

                    if (ItemNo == 6)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanokutu.itemID, 1 , 0));
                    }

                    if (ItemNo == 7)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanoyoroi.itemID, 1 , 0));
                    }

                    if (ItemNo == 8)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitakabuto.itemID, 1 , 0));
                    }

                    if (ItemNo == 9)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitakote.itemID, 1 , 0));
                    }

                    if (ItemNo == 10)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitakutu.itemID, 1 , 0));
                    }

                    if (ItemNo == 11)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitatate.itemID, 1 , 0));
                    }

                    if (ItemNo == 12)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sabitayoroi.itemID, 1 , 0));
                    }

                    if (ItemNo == 13)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimupiasu.itemID, 1 , 0));
                    }

                    if (ItemNo == 14)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimutorei.itemID, 1 , 0));
                    }

                    if (ItemNo == 15)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tikaranoyubiwa.itemID, 1 , 0));
                    }

                    if (ItemNo == 16)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Howaitosirudo.itemID, 1 , 0));
                    }

                    if (ItemNo == 17)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kawanotate.itemID, 1 , 0));
                    }

                    if (ItemNo == 18)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Keikoginobandana.itemID, 1 , 0));
                    }

                    if (ItemNo == 19)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kinobousi.itemID, 1 , 0));
                    }

                    if (ItemNo == 20)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Oberonnokutu.itemID, 1 , 0));
                    }

                    if (ItemNo == 21)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tabibitonofuku.itemID, 1 , 0));
                    }

                    if (ItemNo == 22)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tabibitonotebukuro.itemID, 1 , 0));
                    }
                }
            }

            //魔法
            if (Kakuritu7 >= 290)
            {
                for (i = 0; i <= 0; i++)
                {
                    int ItemNo = par2Random.nextInt(4);
                    int ChestNo = par2Random.nextInt(26);

                    if (ItemNo == 0)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hikarinotue.itemID, 1 , 0));
                    }

                    if (ItemNo == 1)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hoimi.itemID, 1 , 0));
                    }

                    if (ItemNo == 2)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Io.itemID, 1 , 0));
                    }

                    if (ItemNo == 3)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Mera.itemID, 1 , 0));
                    }

                    if (ItemNo == 4)
                    {
                        chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Raidein.itemID, 1 , 0));
                    }
                }
            }
        }
    }

    public static DqmWorldGenChestN2 getInfo(String dungeonChest)
    {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }
}
