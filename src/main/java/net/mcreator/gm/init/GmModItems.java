
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gm.item.ThreeseeItem;
import net.mcreator.gm.item.MillppItem;
import net.mcreator.gm.item.MillcadItem;
import net.mcreator.gm.item.GoonsauceItem;
import net.mcreator.gm.item.ExecprogItem;
import net.mcreator.gm.item.BallsItem;
import net.mcreator.gm.GmMod;

public class GmModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GmMod.MODID);
	public static final RegistryObject<Item> GOONSAUCE_BUCKET = REGISTRY.register("goonsauce_bucket", () -> new GoonsauceItem());
	public static final RegistryObject<Item> THREESEE = REGISTRY.register("threesee", () -> new ThreeseeItem());
	public static final RegistryObject<Item> EXECPROG = REGISTRY.register("execprog", () -> new ExecprogItem());
	public static final RegistryObject<Item> MILLPP = REGISTRY.register("millpp", () -> new MillppItem());
	public static final RegistryObject<Item> MILLCAD = REGISTRY.register("millcad", () -> new MillcadItem());
	public static final RegistryObject<Item> BALLS = REGISTRY.register("balls", () -> new BallsItem());
	public static final RegistryObject<Item> DICK = block(GmModBlocks.DICK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
