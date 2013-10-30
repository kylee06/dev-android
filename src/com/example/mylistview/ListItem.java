package com.example.mylistview;

import android.graphics.Bitmap;

/*
 * btn_type 0 : null
 * 			1 : delete
 * 			2 : setup
 * 			3 : detail
 */

public class ListItem {
	Bitmap Img;
	String title;
	String sub_title;
	String btn_title;
	int btn_type;
	boolean btn_visibility;
	boolean img_visibility;
	
	public ListItem(Bitmap _img, boolean _img_visibility, String _title, String _sub_title, int _btn_type, String _btn_title, boolean _btn_visibility){
		Img = _img;
		img_visibility = _img_visibility;
		title = _title;
		sub_title = _sub_title;
		btn_type = _btn_type;
		btn_title = _btn_title;
		btn_visibility = _btn_visibility;
	}
}
