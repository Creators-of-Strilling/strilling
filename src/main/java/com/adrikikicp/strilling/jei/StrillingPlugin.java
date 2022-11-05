package com.adrikikicp.strilling.jei;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

import com.adrikikicp.strilling.StrillingMod;
import com.adrikikicp.strilling.recipes.CapacityTableRecipe;

@JeiPlugin
public class StrillingPlugin implements IModPlugin {
		    public static RecipeType<CapacityTableRecipe> CAPACITY_TABLE_TYPE =
		            new RecipeType<>(CapacityTableCategory.UID, CapacityTableRecipe.class);

		    @Override
		    public ResourceLocation getPluginUid() {
		        return new ResourceLocation(StrillingMod.MODID, "jei_plugin");
		    }

		    public void registerCategories(IRecipeCategoryRegistration registration) {
		        registration.addRecipeCategories(new
		                CapacityTableCategory(registration.getJeiHelpers().getGuiHelper()));
		    }

		    @Override
		    public void registerRecipes(IRecipeRegistration registration) {
		        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

		        List<CapacityTableRecipe> recipesInfusing = rm.getAllRecipesFor(CapacityTableRecipe.Type.INSTANCE);
		        registration.addRecipes(CAPACITY_TABLE_TYPE, recipesInfusing);
		    }
		}

