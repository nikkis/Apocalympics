package com.bmge.framework;

import com.bmge.framework.Graphics.ImageFormat;

public interface Image {
	
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
    
}
