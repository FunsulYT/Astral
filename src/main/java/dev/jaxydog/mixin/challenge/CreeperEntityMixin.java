package dev.jaxydog.mixin.challenge;

import dev.jaxydog.utility.MobChallengeUtil;
import net.minecraft.client.render.entity.feature.SkinOverlayOwner;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

/** Implements the mob challenge system for creepers */
@Mixin(CreeperEntity.class)
public abstract class CreeperEntityMixin extends HostileEntity implements SkinOverlayOwner {

	protected CreeperEntityMixin(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
	}

	/** The maximum allowed explosion power. */
	private static final double MAX_POWER = 50.0D;

	/** Modifies the creeper's explosion strength to account for mob challenge scaling */
	@ModifyVariable(method = "explode", at = @At("STORE"), ordinal = 0)
	private float powerVarInject(float power) {
		if (((LivingEntityMixin) (Object) this).ignoreChallengeScaling) {
			return power;
		}
		if (!MobChallengeUtil.isEnabled(this.getWorld())) {
			return power;
		}

		final double additive = MobChallengeUtil.getAttackAdditive(this.getWorld());
		final double scaled = MobChallengeUtil.getScaledAdditive(this, additive);

		return (float) Math.max(power + (scaled / 10.0D), CreeperEntityMixin.MAX_POWER);
	}

}
