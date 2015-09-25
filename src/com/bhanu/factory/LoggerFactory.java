package com.bhanu.factory;

import java.util.logging.Level;

/**
 * @author bhanu this is a LoggerFactory generates Logger instances based on
 *         request.
 */

public class LoggerFactory {

	java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(LoggerFactory.class.getName());
	Logger logger;

	static private LoggerFactory instance;

	static LoggerFactory getInststance() {
		instance = new LoggerFactory();
		return instance;
	}

	// to prevent using constructor for creating instances.
	private LoggerFactory() {

	}

	public Logger getLogger(String loggerType) {
		ELogger eLogger = null;
		try {
			eLogger = ELogger.valueOf(loggerType);
			// File , XML , DataBase
			switch (eLogger) {
			case File:
				logger = new FileLogger();
				break;
			case XML:
				logger = new XmlLogger();
				break;
			case DataBase:
				logger = new DataBaseLogger();
				break;
			default:
				logger2.log(Level.SEVERE, " No Logger found ");
				logger = new FileLogger();
			}
		} catch (IllegalArgumentException illegalArgumentException) {
			logger2.log(Level.SEVERE, " Type not supported ");
			logger2.log(Level.INFO, " Creating File logger ");
			logger = new FileLogger();

		} catch (Exception exception) {
			logger2.log(Level.SEVERE, " Exception in getLogger ", exception);
		}
		return logger;
	}
}
