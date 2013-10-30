/*
 * TO DO 퍼블리셔 구현
 */

package com.example.dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import android.Manifest.permission;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;

public class InstalledAppList {
	public ArrayList<AppInformation> installed_app_list;
	
	public InstalledAppList() {
		installed_app_list = new ArrayList<AppInformation>();
	}

	public boolean getInstalledAppList(PackageManager pkmgr){
		if(pkmgr == null)
			return false;
		
		List<PackageInfo> appinfo = pkmgr.getInstalledPackages(PackageManager.GET_PERMISSIONS | PackageManager.GET_SIGNATURES | PackageManager.GET_PROVIDERS );
		
		for (PackageInfo packageInfo : appinfo) {
			Bitmap app_icon = null;
			try {
				Drawable dw = pkmgr.getApplicationIcon(packageInfo.packageName);
				app_icon = ((BitmapDrawable)dw).getBitmap();
			} catch (NameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(installed_app_list == null)
				installed_app_list = new ArrayList<AppInformation>();
			
			//Log.d("CASE","CASE 1");
			//Signature
			Signature[] sign = packageInfo.signatures;
			String signature_str ="";
			if(sign !=null){
				for(Signature sign_str : sign){
					Log.d("signature H : ",""+sign_str.hashCode());
					Log.d("signature B : ",""+sign_str.toCharsString());
					signature_str += sign_str.toCharsString(); 
					
				}
			}else{
				Log.d("signature","No Signatures");
			}
			
			//Permission
			String[] perm = packageInfo.requestedPermissions;
			ArrayList<String> perm_list = new ArrayList<String>();
			if(perm != null){
				for(String perm_str : perm){
					perm_list.add(perm_str);
				}
			}else{
				Log.d("str","No List");
			}
			
			ProviderInfo[] providerinfo = packageInfo.providers;
			if(providerinfo != null){
				for(ProviderInfo pi : providerinfo){
					Log.d("authority",""+pi.authority);
					Log.d("name",""+pi.name);
				}
			}else{
				Log.d("Provider","No List");
			}
			
			installed_app_list.add(
					new AppInformation(
							app_icon,
							packageInfo.packageName,
							"test",//packageInfo.providers.toString(),//test
							signature_str,
							perm_list
							)
				);
		}
		
		return true;
	}
	
}
