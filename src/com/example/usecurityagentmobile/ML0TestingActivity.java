package com.example.usecurityagentmobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ML0TestingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ml0_testing);
		
		//악성코드 검사
		Button bTestingMalicious = (Button)findViewById(R.id.button_testing_malicious);
		bTestingMalicious.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),ML1TestingMaliciousActivity.class);
				startActivity(intent);
			}
		});
		
		//보안취약성 점검
		Button bTestingSecurityVulnerablitiy = (Button)findViewById(R.id.button_testing_security_vulnerability);
		bTestingSecurityVulnerablitiy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),ML1TestingSecurityVulnerabilityActivity.class);
				startActivity(intent);
			}
		});
		
		//로그뷰
		Button bLogview = (Button)findViewById(R.id.button_logview);
		bLogview.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),ML1LogviewActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ml0_testing, menu);
		return true;
	}

}
