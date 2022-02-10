package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.items.*;
import com.kwpugh.veggie_way.lists.FoodList;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VeggieWay.modid);

	public static final RegistryObject<Item> KNIFE = ITEMS.register("knife", () -> new ItemKnife(new Item.Properties().durability(128).setNoRepair().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> HAND_RAKE = ITEMS.register("hand_rake", () -> new ItemHandRake(Tiers.IRON, -2, -3, new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> HAND_SCRAPER = ITEMS.register("hand_scraper", () -> new ItemHandScraper(new Item.Properties().stacksTo(1).durability(192).setNoRepair().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> BAMBOO_SHEET = ITEMS.register("bamboo_sheet", () -> new Item(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> LARGE_BAMBOO_SHEET = ITEMS.register("large_bamboo_sheet", () -> new Item(new Item.Properties().tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> FRESH_TOFU = ITEMS.register("fresh_tofu", () -> new Item(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> COOKED_TOFU = ITEMS.register("cooked_tofu", () -> new Item(new Item.Properties().tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> SOY_MILK_BUCKET = ITEMS.register("soy_milk_bucket", () -> new Item(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SOY_MILK_COOKED_BUCKET = ITEMS.register("soy_milk_cooked_bucket", () -> new ItemSoyMilkBucket(new Item.Properties().stacksTo(1).durability(16).setNoRepair().tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () -> new Item(new Item.Properties().food(FoodList.fried_egg).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(new Item.Properties().food(FoodList.cooked_carrot).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> COOKED_BEETROOT = ITEMS.register("cooked_beetroot", () -> new Item(new Item.Properties().food(FoodList.cooked_beetroot).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> MILL = ITEMS.register("mill", () -> new ItemMill(new Item.Properties().stacksTo(1).durability(512).setNoRepair().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new ItemFlour(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> new ItemDough(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", () -> new Item(new Item.Properties().food(FoodList.chocolate_bar).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> PUMPKIN_CHUNK = ITEMS.register("pumpkin_chunk", () -> new ItemPumpkinChunk(new Item.Properties().food(FoodList.pumpkin_chunk).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> CACTUS_CHUNK = ITEMS.register("cactus_chunk", () -> new ItemCactusChunk(new Item.Properties().food(FoodList.cactus_chunk).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> MELON_CHUNK = ITEMS.register("melon_chunk", () -> new ItemMelonChunk(new Item.Properties().food(FoodList.melon_chunk).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", () -> new BowlFoodItem(new Item.Properties().stacksTo(1).food(FoodList.pumpkin_soup).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> CACTUS_SOUP = ITEMS.register("cactus_soup", () -> new BowlFoodItem(new Item.Properties().stacksTo(1).food(FoodList.cactus_soup).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> MELON_SOUP = ITEMS.register("melon_soup", () -> new BowlFoodItem(new Item.Properties().stacksTo(1).food(FoodList.melon_soup).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new BowlFoodItem(new Item.Properties().stacksTo(1).food(FoodList.melon_soup).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(new Item.Properties().food(FoodList.apple_pie).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SWEET_BERRY_PIE = ITEMS.register("sweet_berry_pie", () -> new Item(new Item.Properties().food(FoodList.sweet_berry_pie).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> MELON_PIE = ITEMS.register("melon_pie", () -> new Item(new Item.Properties().food(FoodList.melon_pie).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> SUPER_PETALS = ITEMS.register("super_petals", () -> new ItemSuperPetals(new Item.Properties().food(FoodList.super_petals).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> QUINOA_SEEDS = ITEMS.register("quinoa_seeds", () -> new ItemSeedQuinoa(BlockInit.PLANT_QUINOA.get(), (new Item.Properties().tab(VeggieWay.veggie_way))));
	public static final RegistryObject<Item> QUINOA = ITEMS.register("quinoa", () -> new ItemCropQuinoa(new Item.Properties().food(FoodList.quinoa).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> SOYBEAN_SEEDS = ITEMS.register("soybean_seeds", () -> new ItemSeedSoybean(BlockInit.PLANT_SOYBEAN.get(), (new Item.Properties().tab(VeggieWay.veggie_way))));
	public static final RegistryObject<Item> SOYBEAN = ITEMS.register("soybean", () -> new ItemCropSoybean(new Item.Properties().food(FoodList.soybean).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> LENTIL_SEEDS = ITEMS.register("lentil_seeds", () -> new ItemSeedLentil(BlockInit.PLANT_LENTIL.get(), (new Item.Properties().tab(VeggieWay.veggie_way))));
	public static final RegistryObject<Item> LENTIL = ITEMS.register("lentil", () -> new ItemCropLentil(new Item.Properties().food(FoodList.lentil).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds", () -> new ItemSeedCorn(BlockInit.PLANT_CORN.get(), (new Item.Properties().tab(VeggieWay.veggie_way))));
	public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> new ItemCropCorn(new Item.Properties().food(FoodList.corn).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> COTTON_SEEDS = ITEMS.register("cotton_seeds", () -> new ItemSeedCotton(BlockInit.PLANT_COTTON.get(), (new Item.Properties().tab(VeggieWay.veggie_way))));
	public static final RegistryObject<Item> COTTON = ITEMS.register("cotton", () -> new ItemCropCotton(new Item.Properties().tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> DRYING_AGENT = ITEMS.register("drying_agent", () -> new ItemDryingAgent(new Item.Properties().tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> CARBS = ITEMS.register("carbs", () -> new ItemCarbs(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> FRUCTOSE = ITEMS.register("fructose", () -> new ItemFructose(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> PROTEINS = ITEMS.register("proteins", () -> new ItemProteins(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> VITAMINS = ITEMS.register("vitamins", () -> new ItemVitamins(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> CAFFEINE = ITEMS.register("caffeine", () -> new ItemCaffeine(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> WHEATGERM = ITEMS.register("wheatgerm", () -> new ItemWheatgerm(new Item.Properties().tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> ENERGY_POWDER = ITEMS.register("energy_powder", () -> new ItemEnergyPowder(new Item.Properties().tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SUPERFOOD_POWDER = ITEMS.register("superfood_powder", () -> new ItemSuperfoodPowder(new Item.Properties().tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> ENERGY_DRINK = ITEMS.register("energy_drink", () -> new DrinkBase(new Item.Properties().food(FoodList.energy_drink).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SUPERFOOD_SHAKE = ITEMS.register("superfood_shake", () -> new DrinkBase(new Item.Properties().food(FoodList.superfood_shake).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SUPERFOOD_SMOOTHIE = ITEMS.register("superfood_smoothie", () -> new DrinkBase(new Item.Properties().food(FoodList.superfood_smoothie).tab(VeggieWay.veggie_way)));

	public static final RegistryObject<Item> ENERGY_BAR = ITEMS.register("energy_bar", () -> new Item(new Item.Properties().food(FoodList.energy_bar).tab(VeggieWay.veggie_way)));
	public static final RegistryObject<Item> SUPERFOOD_BAR = ITEMS.register("superfood_bar", () -> new Item(new Item.Properties().food(FoodList.superfood_bar).tab(VeggieWay.veggie_way)));
}
