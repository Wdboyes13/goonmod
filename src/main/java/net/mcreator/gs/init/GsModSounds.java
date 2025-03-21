
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.gs.GsMod;

public class GsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GsMod.MODID);
	public static final RegistryObject<SoundEvent> THC = REGISTRY.register("thc", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gs", "thc")));
	public static final RegistryObject<SoundEvent> EXEPRO = REGISTRY.register("exepro", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gs", "exepro")));
	public static final RegistryObject<SoundEvent> MILLIONPP = REGISTRY.register("millionpp", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gs", "millionpp")));
}
