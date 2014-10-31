package DQMIIDim.genDqm;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmItemList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenIdoN2 implements IWorldGenerator
{
    public DqmWorldGenIdoN2(boolean b) {	}
    public DqmWorldGenIdoN2() {}
    public void setScale(int i, int j, int k) {	}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int xxx = par1 * 16 + rand.nextInt(16);
        int zzz = par2 * 16 + rand.nextInt(16);
        int yyy = par3World.getHeightValue(xxx, zzz);
        int ran1 = rand.nextInt(10000);
        int ran2 = rand.nextInt(2);
        int ran3 = rand.nextInt(2);
        int ran4 = rand.nextInt(2);
        int ran5 = rand.nextInt(3);
        int ran6 = rand.nextInt(3);
        int ran7 = rand.nextInt(2);
        int ran8 = rand.nextInt(3);
        int ran9 = rand.nextInt(4);
        int ran10 = rand.nextInt(5);
        int ran11 = rand.nextInt(3);
        int ran12 = rand.nextInt(50);

        if (ran1 >= 9950 && WorldGenFunctions.canGenerate(rand, par3World, xxx, yyy, zzz, 1))
        {
            for (int x = -1; x <= 1; ++x)
            {
                for (int z = -1; z <= 1; ++z)
                {
                    for (int y = 0; y <= 2; ++y)
                    {
                        par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                    }
                }
            }

            if (ran2 == 0)
            {
                par3World.setBlock(xxx - 1, yyy, zzz, DqmItemList.Ido.blockID, 0, 2);
            }

            if (ran2 == 1)
            {
                par3World.setBlock(xxx - 1, yyy, zzz, DqmItemList.Idooke.blockID, 0, 2);
            }

            for (int y = -32; y <= -1; ++y)
            {
                par3World.setBlock(xxx, yyy + y, zzz, 0, 0, 2);
            }

            for (int x = -2; x <= 2; ++x)
            {
                for (int z = -4; z <= 4; ++z)
                {
                    for (int y = -35; y <= -32; ++y)
                    {
                        par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                    }
                }
            }

            for (int x = -4; x <= 4; ++x)
            {
                for (int z = -2; z <= 2; ++z)
                {
                    for (int y = -35; y <= -32; ++y)
                    {
                        par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                    }
                }
            }

            for (int x = -3; x <= 3; ++x)
            {
                for (int z = -3; z <= 3; ++z)
                {
                    for (int y = -35; y <= -32; ++y)
                    {
                        par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                    }
                }
            }

            for (int x = -2; x <= 2; ++x)
            {
                for (int z = -2; z <= 2; ++z)
                {
                    for (int y = -36; y <= -35; ++y)
                    {
                        par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                    }
                }
            }

            if (ran12 >= 45)
            {
                if (ran11 == 0)
                {
                    par3World.setBlock(xxx, yyy - 35, zzz + 3, DqmItemList.Sword.blockID, 0, 2);
                }

                if (ran11 == 1)
                {
                    par3World.setBlock(xxx, yyy - 35, zzz + 3, DqmItemList.SwordMob.blockID, 0, 2);
                }

                if (ran11 == 2)
                {
                    par3World.setBlock(xxx, yyy - 35, zzz + 3, DqmItemList.Tue.blockID, 0, 2);
                }
            }

            if (ran12 <= 1)
            {
                if (ran11 == 0)
                {
                    par3World.setBlock(xxx, yyy - 35, zzz + 3, DqmItemList.Sword2.blockID, 0, 2);
                }

                if (ran11 == 1)
                {
                    par3World.setBlock(xxx, yyy - 35, zzz + 3, DqmItemList.Sword2Mob.blockID, 0, 2);
                }
            }

            par3World.setBlock(xxx + 1, yyy - 36, zzz, BlockFluid.waterMoving.blockID, 0, 2);
            par3World.setBlock(xxx - 1, yyy - 36, zzz, BlockFluid.waterMoving.blockID, 0, 2);
            par3World.setBlock(xxx, yyy - 36, zzz + 1, BlockFluid.waterMoving.blockID, 0, 2);
            par3World.setBlock(xxx, yyy - 36, zzz - 1, BlockFluid.waterMoving.blockID, 0, 2);
            par3World.setBlock(xxx, yyy - 35, zzz - 3, DqmItemList.JampBlock.blockID, 0, 2);

            if (ran3 == 0)
            {
                par3World.setBlock(xxx + 4, yyy - 35, zzz + 4, Block.mobSpawner.blockID, 0, 2);
                TileEntityMobSpawner tileentitymobspawner1 = (TileEntityMobSpawner)par3World.getBlockTileEntity(xxx + 4, yyy - 35, zzz + 4);

                if (tileentitymobspawner1 != null)
                {
                    tileentitymobspawner1.func_98049_a().setMobID(WorldGenFunctions.pickMobName(rand, par3World, xxx, yyy, zzz));
                }
                else
                {
                    System.err.println("Failed to fetch mob spawner entity at (" + xxx + ", " + yyy + ", " + zzz + ")");
                }
            }

            if (ran4 == 0)
            {
                par3World.setBlock(xxx + 4, yyy - 35, zzz - 4, Block.mobSpawner.blockID, 0, 2);
                TileEntityMobSpawner tileentitymobspawner2 = (TileEntityMobSpawner)par3World.getBlockTileEntity(xxx + 4, yyy - 35, zzz - 4);

                if (tileentitymobspawner2 != null)
                {
                    tileentitymobspawner2.func_98049_a().setMobID(WorldGenFunctions.pickMobName(rand, par3World, xxx, yyy, zzz));
                }
                else
                {
                    System.err.println("Failed to fetch mob spawner entity at (" + xxx + ", " + yyy + ", " + zzz + ")");
                }
            }

            if (ran5 == 0)
            {
                par3World.setBlock(xxx - 4, yyy - 35, zzz + 4, Block.mobSpawner.blockID, 0, 2);
                TileEntityMobSpawner tileentitymobspawner3 = (TileEntityMobSpawner)par3World.getBlockTileEntity(xxx - 4, yyy - 35, zzz + 4);

                if (tileentitymobspawner3 != null)
                {
                    tileentitymobspawner3.func_98049_a().setMobID(WorldGenFunctions.pickMobName(rand, par3World, xxx, yyy, zzz));
                }
                else
                {
                    System.err.println("Failed to fetch mob spawner entity at (" + xxx + ", " + yyy + ", " + zzz + ")");
                }
            }

            if (ran6 == 0)
            {
                par3World.setBlock(xxx - 4, yyy - 35, zzz - 4, Block.mobSpawner.blockID, 0, 2);
                TileEntityMobSpawner tileentitymobspawner4 = (TileEntityMobSpawner)par3World.getBlockTileEntity(xxx - 4, yyy - 35, zzz - 4);

                if (tileentitymobspawner4 != null)
                {
                    tileentitymobspawner4.func_98049_a().setMobID(WorldGenFunctions.pickMobName(rand, par3World, xxx, yyy, zzz));
                }
                else
                {
                    System.err.println("Failed to fetch mob spawner entity at (" + xxx + ", " + yyy + ", " + zzz + ")");
                }
            }

            //チェスト
            if (ran7 == 0)
            {
                par3World.setBlock(xxx - 3, yyy - 35, zzz - 3, Block.chest.blockID, 0, 2);
            }

            if (ran8 == 0)
            {
                par3World.setBlock(xxx - 3, yyy - 35, zzz + 3, Block.chest.blockID, 0, 2);
            }

            if (ran9 == 0)
            {
                par3World.setBlock(xxx + 3, yyy - 35, zzz - 3, Block.chest.blockID, 0, 2);
            }

            if (ran10 == 0)
            {
                par3World.setBlock(xxx + 3, yyy - 35, zzz + 3, Block.chest.blockID, 0, 2);
            }

            TileEntityChest chest = (TileEntityChest)par3World.getBlockTileEntity(xxx - 3, yyy - 35, zzz - 3);
            TileEntityChest chest2 = (TileEntityChest)par3World.getBlockTileEntity(xxx - 3, yyy - 35, zzz + 3);
            TileEntityChest chest3 = (TileEntityChest)par3World.getBlockTileEntity(xxx + 3, yyy - 35, zzz - 3);
            TileEntityChest chest4 = (TileEntityChest)par3World.getBlockTileEntity(xxx + 3, yyy - 35, zzz + 3);

            if (chest != null)
            {
                int Kakuritu = rand.nextInt(300);
                int Kakuritu1 = rand.nextInt(300);
                int Kakuritu2 = rand.nextInt(300);
                int Kakuritu3 = rand.nextInt(300);
                int Kakuritu4 = rand.nextInt(300);
                int Kakuritu5 = rand.nextInt(300);
                int Kakuritu6 = rand.nextInt(300);
                int Kakuritu7 = rand.nextInt(300);
                int Kakuritu8 = rand.nextInt(300);
                int i = 0;

                //素材1
                if (Kakuritu8 >= 250)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(57);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akaisango.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ayakasisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bakudanisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bannouyaku.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bekkou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokuganokona.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Doragonnonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gamanoabura.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Genmaseki.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoobane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hananomitu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hebinonukegara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Honehone.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hosinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Jouyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kazekirinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kingdaiya.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kiyomenomizu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koorinokessyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koumorinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodainakiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Madarakumonoito.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunokawa.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunotuno.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Maryokunotuti.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Meijikimeranohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Midorinokoke.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Migakizuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Moon.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nebanebazeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 32)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nekozuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 33)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nijiirononunokire.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 34)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rengokunohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 35)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Risaikurusuton.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seijanohai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 37)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yougansekinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yorunotobari.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 39)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seisui.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 40)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Siroikaigara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 41)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 42)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 43)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuzeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 44)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tensinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 45)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tetunokugi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 46)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Togetogenokiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 47)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokinosuisyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 48)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokuyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 49)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukemonoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 50)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukinomegumi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 51)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tyounohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 52)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Umanofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 53)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Uruwasikinoko.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 54)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usaginosippo.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 55)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usinofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 56)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yawarakauru.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 57)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yogoretahoutai.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //素材2
                if (Kakuritu >= 50)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(57);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akaisango.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ayakasisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bakudanisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bannouyaku.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bekkou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokuganokona.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Doragonnonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gamanoabura.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Genmaseki.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Haganenoobane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hananomitu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hebinonukegara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Honehone.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hosinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Jouyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kazekirinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kingdaiya.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kiyomenomizu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koorinokessyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Koumorinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kyodainakiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Madarakumonoito.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunokawa.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Majuunotuno.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Maryokunotuti.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Meijikimeranohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Midorinokoke.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Migakizuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Moon.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nebanebazeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 32)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nekozuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 33)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Nijiirononunokire.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 34)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rengokunohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 35)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Risaikurusuton.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seijanohai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 37)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yougansekinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yorunotobari.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 39)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Seisui.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 40)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Siroikaigara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 41)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 42)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 43)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimuzeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 44)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tensinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 45)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tetunokugi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 46)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Togetogenokiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 47)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokinosuisyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 48)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tokuyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 49)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukemonoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 50)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tukinomegumi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 51)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tyounohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 52)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Umanofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 53)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Uruwasikinoko.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 54)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usaginosippo.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 55)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Usinofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 56)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yawarakauru.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 57)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yogoretahoutai.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //鉱石
                if (Kakuritu1 >= 250)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(12);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Littlemedal.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kinkai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Misriru.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Oriharukon.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Metaru.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Puratina.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tekkouseki.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ikazutinotama.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ryuunonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Taiyounoisi.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Inotinoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Kagaminoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rubinogenseki.itemID, rand.nextInt(1) + 1 , 0));
                        }
                    }
                }

                //種
                if (Kakuritu2 >= 150)
                {
                    for (i = 0; i <= 1; i++)
                    {
                        int ItemNo = rand.nextInt(9);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Dokukesisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tikaranotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Mamorinotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Subayasanotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemYakusouSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemDokukesisouSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemTikaraSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemMamoriSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.ItemSubayasaSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //上位素材
                if (Kakuritu3 >= 295)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(22);
                        int ChestNo = rand.nextInt(26);

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
                        int ItemNo = rand.nextInt(6);
                        int ChestNo = rand.nextInt(26);

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
                        int ItemNo = rand.nextInt(31);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akumanotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Bumeran.itemID, rand.nextInt(16) + 1 , 0));
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
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Yaibanobumeran.itemID, rand.nextInt(16) + 1 , 0));
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
                        int ItemNo = rand.nextInt(25);
                        int ChestNo = rand.nextInt(26);

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

                        if (ItemNo == 23)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Businnobandana.itemID, 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Budounokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Businrisuto.itemID, 1 , 0));
                        }
                    }
                }

                //魔法
                if (Kakuritu7 >= 290)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(4);
                        int ChestNo = rand.nextInt(26);

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

            if (chest2 != null)
            {
                int Kakuritu = rand.nextInt(300);
                int Kakuritu1 = rand.nextInt(300);
                int Kakuritu2 = rand.nextInt(300);
                int Kakuritu3 = rand.nextInt(300);
                int Kakuritu4 = rand.nextInt(300);
                int Kakuritu5 = rand.nextInt(300);
                int Kakuritu6 = rand.nextInt(300);
                int Kakuritu7 = rand.nextInt(300);
                int Kakuritu8 = rand.nextInt(300);
                int i = 0;

                //素材1
                if (Kakuritu8 >= 250)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(57);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Akaisango.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Ayakasisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Bakudanisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Bannouyaku.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Bekkou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Dokuganokona.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Doragonnonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Gamanoabura.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Genmaseki.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenoobane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hananomitu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hebinonukegara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Honehone.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hosinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Jouyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kazekirinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kingdaiya.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kiyomenomizu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Koorinokessyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Koumorinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kyodainakiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Madarakumonoito.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Majuunokawa.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Majuunotuno.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Maryokunotuti.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Meijikimeranohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Midorinokoke.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Migakizuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Moon.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Nebanebazeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 32)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Nekozuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 33)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Nijiirononunokire.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 34)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Rengokunohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 35)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Risaikurusuton.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Seijanohai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 37)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yougansekinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yorunotobari.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 39)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Seisui.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 40)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Siroikaigara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 41)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 42)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 43)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Suraimuzeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 44)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tensinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 45)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tetunokugi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 46)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Togetogenokiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 47)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tokinosuisyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 48)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tokuyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 49)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tukemonoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 50)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tukinomegumi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 51)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tyounohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 52)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Umanofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 53)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Uruwasikinoko.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 54)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Usaginosippo.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 55)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Usinofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 56)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yawarakauru.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 57)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yogoretahoutai.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //素材2
                if (Kakuritu >= 50)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(57);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Akaisango.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Ayakasisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Bakudanisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Bannouyaku.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Bekkou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Dokuganokona.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Doragonnonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Gamanoabura.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Genmaseki.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenoobane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hananomitu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hebinonukegara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Honehone.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hosinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Jouyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kazekirinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kingdaiya.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kiyomenomizu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Koorinokessyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Koumorinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kyodainakiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Madarakumonoito.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Majuunokawa.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Majuunotuno.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Maryokunotuti.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Meijikimeranohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Midorinokoke.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Migakizuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Moon.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Nebanebazeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 32)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Nekozuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 33)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Nijiirononunokire.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 34)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Rengokunohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 35)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Risaikurusuton.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Seijanohai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 37)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yougansekinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yorunotobari.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 39)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Seisui.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 40)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Siroikaigara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 41)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 42)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 43)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Suraimuzeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 44)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tensinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 45)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tetunokugi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 46)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Togetogenokiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 47)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tokinosuisyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 48)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tokuyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 49)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tukemonoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 50)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tukinomegumi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 51)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tyounohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 52)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Umanofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 53)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Uruwasikinoko.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 54)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Usaginosippo.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 55)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Usinofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 56)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yawarakauru.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 57)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yogoretahoutai.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //鉱石
                if (Kakuritu1 >= 250)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(12);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Littlemedal.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kinkai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Misriru.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Oriharukon.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Metaru.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Puratina.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tekkouseki.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Ikazutinotama.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Ryuunonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Taiyounoisi.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Inotinoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kagaminoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Rubinogenseki.itemID, rand.nextInt(1) + 1 , 0));
                        }
                    }
                }

                //種
                if (Kakuritu2 >= 150)
                {
                    for (i = 0; i <= 1; i++)
                    {
                        int ItemNo = rand.nextInt(9);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Dokukesisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tikaranotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Mamorinotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Subayasanotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.ItemYakusouSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.ItemDokukesisouSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.ItemTikaraSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.ItemMamoriSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.ItemSubayasaSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //上位素材
                if (Kakuritu3 >= 295)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(22);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Amatuyunoito.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Ayasiikobin.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Budouekisu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Furubitaring.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Goldburesuretto.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Goldring.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hepaitosu.blockID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hikarinoisi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hyoutyounohane.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Juryokunomoto.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kenjanoisi.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kenjanoseisui.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kimeranotubasa.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.MysteryEgg.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Ryuunohizake.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Saezurinomitu.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Sekaijunoha.itemID, 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Sinkanohiseki.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tensinosoma.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Toukonekisu.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Uraminohouju.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Seinarusizuku.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Seireiseki.itemID, 1 , 0));
                        }
                    }
                }

                //オーブ
                if (Kakuritu4 == 298)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(6);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Buruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Gurinoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Ierooubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Metaloubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Paapuruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Redoubu.itemID, 1 , 0));
                        }
                    }
                }

                //武具
                if (Kakuritu5 >= 285)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(31);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Akumanotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Bumeran.itemID, rand.nextInt(16) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Dokubari.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Doragonkira.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Ginnoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenokon.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenoono.itemID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenoturugi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Heisinoken.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Inotinoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kazekirinoyumi.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Konbou.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Koorinoyaiba.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Majuunotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Seinarunaifu.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Toraidento.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Yaibanobumeran.itemID, rand.nextInt(16) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Monosasizao.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tenbinbou.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kawanomuti.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kudamononaifu.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Isinotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Takenoyari.itemID, 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Jaiantokurabu.itemID, 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Reipia.itemID, 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Batoruribon.itemID, 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kinoono.itemID, 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tekkoukagi.itemID, 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tetunoyari.itemID, 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Syotobou.itemID, 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Karyuudonoyumi.itemID, 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kurosubumeran.itemID, 1 , 0));
                        }
                    }
                }

                //防具
                if (Kakuritu6 >= 285)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(25);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenokabuto.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenokote.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Haganenoyoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kawanobousi.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kawanokote.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kawanokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kawanoyoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Sabitakabuto.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Sabitakote.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Sabitakutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Sabitatate.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Sabitayoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Suraimupiasu.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Suraimutorei.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tikaranoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Howaitosirudo.itemID, 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kawanotate.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Keikoginobandana.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Kinobousi.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Oberonnokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tabibitonofuku.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Tabibitonotebukuro.itemID, 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Businnobandana.itemID, 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Budounokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Businrisuto.itemID, 1 , 0));
                        }
                    }
                }

                //魔法
                if (Kakuritu7 >= 290)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(4);
                        int chest2No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hikarinotue.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Hoimi.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Io.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Mera.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest2.setInventorySlotContents(chest2No, new ItemStack(DqmItemList.Raidein.itemID, 1 , 0));
                        }
                    }
                }
            }

            if (chest3 != null)
            {
                int Kakuritu = rand.nextInt(300);
                int Kakuritu1 = rand.nextInt(300);
                int Kakuritu2 = rand.nextInt(300);
                int Kakuritu3 = rand.nextInt(300);
                int Kakuritu4 = rand.nextInt(300);
                int Kakuritu5 = rand.nextInt(300);
                int Kakuritu6 = rand.nextInt(300);
                int Kakuritu7 = rand.nextInt(300);
                int Kakuritu8 = rand.nextInt(300);
                int i = 0;

                //素材1
                if (Kakuritu8 >= 250)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(57);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Akaisango.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Ayakasisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Bakudanisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Bannouyaku.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Bekkou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Dokuganokona.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Doragonnonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Gamanoabura.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Genmaseki.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenoobane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hananomitu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hebinonukegara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Honehone.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hosinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Jouyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kazekirinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kingdaiya.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kiyomenomizu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Koorinokessyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Koumorinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kyodainakiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Madarakumonoito.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Majuunokawa.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Majuunotuno.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Maryokunotuti.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Meijikimeranohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Midorinokoke.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Migakizuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Moon.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Nebanebazeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 32)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Nekozuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 33)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Nijiirononunokire.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 34)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Rengokunohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 35)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Risaikurusuton.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Seijanohai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 37)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yougansekinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yorunotobari.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 39)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Seisui.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 40)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Siroikaigara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 41)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 42)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 43)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Suraimuzeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 44)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tensinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 45)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tetunokugi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 46)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Togetogenokiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 47)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tokinosuisyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 48)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tokuyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 49)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tukemonoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 50)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tukinomegumi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 51)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tyounohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 52)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Umanofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 53)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Uruwasikinoko.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 54)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Usaginosippo.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 55)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Usinofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 56)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yawarakauru.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 57)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yogoretahoutai.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //素材2
                if (Kakuritu >= 50)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(57);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Akaisango.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Ayakasisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Bakudanisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Bannouyaku.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Bekkou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Dokuganokona.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Doragonnonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Gamanoabura.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Genmaseki.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenoobane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hananomitu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hebinonukegara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Honehone.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hosinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Jouyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kazekirinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kingdaiya.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kiyomenomizu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Koorinokessyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Koumorinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kyodainakiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Madarakumonoito.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Majuunokawa.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Majuunotuno.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Maryokunotuti.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Meijikimeranohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Midorinokoke.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Migakizuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Moon.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Nebanebazeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 32)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Nekozuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 33)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Nijiirononunokire.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 34)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Rengokunohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 35)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Risaikurusuton.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Seijanohai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 37)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yougansekinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yorunotobari.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 39)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Seisui.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 40)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Siroikaigara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 41)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 42)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 43)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Suraimuzeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 44)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tensinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 45)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tetunokugi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 46)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Togetogenokiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 47)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tokinosuisyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 48)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tokuyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 49)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tukemonoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 50)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tukinomegumi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 51)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tyounohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 52)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Umanofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 53)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Uruwasikinoko.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 54)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Usaginosippo.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 55)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Usinofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 56)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yawarakauru.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 57)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yogoretahoutai.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //鉱石
                if (Kakuritu1 >= 250)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(12);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Littlemedal.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kinkai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Misriru.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Oriharukon.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Metaru.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Puratina.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tekkouseki.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Ikazutinotama.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Ryuunonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Taiyounoisi.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Inotinoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kagaminoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Rubinogenseki.itemID, rand.nextInt(1) + 1 , 0));
                        }
                    }
                }

                //種
                if (Kakuritu2 >= 150)
                {
                    for (i = 0; i <= 1; i++)
                    {
                        int ItemNo = rand.nextInt(9);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Dokukesisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tikaranotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Mamorinotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Subayasanotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.ItemYakusouSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.ItemDokukesisouSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.ItemTikaraSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.ItemMamoriSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.ItemSubayasaSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //上位素材
                if (Kakuritu3 >= 295)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(22);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Amatuyunoito.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Ayasiikobin.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Budouekisu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Furubitaring.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Goldburesuretto.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Goldring.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hepaitosu.blockID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hikarinoisi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hyoutyounohane.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Juryokunomoto.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kenjanoisi.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kenjanoseisui.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kimeranotubasa.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.MysteryEgg.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Ryuunohizake.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Saezurinomitu.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Sekaijunoha.itemID, 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Sinkanohiseki.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tensinosoma.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Toukonekisu.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Uraminohouju.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Seinarusizuku.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Seireiseki.itemID, 1 , 0));
                        }
                    }
                }

                //オーブ
                if (Kakuritu4 == 298)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(6);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Buruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Gurinoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Ierooubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Metaloubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Paapuruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Redoubu.itemID, 1 , 0));
                        }
                    }
                }

                //武具
                if (Kakuritu5 >= 285)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(31);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Akumanotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Bumeran.itemID, rand.nextInt(16) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Dokubari.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Doragonkira.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Ginnoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenokon.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenoono.itemID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenoturugi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Heisinoken.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Inotinoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kazekirinoyumi.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Konbou.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Koorinoyaiba.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Majuunotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Seinarunaifu.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Toraidento.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Yaibanobumeran.itemID, rand.nextInt(16) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Monosasizao.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tenbinbou.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kawanomuti.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kudamononaifu.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Isinotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Takenoyari.itemID, 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Jaiantokurabu.itemID, 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Reipia.itemID, 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Batoruribon.itemID, 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kinoono.itemID, 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tekkoukagi.itemID, 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tetunoyari.itemID, 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Syotobou.itemID, 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Karyuudonoyumi.itemID, 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kurosubumeran.itemID, 1 , 0));
                        }
                    }
                }

                //防具
                if (Kakuritu6 >= 285)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(25);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenokabuto.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenokote.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Haganenoyoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kawanobousi.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kawanokote.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kawanokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kawanoyoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Sabitakabuto.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Sabitakote.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Sabitakutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Sabitatate.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Sabitayoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Suraimupiasu.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Suraimutorei.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tikaranoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Howaitosirudo.itemID, 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kawanotate.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Keikoginobandana.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Kinobousi.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Oberonnokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tabibitonofuku.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Tabibitonotebukuro.itemID, 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Businnobandana.itemID, 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Budounokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Businrisuto.itemID, 1 , 0));
                        }
                    }
                }

                //魔法
                if (Kakuritu7 >= 290)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(4);
                        int chest3No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hikarinotue.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Hoimi.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Io.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Mera.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest3.setInventorySlotContents(chest3No, new ItemStack(DqmItemList.Raidein.itemID, 1 , 0));
                        }
                    }
                }
            }

            if (chest4 != null)
            {
                int Kakuritu = rand.nextInt(300);
                int Kakuritu1 = rand.nextInt(300);
                int Kakuritu2 = rand.nextInt(300);
                int Kakuritu3 = rand.nextInt(300);
                int Kakuritu4 = rand.nextInt(300);
                int Kakuritu5 = rand.nextInt(300);
                int Kakuritu6 = rand.nextInt(300);
                int Kakuritu7 = rand.nextInt(300);
                int Kakuritu8 = rand.nextInt(300);
                int i = 0;

                //素材1
                if (Kakuritu8 >= 250)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(57);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Akaisango.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Ayakasisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Bakudanisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Bannouyaku.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Bekkou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Dokuganokona.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Doragonnonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Gamanoabura.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Genmaseki.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenoobane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hananomitu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hebinonukegara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Honehone.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hosinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Jouyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kazekirinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kingdaiya.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kiyomenomizu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Koorinokessyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Koumorinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kyodainakiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Madarakumonoito.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Majuunokawa.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Majuunotuno.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Maryokunotuti.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Meijikimeranohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Midorinokoke.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Migakizuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Moon.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Nebanebazeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 32)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Nekozuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 33)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Nijiirononunokire.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 34)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Rengokunohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 35)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Risaikurusuton.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Seijanohai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 37)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yougansekinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yorunotobari.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 39)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Seisui.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 40)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Siroikaigara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 41)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 42)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 43)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Suraimuzeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 44)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tensinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 45)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tetunokugi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 46)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Togetogenokiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 47)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tokinosuisyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 48)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tokuyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 49)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tukemonoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 50)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tukinomegumi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 51)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tyounohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 52)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Umanofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 53)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Uruwasikinoko.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 54)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Usaginosippo.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 55)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Usinofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 56)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yawarakauru.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 57)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yogoretahoutai.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //素材2
                if (Kakuritu >= 50)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(57);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Akaisango.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Ayakasisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Bakudanisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Bannouyaku.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Bekkou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Dokudokuhedoro.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Dokuganokona.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Doragonnonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Gamanoabura.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Genmaseki.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenoobane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hananomitu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hebinonukegara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Honehone.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hosinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Jouyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kazekirinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kingdaiya.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kiyomenomizu.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Koorinokessyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Koumorinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kyodaihigetokage.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kyodainakiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Madarakumonoito.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Majuunokawa.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Majuunotuno.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Maryokunotuti.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Meijikimeranohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Midorinokoke.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Migakizuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Moon.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Nebanebazeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 32)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Nekozuna.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 33)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Nijiirononunokire.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 34)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Rengokunohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 35)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Risaikurusuton.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Seijanohai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 37)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yougansekinokakera.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 36)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yorunotobari.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 39)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Seisui.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 40)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Siroikaigara.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 41)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Suraimunokanmuri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 42)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Suraimuosyarebana.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 43)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Suraimuzeri.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 44)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tensinohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 45)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tetunokugi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 46)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Togetogenokiba.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 47)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tokinosuisyou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 48)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tokuyakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 49)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tukemonoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 50)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tukinomegumi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 51)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tyounohane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 52)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Umanofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 53)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Uruwasikinoko.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 54)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Usaginosippo.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 55)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Usinofun.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 56)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yawarakauru.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 57)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yogoretahoutai.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //鉱石
                if (Kakuritu1 >= 250)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(12);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Littlemedal.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kinkai.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Misriru.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Oriharukon.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Metaru.itemID, rand.nextInt(1) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Puratina.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tekkouseki.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Ikazutinotama.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Ryuunonamida.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Taiyounoisi.itemID, rand.nextInt(2) + 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Inotinoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kagaminoisi.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Rubinogenseki.itemID, rand.nextInt(1) + 1 , 0));
                        }
                    }
                }

                //種
                if (Kakuritu2 >= 150)
                {
                    for (i = 0; i <= 1; i++)
                    {
                        int ItemNo = rand.nextInt(9);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yakusou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Dokukesisou.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tikaranotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Mamorinotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Subayasanotane.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.ItemYakusouSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.ItemDokukesisouSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.ItemTikaraSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.ItemMamoriSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.ItemSubayasaSeed.itemID, rand.nextInt(3) + 1 , 0));
                        }
                    }
                }

                //上位素材
                if (Kakuritu3 >= 295)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(22);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Amatuyunoito.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Ayasiikobin.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Budouekisu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Furubitaring.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Goldburesuretto.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Goldring.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hepaitosu.blockID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hikarinoisi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hyoutyounohane.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Juryokunomoto.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kenjanoisi.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kenjanoseisui.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kimeranotubasa.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.MysteryEgg.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Ryuunohizake.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Saezurinomitu.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Sekaijunoha.itemID, 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Sinkanohiseki.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tensinosoma.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Toukonekisu.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Uraminohouju.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Seinarusizuku.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Seireiseki.itemID, 1 , 0));
                        }
                    }
                }

                //オーブ
                if (Kakuritu4 == 298)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(6);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Buruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Gurinoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Ierooubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Metaloubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Paapuruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Redoubu.itemID, 1 , 0));
                        }
                    }
                }

                //武具
                if (Kakuritu5 >= 285)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(31);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Akumanotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Bumeran.itemID, rand.nextInt(16) + 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Dokubari.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Doragonkira.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Ginnoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenokon.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenoono.itemID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenoturugi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Heisinoken.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Inotinoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kazekirinoyumi.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Konbou.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Koorinoyaiba.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Majuunotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Seinarunaifu.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Toraidento.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Yaibanobumeran.itemID, rand.nextInt(16) + 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Monosasizao.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tenbinbou.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kawanomuti.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kudamononaifu.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Isinotume.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Takenoyari.itemID, 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Jaiantokurabu.itemID, 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Reipia.itemID, 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Batoruribon.itemID, 1 , 0));
                        }

                        if (ItemNo == 26)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kinoono.itemID, 1 , 0));
                        }

                        if (ItemNo == 27)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tekkoukagi.itemID, 1 , 0));
                        }

                        if (ItemNo == 28)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tetunoyari.itemID, 1 , 0));
                        }

                        if (ItemNo == 29)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Syotobou.itemID, 1 , 0));
                        }

                        if (ItemNo == 30)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Karyuudonoyumi.itemID, 1 , 0));
                        }

                        if (ItemNo == 31)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kurosubumeran.itemID, 1 , 0));
                        }
                    }
                }

                //防具
                if (Kakuritu6 >= 285)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(25);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenokabuto.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenokote.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Haganenoyoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kawanobousi.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kawanokote.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kawanokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kawanoyoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Sabitakabuto.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Sabitakote.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Sabitakutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 11)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Sabitatate.itemID, 1 , 0));
                        }

                        if (ItemNo == 12)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Sabitayoroi.itemID, 1 , 0));
                        }

                        if (ItemNo == 13)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Suraimupiasu.itemID, 1 , 0));
                        }

                        if (ItemNo == 14)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Suraimutorei.itemID, 1 , 0));
                        }

                        if (ItemNo == 15)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tikaranoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 16)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Howaitosirudo.itemID, 1 , 0));
                        }

                        if (ItemNo == 17)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kawanotate.itemID, 1 , 0));
                        }

                        if (ItemNo == 18)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Keikoginobandana.itemID, 1 , 0));
                        }

                        if (ItemNo == 19)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Kinobousi.itemID, 1 , 0));
                        }

                        if (ItemNo == 20)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Oberonnokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 21)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tabibitonofuku.itemID, 1 , 0));
                        }

                        if (ItemNo == 22)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Tabibitonotebukuro.itemID, 1 , 0));
                        }

                        if (ItemNo == 23)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Businnobandana.itemID, 1 , 0));
                        }

                        if (ItemNo == 24)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Budounokutu.itemID, 1 , 0));
                        }

                        if (ItemNo == 25)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Businrisuto.itemID, 1 , 0));
                        }
                    }
                }

                //魔法
                if (Kakuritu7 >= 290)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(4);
                        int chest4No = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hikarinotue.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Hoimi.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Io.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Mera.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest4.setInventorySlotContents(chest4No, new ItemStack(DqmItemList.Raidein.itemID, 1 , 0));
                        }
                    }
                }
            }
        }
    }

}
