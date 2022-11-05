
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.adrikikicp.strilling.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.adrikikicp.strilling.block.NatedmPortalBlock;
import com.adrikikicp.strilling.block.CapacityTableBlock;
import com.adrikikicp.strilling.StrillingMod;

public class StrillingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StrillingMod.MODID);
	public static final RegistryObject<Block> CAPACITY_TABLE = REGISTRY.register("capacity_table", () -> new CapacityTableBlock());
	public static final RegistryObject<Block> NATEDM_PORTAL = REGISTRY.register("natedm_portal", () -> new NatedmPortalBlock());
}
