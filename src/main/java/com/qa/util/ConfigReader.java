package com.qa.util;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	
	private Properties prop;
	
	//case of encapsulation and this class used to load the config.properties file
	// return properties prop object
	public Properties init_prop(){
		prop=new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src//test//resources//config//config.properties");
			prop.load(ip);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop;
	}
}
