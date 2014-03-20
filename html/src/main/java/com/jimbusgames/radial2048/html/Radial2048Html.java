package com.jimbusgames.radial2048.html;

import com.jimbusgames.radial2048.core.Radial2048;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class Radial2048Html extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new Radial2048();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
