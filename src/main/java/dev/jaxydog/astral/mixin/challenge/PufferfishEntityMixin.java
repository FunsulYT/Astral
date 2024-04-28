package dev.jaxydog.astral.mixin.challenge;

import dev.jaxydog.astral.utility.ChallengeHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.passive.PufferfishEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(PufferfishEntity.class)
public abstract class PufferfishEntityMixin extends FishEntity {

    public PufferfishEntityMixin(EntityType<? extends FishEntity> entityType, World world) {
        super(entityType, world);
    }

    @Unique
    private float scale(float damage) {
        if (!ChallengeHelper.shouldApplyScaling(this)) return damage;

        final double additive = ChallengeHelper.getAttackAdditive(this.getWorld());

        return damage + (float) ChallengeHelper.getScaledAdditive(this, additive);
    }

    @ModifyArg(
        method = "sting", at = @At(
        value = "INVOKE",
        target = "Lnet/minecraft/entity/mob/MobEntity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"
    )
    )
    private float scaleStringDamage(float damage) {
        return this.scale(damage);
    }

    @ModifyArg(
        method = "onPlayerCollision", at = @At(
        value = "INVOKE",
        target = "Lnet/minecraft/entity/player/PlayerEntity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"
    )
    )
    private float scaleCollisionDamage(float damage) {
        return this.scale(damage);
    }

}
