package com.teamabnormals.autumnity.core.registry;

import com.teamabnormals.autumnity.client.particle.FallingMapleLeafParticle;
import com.teamabnormals.autumnity.core.Autumnity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(modid = Autumnity.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class AutumnityParticleTypes {
	public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Autumnity.MOD_ID);

	public static final RegistryObject<SimpleParticleType> FALLING_MAPLE_LEAF = PARTICLE_TYPES.register("falling_maple_leaf", () -> new SimpleParticleType(false));

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void registerParticleTypes(ParticleFactoryRegisterEvent event) {
		ParticleEngine manager = Minecraft.getInstance().particleEngine;
		if (FALLING_MAPLE_LEAF.isPresent()) {
			manager.register(FALLING_MAPLE_LEAF.get(), FallingMapleLeafParticle.Factory::new);
		}
	}
}