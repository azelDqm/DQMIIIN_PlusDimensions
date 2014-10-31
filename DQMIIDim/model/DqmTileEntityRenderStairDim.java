package DQMIIDim.model;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class DqmTileEntityRenderStairDim extends TileEntitySpecialRenderer
{
    private DqmModelStairDim model = new DqmModelStairDim();
    private DqmModelStairDimR model2 = new DqmModelStairDimR();

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
    	DqmTileEntityStairDim var9 = (DqmTileEntityStairDim)var1;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 1.5F, (float)var6 + 0.5F);
        //GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(0.0F, 0.0F, -16.0F, 1.0F);



	        if (var9.getHougakuData() == 3)
	        {
	            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
	        }

	        if (var9.getHougakuData() == 2)
	        {
	            GL11.glRotatef(-180.0F, 0.0F, 1.0F, 0.0F);
	        }

	        if (var9.getHougakuData() == 1)
	        {
	            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
	        }

        //System.out.println("ファイル名7:" + var9.getBlockMetadata());
        this.bindTextureByName("/textures/blocks/woodN_" + var9.getBlockMetadata() + ".png");

        GL11.glPushMatrix();
        if(var9.getMuki() == 0)
        {
        	this.model.modelRender(0.0625F);
        }else
        {
        	this.model2.modelRender(0.0625F);
        }
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
