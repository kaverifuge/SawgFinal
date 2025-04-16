package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFileData {
	
	
	Properties p ; 
	
	public String readAppUrl() throws IOException {
		
		String filepath = System.getProperty("user.dir")+"//src//test//resources//Utils.properties";
		InputStream fis = new FileInputStream(filepath);
		p = new Properties();
		p.load(fis);
		String u = p.get("url").toString();
		return u;
		
	}
	
	public String readUsername() throws IOException {
		
		String filepath = System.getProperty("user.dir")+"//src//test//resources//Utils.properties";
		InputStream fis = new FileInputStream(filepath);
		p = new Properties();
		p.load(fis);
		String username = p.get("username").toString();
		return username;
		
	}
	
	public String readPassword() throws IOException {
		
		String filepath = System.getProperty("user.dir")+"//src//test//resources//Utils.properties";
		InputStream fis = new FileInputStream(filepath);
		p = new Properties();
		p.load(fis);
		String password = p.get("password").toString();
		return password;
		
	}
	
	public String readFirstname() throws IOException {
		
		String filepath = System.getProperty("user.dir")+"//src//test//resources//Utils.properties";
		InputStream fis = new FileInputStream(filepath);
		p = new Properties();
		p.load(fis);
		String firstname = p.get("firstname").toString();
		return firstname;
		
	}
	
	public String readLastname() throws IOException {
		
		String filepath = System.getProperty("user.dir")+"//src//test//resources//Utils.properties";
		InputStream fis = new FileInputStream(filepath);
		p = new Properties();
		p.load(fis);
		String lastname = p.get("lastname").toString();
		return lastname;
		
	}
	
	public String readZipcode() throws IOException {
		
		String filepath = System.getProperty("user.dir")+"//src//test//resources//Utils.properties";
		InputStream fis = new FileInputStream(filepath);
		p = new Properties();
		p.load(fis);
		String zipcode = p.get("zipcode").toString();
		return zipcode;
		
	}

}
