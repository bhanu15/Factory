package com.bhanu.factory;

public class XmlLogger implements Logger {

	@Override
	public void log() {
		// TODO Auto-generated method stub
		throw new IllegalStateException(" Xml Logger not implemented ");
	}

	public static void main(String[] args) {
		XmlLogger logger = new XmlLogger();
		logger.log();
	}
}
