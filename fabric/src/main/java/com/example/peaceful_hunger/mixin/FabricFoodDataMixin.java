package com.example.peaceful_hunger.mixin;

import net.minecraft.world.Difficulty;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FoodData.class)
public abstract class FabricFoodDataMixin {

//    @Inject(at = @At("HEAD"), method = "tick")
//    private void injected(Player player, CallbackInfo ci) {
//
//    }
//
//    @Inject(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;getDifficulty()Lnet/minecraft/world/Difficulty;", shift = At.Shift.AFTER))
//    private static void injected(Player player, CallbackInfo ci, @Local LocalRef<Difficulty> localRef) {
//
//    }

    /* Sets local variable in FoodData to always HARD */
    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;getDifficulty()Lnet/minecraft/world/Difficulty;"))
    private Difficulty injected(Level instance) {
        return Difficulty.HARD;
    }



//    @Inject(at = @At("HEAD"), method = "tick")
//    private void injected(Player player, CallbackInfo ci) {
//        ((FoodData)(Object)this).saturationLevel = Math.max(((FoodData)(Object)this).saturationLevel - 1.0F, 0.0F);
////        ((FoodData)(Object)this).foodLevel = Math.max(((FoodData)(Object)this).foodLevel - 1, 0);
//    }
//
//    @Inject(at = @At("HEAD"), method = "tick")
//    private void injectedSecond(Player player, CallbackInfo ci) {
////        ((FoodData)(Object)this).saturationLevel = Math.max(((FoodData)(Object)this).saturationLevel - 1.0F, 0.0F);
//        ((FoodData)(Object)this).foodLevel = Math.max(((FoodData)(Object)this).foodLevel - 1, 0);
//    }





//    @Shadow private int lastFoodLevel;
//
//    @Shadow private int foodLevel;
//
//    @Shadow private float exhaustionLevel;
//
//    @Shadow private float saturationLevel;
//
//    @Shadow private int tickTimer;
//
//    @Shadow public abstract void addExhaustion(float $$0);

//    @Inject(at = @At("HEAD"), method = "tick")
//    private void injected(Player $$0, CallbackInfo ci) {
//        Difficulty $$1 = Difficulty.HARD; // $$0.level().getDifficulty();
//        ((FoodData)(Object) this).lastFoodLevel = ((FoodData)(Object) this).foodLevel;
//        if (((FoodData)(Object) this).exhaustionLevel > 4.0F) {
//            ((FoodData)(Object) this).exhaustionLevel -= 4.0F;
//            if (((FoodData)(Object) this).saturationLevel > 0.0F) {
//                ((FoodData)(Object) this).saturationLevel = Math.max(((FoodData)(Object) this).saturationLevel - 1.0F, 0.0F);
//            }
//        }
//
//        if (((FoodData)(Object) this).saturationLevel > 0.0F && $$0.isHurt() && ((FoodData)(Object) this).foodLevel >= 20) {
//            ++((FoodData)(Object) this).tickTimer;
//            if (((FoodData)(Object) this).tickTimer >= 10) {
//                float $$3 = Math.min(((FoodData)(Object) this).saturationLevel, 6.0F);
//                $$0.heal($$3 / 6.0F);
//                ((FoodData)(Object) this).addExhaustion($$3);
//                ((FoodData)(Object) this).tickTimer = 0;
//            }
//        } else if (((FoodData)(Object) this).foodLevel >= 18 && $$0.isHurt()) {
//            ++((FoodData)(Object) this).tickTimer;
//            if (((FoodData)(Object) this).tickTimer >= 80) {
//                $$0.heal(1.0F);
//                ((FoodData)(Object) this).addExhaustion(6.0F);
//                ((FoodData)(Object) this).tickTimer = 0;
//            }
//        } else if (((FoodData)(Object) this).foodLevel <= 0) {
//            ++((FoodData)(Object) this).tickTimer;
//            if (((FoodData)(Object) this).tickTimer >= 80) {
//                if ($$0.getHealth() > 10.0F || $$1 == Difficulty.HARD || $$0.getHealth() > 1.0F && $$1 == Difficulty.NORMAL) {
//                    $$0.hurt($$0.damageSources().starve(), 1.0F);
//                }
//
//                ((FoodData)(Object) this).tickTimer = 0;
//            }
//        } else {
//            ((FoodData)(Object) this).tickTimer = 0;
//        }
//
//        return;
//        // ci.cancel();
//    }
}
