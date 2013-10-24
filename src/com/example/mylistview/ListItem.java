package com.example.mylistview;

import android.graphics.Bitmap;

public class ListItem {
	Bitmap Img;
	String title;
	String sub_title;
	String btn_title;
	boolean img_visibility;
	boolean btn_visibility;
	public ListItem(Bitmap _img, boolean _img_visibility, String _title, String _sub_title, String _btn_title, boolean _btn_visibility){
		Img = _img;
		img_visibility = _img_visibility;
		title = _title;
		sub_title = _sub_title;
		btn_title = _btn_title;
		btn_visibility = _btn_visibility;
	}
}
