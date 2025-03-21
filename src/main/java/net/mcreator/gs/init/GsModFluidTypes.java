
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.gs.fluid.types.GoonsauceFluidType;
import net.mcreator.gs.GsMod;

public class GsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, GsMod.MODID);
	public static final RegistryObject<FluidType> GOONSAUCE_TYPE = REGISTRY.register("goonsauce", () -> new GoonsauceFluidType());
}
