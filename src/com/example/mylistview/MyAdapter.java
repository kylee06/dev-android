package com.example.mylistview;

import java.util.ArrayList;

import com.example.usecurityagentmobile.R;
import com.example.usecurityagentmobile.ResultDetailPermission;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/*
 * btn_type 0 : null
 * 			1 : delete
 * 			2 : setup
 * 			3 : detail
 */

public class MyAdapter extends BaseAdapter implements OnClickListener{
	Context context;
	int layoutId;
	LayoutInflater Inflater;
	ArrayList<ListItem> myListItemArr;
	
	public MyAdapter(Context _context, int _layoutId, ArrayList<ListItem> _myListItemArr){
		context = _context;
		layoutId = _layoutId;
		myListItemArr = _myListItemArr;
		Inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return myListItemArr.size();
	}

	@Override
	public Object getItem(int position) {
		return myListItemArr.get(position).title;
	}
	
	//return subtitle?

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final int pos = position;
		
		if (convertView == null)  {
            convertView = Inflater.inflate(layoutId, parent, false);
        }
		//Area1
		ImageView leftImg = (ImageView)convertView.findViewById(R.id.left_image);
        leftImg.setImageBitmap(myListItemArr.get(position).Img);
        if(myListItemArr.get(position).btn_visibility == false)
        	leftImg.setVisibility(View.INVISIBLE);
        else
        	leftImg.setVisibility(View.VISIBLE);
		
        TextView nameTv = (TextView)convertView.findViewById(R.id.list_item_title);
        nameTv.setText(myListItemArr.get(position).title);
        
        TextView phoneTv = (TextView)convertView.findViewById(R.id.list_item_sub_title);
        phoneTv.setText(myListItemArr.get(position).sub_title);
        
       //Area2
       Button btn = (Button)convertView.findViewById(R.id.list_item_btn);
       
       if(myListItemArr.get(position).btn_visibility == false)
    	   btn.setVisibility(View.INVISIBLE);
       else
    	   btn.setVisibility(View.VISIBLE);

       
       btn.setText(myListItemArr.get(position).btn_title);
       btn.setTag(new ButtonParameters(myListItemArr.get(position).btn_type,pos));
       btn.setOnClickListener(this);
       
        return convertView;
		
	}

	@Override
	public void onClick(View v) {
		ButtonParameters btn_prams = (ButtonParameters)v.getTag();
		final int pos = btn_prams.position;
		
		Toast.makeText(context, "pos : "+pos+"button_type : "+btn_prams.button_type,Toast.LENGTH_SHORT).show();
		
		switch(btn_prams.button_type){
		case 0: //null
			break;
		
		case 1://delete
			//Intent intent = new Intent(context.getApplicationContext(),ResultDetailPermission.class);
			break;
		
		case 2://setup
			break;
			
		case 3://detail
			Intent intent = new Intent(context.getApplicationContext(),ResultDetailPermission.class);
			intent.putExtra("LIST_ID", pos);
			context.startActivity(intent);
			break;	
		}
		
	}
}