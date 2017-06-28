package com.demoqa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Loadplaceholder {
	
	//Methods for getting placeholder values
	public static Map<String, String> getproperties() {
		Properties prop=new Properties();
		FileInputStream fis=null;
		Map<String, String> propmap=new HashMap<String, String>();
		
		try {
			fis=new FileInputStream("./resource/config.properties");
			prop.load(fis);
			System.out.println("Loading properties file");
			for (String key : prop.stringPropertyNames()) {
				propmap.put(key, prop.getProperty(key));
				//System.out.print(propmap);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		return propmap;
	}
	
//	public static void main(String[] args) {
//		Map<String,String> mp=Loadplaceholder.getproperties();
//		System.out.println(mp);
//	}
}
