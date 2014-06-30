package de.bbm2h12akr.anno2070calculator;

public class Cost {
	
	public int getCredits()
	{
		return credits;
	}
	public int getBuildingmodules() 
	{
		return buildingmodules;
	}
	public int getTools() 
	{
		return tools;
	}
	public int getConcrete() 
	{
		return concrete;
	}
	
	public int credits;
	public int buildingmodules;
	public int tools;
	public int concrete;
	
	public Cost(int credits, int buildingmodules, int tools, int concrete)
	{
		this.credits=credits;
		this.buildingmodules=buildingmodules;
		this.tools=tools;
		this.concrete=concrete;
	}

}
