package de.bbm2h12akr.anno2070calculator;


public class Building
{
	public String name;
	
	public String getName() 
	{
		return name;
	}
	
	public Cost cost;
	public Cost getCost()
	{
		return cost;
	}

	public Production getProduction() 
	{
		return production;
	}

	public MaintenanceCost getMaintenanceCost() 
	{
		return maintenanceCost;
	}

	public Production production;
	public MaintenanceCost maintenanceCost;

	public Building(String name, Cost cost, Production production, MaintenanceCost maintenanceCost)
	{
			this.name=name;
			this.cost=cost;
			this.production=production;
			this.maintenanceCost=maintenanceCost;
			
		
	}
}
