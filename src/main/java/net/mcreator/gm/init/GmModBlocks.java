
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gm.block.GoonsauceBlock;
import net.mcreator.gm.GmMod;

public class GmModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GmMod.MODID);
	public static final RegistryObject<Block> GOONSAUCE = REGISTRY.register("goonsauce", () -> new GoonsauceBlock());
}
