package com.example.slidingmenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class RightFragment extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TextView view = new TextView(getActivity());
		// view.setBackgroundColor(0x4400ffff);

		Log.d("Right", "before1");
		final View v = inflater.inflate(R.layout.right_frame, container, false);

		// Switch sw1 = (Switch)v.findViewById(R.id.switch1);
		// String tg = (String) sw1.getTextOn();
		// Log.d("texton1", tg);
		// sw1.setTextOn("xx");
		// Log.d("texon2", (String)sw1.getTextOn());
		// Log.d("Right", "after1");
		//
		// TextView tx1 = (TextView)v.findViewById(R.id.TextView01);
		// tx1.setText("HELP!!");
		//
//		Button btsm = (Button) v.findViewById(R.id.buttonSM);
//		btsm.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast toast = Toast.makeText(
//						v.getContext(),
//						"Social Mode: Whether to show your location on map to public",
//						Toast.LENGTH_SHORT);
//				toast.show();
//				Log.d("xxx", "btsm");
//			}
//		});
//		Button btcap = (Button) v.findViewById(R.id.buttonCAP);
//		btcap.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast toast = Toast.makeText(
//						v.getContext(),
//						"Clock Auto Pause: Clock will pause for temporary stop",
//						Toast.LENGTH_SHORT);
//				toast.show();
//				Log.d("xxx", "btsm");
//			}
//		});
//		Button btsal = (Button) v.findViewById(R.id.buttonSAL);
//		btsal.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast toast = Toast.makeText(v.getContext(),
//						"Screen Auto Lock: Lock screen when riding",
//						Toast.LENGTH_SHORT);
//				toast.show();
//				Log.d("xxx", "btsm");
//			}
//		});
//		// create a single listener for all the 3 switches
//		CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
//
//			@Override
//			public void onCheckedChanged(CompoundButton buttonView,
//					boolean isChecked) {
//				// TODO Auto-generated method stub
//				Toast toast = Toast.makeText(v.getContext(),
//						"Is Checked",
//						Toast.LENGTH_SHORT);
//				toast.show();
//				String key = null;
//				switch (buttonView.getId()) {
//				case R.id.switch1:
//					if (isChecked) {
//						Toast toast = Toast.makeText(v.getContext(),
//								"Is Checked",
//								Toast.LENGTH_SHORT);
//						toast.show();
//					}else{
//						Toast toast = Toast.makeText(v.getContext(),
//								"Not Checked",
//								Toast.LENGTH_SHORT);
//						toast.show();
//					}
//					break;
//				case R.id.switch2:
//					if (isChecked) {
//						Toast toast = Toast.makeText(v.getContext(),
//								"Is Checked",
//								Toast.LENGTH_SHORT);
//						toast.show();
//					}else{
//						Toast toast = Toast.makeText(v.getContext(),
//								"Not Checked",
//								Toast.LENGTH_SHORT);
//						toast.show();
//					}
//					break;
//				case R.id.switch3:
//					if (isChecked) {
//						Toast toast = Toast.makeText(v.getContext(),
//								"Is Checked",
//								Toast.LENGTH_SHORT);
//						toast.show();
//					}else{
//						Toast toast = Toast.makeText(v.getContext(),
//								"Not Checked",
//								Toast.LENGTH_SHORT);
//						toast.show();
//					}
//					break;
//				}
//			}
//		};
//
//		Switch swsm = (Switch) v.findViewById(R.id.switch1);
//		swsm.setOnCheckedChangeListener(listener);
//		Switch sw2 = (Switch)v.findViewById(R.id.switch2);
//		sw2.setOnCheckedChangeListener(listener);
//		Switch sw3 = (Switch)v.findViewById(R.id.switch3);
//		sw3.setOnCheckedChangeListener(listener);
		return v;
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d("Right", "before2");
		Log.d("Right", "after2");
	}

}
