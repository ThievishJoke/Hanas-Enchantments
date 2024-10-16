package net.hanas_enchantments.util;

import net.hanas_enchantments.HanasEnchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class HEnchModTags {
    public static class Items {

        public static final TagKey<Item> ALL_ARMOR = createTag("all_armor");
        public static final TagKey<Item> ALL_AXES = createTag("all_axes");
        public static final TagKey<Item> ALL_BOWS = createTag("all_bows");
        public static final TagKey<Item> ALL_ENCHANTABLE = createTag("all_enchantable");
        public static final TagKey<Item> ALL_TOOLS = createTag("all_tools");
        public static final TagKey<Item> ALL_WEAPONS = createTag("all_weapons");
        public static final TagKey<Item> EQUIPMENT = createTag("equipment");
        public static final TagKey<Item> NO_WEAPONS = createTag("no_weapons");
        public static final TagKey<Item> WEAPONS = createTag("weapons");

        private static TagKey<Item> createTag(String name) {
            return  TagKey.of(RegistryKeys.ITEM, Identifier.of(HanasEnchantments.MOD_ID, name));
        }
    }
    public static class Enchantments {

        public static final TagKey<Enchantment> ALL_BOWS_EXCLUSIVE_SET = createTag("exclusive_set/all_bows");
        public static final TagKey<Enchantment> AXE_EXCLUSIVE_SET = createTag("exclusive_set/axe");
        public static final TagKey<Enchantment> LEGGINGS_EXCLUSIVE_SET = createTag("exclusive_set/leggings");

        private static TagKey<Enchantment> createTag(String name) {
            return  TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(HanasEnchantments.MOD_ID, name));
        }
    }
    public static class Entities {
        // Hostility Based
        public static final TagKey<EntityType<?>> PASSIVE_MOB_TAG = createTag("passive_mob");
        public static final TagKey<EntityType<?>> NEUTRAL_MOB_TAG = createTag("neutral_mob");
        public static final TagKey<EntityType<?>> HOSTILE_MOB_TAG = createTag("hostile_mob");

        // Dimension
        public static final TagKey<EntityType<?>> OVERWORLD_MOB_TAG = createTag("overworld_mob_tag");
        public static final TagKey<EntityType<?>> NETHER_MOB_TAG = createTag("neutral_mob_tag");
        public static final TagKey<EntityType<?>> END_MOB_TAG = createTag("hostile_mob_tag");

        // Boss
        public static final TagKey<EntityType<?>> BOSS_MOB_TAG = createTag("boss_mob");

        // Mob
        public static final TagKey<EntityType<?>> MOB_TAG = createTag("mob_tag");

        // MobGroup
        public static final TagKey<EntityType<?>> CUBED_MOBS = createTag("cubed_mobs");
        public static final TagKey<EntityType<?>> SENSITIVE_TO_BANE_OF_CUBES = createTag("sensitive_to_bane_of_cubes");

        private static TagKey<EntityType<?>> createTag(String name) {
            return TagKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(HanasEnchantments.MOD_ID, name));
        }
    }
}
