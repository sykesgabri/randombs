package com.gabrielsykes.randombs.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ONE_PENCE = new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 1f).build();
}
