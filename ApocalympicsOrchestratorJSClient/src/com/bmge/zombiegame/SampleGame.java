package com.bmge.zombiegame;

import android.util.Log;

import com.bmge.framework.Screen;
import com.bmge.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {
    
	private static final String TAG = SampleGame.class.getSimpleName();
	
	@Override
    public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		Log.d(TAG, "on back pressed!");
		//finish();
		//Log.d(TAG, "finished!");
	}
    
	
	
	
	
}