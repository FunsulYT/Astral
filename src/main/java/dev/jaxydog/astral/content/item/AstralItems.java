/*
 * SPDX-License-Identifier: AGPL-3.0-or-later
 *
 * Copyright © 2023–2024 Jaxydog
 * Copyright © 2024 IcePenguin
 * Copyright © 2024 FunsulYT
 *
 * This file is part of Astral.
 *
 * Astral is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * Astral is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with Astral. If not, see <https://www.gnu.org/licenses/>.
 */

package dev.jaxydog.astral.content.item;

import dev.jaxydog.astral.content.block.AstralBlocks;
import dev.jaxydog.astral.content.block.custom.DyedAmethystBlock;
import dev.jaxydog.astral.content.block.custom.DyedAmethystClusterBlock;
import dev.jaxydog.astral.content.block.custom.DyedBuddingAmethystBlock;
import dev.jaxydog.astral.content.effect.AstralStatusEffects;
import dev.jaxydog.astral.content.item.AstralArmorItem.Material;
import dev.jaxydog.astral.content.item.custom.*;
import dev.jaxydog.astral.content.item.group.AstralItemGroups;
import dev.jaxydog.astral.datagen.TagGenerator;
import dev.jaxydog.astral.register.ArmorMap;
import dev.jaxydog.astral.register.ContentRegistrar;
import dev.jaxydog.astral.register.DyeMap;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Rarity;

/**
 * Contains definitions of all modded-in items.
 *
 * @author Jaxydog
 * @since 2.0.0
 */
@SuppressWarnings("unused")
public final class AstralItems extends ContentRegistrar {

    /**
     * The blob of malintent effect item.
     * <p>
     * Randomly provides the holder with the sinister effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem BLOB_OF_MALINTENT = new RandomEffectItem("blob_of_malintent",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        AstralStatusEffects.SINISTER
    );

    /**
     * The bulb of rejection effect item.
     * <p>
     * Randomly provides the holder with the invisibility effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem BULB_OF_REJECTION = new RandomEffectItem("bulb_of_rejection",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.INVISIBILITY
    );

    /**
     * The chocolate milk food item.
     *
     * @since 2.0.0
     */
    public static final ChocolateMilkItem CHOCOLATE_MILK = new ChocolateMilkItem("chocolate_milk",
        new Settings().food(FoodComponents.CHOCOLATE_MILK).maxCount(16)
    );

    /**
     * The clock of regret effect item.
     * <p>
     * Randomly provides the holder with the nausea effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem CLOCK_OF_REGRET = new RandomEffectItem("clock_of_regret",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.NAUSEA
    );

    /**
     * The cloudy armor set.
     *
     * @since 2.0.0
     */
    public static final ArmorMap<DyeableCloudyArmorItem> CLOUDY_ARMOR = new ArmorMap<>("cloudy",
        (id, type) -> new DyeableCloudyArmorItem(id, ArmorMaterials.CLOUDY, type, new Settings())
    );

    /**
     * The cloudy candy food item.
     *
     * @since 2.0.0
     */
    public static final CloudyItem CLOUDY_CANDY = new CloudyItem("cloudy_candy",
        new Settings().food(FoodComponents.CLOUDY_CANDY).rarity(Rarity.UNCOMMON)
    );

    /**
     * The cloudy cotton item.
     *
     * @since 2.0.0
     */
    public static final CloudyItem CLOUDY_COTTON = new CloudyItem("cloudy_cotton",
        new Settings().rarity(Rarity.UNCOMMON)
    );

    /**
     * The cloudy mane item.
     *
     * @since 2.0.0
     */
    public static final CloudyItem CLOUDY_MANE = new CloudyItem("cloudy_mane", new Settings().rarity(Rarity.UNCOMMON));

    /**
     * The cobbled sandstone block item.
     *
     * @since 2.0.0
     */
    public static final AstralBlockItem COBBLED_SANDSTONE_BLOCK = new AstralBlockItem("cobbled_sandstone",
        AstralBlocks.COBBLED_SANDSTONE,
        new Settings()
    );

    /**
     * The cookie of resentment effect item.
     * <p>
     * Randomly provides the holder with the strength effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem COOKIE_OF_RESENTMENT = new RandomEffectItem("cookie_of_resentment",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.STRENGTH
    );

    /**
     * The crown of dread effect item.
     * <p>
     * Randomly provides the holder with the darkness effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem CROWN_OF_DREAD = new RandomEffectItem("crown_of_dread",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.DARKNESS
    );

    /**
     * The cup of grief effect item.
     * <p>
     * Randomly provides the holder with the slowness effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem CUP_OF_GRIEF = new RandomEffectItem("cup_of_grief",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.SLOWNESS
    );

    /**
     * The dragon scale item.
     *
     * @since 2.0.0
     */
    public static final AstralItem DRAGON_SCALE = new AstralItem("dragon_scale",
        new Settings().rarity(Rarity.EPIC),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey
    );

    /**
     * The set of dyed amethyst block items.
     *
     * @since 2.0.0
     */
    public static final DyeMap<AstralBlockItem> DYED_AMETHYST_BLOCKS = new DyeMap<>("amethyst_block",
        (rawId, color) -> new AstralBlockItem(rawId,
            AstralBlocks.DYED_AMETHYST_BLOCKS.getComputed(color),
            new Settings(),
            AstralItemGroups.DYED_AMETHYST::getRegistryKey
        )
    );

    /**
     * The set of dyed amethyst cluster block items.
     *
     * @since 2.0.0
     */
    public static final DyeMap<AstralBlockItem> DYED_AMETHYST_CLUSTERS = new DyeMap<>("amethyst_cluster",
        (rawId, color) -> new AstralBlockItem(rawId,
            AstralBlocks.DYED_AMETHYST_CLUSTERS.getComputed(color),
            new Settings(),
            AstralItemGroups.DYED_AMETHYST::getRegistryKey
        )
    );

    /**
     * The set of dyed budding amethyst block items.
     *
     * @since 2.0.0
     */
    public static final DyeMap<AstralBlockItem> DYED_BUDDING_AMETHYST_BLOCKS = new DyeMap<>("budding_amethyst",
        (rawId, color) -> new AstralBlockItem(rawId,
            AstralBlocks.DYED_BUDDING_AMETHYST_BLOCKS.getComputed(color),
            new Settings(),
            AstralItemGroups.DYED_AMETHYST::getRegistryKey
        )
    );

    /**
     * The set of dyed large amethyst bud block items.
     *
     * @since 2.0.0
     */
    public static final DyeMap<AstralBlockItem> DYED_LARGE_AMETHYST_BUDS = new DyeMap<>("large_amethyst_bud",
        (rawId, color) -> new AstralBlockItem(rawId,
            AstralBlocks.DYED_LARGE_AMETHYST_BUDS.getComputed(color),
            new Settings(),
            AstralItemGroups.DYED_AMETHYST::getRegistryKey
        )
    );

    /**
     * The set of dyed medium amethyst bud block items.
     *
     * @since 2.0.0
     */
    public static final DyeMap<AstralBlockItem> DYED_MEDIUM_AMETHYST_BUDS = new DyeMap<>("medium_amethyst_bud",
        (rawId, color) -> new AstralBlockItem(rawId,
            AstralBlocks.DYED_MEDIUM_AMETHYST_BUDS.getComputed(color),
            new Settings(),
            AstralItemGroups.DYED_AMETHYST::getRegistryKey
        )
    );

    /**
     * The set of dyed small amethyst bud block items.
     *
     * @since 2.0.0
     */
    public static final DyeMap<AstralBlockItem> DYED_SMALL_AMETHYST_BUDS = new DyeMap<>("small_amethyst_bud",
        (rawId, color) -> new AstralBlockItem(rawId,
            AstralBlocks.DYED_SMALL_AMETHYST_BUDS.getComputed(color),
            new Settings(),
            AstralItemGroups.DYED_AMETHYST::getRegistryKey
        )
    );

    /**
     * The egg of greed effect item.
     * <p>
     * Randomly provides the holder with the hero of the village effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem EGG_OF_GREED = new RandomEffectItem("egg_of_greed",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.HERO_OF_THE_VILLAGE
    );

    /**
     * The eye of surprise effect item.
     * <p>
     * Randomly provides the holder with the levitation effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem EYE_OF_SURPRISE = new RandomEffectItem("eye_of_surprise",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.LEVITATION
    );

    /**
     * The flower of suffering effect item.
     * <p>
     * Randomly provides the holder with the wither effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem FLOWER_OF_SUFFERING = new RandomEffectItem("flower_of_suffering",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.WITHER
    );

    /**
     * The living sculk item.
     *
     * @since 2.0.0
     */
    public static final AstralItem LIVING_SCULK = new AstralItem("living_sculk",
        new Settings().rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey
    );

    /**
     * The Fluxling's mirror item.
     *
     * @since 2.0.0
     */
    public static final MirrorItem MIRROR = new MirrorItem("mirror", new Settings().maxCount(1).rarity(Rarity.RARE));

    /**
     * The photo of hope effect item.
     * <p>
     * Randomly provides the holder with the luck effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem PHOTO_OF_HOPE = new RandomEffectItem("photo_of_hope",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.LUCK
    );

    /**
     * The pig card item.
     *
     * @since 2.0.0
     */
    public static final AstralItem PIG_CARD = new AstralItem("pig_card",
        new Settings(),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey
    );

    /**
     * The placeholder item.
     *
     * @since 2.0.0
     */
    public static final PlaceholderItem PLACEHOLDER = new PlaceholderItem("placeholder",
        new Settings().fireproof().maxCount(1).rarity(Rarity.UNCOMMON)
    );

    /**
     * The randomizer block item.
     *
     * @since 2.0.0
     */
    public static final AstralBlockItem RANDOMIZER_BLOCK = new AstralBlockItem("randomizer",
        AstralBlocks.RANDOMIZER,
        new Settings().rarity(Rarity.UNCOMMON)
    );

    /**
     * The rotten chorus fruit food item.
     *
     * @since 2.0.0
     */
    public static final AstralItem ROTTEN_CHORUS_FRUIT = new AstralItem("rotten_chorus_fruit",
        new Settings().food(FoodComponents.ROTTEN_CHORUS_FRUIT),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey
    );

    /**
     * The skull of joy effect item.
     * <p>
     * Randomly provides the holder with the regeneration effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem SKULL_OF_JOY = new RandomEffectItem("skull_of_joy",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.REGENERATION
    );

    /**
     * The slime card item.
     *
     * @since 2.0.0
     */
    public static final AstralItem SLIME_CARD = new AstralItem("slime_card",
        new Settings(),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey
    );

    /**
     * The spray bottle item.
     *
     * @since 2.0.0
     */
    public static final SprayBottleItem SPRAY_BOTTLE = new SprayBottleItem("spray_bottle",
        new Settings().maxDamage(SprayBottleItem.MAX_USES)
    );

    /**
     * The spray potion item.
     *
     * @since 2.0.0
     */
    public static final SprayPotionItem SPRAY_POTION = new SprayPotionItem("spray_potion",
        new Settings().maxDamage(SprayPotionItem.MAX_USES)
    );

    /**
     * The strawberry milk food item.
     *
     * @since 2.0.0
     */
    public static final BottleItem STRAWBERRY_MILK = new BottleItem("strawberry_milk",
        new Settings().food(FoodComponents.STRAWBERRY_MILK).maxCount(16)
    );

    /**
     * The target of panic effect item.
     * <p>
     * Randomly provides the holder with the speed effect.
     *
     * @since 2.0.0
     */
    public static final RandomEffectItem TARGET_OF_PANIC = new RandomEffectItem("target_of_panic",
        new Settings().maxCount(1).rarity(Rarity.RARE),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey,
        0.0005F,
        StatusEffects.SPEED
    );

    /**
     * The void essence item.
     *
     * @since 2.0.0
     */
    public static final AstralItem VOID_ESSENCE = new AstralItem("void_essence",
        new Settings().rarity(Rarity.EPIC),
        AstralItemGroups.STARMONEY_PLAZA::getRegistryKey
    );

    @Override
    public void generate() {
        super.generate();

        final TagGenerator tag = TagGenerator.getInstance();

        tag.generate(DyedAmethystBlock.AMETHYST_BLOCK_ITEMS, b -> b.add(Items.AMETHYST_BLOCK));
        tag.generate(DyedBuddingAmethystBlock.BUDDING_AMETHYST_ITEMS, b -> b.add(Items.BUDDING_AMETHYST));
        tag.generate(DyedAmethystClusterBlock.AMETHYST_CLUSTER_ITEMS, b -> b.add(Items.AMETHYST_CLUSTER));
        tag.generate(DyedAmethystClusterBlock.LARGE_AMETHYST_BUD_ITEMS, b -> b.add(Items.LARGE_AMETHYST_BUD));
        tag.generate(DyedAmethystClusterBlock.MEDIUM_AMETHYST_BUD_ITEMS, b -> b.add(Items.MEDIUM_AMETHYST_BUD));
        tag.generate(DyedAmethystClusterBlock.SMALL_AMETHYST_BUD_ITEMS, b -> b.add(Items.SMALL_AMETHYST_BUD));
    }

    /**
     * Contains shared food components for custom items.
     *
     * @author Jaxydog
     * @since 2.0.0
     */
    private static final class FoodComponents {

        /**
         * The chocolate milk food component.
         *
         * @since 2.0.0
         */
        public static final FoodComponent CHOCOLATE_MILK = new FoodComponent.Builder().alwaysEdible()
            .hunger(6)
            .saturationModifier(0.25F)
            .build();

        /**
         * The cloudy candy food component.
         *
         * @since 2.0.0
         */
        public static final FoodComponent CLOUDY_CANDY = new FoodComponent.Builder().alwaysEdible()
            .hunger(2)
            .saturationModifier(0.45F)
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 0, false, true, true), 0.25F)
            .build();

        /**
         * The rotten chorus fruit food component.
         *
         * @since 2.0.0
         */
        public static final FoodComponent ROTTEN_CHORUS_FRUIT = new FoodComponent.Builder().alwaysEdible()
            .hunger(1)
            .saturationModifier(0.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 400, 0), 1F)
            .build();

        /**
         * The strawberry milk food component.
         *
         * @since 2.0.0
         */
        public static final FoodComponent STRAWBERRY_MILK = new FoodComponent.Builder().alwaysEdible()
            .hunger(7)
            .saturationModifier(0.25F)
            .build();

        private FoodComponents() { }

    }

    /**
     * Contains shared armor materials for custom items.
     *
     * @author Jaxydog
     * @since 2.0.0
     */
    private static final class ArmorMaterials {

        /**
         * The material used by cloudy armor.
         *
         * @since 2.0.0
         */
        public static final Material CLOUDY = Material.builder("cloudy")
            .setDurability(52, 64, 60, 44)
            .setEnchantability(15)
            .setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER)
            .setProtection(2, 5, 3, 2)
            .setRepairIngredient(Ingredient.ofItems(CLOUDY_COTTON))
            .build();

        private ArmorMaterials() { }

    }

}
