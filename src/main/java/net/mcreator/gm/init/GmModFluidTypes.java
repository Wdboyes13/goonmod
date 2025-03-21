
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.gm.fluid.types.GoonsauceFluidType;
import net.mcreator.gm.GmMod;

public class GmModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, GmMod.MODID);
	public static final RegistryObject<FluidType> GOONSAUCE_TYPE = REGISTRY.register("goonsauce", () -> new GoonsauceFluidType());
}
