
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.gm.GmMod;

public class GmModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, GmMod.MODID);
	public static final RegistryObject<PaintingVariant> GTFLAG = REGISTRY.register("gtflag", () -> new PaintingVariant(80, 48));
}
