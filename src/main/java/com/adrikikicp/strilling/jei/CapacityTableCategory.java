package com.adrikikicp.strilling.jei;

import com.adrikikicp.strilling.StrillingMod;
import com.adrikikicp.strilling.init.StrillingModBlocks;
import com.adrikikicp.strilling.recipes.CapacityTableRecipe;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class CapacityTableCategory implements IRecipeCategory<CapacityTableRecipe> {

	  public final static ResourceLocation UID = new ResourceLocation(StrillingMod.MODID, "capaciting");
	    public final static ResourceLocation TEXTURE =
	            new ResourceLocation(StrillingMod.MODID, "textures/screens/capacity_gui.png");

	    private final IDrawable background;
	    private final IDrawable icon;

	    public CapacityTableCategory(IGuiHelper helper) {
	        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
	        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(StrillingModBlocks.CAPACITY_TABLE.get()));
	    }

	    @Override
	    public RecipeType<CapacityTableRecipe> getRecipeType() {
	        return StrillingPlugin.CAPACITY_TABLE_TYPE;
	    }

	    @Override
	    public Component getTitle() {
	        return Component.literal("Capaciting");
	    }

	    @Override
	    public IDrawable getBackground() {
	        return this.background;
	    }

	    @Override
	    public IDrawable getIcon() {
	        return this.icon;
	    }

	    @Override
	    public void setRecipe(IRecipeLayoutBuilder builder, CapacityTableRecipe recipe, IFocusGroup focuses) {
	        builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(recipe.getIngredients().get(0));

	        builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 60).addItemStack(recipe.getResultItem());
	    }

}
