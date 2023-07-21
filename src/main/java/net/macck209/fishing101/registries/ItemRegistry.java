package net.macck209.fishing101.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.macck209.fishing101.Fishing101Initializer;
import net.macck209.fishing101.items.FishBookItem;
import net.macck209.fishing101.items.MealBookItem;
import net.macck209.fishing101.items.fishes.AutoFishItem;
import net.macck209.fishing101.items.fishes.FishItem;
import net.macck209.fishing101.polymer.PolymerTextures;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ItemRegistry {
    public static final Item FISH_BONES = registerItem("fish_bones", new AutoFishItem(new FabricItemSettings().maxCount(64),
            Items.BONE,"Fish Bones", FishItem.ORDINARY
    ));
    // Raw fish
    public static final Item ORDINARY_CARP = registerItem("ordinary_carp", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build()), Items.TROPICAL_FISH,
            "Carp",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item DEFORMED_CARP = registerItem("deformed_carp", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(-1F)
                .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 30 * 20), 1).build()), Items.TROPICAL_FISH,
            "Deformed Carp",
            FishItem.DEFORMED).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item LUMINOUS_CARP = registerItem("luminous_carp", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 30 * 20), 1).build()), Items.TROPICAL_FISH,
            "Luminous Carp",
            FishItem.LUMINOUS).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item ORDINARY_CATFISH = registerItem("ordinary_catfish", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build()), Items.TROPICAL_FISH,
            "Catfish",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item MUDDY_CATFISH = registerItem("muddy_catfish", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build()), Items.TROPICAL_FISH,
            "Muddy Catfish",
            FishItem.MUDDY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item TROPICAL_CATFISH = registerItem("tropical_catfish", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build()), Items.TROPICAL_FISH,
            "Tropical Catfish",
            FishItem.TROPICAL).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item DIVINE_CATFISH = registerItem("divine_catfish", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().alwaysEdible().hunger(6).saturationModifier(1.5F)
                .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 5 * 20), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5 * 20), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600 * 20,1), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300 * 20,4), 1).build()), Items.TROPICAL_FISH,
            "Divine Catfish",
            FishItem.DIVINE).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item ORDINARY_MACKEREL = registerItem("ordinary_mackerel", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).build()), Items.TROPICAL_FISH,
            "Mackerel",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item LUMINOUS_MACKEREL = registerItem("luminous_mackerel", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2F)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 30 * 20), 1).build()), Items.TROPICAL_FISH,
            "Luminous Mackerel",
            FishItem.LUMINOUS).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item MANGROVE_JACK = registerItem("mangrove_jack", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).build()), Items.TROPICAL_FISH,
            "Mangrove Jack",
            FishItem.MANGROVE).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item ORDINARY_SHRIMP = registerItem("ordinary_shrimp", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).build()), Items.TROPICAL_FISH,
            "Shrimp",
            FishItem.ORDINARY
    ));
    public static final Item LUMINOUS_SHRIMP = registerItem("luminous_shrimp", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 30 * 20), 1).build()), Items.TROPICAL_FISH,
            "Luminous Shrimp",
            FishItem.LUMINOUS
    ));
    public static final Item JELLYFISH = registerItem("jellyfish", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4F)
                .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 8 * 20,1), 0.25F)
                .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 150 * 20), 0.25F)
                .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 150 * 20), 0.25F)
                .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 150 * 20), 0.25F).build()), Items.TROPICAL_FISH,
            "Jellyfish",
            FishItem.JELLYFISH
    ));
    public static final Item END_JELLYFISH = registerItem("end_jellyfish", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 8 * 20,2), 0.25F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 150 * 20), 0.25F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 150 * 20,2), 0.25F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 150 * 20,2), 0.25F).build()), Items.TROPICAL_FISH,
            "End Jellyfish",
            FishItem.END
    ));
    public static final Item DIVINE_JELLYFISH = registerItem("divine_jellyfish", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(1.5F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 5 * 20), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5 * 20), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 300 * 20), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 600 * 20), 1).build()), Items.TROPICAL_FISH,
            "Divine Jellyfish",
            FishItem.DIVINE).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item ANGLERFISH = registerItem("anglerfish", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 8 * 20), 1).build()), Items.TROPICAL_FISH,
            "Anglerfish",
            FishItem.ANGLER).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item RED_KOI = registerItem("red_koi", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build()), Items.TROPICAL_FISH,
            "Red Koi",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item YELLOW_KOI = registerItem("yellow_koi", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build()), Items.TROPICAL_FISH,
            "Yellow Koi",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item THUNDERFIN = registerItem("thunderfin", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).build()), Items.TROPICAL_FISH,
            "Thunderfin",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item STARFISH = registerItem("starfish", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0F).build()), Items.TROPICAL_FISH,
            "Starfish",
            FishItem.ORDINARY
    ));
    public static final Item END_STARFISH = registerItem("end_starfish", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0F).build()), Items.TROPICAL_FISH,
            "End Starfish",
            FishItem.END
    ));
    public static final Item ICE_COD = registerItem("ice_cod", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).build()), Items.TROPICAL_FISH,
            "Ice Cod",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );


    // Smoked fish
    public static final Item SMOKED_ORDINARY_CARP = registerItem("smoked_ordinary_carp", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8F).build()), Items.TROPICAL_FISH,
            "Smoked Carp",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item SMOKED_DEFORMED_CARP = registerItem("smoked_deformed_carp", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2F)
                .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 30 * 20), 1).build()), Items.TROPICAL_FISH,
            "Smoked Deformed Carp",
            FishItem.DEFORMED).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item SMOKED_LUMINOUS_CARP = registerItem("smoked_luminous_carp", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8F)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300 * 20), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300 * 20), 1).build()), Items.TROPICAL_FISH,
            "Smoked Luminous Carp",
            FishItem.LUMINOUS).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item SMOKED_ORDINARY_CATFISH = registerItem("smoked_catfish", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5F).build()), Items.TROPICAL_FISH,
            "Smoked Catfish",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item SMOKED_ORDINARY_MACKEREL = registerItem("smoked_ordinary_mackerel", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7F).build()), Items.TROPICAL_FISH,
            "Smoked Mackerel",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item SMOKED_LUMINOUS_MACKEREL = registerItem("smoked_luminous_mackerel", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7F)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300 * 20), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300 * 20), 1).build()), Items.TROPICAL_FISH,
            "Smoked Luminous Mackerel",
            FishItem.LUMINOUS).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item SMOKED_MANGROVE_JACK = registerItem("smoked_mangrove_jack", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(1F).build()), Items.TROPICAL_FISH,
            "Smoked Mangrove Jack",
            FishItem.MANGROVE).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item SMOKED_ORDINARY_SHRIMP = registerItem("smoked_ordinary_shrimp", new AutoFishItem(
            new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build()), Items.TROPICAL_FISH,
            "Cooked Shrimp",
            FishItem.ORDINARY
    ));
    public static final Item SMOKED_LUMINOUS_SHRIMP = registerItem("smoked_luminous_shrimp", new AutoFishItem(
            new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300 * 20), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300 * 20), 1).build()), Items.TROPICAL_FISH,
            "Cooked Luminous Shrimp",
            FishItem.LUMINOUS
    ));
    public static final Item SMOKED_ANGLERFISH = registerItem("smoked_anglerfish", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(7).saturationModifier(0.6F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 90 * 20), 1).build()), Items.TROPICAL_FISH,
            "Smoked Anglerfish",
            FishItem.ANGLER).returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item CHARGED_THUNDERFIN = registerItem("charged_thunderfin", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).alwaysEdible().build()), Items.TROPICAL_FISH,
            "Charged Thunderfin",
            FishItem.DIVINE).isCharged().returnItem(ItemRegistry.FISH_BONES).build()
    );
    public static final Item SMOKED_KOI = registerItem("smoked_koi", new AutoFishItem.Builder(
            new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().hunger(9).saturationModifier(1F).build()), Items.TROPICAL_FISH,
            "Smoked Koi",
            FishItem.ORDINARY).returnItem(ItemRegistry.FISH_BONES).build()
    );

    // Other items
    public static final Item DOUGH = registerItem("dough", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(0).saturationModifier(0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 10 * 20), 0.3F).build()),
            Items.COOKED_CHICKEN,"Dough", FishItem.ORDINARY
    ));
    public static final Item NOODLES = registerItem("noodles", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5F).build()),
            Items.COOKED_CHICKEN,"Noodles", FishItem.ORDINARY
    ));
    public static final Item CHICKEN_BROTH = registerItem("chicken_broth", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(1F).alwaysEdible().build()),
            Items.COOKED_CHICKEN,"Chicken broth", FishItem.ORDINARY).returnItem(Items.BOWL).build()
    );
    public static final Item SPAGHETTI_FRUTTI_DI_MARE = registerItem("spaghetti_frutti_di_mare", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(10).saturationModifier(1.5F).alwaysEdible().build()),
            Items.COOKED_CHICKEN,"Spaghetti Frutti di Mare", FishItem.ORDINARY).returnItem(Items.BOWL).build()
    );
    public static final Item TENTACLE = registerItem("tentacle", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 10 * 20), 0.2F).build()),
            Items.COOKED_CHICKEN,"Tentacle", FishItem.ORDINARY
    ));
    public static final Item COOKED_TENTACLE = registerItem("cooked_tentacle", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0F).build()),
            Items.COOKED_CHICKEN,"Cooked Tentacle", FishItem.ORDINARY
    ));
    public static final Item STARFISH_SHASHLIK = registerItem("starfish_shashlik", new AutoFishItem
            .Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).alwaysEdible().build()),
            Items.COOKED_CHICKEN,"Starfish Shashlik", FishItem.ORDINARY).returnItem(Items.STICK).build()
    );
    public static final Item END_STARFISH_SHASHLIK = registerItem("end_starfish_shashlik", new AutoFishItem
            .Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 60 * 20), 1).build()),
            Items.COOKED_CHICKEN,"End Starfish Shashlik", FishItem.END).returnItem(Items.STICK).build()
    );
    public static final Item PURPLE_PASTA = registerItem("purple_pasta", new AutoFishItem.Builder(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.2F).alwaysEdible()
                    .build()),
            Items.CHORUS_FRUIT,"Purple Pasta", FishItem.ORDINARY).isChorus().returnItem(Items.BOWL).build()
    );
    public static final Item RICE = registerItem("rice", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0F).build()),
            Items.COOKED_CHICKEN,"Rice", FishItem.ORDINARY
    ));
    public static final Item SUSHI = registerItem("sushi", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(1F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 300 * 20), 1).build()),
            Items.COOKED_CHICKEN,"Sushi", FishItem.ORDINARY
    ));
    public static final Item THICK_GOO = registerItem("thick_goo", new AutoFishItem(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(0).saturationModifier(0F).alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 20), 1).build()),
            Items.DRIED_KELP,"Thick Goo", FishItem.ORDINARY
    ));

    // Books
    public static final Item FISH_BOOK = registerItem("fish_book", new FishBookItem(new Item.Settings().maxCount(1)));
    public static final Item MEAL_BOOK = registerItem("meal_book", new MealBookItem(new Item.Settings().maxCount(1)));


    public static Item registerItem(String path, Item item) {
        Registry.register(Registries.ITEM, new Identifier(Fishing101Initializer.MOD_ID, path), item);
        PolymerTextures.requestModel(new Identifier(Fishing101Initializer.MOD_ID, "item/" + path), item);
        return item;
    }

    public static void register() {
    }
}
