package com.teamabnormals.autumnity.common.block.grower;

import com.teamabnormals.autumnity.core.registry.AutumnityFeatures.AutumnityConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class MapleTreeGrower extends AbstractTreeGrower {
	@Override
	@Nullable
	protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random randomIn, boolean beehiveIn) {
		return AutumnityConfiguredFeatures.MAPLE_TREE.getHolder().get();
	}
}