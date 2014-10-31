package DQMIIDim.genDqm;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import DQMII.DqmItemList;
import DQMIIDim.BlockList;
import DQMIIDim.DqmNextDim;
import DQMIIDim.ItemList;
import cpw.mods.fml.common.IWorldGenerator;

public class DqmWorldGenHoumotukoN2 implements IWorldGenerator
{
    public DqmWorldGenHoumotukoN2(boolean b) {	}
    public DqmWorldGenHoumotukoN2() {}
    public void setScale(int i, int j, int k) {	}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int xxx = par1 * 16 + rand.nextInt(16);
        int zzz = par2 * 16 + rand.nextInt(16);
        int yyy = par3World.getHeightValue(xxx, zzz);
        int ran1 = rand.nextInt(10000);
        int ran2 = rand.nextInt(100);
        int door = rand.nextInt(100);

        if (ran1 >= 9990 && WorldGenFunctions.canGenerate(rand, par3World, xxx, yyy, zzz, 1))
        {
            for (int x = -3; x <= 3; ++x)
            {
                for (int z = -5; z <= 5; ++z)
                {
                    for (int y = 0; y <= 4; ++y)
                    {
                        par3World.setBlock(xxx + x, yyy + y, zzz + z, 0, 0, 2);
                    }
                }
            }

            for (int x = -1; x <= 1; ++x)
            {
                for (int z = -4; z <= 4; ++z)
                {
                    for (int y = +1; y <= 3; ++y)
                    {
                        par3World.setBlock(xxx + x, yyy + y, zzz + z, DqmItemList.Kowarenai1.blockID, 0, 2);
                    }
                }
            }

            for (int z = -4; z <= 3; ++z)
            {
                for (int y = +1; y <= 2; ++y)
                {
                    par3World.setBlock(xxx, yyy + y, zzz + z, 0, 0, 2);
                }
            }

            for (int x = -2; x <= 2; ++x)
            {
                for (int z = -4; z <= 4; ++z)
                {
                    par3World.setBlock(xxx + x, yyy, zzz + z, DqmItemList.Kowarenai1.blockID, 0, 2);
                }
            }

            for (int z = -3; z <= 1; ++z)
            {
                par3World.setBlock(xxx, yyy, zzz + z, DqmItemList.ToramanaYuka.blockID, 0, 2);
            }

            for (int x = -2; x <= 2; ++x)
            {
                for (int z = -4; z <= 4; ++z)
                {
                    par3World.setBlock(xxx + x, yyy + 4, zzz + z, DqmItemList.Kowarenai1.blockID, 0, 2);
                }
            }

            for (int z = -4; z <= 4; ++z)
            {
                par3World.setBlock(xxx + 3, yyy, zzz + z, Block.stairsStoneBrick.blockID, 1, 2);
                par3World.setBlock(xxx - 3, yyy, zzz + z, Block.stairsStoneBrick.blockID, 0, 2);
            }

            for (int z = -4; z <= 4; ++z)
            {
                par3World.setBlock(xxx + 3, yyy + 4, zzz + z, Block.stairsStoneBrick.blockID, 5, 2);
                par3World.setBlock(xxx - 3, yyy + 4, zzz + z, Block.stairsStoneBrick.blockID, 4, 2);
            }

            for (int x = -3; x <= 3; ++x)
            {
                par3World.setBlock(xxx + x, yyy, zzz + 5, Block.stairsStoneBrick.blockID, 3, 2);
                par3World.setBlock(xxx + x, yyy, zzz - 5, Block.stairsStoneBrick.blockID, 2, 2);
            }

            for (int x = -3; x <= 3; ++x)
            {
                par3World.setBlock(xxx + x, yyy + 4, zzz + 5, Block.stairsStoneBrick.blockID, 7, 2);
                par3World.setBlock(xxx + x, yyy + 4, zzz - 5, Block.stairsStoneBrick.blockID, 6, 2);
            }

            par3World.setBlock(xxx + 2, yyy + 1, zzz, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 1, zzz + 4, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 1, zzz - 4, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 1, zzz, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 1, zzz + 4, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 1, zzz - 4, DqmItemList.HasiraQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz + 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz - 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz + 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz - 4, DqmItemList.HasiranakaQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 3, zzz, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 3, zzz + 4, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 3, zzz - 4, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 3, zzz, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 3, zzz + 4, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx - 2, yyy + 3, zzz - 4, DqmItemList.HasiraueQ.blockID, 0, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz + 2, DqmItemList.Taimatu.blockID, 1, 2);
            par3World.setBlock(xxx + 2, yyy + 2, zzz - 2, DqmItemList.Taimatu.blockID, 1, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz + 2, DqmItemList.Taimatu.blockID, 3, 2);
            par3World.setBlock(xxx - 2, yyy + 2, zzz - 2, DqmItemList.Taimatu.blockID, 3, 2);
            par3World.setBlock(xxx + 1, yyy + 2, zzz + 5, DqmItemList.Taimatu.blockID, 2, 2);
            par3World.setBlock(xxx - 1, yyy + 2, zzz + 5, DqmItemList.Taimatu.blockID, 2, 2);
            par3World.setBlock(xxx + 1, yyy + 2, zzz - 5, DqmItemList.Taimatu.blockID, 0, 2);
            par3World.setBlock(xxx - 1, yyy + 2, zzz - 5, DqmItemList.Taimatu.blockID, 0, 2);

          //par3World.setBlock(xxx, yyy+5, zzz-4, Block.doorIron.blockID, 1, 2);
            if (door <= 59)
            {
                Block block;
                block = DqmItemList.KowarenaiDoor;
                int i1 = MathHelper.floor_double((double)((180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                placeDoorBlock(par3World, xxx, yyy + 1, zzz - 4, i1, block);
                par3World.setBlock(xxx, yyy + 1, zzz + 3, Block.chest.blockID, 0, 2);
                TileEntityChest chest = (TileEntityChest)par3World.getBlockTileEntity(xxx, yyy + 1, zzz + 3);
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

                //アクセサリ
                if (Kakuritu2 >= 100)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(10);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Inotinoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ryuunouroko.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suraimupiasu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Akumanotatu.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Goldring.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Goldburesuretto.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hayatenoring.itemID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Mamorinorubi.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tikaranoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ginnoyubiwa.itemID, 1 , 0));
                        }
                    }
                }

                //上位素材
                if (Kakuritu3 >= 255)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(23);
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
                if (Kakuritu4 == 290)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(6);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Buruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gurinoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ierooubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Metaloubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Paapuruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Redoubu.itemID, 1 , 0));
                        }
                    }
                }

                //武具
                if (Kakuritu5 >= 50)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(32);
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
                if (Kakuritu6 >= 50)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(26);
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
                if (Kakuritu7 >= 250)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(5);
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

            if (door >= 60 && door <= 89)
            {
                Block block;
                block = DqmItemList.KowarenaiDoor2;
                int i1 = MathHelper.floor_double((double)((180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                placeDoorBlock(par3World, xxx, yyy + 1, zzz - 4, i1, block);
                par3World.setBlock(xxx, yyy + 1, zzz + 3, Block.chest.blockID, 0, 2);
                TileEntityChest chest = (TileEntityChest)par3World.getBlockTileEntity(xxx, yyy + 1, zzz + 3);
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

                //アクセサリ
                if (Kakuritu2 >= 100)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(11);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ikarinotatu.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Inorinoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Singonnojuzu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Rakkipendanto.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Mayokenoseiin.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Roiyarubajjji.itemID, 1 , 0));
                        }

                        if (ItemNo == 6)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Iyasinoudewa.itemID, 1 , 0));
                        }

                        if (ItemNo == 7)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Hosifuru.itemID, 1 , 0));
                        }

                        if (ItemNo == 8)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Mamorinoudewa.itemID, 1 , 0));
                        }

                        if (ItemNo == 9)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Furubitaring.itemID, 1 , 0));
                        }

                        if (ItemNo == 10)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Tikaranorubi.itemID, 1 , 0));
                        }
                    }
                }

                //上位素材
                if (Kakuritu3 >= 255)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(23);
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
                if (Kakuritu4 == 290)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(6);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Buruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gurinoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ierooubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Metaloubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Paapuruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Redoubu.itemID, 1 , 0));
                        }
                    }
                }

                //武具
                if (Kakuritu5 >= 50)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(32);
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
                if (Kakuritu6 >= 50)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(26);
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
                if (Kakuritu7 >= 250)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(5);
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

            if (door >= 90)
            {
                Block block;
                block = DqmItemList.KowarenaiDoor3;
                int i1 = MathHelper.floor_double((double)((180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                placeDoorBlock(par3World, xxx, yyy + 1, zzz - 4, i1, block);
                par3World.setBlock(xxx, yyy + 1, zzz + 3, Block.chest.blockID, 0, 2);
                TileEntityChest chest = (TileEntityChest)par3World.getBlockTileEntity(xxx, yyy + 1, zzz + 3);
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

                //アクセサリ
                if (Kakuritu2 >= 100)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(4);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Suparing.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Megaminoyubiwa.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gouketunoudewa.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Sosararing.itemID, 1 , 0));
                        }
                    }
                }

                //上位素材
                if (Kakuritu3 >= 255)
                {
                    for (i = 0; i <= 2; i++)
                    {
                        int ItemNo = rand.nextInt(23);
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
                if (Kakuritu4 == 290)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(6);
                        int ChestNo = rand.nextInt(26);

                        if (ItemNo == 0)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Buruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 1)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Gurinoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 2)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Ierooubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 3)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Metaloubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 4)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Paapuruoubu.itemID, 1 , 0));
                        }

                        if (ItemNo == 5)
                        {
                            chest.setInventorySlotContents(ChestNo, new ItemStack(DqmItemList.Redoubu.itemID, 1 , 0));
                        }
                    }
                }

                //武具
                if (Kakuritu5 >= 50)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(32);
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
                if (Kakuritu6 >= 50)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(26);
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
                if (Kakuritu7 >= 250)
                {
                    for (i = 0; i <= 0; i++)
                    {
                        int ItemNo = rand.nextInt(5);
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

                int bid = par3World.getBlockId(xxx, yyy - 1, zzz);
                int metaCnt = -1;

                for(int cnt = 0; cnt < BlockList.DqmDimBlocks_grass.length; cnt++)
                {
                	//System.out.println("ファイル名3:" + par3World.getBlockId(x, y - 1, z));
                	if(bid == BlockList.DqmDimBlocks_grass[cnt].blockID || bid == BlockList.DqmDimBlocks_dirt[cnt].blockID)
                	{
                		metaCnt = cnt;
                		//break;
                	}
                }


                int setMeta = 0;

                if(metaCnt == DqmNextDim.idxAkuma)
                {
                	switch(rand.nextInt(5))
                	{
                		case 0: setMeta = 0;break;
                		case 1: setMeta = 1;break;
                		case 2: setMeta = 2;break;
                		case 3: setMeta = 5;break;
                		case 4: setMeta = 6;break;
                	}
                }else if(metaCnt == DqmNextDim.idxBussitu)
                {
                	switch(rand.nextInt(5))
                	{
                		case 0: setMeta = 1;break;
                		case 1: setMeta = 2;break;
                		case 2: setMeta = 3;break;
                		case 3: setMeta = 4;break;
                		case 4: setMeta = 8;break;
                	}
                }else if(metaCnt == DqmNextDim.idxMaju)
                {
                	switch(rand.nextInt(4))
                	{
                		case 0: setMeta = 3;break;
                		case 1: setMeta = 7;break;
                		case 2: setMeta = 8;break;
                		case 3: setMeta = 11;break;
                	}
                }else if(metaCnt == DqmNextDim.idxMetaru)
                {
                	switch(rand.nextInt(12))
                	{
                		case 0: setMeta = 0;break;
                		case 1: setMeta = 1;break;
                		case 2: setMeta = 2;break;
                		case 3: setMeta = 31;break;
                		case 4: setMeta = 4;break;
                		case 5: setMeta = 5;break;
                		case 6: setMeta = 6;break;
                		case 7: setMeta = 7;break;
                		case 8: setMeta = 8;break;
                		case 9: setMeta = 9;break;
                		case 10: setMeta = 10;break;
                		case 11: setMeta = 11;break;
                	}
                }else if(metaCnt == DqmNextDim.idxSizen)
                {
                	switch(rand.nextInt(4))
                	{
                		case 0: setMeta = 5;break;
                		case 1: setMeta = 7;break;
                		case 2: setMeta = 8;break;
                		case 3: setMeta = 6;break;
                	}
                }else if(metaCnt == DqmNextDim.idxSuraimu)
                {
                	switch(rand.nextInt(4))
                	{
                		case 0: setMeta = 0;break;
                		case 1: setMeta = 1;break;
                		case 2: setMeta = 4;break;
                		case 3: setMeta = 7;break;
                	}
                }else if(metaCnt == DqmNextDim.idxTokusyu)
                {
                	switch(rand.nextInt(5))
                	{
                		case 0: setMeta = 0;break;
                		case 1: setMeta = 1;break;
                		case 2: setMeta = 2;break;
                		case 3: setMeta = 9;break;
                		case 4: setMeta = 10;break;
                	}
                }else if(metaCnt == DqmNextDim.idxZonbi)
                {
                	switch(rand.nextInt(4))
                	{
                		case 0: setMeta = 9;break;
                		case 1: setMeta = 10;break;
                		case 2: setMeta = 11;break;
                		case 3: setMeta = 4;break;
                	}
                }else if(metaCnt == DqmNextDim.idxDragon)
                {
                	switch(rand.nextInt(5))
                	{
                		case 0: setMeta = 2;break;
                		case 1: setMeta = 3;break;
                		case 2: setMeta = 7;break;
                		case 3: setMeta = 8;break;
                		case 4: setMeta = 11;break;
                	}
                }

                int ChestNo = rand.nextInt(26);
                chest.setInventorySlotContents(ChestNo, new ItemStack(ItemList.itemBuilderTicket.itemID, 1 , setMeta));
            }

            /*
            for (int x = -2; x <= 2; ++x)
            {
            	for (int z = -2; z <= 3; ++z)
            	{
            		for (int y = 0; y <= 2; ++y)
            		{
                		par3World.setBlock(xxx+x, yyy+y, zzz+z, 0, 0, 2);
            		}
            	}
            }
            for (int x = -2; x <= 2; ++x)
            {
                par3World.setBlock(xxx+x, yyy, zzz+1, Block.stairsWoodOak.blockID, 7, 2);
            }
            par3World.setBlock(xxx-2, yyy, zzz, DqmItemList.Maki.blockID, 0, 2);
            par3World.setBlock(xxx-1, yyy, zzz+2, DqmItemList.Isu.blockID, 0, 2);
            par3World.setBlock(xxx+1, yyy, zzz+2, DqmItemList.Isu.blockID, 0, 2);
            par3World.setBlock(xxx+2, yyy, zzz+2, DqmItemList.Taimatu2.blockID, 0, 2);
            par3World.setBlock(xxx-2, yyy, zzz+2, DqmItemList.Taimatu2.blockID, 0, 2);

            par3World.setBlock(xxx+2, yyy, zzz-2, DqmItemList.TaruK.blockID, 0, 2);
            par3World.setBlock(xxx-2, yyy, zzz-1, DqmItemList.TuboK.blockID, 0, 2);
            par3World.setBlock(xxx-2, yyy, zzz-2, DqmItemList.TuboK.blockID, 0, 2);

            par3World.setBlock(xxx+1, yyy+1, zzz+1, DqmItemList.Hepaitosu.blockID, 0, 2);

            par3World.setBlock(xxx, yyy, zzz-2, DqmItemList.Hondana.blockID, 2, 2);

            par3World.setBlock(xxx-4, yyy+1, zzz+2, DqmItemList.Taimatu.blockID, 3, 2);
            par3World.setBlock(xxx-4, yyy+1, zzz-2, DqmItemList.Taimatu.blockID, 3, 2);
            par3World.setBlock(xxx+4, yyy+1, zzz+2, DqmItemList.Taimatu.blockID, 1, 2);
            par3World.setBlock(xxx+4, yyy+1, zzz-2, DqmItemList.Taimatu.blockID, 1, 2);

            par3World.setBlock(xxx+3, yyy+1, zzz+4, DqmItemList.Bouguya.blockID, 2, 2);
            par3World.setBlock(xxx-3, yyy+1, zzz+4, DqmItemList.Bouguya.blockID, 2, 2);

            DqmEventSyuuri entitysilverfish = new DqmEventSyuuri(par3World);
            entitysilverfish.setLocationAndAngles(xxx+0.5F, yyy, zzz+0.5F, 0.0F, 0.0F);
            par3World.spawnEntityInWorld(entitysilverfish);*/
        }
    }
    public static void placeDoorBlock(World par0World, int par1, int par2, int par3, int par4, Block par5Block)
    {
        byte b0 = 0;
        byte b1 = 0;

        if (par4 == 0)
        {
            b1 = 1;
        }

        if (par4 == 1)
        {
            b0 = -1;
        }

        if (par4 == 2)
        {
            b1 = -1;
        }

        if (par4 == 3)
        {
            b0 = 1;
        }

        int i1 = (par0World.isBlockNormalCube(par1 - b0, par2, par3 - b1) ? 1 : 0) + (par0World.isBlockNormalCube(par1 - b0, par2 + 1, par3 - b1) ? 1 : 0);
        int j1 = (par0World.isBlockNormalCube(par1 + b0, par2, par3 + b1) ? 1 : 0) + (par0World.isBlockNormalCube(par1 + b0, par2 + 1, par3 + b1) ? 1 : 0);
        boolean flag = par0World.getBlockId(par1 - b0, par2, par3 - b1) == par5Block.blockID || par0World.getBlockId(par1 - b0, par2 + 1, par3 - b1) == par5Block.blockID;
        boolean flag1 = par0World.getBlockId(par1 + b0, par2, par3 + b1) == par5Block.blockID || par0World.getBlockId(par1 + b0, par2 + 1, par3 + b1) == par5Block.blockID;
        boolean flag2 = false;

        if (flag && !flag1)
        {
            flag2 = true;
        }
        else if (j1 > i1)
        {
            flag2 = true;
        }

        par0World.setBlock(par1, par2, par3, par5Block.blockID, par4, 2);
        par0World.setBlock(par1, par2 + 1, par3, par5Block.blockID, 8 | (flag2 ? 1 : 0), 2);
        par0World.notifyBlocksOfNeighborChange(par1, par2, par3, par5Block.blockID);
        par0World.notifyBlocksOfNeighborChange(par1, par2 + 1, par3, par5Block.blockID);
    }
}
