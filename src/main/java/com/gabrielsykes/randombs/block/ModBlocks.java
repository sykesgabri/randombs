package com.gabrielsykes.randombs.block;

import com.gabrielsykes.randombs.RandomBS;
import com.gabrielsykes.randombs.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TEXTURELESS_BLOCK = registerBlock("textureless_block", new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.STONE)));
    public static final Block GAY_BLOCK = registerBlock("gay_block", new Block(FabricBlockSettings.copyOf(Blocks.SHROOMLIGHT).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static void addItemsToColoredBlockItemGroup(FabricItemGroupEntries entries) {
        entries.add(TEXTURELESS_BLOCK);
        entries.add(GAY_BLOCK);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RandomBS.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RandomBS.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        RandomBS.LOGGER.info("Registering ModBlocks for " + RandomBS.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addItemsToColoredBlockItemGroup);
    }
}
