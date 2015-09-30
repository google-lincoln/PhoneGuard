package com.diary.mobile.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.diary.mobile.R;

public class AppEnterActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_enter_main);
	}
	
	
	
	public void onClick(View view) {
		Intent intent = new Intent();
		switch (view.getId()) {
		// �������
		case R.id.soft_manager:
			intent.setClass(this, AppManager.class);
			break;
		// ��������
//		case R.id.app_setting:
//			intent.setClass(this, SettingCenter.class);
//			break;
//		// �������
		case R.id.flow_monitoring:
			intent.setClass(this, NetWorkMonitoringActivity.class);
//			break;
//		// ϵͳ�Ż�
//		case R.id.system_optimizing:
//			intent.setClass(this, SystemOptimizing.class);
//			break;
//		// ɧ������
//		case R.id.harass_intercept:
//			intent.setClass(this, HarassInterceptActivity.class);
//			break;

		// ������
		case R.id.function_box:
			// intent.setAction("function_box");
			break;
		default:
			break;
		}
		startActivity(intent);
	}

}
