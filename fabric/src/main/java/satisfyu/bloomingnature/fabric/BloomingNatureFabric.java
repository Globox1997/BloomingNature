package satisfyu.bloomingnature.fabric;

import net.fabricmc.api.ModInitializer;
import satisfyu.bloomingnature.BloomingNature;
import satisfyu.bloomingnature.fabric.entity.EntitySpawnFabric;
import satisfyu.bloomingnature.fabric.world.BloomingNatureBiomeModification;

public class BloomingNatureFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BloomingNature.init();
        BloomingNature.commonInit();
        BloomingNatureBiomeModification.init();
        EntitySpawnFabric.addEntitySpawn();
    }
}
