package com.example.dao;

import java.util.ArrayList;

import android.graphics.Bitmap;

public class AppInformation {
	Bitmap app_icon; //¾Û ¾ÆÀÌÄÜ
	String app_name; //¾Û ÀÌ¸§
	String app_publisher; //¾Û ¹èÆ÷ÀÚ
	String app_signature; //¾Û ½Ã±×´ÏÃ³
	ArrayList<String> app_permission_list;
	
	public AppInformation(){
		this.app_icon = null;
		this.app_name = "";
		this.app_publisher = "";
		this.app_signature = "";
		this.app_permission_list = new ArrayList<String>();
	}
	
	public AppInformation(Bitmap app_icon, String app_name,
			String app_publisher, String app_signature, ArrayList<String> app_permission_list) {
		super();
		this.app_icon = app_icon;
		this.app_name = app_name;
		this.app_publisher = app_publisher;
		this.app_signature = app_signature;
		this.app_permission_list = app_permission_list;
	}

	public Bitmap getApp_icon() {
		return app_icon;
	}

	public void setApp_icon(Bitmap app_icon) {
		this.app_icon = app_icon;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getApp_publisher() {
		return app_publisher;
	}

	public void setApp_publisher(String app_publisher) {
		this.app_publisher = app_publisher;
	}

	public String getApp_signature() {
		return app_signature;
	}

	public void setApp_signature(String app_signature) {
		this.app_signature = app_signature;
	}

	public ArrayList<String> getApp_permission_list() {
		return app_permission_list;
	}

	public void setApp_permission_list(ArrayList<String> app_permission_list) {
		this.app_permission_list = app_permission_list;
	}
	
}
