package com.Adactine_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	public Configuration_Reader() throws IOException {
		File f = new File("C:\\Users\\subaa\\eclipse-workspace\\Adactine_Project\\"
				+ "src\\test\\java\\com\\Adactine_Project\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String get_Url() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String uname = p.getProperty("username");
		return uname;
	}
	
	public String getPassword() {
		String passcode = p.getProperty("password");
		return passcode;
	}
	
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String getBillingaddress() {
		String billaddress = p.getProperty("billingaddress");
		return billaddress;
	}
	
	public String getCreditcardno() {
		String ccno = p.getProperty("creditcardno");
		return ccno;
	}
	
	public String getCvvno() {
		String cvvno = p.getProperty("cvvnumber");
		return cvvno;
	}
	
}
