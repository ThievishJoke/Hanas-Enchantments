package net.hanas_enchantments;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hanas_enchantments.datagen.ModEnchantmentTagProvider;
import net.hanas_enchantments.datagen.ModEntityTypeTagProvider;
import net.hanas_enchantments.datagen.ModItemTagProvider;
import net.hanas_enchantments.datagen.ModRegistryProvider;
import net.hanas_enchantments.enchantment.ModEnchantments;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class HanasEnchantmentsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModEnchantmentTagProvider::new);
		pack.addProvider(ModEntityTypeTagProvider::new);

		pack.addProvider(ModRegistryProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.ENCHANTMENT, ModEnchantments::bootstrap);
	}
}
