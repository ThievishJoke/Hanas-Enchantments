package net.hanas_enchantments.enchantment;

import com.ibm.icu.impl.locale.KeyTypeData;
import net.hanas_enchantments.HanasEnchantments;
import net.hanas_enchantments.enchantment.custom.LightningStrikerEnchantmentEffect;
import net.hanas_enchantments.util.HEnchModTags;
import net.minecraft.block.Portal;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.effect.AttributeEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.enchantment.effect.EnchantmentValueEffect;
import net.minecraft.enchantment.effect.value.AddEnchantmentEffect;
import net.minecraft.enchantment.effect.value.SetEnchantmentEffect;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.entity.EntityFlagsPredicate;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.entity.MovementPredicate;
import net.minecraft.predicate.entity.SlotsPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;

import java.lang.reflect.Type;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

public class ModEnchantments {
    public static final RegistryKey<Enchantment> LIGHTNING_STRIKER  =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(HanasEnchantments.MOD_ID, "lightning_striker"));
    //public static final RegistryKey<Enchantment> ARROW_BARRAGE  =
    //        RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(HanasEnchantments.MOD_ID, "arrow_barrage"));
    public static final RegistryKey<Enchantment> SPLIT_SHOT  =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(HanasEnchantments.MOD_ID, "split_shot"));

    public static void bootstrap(Registerable<Enchantment> registerable) {
        var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

        register(registerable, LIGHTNING_STRIKER, Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                        items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                        5,
                        2,
                        Enchantment.leveledCost(5, 8),
                        Enchantment.leveledCost(25, 7),
                        2,
                        AttributeModifierSlot.MAINHAND))
                .exclusiveSet(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE_SET))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                        EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                        new LightningStrikerEnchantmentEffect(1)));
        /*
        register(registerable, ARROW_BARRAGE, Enchantment.builder(Enchantment.definition(
                items.getOrThrow(HEnchModTags.Items.ALL_BOWS),
                2,
                5,
                Enchantment.leveledCost(25, 0),
                Enchantment.leveledCost(25, 0),
                10,
                AttributeModifierSlot.MAINHAND))
                .addEffect(EnchantmentEffectComponentTypes.AMMO_USE,
                        new SetEnchantmentEffect(
                                EnchantmentLevelBasedValue.linear(1.0F, 1.0F)
                        ),
                        MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.ARROW))
                )
                .addEffect(EnchantmentEffectComponentTypes.PROJECTILE_COUNT,
                        new SetEnchantmentEffect(
                                EnchantmentLevelBasedValue.linear(2.0F, 1.0F)
                        )
                )
                .addNonListEffect(EnchantmentEffectComponentTypes.CROSSBOW_CHARGE_TIME,
                        new AddEnchantmentEffect(EnchantmentLevelBasedValue.linear(0.5F, 0.25F))
                )
                .addEffect(EnchantmentEffectComponentTypes.PROJECTILE_SPREAD,
                        new AddEnchantmentEffect(
                                EnchantmentLevelBasedValue.linear(1.0F, 2.0F)
                        )
                        //,
                        //EntityPropertiesLootCondition.builder(
                        //        LootContext.EntityTarget.THIS
                )
        );
         */
        register(registerable, SPLIT_SHOT, Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(HEnchModTags.Items.ALL_BOWS),
                        2,
                        1,
                        Enchantment.leveledCost(25, 0),
                        Enchantment.leveledCost(25, 0),
                        10,
                        AttributeModifierSlot.MAINHAND))
                .addEffect(EnchantmentEffectComponentTypes.AMMO_USE,
                        new SetEnchantmentEffect(
                                EnchantmentLevelBasedValue.constant(2.0F)
                        ),
                        MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.ARROW))
                )
                .addEffect(EnchantmentEffectComponentTypes.PROJECTILE_COUNT,
                        new SetEnchantmentEffect(
                                EnchantmentLevelBasedValue.constant(2.0F)
                        )
                )
                .addNonListEffect(EnchantmentEffectComponentTypes.CROSSBOW_CHARGE_TIME,
                        new AddEnchantmentEffect(EnchantmentLevelBasedValue.constant(0.25F))
                )
                .addEffect(EnchantmentEffectComponentTypes.PROJECTILE_SPREAD,
                        new AddEnchantmentEffect(
                                EnchantmentLevelBasedValue.constant(1.0F)
                        )
                        //,
                        //EntityPropertiesLootCondition.builder(
                        //        LootContext.EntityTarget.THIS
                )
        );
    }

    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.getValue()));
    }
}
