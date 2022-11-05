
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.adrikikicp.strilling.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.adrikikicp.strilling.world.inventory.CapacityGUIMenu;
import com.adrikikicp.strilling.StrillingMod;

public class StrillingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StrillingMod.MODID);
	public static final RegistryObject<MenuType<CapacityGUIMenu>> CAPACITY_GUI = REGISTRY.register("capacity_gui",
			() -> IForgeMenuType.create(CapacityGUIMenu::new));
}
