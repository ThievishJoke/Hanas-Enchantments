package net.hanas_enchantments.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hanas_enchantments.util.HEnchModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_ARMOR)
                .addTag(ItemTags.SKULLS)
                .addTag(ItemTags.HEAD_ARMOR)
                .addTag(ItemTags.CHEST_ARMOR)
                .addTag(ItemTags.LEG_ARMOR)
                .addTag(ItemTags.FOOT_ARMOR)
                .add(Items.ELYTRA)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_AXES)
                .add(Items.WOODEN_AXE)
                .add(Items.STONE_AXE)
                .add(Items.IRON_AXE)
                .add(Items.GOLDEN_AXE)
                .add(Items.DIAMOND_AXE)
                .add(Items.NETHERITE_AXE)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_BOWS)
                .add(Items.BOW)
                .add(Items.CROSSBOW)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_ENCHANTABLE)
                .addTag(ItemTags.SKULLS)
                .addTag(ItemTags.HEAD_ARMOR)
                .addTag(ItemTags.CHEST_ARMOR)
                .addTag(ItemTags.LEG_ARMOR)
                .addTag(ItemTags.FOOT_ARMOR)
                .add(Items.ELYTRA)
                .add(Items.CARVED_PUMPKIN)
                .add(Items.SHIELD)
                .addTag(HEnchModTags.Items.ALL_BOWS)
                .addTag(HEnchModTags.Items.ALL_TOOLS)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_TOOLS)
                .addTag(ItemTags.SWORDS)
                .addTag(ItemTags.AXES)
                .addTag(ItemTags.PICKAXES)
                .addTag(ItemTags.SHOVELS)
                .addTag(ItemTags.HOES)
                .add(Items.TRIDENT)
                .add(Items.FLINT_AND_STEEL)
                .add(Items.SHEARS)
                .add(Items.BRUSH)
                .add(Items.MACE)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_WEAPONS)
                .addTag(ItemTags.SWORDS)
                .addTag(ItemTags.AXES)
                .addTag(HEnchModTags.Items.ALL_BOWS)
                .add(Items.TRIDENT)
                .add(Items.MACE)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.EQUIPMENT)
                .addTag(ItemTags.ARMOR_ENCHANTABLE)
                .addTag(ItemTags.WEAPON_ENCHANTABLE)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.NO_WEAPONS)
                .addTag(ItemTags.AXES)
                .addTag(ItemTags.PICKAXES)
                .addTag(ItemTags.SHOVELS)
                .addTag(ItemTags.HOES)
                .add(Items.FLINT_AND_STEEL)
                .add(Items.SHEARS)
                .add(Items.BRUSH)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.WEAPONS)
                .addTag(ItemTags.SWORDS)
                .addTag(ItemTags.AXES)
                .add(Items.TRIDENT)
                .add(Items.MACE)
        ;
    }
}