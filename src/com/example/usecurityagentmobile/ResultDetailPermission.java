package com.example.usecurityagentmobile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ResultDetailPermission extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_detail_permission);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result_detail_permission, menu);
		return true;
	}

}
