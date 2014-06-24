package com.fyang880321.dragadndraw;

import android.graphics.PointF;

public class Box {
	public PointF getOrigin() {
		return mOrigin;
	}

	public void setOrigin(PointF origin) {
		mOrigin = origin;
	}

	public PointF getCurrent() {
		return mCurrent;
	}

	public void setCurrent(PointF current) {
		mCurrent = current;
	}

	private PointF mOrigin;
	private PointF mCurrent;
	
	public Box(PointF origin) {
		mOrigin = mCurrent = origin;
	}
	
//	public void setCurrent(PointF current) {
//		mCurrent = current;
//	}
//	
//	public PointF getOrigin() {
//		return mOrigin;
//	}
}
