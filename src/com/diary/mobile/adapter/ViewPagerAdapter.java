package com.diary.mobile.adapter;

import java.util.List;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

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
		
		return pageList.get(position);
	}
	
	

}
