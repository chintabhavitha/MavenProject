package tests;

import java.util.Properties;

import utilities.PropUtil;

public class ReadProperties {

	public static void main(String[] args) {

		Properties prop = PropUtil.readData("config.Properties");
		
		System.out.println(prop.getProperty("APP_URL"));

	}
}
