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
        /*
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_ARMOR)
                .forceAddTag(ItemTags.SKULLS)
                .forceAddTag(ItemTags.HEAD_ARMOR)
                .forceAddTag(ItemTags.CHEST_ARMOR)
                .forceAddTag(ItemTags.LEG_ARMOR)
                .forceAddTag(ItemTags.FOOT_ARMOR)
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
                .forceAddTag(ItemTags.SKULLS)
                .forceAddTag(ItemTags.HEAD_ARMOR)
                .forceAddTag(ItemTags.CHEST_ARMOR)
                .forceAddTag(ItemTags.LEG_ARMOR)
                .forceAddTag(ItemTags.FOOT_ARMOR)
                .add(Items.ELYTRA)
                .add(Items.CARVED_PUMPKIN)
                .add(Items.SHIELD)
                .forceAddTag(HEnchModTags.Items.ALL_BOWS)
                .forceAddTag(HEnchModTags.Items.ALL_TOOLS)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_TOOLS)
                .forceAddTag(ItemTags.SWORDS)
                .forceAddTag(ItemTags.AXES)
                .forceAddTag(ItemTags.PICKAXES)
                .forceAddTag(ItemTags.SHOVELS)
                .forceAddTag(ItemTags.HOES)
                .add(Items.TRIDENT)
                .add(Items.FLINT_AND_STEEL)
                .add(Items.SHEARS)
                .add(Items.BRUSH)
                .add(Items.MACE)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.ALL_WEAPONS)
                .forceAddTag(ItemTags.SWORDS)
                .forceAddTag(ItemTags.AXES)
                .forceAddTag(HEnchModTags.Items.ALL_BOWS)
                .add(Items.TRIDENT)
                .add(Items.MACE)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.EQUIPMENT)
                .forceAddTag(ItemTags.ARMOR_ENCHANTABLE)
                .forceAddTag(ItemTags.WEAPON_ENCHANTABLE)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.NO_WEAPONS)
                .forceAddTag(ItemTags.AXES)
                .forceAddTag(ItemTags.PICKAXES)
                .forceAddTag(ItemTags.SHOVELS)
                .forceAddTag(ItemTags.HOES)
                .add(Items.FLINT_AND_STEEL)
                .add(Items.SHEARS)
                .add(Items.BRUSH)
        ;
        getOrCreateTagBuilder(HEnchModTags.Items.WEAPONS)
                .forceAddTag(ItemTags.SWORDS)
                .forceAddTag(ItemTags.AXES)
                .add(Items.TRIDENT)
                .add(Items.MACE)
        ;
         */
    }
}