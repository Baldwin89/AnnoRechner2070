package de.bbm2h12akr.anno2070calculator;

public class Production {
	
	public String getProduct() 
	{
		return product;
	}
	public int getProductionSpeed()
	{
		return productionSpeed;
	}
	
	public String product;
	public int productionSpeed;
	
	public Production(String product, int productionspeed)
	{
		this.product=product;
		this.productionSpeed=productionspeed;
	}

}
