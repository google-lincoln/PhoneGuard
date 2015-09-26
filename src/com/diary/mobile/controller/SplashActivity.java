package com.diary.mobile.controller;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.diary.mobile.R;

public class SplashActivity extends Activity {

	private static final int GO_HOME = 1000;
	private static final int GO_GUIDE = 10001;

	private static final int DELAY_TO_SEND_TIME = 3000;

	private static final String SPLASH_XML_FILE_NAME = "splash_sp";

	private boolean splashFlag;

	private Handler mHandler = new Handler() {

		public void handleMessage(Message msg) {

			switch (msg.what) {
			case GO_HOME:
				goHome();
				break;
			case GO_GUIDE:
				goGuide();
				break;

			default:
				break;
			}

		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		init();
	}

	protected void goGuide() {
		Intent intent = new Intent(this, GuideActivity.class);

		startActivity(intent);
		finish();

	}

	protected void goHome() {
		Intent intent = new Intent(this, GuideActivity.class);

		startActivity(intent);
		finish();

	}

	private void init() {
		SharedPreferences sp = getSharedPreferences(SPLASH_XML_FILE_NAME,
				MODE_PRIVATE);

		splashFlag = sp.getBoolean("splashFlag", true);

		if (!splashFlag) {
			mHandler.sendEmptyMessageAtTime(GO_HOME, DELAY_TO_SEND_TIME);
		} else {
			mHandler.sendEmptyMessageAtTime(GO_GUIDE, DELAY_TO_SEND_TIME);
		}

	}

}
