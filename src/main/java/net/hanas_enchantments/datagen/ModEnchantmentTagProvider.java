package net.hanas_enchantments.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hanas_enchantments.util.HEnchModTags;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnchantmentTagProvider extends FabricTagProvider.EnchantmentTagProvider {
    public ModEnchantmentTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(HEnchModTags.Enchantments.ALL_BOWS_EXCLUSIVE_SET)
                .add(Enchantments.INFINITY)
        ;
        getOrCreateTagBuilder(HEnchModTags.Enchantments.AXE_EXCLUSIVE_SET)

        ;
        getOrCreateTagBuilder(HEnchModTags.Enchantments.LEGGINGS_EXCLUSIVE_SET)
                .add(Enchantments.SWIFT_SNEAK)
        ;
    }
}
