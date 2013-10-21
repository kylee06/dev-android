package com.example.usecurityagentmobile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ML1LogviewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ml1_logview);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ml1_logview, menu);
		return true;
	}

}
