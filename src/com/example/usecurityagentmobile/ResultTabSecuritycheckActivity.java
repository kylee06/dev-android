package com.example.usecurityagentmobile;

import java.util.ArrayList;

import com.example.mylistview.AdapterBtnAppDelete;
import com.example.mylistview.AdapterBtnSetup;
import com.example.mylistview.ListItem;
import com.example.mylistview.MyAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.widget.ListView;

public class ResultTabSecuritycheckActivity extends Activity {
	ListView list;
	ArrayList<ListItem> dataArr;
	MyAdapter mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_tab_securitycheck);
		
		list = (ListView) findViewById(R.id.listView_result_security_check);

		dataArr = new ArrayList<ListItem>();
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"��й�ȣ ���� ����",  "Y/N",2,"�����ϱ�",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"WiFi ���� ����", "Y/N",2,"�����ϱ�",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"GPS ���� ����",  "Y/N",2,"�����ϱ�",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"�� ���� �� ��ġ ����",  "Y/N",2,"�����ϱ�",true) );

	    mAdapter = new MyAdapter(this, R.layout.list_item, dataArr);
	    list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	    list.setAdapter(mAdapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result_tab_securitycheck, menu);
		return true;
	}

}
