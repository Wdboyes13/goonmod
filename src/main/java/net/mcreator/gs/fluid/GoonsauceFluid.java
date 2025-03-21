
package net.mcreator.gs.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.gs.init.GsModItems;
import net.mcreator.gs.init.GsModFluids;
import net.mcreator.gs.init.GsModFluidTypes;
import net.mcreator.gs.init.GsModBlocks;

public abstract class GoonsauceFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GsModFluidTypes.GOONSAUCE_TYPE.get(), () -> GsModFluids.GOONSAUCE.get(), () -> GsModFluids.FLOWING_GOONSAUCE.get()).explosionResistance(100f)
			.slopeFindDistance(5).bucket(() -> GsModItems.GOONSAUCE_BUCKET.get()).block(() -> (LiquidBlock) GsModBlocks.GOONSAUCE.get());

	private GoonsauceFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_HONEY;
	}

	public static class Source extends GoonsauceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GoonsauceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
