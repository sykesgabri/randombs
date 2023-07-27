package com.gabrielsykes.randombs.item;

import com.gabrielsykes.randombs.RandomBS;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ONE_PENCE = registerItem("one_pence", new Item(new FabricItemSettings().food(ModFoodComponents.ONE_PENCE)));
    public static final Item NETHERITE_STICK = registerItem("netherite_stick", new Item(new FabricItemSettings()));

    private static void addItemsToFoodAndDrinkTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ONE_PENCE);
    }
    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(NETHERITE_STICK);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RandomBS.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RandomBS.LOGGER.info("Registering Mod Items for " + RandomBS.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
    }
}
