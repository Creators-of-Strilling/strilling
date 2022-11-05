
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.adrikikicp.strilling.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.adrikikicp.strilling.item.NatedmItem;
import com.adrikikicp.strilling.StrillingMod;

public class StrillingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StrillingMod.MODID);
	public static final RegistryObject<Item> CAPACITY_TABLE = block(StrillingModBlocks.CAPACITY_TABLE, StrillingModTabs.TAB_STRILLING);
	public static final RegistryObject<Item> NATEDM = REGISTRY.register("natedm", () -> new NatedmItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
