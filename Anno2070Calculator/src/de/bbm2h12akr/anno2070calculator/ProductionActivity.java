package de.bbm2h12akr.anno2070calculator;

import com.example.anno2070calculator.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ProductionActivity extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent intent = getIntent();
		int[] message = intent.getIntArrayExtra(InhabitantActivity.EXTRA_MESSAGE);
		setContentView(R.layout.activity_production);
		parserClass parse = new parserClass(getApplicationContext());
	}

    public void inhabitants(View view) {
    	Intent intent = new Intent(this, InhabitantActivity.class);
    	startActivity(intent);
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.production, menu);
		return true;
	}

}
