
package net.mcreator.gs.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.gs.init.GsModFluids;

public class GoonsauceBlock extends LiquidBlock {
	public GoonsauceBlock() {
		super(() -> GsModFluids.GOONSAUCE.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).lightLevel(s -> 2).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
