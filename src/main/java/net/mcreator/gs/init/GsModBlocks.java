
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gs.block.GoonsauceBlock;
import net.mcreator.gs.GsMod;

public class GsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GsMod.MODID);
	public static final RegistryObject<Block> GOONSAUCE = REGISTRY.register("goonsauce", () -> new GoonsauceBlock());
}
