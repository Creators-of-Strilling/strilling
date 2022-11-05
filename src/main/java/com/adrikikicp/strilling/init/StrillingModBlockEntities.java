
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.adrikikicp.strilling.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.adrikikicp.strilling.block.entity.CapacityTableBlockEntity;
import com.adrikikicp.strilling.StrillingMod;

public class StrillingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			StrillingMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CAPACITY_TABLE = register("capacity_table", StrillingModBlocks.CAPACITY_TABLE,
			CapacityTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
