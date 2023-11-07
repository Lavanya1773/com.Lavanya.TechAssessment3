package com.TechAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	
	String gender;
	String firstname;
	String lastname;
	String email;
	String password;
	String confirmpassword;
	
	public UtilityClass(){
		data();
	}
	
	public void data() {
		File file = new File("src/test/resources/data.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		gender = prop.getProperty("gender");
		firstname = prop.getProperty("firstName");
		lastname = prop.getProperty("lastName");	
		email = prop.getProperty("email");
		password = prop.getProperty("password");
		confirmpassword = prop.getProperty("confirmPassword");
	}


}
