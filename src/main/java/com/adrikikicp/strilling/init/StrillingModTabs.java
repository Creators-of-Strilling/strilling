
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.adrikikicp.strilling.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class StrillingModTabs {
	public static CreativeModeTab TAB_STRILLING;

	public static void load() {
		TAB_STRILLING = new CreativeModeTab("tabstrilling") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(StrillingModBlocks.CAPACITY_TABLE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
