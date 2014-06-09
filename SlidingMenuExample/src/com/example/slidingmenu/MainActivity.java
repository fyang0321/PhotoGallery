package com.example.slidingmenu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.actionbarsherlock.app.ActionBar;
import com.google.android.gms.maps.GoogleMap;

public class MainActivity extends BaseActivity {
	private GoogleMap map;
	private ImageView friendList; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// TextView textView = new TextView(this);
		// textView.setBackgroundColor(0x44ff00ff);
		// setContentView(textView);
		//设定主界面的布局
		setContentView(R.layout.main_page);

		Log.d("Main","onCreate beginning");
		// get the map
//		map = ((SupportMapFragment) getSupportFragmentManager()
//				.findFragmentById(R.id.map)).getMap();
//		LatLng sydney = new LatLng(-33.867, 151.206);
//
//		map.setMyLocationEnabled(true);
//		map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));
//
//		map.addMarker(new MarkerOptions().title("Sydney")
//				.snippet("The most populous city in Australia.")
//				.position(sydney));
		
		slidingMenu.setSecondaryMenu(R.layout.right_container);
		
		FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
		Log.d("Main","onCreate before rightfragment");
		RightFragment rightFrag = new RightFragment();		
		Log.d("Main","onCreate after rightfragment");
		transaction.replace(R.id.right_container, rightFrag);
		transaction.commit();
		
		ActionBar actionBar = getSupportActionBar();
		//LayoutInflater inflater = getLayoutInflater();
		LayoutInflater inflater = (LayoutInflater) this
	                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View actionBarView = inflater.inflate(R.layout.actionbar, null);
		actionBar.setCustomView(actionBarView);
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

		actionBar.setDisplayUseLogoEnabled(false);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayHomeAsUpEnabled(false);
		
		ImageView friendlist = (ImageView)actionBarView.findViewById(R.id.friendlist);
		friendlist.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				toggle();
			}
		});
		
		ImageView personalInfo = (ImageView)actionBarView.findViewById(R.id.personalInfo);
		personalInfo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				getSlidingMenu().showSecondaryMenu();
			}
		});
		//getSherlock().getActionBar().setDisplayHomeAsUpEnabled(true);
		Log.d("Main","onCreate last");
	}

//	@Override
//	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
//		//getMenuInflater().inflate(R.menu.actionbar, menu);
//		getSherlock().getMenuInflater().inflate(R.menu.actionbar, menu);
//		return true;
//	}
	

	@Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// toggle就是程序自动判断是打开还是关闭
			toggle();
			// getSlidingMenu().showMenu();// show menu
			// getSlidingMenu().showContent();//show content
			return true;
		default:
			getSlidingMenu().showSecondaryMenu();
		}

		return super.onOptionsItemSelected(item);
	}

}
