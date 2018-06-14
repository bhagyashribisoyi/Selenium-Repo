package com.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproprtyfile {

	public static void main(String[] args) throws IOException {
		
		Properties po=new Properties();
		FileInputStream file=new FileInputStream("D:\\selenium framework\\FreeCrmMavenproject\\src\\main\\java\\com\\crm\\qa\\configEnvironment\\config.properties");
	    po.load(file);
	   System.out.println( po.getProperty("name"));
	}

}
