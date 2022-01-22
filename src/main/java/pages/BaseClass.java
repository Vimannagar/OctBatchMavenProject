package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass {
	
	Properties prop ;
	FileInputStream fis;
	String path;
	public  BaseClass() throws IOException
	{
		 prop =new Properties();
		 path = System.getProperty("user.dir")+"\\config.properties";
		
		fis = new FileInputStream(path);
		prop.load(fis);
	}

}
