
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.gs.GsMod;

public class GsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, GsMod.MODID);
	public static final RegistryObject<PaintingVariant> GTFLAG = REGISTRY.register("gtflag", () -> new PaintingVariant(80, 48));
}
