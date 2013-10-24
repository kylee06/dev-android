package com.example.usecurityagentmobile;

import java.util.ArrayList;

import com.example.mylistview.AdapterBtnAppDelete;
import com.example.mylistview.ListItem;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ResultMaliciousTestingActivity extends Activity {
	ListView list;
	ArrayList<ListItem> dataArr;
	AdapterBtnAppDelete mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_malicious_testing);
		
		//�Ǽ��ڵ�� ����Ʈ
		list = (ListView) findViewById(R.id.listView_result_malicious);

		dataArr = new ArrayList<ListItem>();
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"�Ǽ�����1",  "�Ǽ��ڵ�2��","����",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"�Ǽ�����2",  "�Ǽ��ڵ�1��","����",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"�Ǽ�����3",  "�Ǽ��ڵ�3��","����",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"�Ǽ�����4",  "�Ǽ��ڵ�1��","����",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"�Ǽ�����5",  "�Ǽ��ڵ�2��","����",true) );
	    

	    mAdapter = new AdapterBtnAppDelete(this, R.layout.list_item, dataArr);
	    list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	    list.setAdapter(mAdapter);
		
		//�˻��ϱ� ??
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
