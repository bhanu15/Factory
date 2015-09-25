package com.bhanu.factory;

import java.util.logging.Level;

public class DataBaseLogger implements com.bhanu.factory.Logger {
	
	private java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DataBaseLogger.class.getName());
	
	@Override
	public void log() {
		String msg = "Logging to database";
		logger.log(Level.INFO, msg);
	}

}
