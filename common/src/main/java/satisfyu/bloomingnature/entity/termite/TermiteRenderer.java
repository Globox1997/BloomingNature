package satisfyu.bloomingnature.entity.termite;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import satisfyu.bloomingnature.util.BloomingNatureIdentifier;


@Environment(value = EnvType.CLIENT)
public class TermiteRenderer extends MobRenderer<TermiteEntity, TermiteModel<TermiteEntity>> {
    private static final ResourceLocation TEXTURE = new BloomingNatureIdentifier("textures/entity/termite.png");

    public TermiteRenderer(EntityRendererProvider.Context context) {
        super(context, new TermiteModel(context.bakeLayer(TermiteModel.LAYER_LOCATION)), 0.2f);
    }



    @Override
    public ResourceLocation getTextureLocation(TermiteEntity entity) {
        return TEXTURE;
    }
}
