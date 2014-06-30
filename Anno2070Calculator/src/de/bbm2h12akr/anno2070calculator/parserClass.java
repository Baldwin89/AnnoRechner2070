package de.bbm2h12akr.anno2070calculator;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;


public class parserClass 
{
	
	public ArrayList<String> content= new ArrayList<String>();
	HashMap collection = new HashMap();
	
	Cost cost = new Cost(0,0,0,0);
	Production production = new Production("",0);
	MaintenanceCost maintenanceCost = new MaintenanceCost(0, 0, 0, 0, 0);
		
	Building building = new Building("", cost, production, maintenanceCost);
		
	public TextView Anzeige1;

	public InputStream in_s;
	
			
			public parserClass(Context context)
			{
				Log.d("Start parserClass", null, null);
				//Öffnen der XML
				try
				{
					in_s = context.getAssets().open("Buildings.xml");
				}
				catch (IOException e1) 
				{
					e1.printStackTrace();
				} 	
					
				try 
				{
					xmlparser();
				} 
				catch (XmlPullParserException e)
				{
					e.printStackTrace();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}

			}



	public void xmlparser() throws XmlPullParserException, IOException 
	{

		String xmlInfo = "xml_parser";
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);
		XmlPullParser xpp = factory.newPullParser();
		
		xpp.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);

		xpp.setInput(in_s, null);
		int eventType = xpp.getEventType();

		while (eventType != XmlPullParser.END_DOCUMENT) {
			if (eventType == XmlPullParser.START_DOCUMENT)
				Log.d(xmlInfo, "Start document");
			else if (eventType == XmlPullParser.END_DOCUMENT)
				Log.d(xmlInfo, "End document");
			else if (eventType == XmlPullParser.START_TAG)
			{
				Log.d(xmlInfo, "Start tag " + xpp.getName());
				
				//building tempBuilding;

				if (xpp.getName()=="Building")
				{
					//obsolete
				}
				else if(xpp.getName()=="Name")
				{
					building.name=xpp.nextText();
				}
				else if (xpp.getName() == "Cost")
				{
					//
				}
				else if (xpp.getName() == "Credits")
				{
					cost.credits = xpp.next();
				}
				else if (xpp.getName() == "Buildingmodules")
				{
					cost.buildingmodules = xpp.next();
				}
				else if (xpp.getName() == "Tools")
				{
					cost.tools = xpp.next();
				}
				else if (xpp.getName() == "Concrete")
				{
					cost.concrete = xpp.next();
				}
				else if (xpp.getName() == "Production")
				{}
				else if (xpp.getName() == "Product")
					production.product = xpp.nextText();
				else if (xpp.getName() == "ProductionSpeed")
				{
					production.productionSpeed = xpp.next();
				}
				else if (xpp.getName() == "MaintenanceCost")
				{
					//
				}
				else if (xpp.getName()== "ActiveCost")
				{
					maintenanceCost.activeCost = xpp.next();
				}
				else if (xpp.getName()== "InactiveCost")
				{
					maintenanceCost.inactiveCost = xpp.next();
				}
				
				else if (xpp.getName()== "ActiveEcoEffect")
				{
					maintenanceCost.activeEcoEffect = xpp.next();
				}
				
				else if (xpp.getName()== "InactiveEcoEffect")
				{
					maintenanceCost.inactiveEcoEffect = xpp.next();
				}
				
				else if (xpp.getName()== "ActiveEnergyCost")
				{
					maintenanceCost.activeEnergyCost = xpp.next();
				}
				
				else if (xpp.getName()== "InactiveEnergyCost")
				{
					maintenanceCost.inactiveEnergyCost = xpp.next();
				}
				
				
				
				
			}
			else if (eventType == XmlPullParser.END_TAG)
				Log.d(xmlInfo, "End tag " + xpp.getName());
			else if (eventType == XmlPullParser.TEXT) {
				if (xpp.getText().length() == 4) 
				{
					Log.d(xmlInfo, xpp.getText());
					Log.d("test", "test");
	
				}
				else 
				{
					Log.d(xmlInfo, xpp.getText());
					Log.d("test", "test2");
					//serverName = xpp.getText();
				}
			}
		
			eventType = xpp.next();
		}
}







}
