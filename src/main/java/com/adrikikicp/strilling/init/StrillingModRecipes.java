package com.adrikikicp.strilling.init;

import com.adrikikicp.strilling.StrillingMod;
import com.adrikikicp.strilling.recipes.CapacityTableRecipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

public class StrillingModRecipes {
	  public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
	            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, StrillingMod.MODID);

	    public static final RegistryObject<RecipeSerializer<CapacityTableRecipe>> CAPACITING_SERIALIZER =
	            SERIALIZERS.register("capaciting", () -> CapacityTableRecipe.Serializer.INSTANCE);

	    public static void register(IEventBus eventBus) {
	        SERIALIZERS.register(eventBus);
	    }
}
