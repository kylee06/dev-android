package com.example.usecurityagentmobile;

import java.util.ArrayList;

import com.example.mylistview.AdapterBtnAppDelete;
import com.example.mylistview.ListItem;
import com.example.mylistview.MyAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.example.dao.AppInformation;
import com.example.dao.InstalledAppList;

public class ResultMaliciousTestingActivity extends Activity {
	ListView list;
	ArrayList<ListItem> dataArr;
	MyAdapter mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_malicious_testing);
		
		//악성코드앱 리스트
		list = (ListView) findViewById(R.id.listView_result_malicious);

		dataArr = new ArrayList<ListItem>();
		
		InstalledAppList installed_app_list = new InstalledAppList();
		installed_app_list.getInstalledAppList(this.getPackageManager());
		
		for(int i=0; i<installed_app_list.installed_app_list.size(); i++){
			AppInformation app_info = installed_app_list.installed_app_list.get(i);
			dataArr.add(new ListItem(app_info.getApp_icon(),true,app_info.getApp_name(),app_info.getApp_publisher(),1,"삭제",true) );
		}
		
		//dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"악성어플1",  "악성코드2개","삭제",true) );
		
	    mAdapter = new MyAdapter(this, R.layout.list_item, dataArr);
	    list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	    list.setAdapter(mAdapter);
		
		//검사하기 ??
		Button bTesting = (Button)findViewById(R.id.button_result_malicious_ok);
		bTesting.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),ML0TestingActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.malicious_testing, menu);
		return true;
	}

}
