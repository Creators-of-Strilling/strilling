
package com.adrikikicp.strilling.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;
import java.util.Optional;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.adrikikicp.core.util.MouseUtil;
import com.adrikikicp.core.util.renderer.EnergyInfoArea;
import com.adrikikicp.strilling.block.entity.CapacityTableBlockEntity;
import com.adrikikicp.strilling.world.inventory.CapacityGUIMenu;

public class CapacityGUIScreen extends AbstractContainerScreen<CapacityGUIMenu> {
	private final static HashMap<String, Object> guistate = CapacityGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

private EnergyInfoArea energyInfoArea;
	public CapacityGUIScreen(CapacityGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.player;
		this.imageWidth = 176;
		this.imageHeight = 166;

	}

	private static final ResourceLocation texture = new ResourceLocation("strilling:textures/screens/capacity_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Capacity Table", 20, 8, -12829636);
    int x = (width - imageWidth) / 2;
    int y = (height - imageHeight) / 2;

    renderEnergyAreaTooltips(poseStack, mouseX, mouseY, x, y);
	
	}
    

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 71, this.topPos + 37, 46, 20, Component.literal("LOAD"), e -> {
		}));
		 assignEnergyInfoArea();
		 
	}
	
	private void assignEnergyInfoArea() {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        energyInfoArea = new EnergyInfoArea(x + 156, y + 13, menu.blockEntity.getEnergyStorage());
    }
	
	 
	  
	    

	    private void renderEnergyAreaTooltips(PoseStack pPoseStack, int pMouseX, int pMouseY, int x, int y) {
	        if(isMouseAboveArea(pMouseX, pMouseY, x, y, 156, 13, 8, 64)) {
	            renderTooltip(pPoseStack, energyInfoArea.getTooltips(),
	                    Optional.empty(), pMouseX - x, pMouseY - y);
	        }
	        
	    }
	    

	    private boolean isMouseAboveArea(int pMouseX, int pMouseY, int x, int y, int offsetX, int offsetY, int width, int height) {
	        return MouseUtil.isMouseOver(pMouseX, pMouseY, x + offsetX, y + offsetY, width, height);
	    }













































}
