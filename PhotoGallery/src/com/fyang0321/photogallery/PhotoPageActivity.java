package com.fyang0321.photogallery;

import android.support.v4.app.Fragment;

public class PhotoPageActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new PhotoPageFragment();
	}

}
