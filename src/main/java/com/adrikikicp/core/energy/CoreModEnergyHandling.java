package com.adrikikicp.core.energy;

import net.minecraftforge.energy.EnergyStorage;

public abstract class CoreModEnergyHandling extends EnergyStorage {

	public CoreModEnergyHandling(int capacity, int maxTransfer) {
		super(capacity, maxTransfer);
		// TODO Auto-generated constructor stub
	}
	
	public int extractEnergy(int maxExtract, boolean simulate){
		return super.extractEnergy(maxExtract, simulate);
	}
	
	public int receiveEnergy(int maxReceive, boolean simulate){
		return super.receiveEnergy(maxReceive, simulate);
	}
	
	public int setEnergy(int energy) {
		this.energy = energy;
		return energy;
	}

	public abstract void onEnergyChanged();

}
