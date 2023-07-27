package com.gabrielsykes.randombs.item;

import com.gabrielsykes.randombs.RandomBS;
import com.gabrielsykes.randombs.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RANDOMBS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(RandomBS.MOD_ID, "randombs"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.randombs")).icon(() -> new ItemStack(ModBlocks.TEXTURELESS_BLOCK)).entries((displayContext, entries) -> {
        entries.add(ModItems.ONE_PENCE);
        entries.add(ModItems.NETHERITE_STICK);
        entries.add(ModBlocks.TEXTURELESS_BLOCK);
        entries.add(ModBlocks.GAY_BLOCK);
    }).build());
    public static void registerItemGroups() {
        RandomBS.LOGGER.info("Registering Item Groups for " + RandomBS.MOD_ID);
    }
}
