package com.wan.slidemenu.bean;

public class ScreenPixelsBean {

	private int screenWidth;
	private int screenHeight;

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	@Override
	public String toString() {
		return "屏幕宽度："+screenWidth+";屏幕高度："+screenHeight;
	}

}
