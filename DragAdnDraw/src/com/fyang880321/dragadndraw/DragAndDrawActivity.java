package com.fyang880321.dragadndraw;

import android.support.v4.app.Fragment;

public class DragAndDrawActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new DragAndDrawFragment();
	}
}
