package de.bbm2h12akr.anno2070calculator;

import com.example.anno2070calculator.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class InhabitantActivity extends Activity {
	public final static String EXTRA_MESSAGE = "de.bbm2h12akr.anno2070calculator.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inhabitant);
	}

    public void production(View view) {
    	Intent intent = new Intent(this, ProductionActivity.class);
    	EditText eco1 = (EditText) findViewById(R.id.eco1);
    	EditText eco2 = (EditText) findViewById(R.id.eco2);
    	EditText eco3 = (EditText) findViewById(R.id.eco3);
    	EditText eco4 = (EditText) findViewById(R.id.eco4);
    	int[] message = new int[4];
    	try{
    		message[0] = Integer.parseInt(eco1.getText().toString());
    		message[1] = Integer.parseInt(eco2.getText().toString());
    		message[2] = Integer.parseInt(eco3.getText().toString());
    		message[3] = Integer.parseInt(eco4.getText().toString());
    	}
    	catch(NumberFormatException ex){
    		message[0] = 0;
    		message[1] = 0;
    		message[2] = 0;
    		message[3] = 0;
    	}
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inhabitant, menu);
		return true;
	}

}
