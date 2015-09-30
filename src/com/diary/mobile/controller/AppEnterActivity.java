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
		// 软件管理
		case R.id.soft_manager:
			intent.setClass(this, AppManager.class);
			break;
		// 设置中心
//		case R.id.app_setting:
//			intent.setClass(this, SettingCenter.class);
//			break;
//		// 流量监控
		case R.id.flow_monitoring:
			intent.setClass(this, NetWorkMonitoringActivity.class);
//			break;
//		// 系统优化
//		case R.id.system_optimizing:
//			intent.setClass(this, SystemOptimizing.class);
//			break;
//		// 骚扰拦截
//		case R.id.harass_intercept:
//			intent.setClass(this, HarassInterceptActivity.class);
//			break;

		// 工具箱
		case R.id.function_box:
			// intent.setAction("function_box");
			break;
		default:
			break;
		}
		startActivity(intent);
	}

}
