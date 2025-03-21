
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.gm.fluid.GoonsauceFluid;
import net.mcreator.gm.GmMod;

public class GmModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, GmMod.MODID);
	public static final RegistryObject<FlowingFluid> GOONSAUCE = REGISTRY.register("goonsauce", () -> new GoonsauceFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_GOONSAUCE = REGISTRY.register("flowing_goonsauce", () -> new GoonsauceFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(GOONSAUCE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GOONSAUCE.get(), RenderType.translucent());
		}
	}
}
