package satisfyu.bloomingnature.client;

import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.SheepFurModel;
import net.minecraft.client.model.SheepModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.FoliageColor;
import satisfyu.bloomingnature.BloomingNature;
import satisfyu.bloomingnature.entity.bison.BisonModel;
import satisfyu.bloomingnature.entity.bison.BisonRenderer;
import satisfyu.bloomingnature.entity.boar.BoarModel;
import satisfyu.bloomingnature.entity.boar.BoarRenderer;
import satisfyu.bloomingnature.entity.deer.DeerModel;
import satisfyu.bloomingnature.entity.deer.DeerRenderer;
import satisfyu.bloomingnature.entity.mossy_sheep.MossySheepRenderer;
import satisfyu.bloomingnature.entity.muddy_pig.MuddyPigModel;
import satisfyu.bloomingnature.entity.muddy_pig.MuddyPigRenderer;
import satisfyu.bloomingnature.entity.owl.OwlModel;
import satisfyu.bloomingnature.entity.owl.OwlRenderer;
import satisfyu.bloomingnature.entity.pelican.PelicanModel;
import satisfyu.bloomingnature.entity.pelican.PelicanRenderer;
import satisfyu.bloomingnature.entity.raccoon.RaccoonModel;
import satisfyu.bloomingnature.entity.raccoon.RaccoonRenderer;
import satisfyu.bloomingnature.entity.red_wolf.RedWolfModel;
import satisfyu.bloomingnature.entity.squirrel.SquirrelModel;
import satisfyu.bloomingnature.entity.squirrel.SquirrelRenderer;
import satisfyu.bloomingnature.entity.termite.TermiteModel;
import satisfyu.bloomingnature.entity.termite.TermiteRenderer;
import satisfyu.bloomingnature.entity.wandering_gardener.WanderingGardenerModel;
import satisfyu.bloomingnature.client.render.block.FlowerBoxBlockEntityRenderer;
import satisfyu.bloomingnature.client.render.block.FlowerPotBigBlockEntityRenderer;
import satisfyu.bloomingnature.entity.red_wolf.RedWolfRenderer;
import satisfyu.bloomingnature.entity.wandering_gardener.WanderingGardenerRenderer;
import satisfyu.bloomingnature.registry.BlockEntityRegistry;
import satisfyu.bloomingnature.registry.EntityRegistry;
import satisfyu.bloomingnature.registry.ObjectRegistry;

@Environment(EnvType.CLIENT)
public class BloomingNatureClient {

    public static void initClient() {
        RenderTypeRegistry.register(RenderType.cutout(),
                ObjectRegistry.CARDINAL.get(), ObjectRegistry.MOUNTAIN_LAUREL.get(), ObjectRegistry.JOE_PYE.get(), ObjectRegistry.HYSSOP.get(),
                ObjectRegistry.MOUNTAIN_SNOWBELL.get(), ObjectRegistry.CARDINAL.get(), ObjectRegistry.BIRD_OF_PARADISE.get(), ObjectRegistry.WHITE_ORCHID.get(),
                ObjectRegistry.POTTED_MOUNTAIN_LAUREL.get(), ObjectRegistry.POTTED_JOE_PYE.get(), ObjectRegistry.POTTED_HYSSOP.get(),
                ObjectRegistry.POTTED_MOUNTAIN_SNOWBELL.get(), ObjectRegistry.POTTED_WHITE_ORCHID.get(), ObjectRegistry.POTTED_BIRD_OF_PARADISE.get(),
                ObjectRegistry.BEGONIE.get(), ObjectRegistry.GENISTEAE.get(), ObjectRegistry.GOATSBEARD.get(), ObjectRegistry.BLUEBELL.get(), ObjectRegistry.DAPHNE.get(),
                ObjectRegistry.BOTTLEBRUSHES.get(), ObjectRegistry.FOXGLOVE_WHITE.get(), ObjectRegistry.FOXGLOVE_PINK.get(), ObjectRegistry.FREESIA_YELLOW.get(),
                ObjectRegistry.FREESIA_PINK.get(), ObjectRegistry.LUPINE_BLUE.get(), ObjectRegistry.LUPINE_PURPLE.get(),
                ObjectRegistry.LARCH_DOOR.get(), ObjectRegistry.POTTED_BEGONIE.get(), ObjectRegistry.POTTED_GENISTEAE.get(),
                ObjectRegistry.POTTED_GOATSBEARD.get(), ObjectRegistry.POTTED_BLUEBELL.get(), ObjectRegistry.POTTED_DAPHNE.get(), ObjectRegistry.POTTED_BOTTLEBRUSHES.get(),
                ObjectRegistry.POTTED_FOXGLOVE_WHITE.get(), ObjectRegistry.POTTED_FOXGLOVE_PINK.get(), ObjectRegistry.POTTED_FREESIA_YELLOW.get(),
                ObjectRegistry.POTTED_FREESIA_PINK.get(), ObjectRegistry.POTTED_LUPINE_BLUE.get(), ObjectRegistry.POTTED_LUPINE_PURPLE.get(),
                ObjectRegistry.POTTED_LARCH_SAPLING.get(), ObjectRegistry.LARCH_SAPLING.get(), ObjectRegistry.SWAMP_OAK_TRAPDOOR.get(),
                ObjectRegistry.SWAMP_OAK_WINDOW.get(), ObjectRegistry.SWAMP_OAK_DOOR.get(), ObjectRegistry.SWAMP_OAK_SAPLING.get(), ObjectRegistry.LARCH_WINDOW.get(),
                ObjectRegistry.TALL_MOUNTAIN_LAUREL.get(), ObjectRegistry.TALL_LUPINE_BLUE.get(), ObjectRegistry.TALL_LUPINE_PURPLE.get(), ObjectRegistry.BEACH_BUSH.get(),
                ObjectRegistry.BEACH_BUSH_TALL.get(), ObjectRegistry.BEACH_GRASS.get(), ObjectRegistry.GOLDEN_ROD.get(), ObjectRegistry.WILD_SUNFLOWER.get(),
                ObjectRegistry.PALM_SAPLING.get(), ObjectRegistry.PALM_DOOR.get(), ObjectRegistry.PALM_TRAPDOOR.get(), ObjectRegistry.PALM_WINDOW.get(),
                ObjectRegistry.CATTAIL.get(), ObjectRegistry.REED.get(), ObjectRegistry.POTTED_LARCH_SAPLING.get(), ObjectRegistry.POTTED_FIR_SAPLING.get(),
                ObjectRegistry.POTTED_SWAMP_CYPRESS_SAPLING.get(), ObjectRegistry.POTTED_SWAMP_OAK_SAPLING.get(), ObjectRegistry.POTTED_PALM_SAPLING.get(),
                ObjectRegistry.POTTED_ASPEN_SAPLING.get(), ObjectRegistry.POTTED_BAOBAB_SAPLING.get(), ObjectRegistry.POTTED_GOLDEN_ROD.get(),
                ObjectRegistry.POTTED_BEACH_BUSH.get(), ObjectRegistry.BAOBAB_WINDOW.get(), ObjectRegistry.ASPEN_WINDOW.get(), ObjectRegistry.SWAMP_CYPRESS_WINDOW.get(),
                ObjectRegistry.FIR_WINDOW.get(), ObjectRegistry.BAOBAB_DOOR.get(), ObjectRegistry.ASPEN_DOOR.get(), ObjectRegistry.SWAMP_CYPRESS_DOOR.get(),
                ObjectRegistry.ASPEN_TRAPDOOR.get(), ObjectRegistry.SWAMP_CYPRESS_TRAPDOOR.get(), ObjectRegistry.BAOBAB_SAPLING.get(),  ObjectRegistry.ASPEN_SAPLING.get(),
                ObjectRegistry.SWAMP_CYPRESS_SAPLING.get(), ObjectRegistry.FIR_SAPLING.get()

                );

        ColorHandlerRegistry.registerItemColors((stack, tintIndex) -> FoliageColor.get(0.5, 1.0), ObjectRegistry.SWAMP_OAK_LEAVES.get());
        ColorHandlerRegistry.registerBlockColors((state, world, pos, tintIndex) -> { if (world == null || pos == null) {return -1;}return BiomeColors.getAverageFoliageColor(world, pos);},
                ObjectRegistry.SWAMP_OAK_LEAVES.get(), ObjectRegistry.SWAMP_OAK_LEAVES.get()

        );
    }

    public static final ModelLayerLocation MOSSY_SHEEP_FUR = new ModelLayerLocation(new ResourceLocation(BloomingNature.MOD_ID, "mossy_sheep_"), "fur");
    public static final ModelLayerLocation MOSSY_SHEEP_MODEL_LAYER = new ModelLayerLocation(new ResourceLocation(BloomingNature.MOD_ID, "mossy_sheep"), "main");


    public static void preInitClient() {
        registerEntityRenderers();
        registerEntityModelLayer();
        registerBlockRenderer();
    }

    private static void registerBlockRenderer() {
        BlockEntityRendererRegistry.register(BlockEntityRegistry.FLOWER_BOX_ENTITY.get(), FlowerBoxBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(BlockEntityRegistry.FLOWER_POT_BIG_ENTITY.get(), FlowerPotBigBlockEntityRenderer::new);

    }


        public static void registerEntityRenderers() {
        EntityRendererRegistry.register(EntityRegistry.WANDERING_GARDENER, WanderingGardenerRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.RED_WOLF, RedWolfRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.PELICAN, PelicanRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.RACCOON, RaccoonRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.SQUIRREL, SquirrelRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.MUDDY_PIG, MuddyPigRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.MOSSY_SHEEP, MossySheepRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.DEER, DeerRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.OWL, OwlRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.TERMITE, TermiteRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.BOAR, BoarRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.BISON, BisonRenderer::new);
        }

    public static void registerEntityModelLayer() {
        EntityModelLayerRegistry.register(WanderingGardenerModel.LAYER_LOCATION, WanderingGardenerModel::getTexturedModelData);
        EntityModelLayerRegistry.register(RedWolfModel.LAYER_LOCATION, RedWolfModel::getTexturedModelData);
        EntityModelLayerRegistry.register(PelicanModel.LAYER_LOCATION, PelicanModel::getTexturedModelData);
        EntityModelLayerRegistry.register(RaccoonModel.LAYER_LOCATION, RaccoonModel::getTexturedModelData);
        EntityModelLayerRegistry.register(SquirrelModel.LAYER_LOCATION, SquirrelModel::getTexturedModelData);
        EntityModelLayerRegistry.register(MuddyPigModel.LAYER_LOCATION, MuddyPigModel::getTexturedModelData);
        EntityModelLayerRegistry.register(DeerModel.LAYER_LOCATION, DeerModel::getTexturedModelData);
        EntityModelLayerRegistry.register(MOSSY_SHEEP_MODEL_LAYER, SheepModel::createBodyLayer);
        EntityModelLayerRegistry.register(MOSSY_SHEEP_FUR, SheepFurModel::createFurLayer);
        EntityModelLayerRegistry.register(OwlModel.LAYER_LOCATION, OwlModel::getTexturedModelData);
        EntityModelLayerRegistry.register(TermiteModel.LAYER_LOCATION, TermiteModel::getTexturedModelData);
        EntityModelLayerRegistry.register(BoarModel.LAYER_LOCATION, BoarModel::getTexturedModelData);
        EntityModelLayerRegistry.register(BisonModel.LAYER_LOCATION, BisonModel::getTexturedModelData);
    }

}

