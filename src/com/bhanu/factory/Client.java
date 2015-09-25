package com.bhanu.factory;

import java.util.logging.Level;

public class Client {

	static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Client.class.getName());

	public static void main(String[] args) {

		try {
			Logger logger = LoggerFactory.getInststance().getLogger("Tesr");
			logger.log();
		} catch (Exception exception) {
			logger.log(Level.SEVERE, "Exception in logger ", exception);
		}
	}
}
