package com.guru99.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class Readconfig {
	
	Properties pro;
	public  Readconfig()
	{
		File src= new File("./Configuration/Config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
			
		}
		
	}
	
	public String getApplicationUrl()
	{
		String url=pro.getProperty("url");
		return url;
		
	}
	public String username()
	{
		String username=pro.getProperty("username");
		return username;
		
	}
	public String password()
	{
		String pasw=pro.getProperty("password");
		return pasw;
		
	}
	public String invalid_username() {
		String invalid_user=pro.getProperty("invalid_username");
		return invalid_user;
	}
	public String invalid_password() {
		String invalid_pass=pro.getProperty("invalid_password");
		return invalid_pass;
	}
    public String getExtensionUrl()
    {
    	String extension_url=pro.getProperty("extension_url");
    	return extension_url;
    }
}
