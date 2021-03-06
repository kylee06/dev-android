package com.example.usecurityagentmobile;

import java.util.ArrayList;

import com.example.dao.AppInformation;
import com.example.dao.InstalledAppList;
import com.example.mylistview.AdapterBtnAppDelete;
import com.example.mylistview.AdapterBtnDetail;
import com.example.mylistview.ListItem;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.widget.ListView;

public class ResultTabAppPermissionActivity extends Activity {
	ListView list;
	ArrayList<ListItem> dataArr;
	AdapterBtnDetail mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_tab_app_permission);
		
		list = (ListView) findViewById(R.id.listView_result_app_permission);

		dataArr = new ArrayList<ListItem>();
	    //dataArr.add(new ListItem(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher),true,"설치된 앱1",  "퍼미션 개수","상세정보",true) );
	    
	    InstalledAppList installed_app_list = new InstalledAppList();
		installed_app_list.getInstalledAppList(this.getPackageManager());
		
		for(int i=0; i<installed_app_list.installed_app_list.size(); i++){
			AppInformation app_info = installed_app_list.installed_app_list.get(i);
			dataArr.add(new ListItem(app_info.getApp_icon(),true,app_info.getApp_name(),""+app_info.getApp_permission_list().size()+"개의 퍼미션","삭제",true) );
		}
	    

	    mAdapter = new AdapterBtnDetail(this, R.layout.list_item, dataArr);
	    list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	    list.setAdapter(mAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result_tab_app_permission, menu);
		return true;
	}

}
