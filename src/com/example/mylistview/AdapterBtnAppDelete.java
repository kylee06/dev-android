package com.example.mylistview;

import java.util.ArrayList;

import com.example.usecurityagentmobile.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AdapterBtnAppDelete extends MyAdapter{

	public AdapterBtnAppDelete(Context _context, int _layoutId, ArrayList<ListItem> _myListItemArr) {
		super(_context, _layoutId, _myListItemArr);
		// TODO Auto-generated constructor stub
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
       btn.setOnClickListener(new Button.OnClickListener(){
    	   public void onClick(View v){
                //String str = myDataArr.get(pos).name + "님의 전화번호는 [ "+myDataArr.get(pos).phone+" ] 입니다.";
                //Toast.makeText(context, str,Toast.LENGTH_SHORT).show();
            	String str = "삭제화면으로 이동";
            	Toast.makeText(context, str,Toast.LENGTH_SHORT).show();
                }
       });

        return convertView;
			
	}
}
