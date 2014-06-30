package de.bbm2h12akr.anno2070calculator;

public class MaintenanceCost 
{
	public int activeCost;
	
	public int getActiveCost() 
	{
		return activeCost;
	}
	public int getInactiveCost() 
	{
		return inactiveCost;
	}
	public int getActiveEcoEffect()
	{
		return activeEcoEffect;
	}
	public int getInactiveEcoEffect() {
		return inactiveEcoEffect;
	}
	public int getActiveEnergyCost() {
		return activeEnergyCost;
	}
	public int getInactiveEnergyCost() {
		return inactiveEnergyCost;
	}
	public int inactiveCost;
	public int activeEcoEffect;
	public int inactiveEcoEffect;
	public int activeEnergyCost;
	public int inactiveEnergyCost;
	
	public MaintenanceCost(int inactiveCost, int activeEcoEffect, int inactiveEcoEffect, int activeEnergyCost, int inactiveEnergyCost)
	{
		this.inactiveCost = inactiveCost;
		this.activeEcoEffect = activeEcoEffect;
		this.inactiveEcoEffect = inactiveEcoEffect;
		this.activeEnergyCost = activeEnergyCost;
		this.inactiveCost = inactiveCost;
		
	}

}
