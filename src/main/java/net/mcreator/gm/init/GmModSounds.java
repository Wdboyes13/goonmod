
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.gm.GmMod;

public class GmModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GmMod.MODID);
	public static final RegistryObject<SoundEvent> THC = REGISTRY.register("thc", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gm", "thc")));
	public static final RegistryObject<SoundEvent> EXEPRO = REGISTRY.register("exepro", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gm", "exepro")));
	public static final RegistryObject<SoundEvent> MILLIONPP = REGISTRY.register("millionpp", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gm", "millionpp")));
}
