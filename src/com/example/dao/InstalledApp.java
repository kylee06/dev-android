package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class InstalledApp {
	private static InstalledApp instance = new InstalledApp();
	public ArrayList<AppInformation> installed_app_list = null;
	
	private InstalledApp(){
		if(installed_app_list == null){
			installed_app_list = new ArrayList<AppInformation>();
		}
	}
	
	public synchronized static InstalledApp getInstance(){
		if(instance == null){
			instance = new InstalledApp();
		}
		return instance;
	}
	
	public AppInformation getInstalledApp(int index){
		if(index < 0 || index >= installed_app_list.size())
			return null;
		
		return installed_app_list.get(index);
	}
	
	public synchronized boolean getInstalledAppList(PackageManager pkmgr){
		if(pkmgr == null)
			return false;
		
		//설치된 패키지 정보 가져오기
		List<PackageInfo> packageinfo_list = pkmgr.getInstalledPackages(
				PackageManager.GET_PERMISSIONS | PackageManager.GET_SIGNATURES | PackageManager.GET_PROVIDERS );
		
		//앱 정보 가져오기 및 저장
		for (PackageInfo packageinfo : packageinfo_list) {
			Bitmap app_icon = null; //앱 아이콘
			try {
				Drawable dw = pkmgr.getApplicationIcon(packageinfo.packageName);
				app_icon = ((BitmapDrawable)dw).getBitmap();
			} catch (NameNotFoundException e) {
				e.printStackTrace();
			}
			
			Log.d("PackageInfo","PackageInfo--------");
			//Signature 가져오기
			Signature[] sign = packageinfo.signatures;
			String signature_str ="";
			if(sign !=null){
				for(Signature sign_str : sign){
					Log.d("signature B : ",""+sign_str.toCharsString());
					signature_str += sign_str.toCharsString(); 
				}
			}else{
				Log.d("signature","No Signatures");
			}
			
			//Permission 가져오기
			String[] perm = packageinfo.requestedPermissions;
			ArrayList<String> perm_list = new ArrayList<String>();
			if(perm != null){
				for(String perm_str : perm){
					perm_list.add(perm_str);
				}
			}else{
				Log.d("str","No List");
			}
			
			//Provider 가져오기
			ProviderInfo[] providerinfo = packageinfo.providers;
			if(providerinfo != null){
				for(ProviderInfo pi : providerinfo){
					Log.d("authority",""+pi.authority);
					Log.d("name",""+pi.name);
				}
			}else{
				Log.d("Provider","No List");
			}
			
			//리스트 저장
			installed_app_list.add(
					new AppInformation(
							app_icon,
							packageinfo.packageName,
							"test",//packageInfo.providers.toString(),//TO DO.
							signature_str,
							perm_list
							)
				);
		}
		
		return true;
	}
	
}
