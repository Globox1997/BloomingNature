package satisfyu.bloomingnature.entity.muddy_pig;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import satisfyu.bloomingnature.registry.EntityRegistry;

public class MuddyPigEntity extends Pig {
    public MuddyPigEntity(EntityType<? extends Pig> entityType, Level world) {
        super(entityType, world);
    }

    private static final Ingredient FOOD_ITEMS;

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
        return this.isBaby() ? entityDimensions.height * 0.4F : entityDimensions.height * 0.5F;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CHICKEN_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.CHICKEN_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.CHICKEN_DEATH;
    }

    public static AttributeSupplier.Builder createMobAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0).add(Attributes.MOVEMENT_SPEED, 0.2F);
    }

    @Nullable
    public MuddyPigEntity getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return EntityRegistry.MUDDY_PIG.get().create(serverLevel);
    }

    @Override
    public boolean isFood(@NotNull ItemStack itemStack) {
        return FOOD_ITEMS.test(itemStack);
    }

    static {
        FOOD_ITEMS = Ingredient.of(Items.APPLE, Items.BEETROOT, Items.SWEET_BERRIES, Items.POTATO, Items.COOKED_COD, Items.COOKED_SALMON, Items.CARROT);
    }
}