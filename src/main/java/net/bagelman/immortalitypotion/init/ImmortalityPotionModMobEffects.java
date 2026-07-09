/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bagelman.immortalitypotion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.bagelman.immortalitypotion.potion.ImmortalityMobEffect;
import net.bagelman.immortalitypotion.ImmortalityPotionMod;

public class ImmortalityPotionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ImmortalityPotionMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> IMMORTALITY = REGISTRY.register("immortality", () -> new ImmortalityMobEffect());
}