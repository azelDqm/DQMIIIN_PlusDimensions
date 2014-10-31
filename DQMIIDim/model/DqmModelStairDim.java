package DQMIIDim.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class DqmModelStairDim extends ModelBase
{
    //fields
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;

    public DqmModelStairDim()
    {
        textureWidth = 16;
        textureHeight = 16;
        float fixPos = -24F;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(-8F, -8F, 0F, 16, 16, 8);
        Shape1.setRotationPoint(0F, 8F + fixPos, 0F);

        Shape2 = new ModelRenderer(this, 0, 0);
        Shape2.addBox(-8F, -8F, -8F, 16, 8, 8);
        Shape2.setRotationPoint(0F, 8F + fixPos, 0F);
        /*
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 16, 16, 8);
        Shape1.setRotationPoint(-8F, 0F + fixPos, 0F);

        Shape2 = new ModelRenderer(this, 0, 0);
        Shape2.addBox(0F, 0F, 0F, 16, 8, 8);
        Shape2.setRotationPoint(-8F, 0F + fixPos, -8F);
*/




        /*
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 16, 16, 8);
        Shape1.setRotationPoint(-8F, 8F + fixPos, 0F);
        Shape1.setTextureSize(64, 16);
        Shape1.mirror = false;
        setRotation(Shape1, 0F, 0F, 180F);
        Shape2 = new ModelRenderer(this, 0, 0);
        Shape2.addBox(0F, 0F, 0F, 16, 8, 8);
        Shape2.setRotationPoint(-8F, 16F + fixPos, -8F);
        Shape2.setTextureSize(64, 16);
        Shape2.mirror = false;
        setRotation(Shape2, 0F, 0F, 180F);
*/
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Shape1.render(f5);
        Shape2.render(f5);
    }
    public void modelRender(float f5)
    {
    	Shape1.render(f5);
    	Shape2.render(f5);
    }
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }
}
