package com.diary.mobile.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.diary.mobile.R;

public class AppManager extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_manager);
		
	}
	
	public void onClick(View view) {
		Intent intent = new Intent();
		switch (view.getId()) {
		case R.id.btn_all_app:
			intent.setClass(this, AllAppActivity.class);
			break;
		case R.id.btn_apk_manager:
			//intent.setClass(this, APKManger.class);
			break;
		default:
			break;
		}
		startActivity(intent);
	}
}
