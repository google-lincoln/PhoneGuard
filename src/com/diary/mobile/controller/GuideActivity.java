package com.diary.mobile.controller;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.diary.mobile.R;
import com.diary.mobile.adapter.ViewPagerAdapter;

public class GuideActivity extends Activity implements OnPageChangeListener {

	private ViewPager vp_guide;
	private ViewPagerAdapter viewpageAdapter;
	private List<View> pageList;
	private ImageView[] iv_dots;
	private int dotIndex;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide);

		initViews();
		initDots();
	}

	private void initViews() {
		LayoutInflater inflater = LayoutInflater.from(this);

		pageList = new ArrayList<View>();
		pageList.add(inflater.inflate(R.layout.activity_guide_page_one, null));
		pageList.add(inflater.inflate(R.layout.activity_guide_page_two, null));
		pageList.add(inflater.inflate(R.layout.activity_guide_page_three, null));
		pageList.add(inflater.inflate(R.layout.activity_guide_page_four, null));

		viewpageAdapter = new ViewPagerAdapter(pageList, this);

		vp_guide = (ViewPager) findViewById(R.id.vp_guide);
		vp_guide.setAdapter(viewpageAdapter);

		vp_guide.setOnPageChangeListener(this);

	}

	private void initDots() {
		LinearLayout ll_main = (LinearLayout) findViewById(R.id.ll_guide_bottom);
		iv_dots = new ImageView[pageList.size()];

		for (int i = 0; i < pageList.size(); i++) {
			iv_dots[i] = (ImageView) ll_main.getChildAt(i);
			iv_dots[i].setEnabled(true);
		}

		dotIndex = 0;
		iv_dots[dotIndex].setEnabled(false);
	}
	
	private void setDotPosition(int position)
	{
		if(position<0 || position>pageList.size()-1| dotIndex ==position)
		{
			return;
		}
		iv_dots[position].setEnabled(false);
		iv_dots[dotIndex].setEnabled(true);
		
		dotIndex = position;
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageSelected(int arg0) {
		setDotPosition(arg0);

	}

}
