package com.diary.mobile.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.diary.mobile.R;
import com.diary.mobile.controller.AppEnterActivity;
import com.diary.mobile.controller.SplashActivity;

public class ViewPagerAdapter extends PagerAdapter {
	
	private List<View> pageList;
	private Activity activity;
	

	public ViewPagerAdapter(List<View> pageList, Activity activity) {
		super();
		this.pageList = pageList;
		this.activity = activity;
	}

	@Override
	public int getCount() {
		return pageList.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return (arg0==arg1);
	}
	
	@Override
	public Object instantiateItem(View container, int position) {
		((ViewPager) container).addView(pageList.get(position));
		
		if(position ==pageList.size()-1)
		{
			ImageView iv_goHome = (ImageView) container.findViewById(R.id.iv_start_weibo);
			
			iv_goHome.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					//set splashFlag
					setGuided();
					goHome();
					
				}
			});
			
		}
		
		return pageList.get(position);
	}
	
	protected void goHome() {
		
		Intent intent = new Intent(activity,AppEnterActivity.class);
		activity.startActivity(intent);
		activity.finish();
		
	}

	protected void setGuided() {
		SharedPreferences sp = activity.getSharedPreferences(SplashActivity.SPLASH_XML_FILE_NAME,Context.MODE_PRIVATE);
		
		Editor editor = sp.edit();
		
		editor.putBoolean("splashFlag", false);
		editor.commit();
	}

	@Override
	public void destroyItem(View container, int position, Object object) {
		((ViewPager) container).removeView(pageList.get(position));
	}
	
	

}
