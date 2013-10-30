package com.example.usecurityagentmobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class ResultDetailPermission extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_detail_permission);
		
		Intent intent = getIntent();
		int pos = intent.getIntExtra("LIST_ID",1000);
		Log.d("getExtra",""+pos);
		
		
    	Toast.makeText(this.getBaseContext(), ""+pos,Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result_detail_permission, menu);
		return true;
	}

}
