package com.bhanu.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLogger implements com.bhanu.factory.Logger{

	private Logger LOGGER = Logger.getLogger(FileLogger.class.getName());
	
	 public void log(){
		 LOGGER.log(Level.SEVERE, " This is custom file logger example ");
	 }
	
	
	public static void main(String[] args) {
		FileLogger fileLogger = new FileLogger();
		fileLogger.log();
	}
}
