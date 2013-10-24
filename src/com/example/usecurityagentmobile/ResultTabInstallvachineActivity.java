package com.example.usecurityagentmobile;

import java.util.ArrayList;

import com.example.mylistview.AdapterBtnAppDelete;
import com.example.mylistview.AdapterBtnNoneButton;
import com.example.mylistview.ListItem;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.widget.ListView;

public class ResultTabInstallvachineActivity extends Activity {
	ListView list;
	ArrayList<ListItem> dataArr;
	AdapterBtnNoneButton mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_tab_installvachine);
		
		list = (ListView) findViewById(R.id.listView_result_install_vachine);

		dataArr = new ArrayList<ListItem>();
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"��ġ�� ���1",  "������ or ȸ���","",false) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"��ġ�� ���2",  "������ or ȸ���","",false) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"��ġ�� ���3",  "������ or ȸ���","",false) );
	    
	    

	    mAdapter = new AdapterBtnNoneButton(this, R.layout.list_item, dataArr);
	    list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	    list.setAdapter(mAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result_tab_installvachine, menu);
		return true;
	}

}
