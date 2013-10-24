package com.example.usecurityagentmobile;

import java.util.ArrayList;

import com.example.mylistview.AdapterBtnAppDelete;
import com.example.mylistview.ListItem;
import com.example.mylistview.MyAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.widget.ListView;

public class ResultTabSavingprivacyActivity extends Activity {
	ListView list;
	ArrayList<ListItem> dataArr;
	AdapterBtnAppDelete mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_tab_savingprivacy);
		
		list = (ListView) findViewById(R.id.listView_result_saving_privacy);

		dataArr = new ArrayList<ListItem>();
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"개인정보 저장앱1",  "퍼미션1","삭제",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),false,"개인정보 저장앱2",  "퍼미션1","삭제",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"개인정보 저장앱3",  "퍼미션1","삭제",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"개인정보 저장앱4",  "퍼미션1","삭제",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"개인정보 저장앱5",  "퍼미션1","삭제",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"개인정보 저장앱6",  "퍼미션1","삭제",true) );
	    dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"개인정보 저장앱7",  "퍼미션1","삭제",true) );
	    

	    mAdapter = new AdapterBtnAppDelete(this, R.layout.list_item, dataArr);
	    list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	    list.setAdapter(mAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result_tab_savingprivacy, menu);
		return true;
	}

}
