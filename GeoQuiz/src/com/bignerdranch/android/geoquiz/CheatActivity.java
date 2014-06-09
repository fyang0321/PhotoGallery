package com.bignerdranch.android.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends Activity {
	public static final String EXTRA_ANSWER_IS_TRUE =
			"com.bignerdranch.android.geoquiz.answer_is_true";
	public static final String EXTRA_ANSWER_SHOWN = 
			"com.bignerdranch.android.geoquiz.answer_shown";
	
	private static final String TAG = "CheatActivity";
	private static final String KEY_ANSWERSHOWN = "answerShown";
	private boolean isAnswerShownRecord;
	private boolean mAnswerIsTrue;
	
	private TextView mAnswerTextView;
	private TextView mBuildVersion;
	private Button mShowAnswer;
	
	private void setAnswerShownResult(boolean isAnswerShown) {
		isAnswerShownRecord = isAnswerShown;
		Intent data = new Intent();
		data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
		setResult(RESULT_OK, data);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cheat);
		
		if (savedInstanceState != null) {
			isAnswerShownRecord = savedInstanceState.getBoolean(KEY_ANSWERSHOWN, false);
		}
		
		mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
		setAnswerShownResult(isAnswerShownRecord);
		
		mAnswerTextView = (TextView)findViewById(R.id.answerTextView);
		if (isAnswerShownRecord) {
			int text = (mAnswerIsTrue == true) ? R.string.true_button :
				R.string.false_button;
			mAnswerTextView.setText(text);
		}
		
		mBuildVersion = (TextView)findViewById(R.id.buildVersion);
		mBuildVersion.append("API Level " + VERSION.SDK_INT);
		
		mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
		mShowAnswer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (mAnswerIsTrue) {
					mAnswerTextView.setText(R.string.true_button);
				} else {
					mAnswerTextView.setText(R.string.false_button);
				}
				setAnswerShownResult(true);
			}
		});
	}
	
	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
		super.onSaveInstanceState(savedInstanceState);
		Log.i(TAG, "onSaveInstanceState");
		savedInstanceState.putBoolean(KEY_ANSWERSHOWN, isAnswerShownRecord);
	}
}
