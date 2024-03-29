package com.bmge.framework;

import android.content.Context;
import android.view.WindowManager;

public interface Game {

	public Audio getAudio();

    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getInitScreen();
}
