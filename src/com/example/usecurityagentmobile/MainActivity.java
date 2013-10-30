package com.example.usecurityagentmobile;

//import com.example.usecurityagent.MenuMainCheck;
//import com.example.usecurityagent.R;

import com.example.database.DBManager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//로그인
		Button bLogin = (Button)findViewById(R.id.button_login);
		bLogin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),ML0LoginActivity.class);
				startActivity(intent);
			}
		});
		
		//검사하기
		Button bTesting = (Button)findViewById(R.id.button_testing);
		bTesting.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),ML0TestingActivity.class);
				startActivity(intent);
			}
		});
		
		//환경설정
		//TO DO
		
		//검사하기
		Button bExit = (Button)findViewById(R.id.button_exit);
		bExit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
