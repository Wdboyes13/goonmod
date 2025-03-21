
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.gs.item.ThreeseeItem;
import net.mcreator.gs.item.MillppItem;
import net.mcreator.gs.item.GoonsauceItem;
import net.mcreator.gs.item.ExecprogItem;
import net.mcreator.gs.GsMod;

public class GsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GsMod.MODID);
	public static final RegistryObject<Item> GOONSAUCE_BUCKET = REGISTRY.register("goonsauce_bucket", () -> new GoonsauceItem());
	public static final RegistryObject<Item> THREESEE = REGISTRY.register("threesee", () -> new ThreeseeItem());
	public static final RegistryObject<Item> EXECPROG = REGISTRY.register("execprog", () -> new ExecprogItem());
	public static final RegistryObject<Item> MILLPP = REGISTRY.register("millpp", () -> new MillppItem());
}
