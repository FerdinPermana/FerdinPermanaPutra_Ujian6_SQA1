package com.juaracoding.wptesting.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.txt")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String userName;
	
	@Value("${emailaddress}")
	private String emailaddress;
	
	@Value("${passowrd}")
	private String password;
	
	@Value("${search}")
	private String search;
	
	@Value("${firstname}")
	private String firstname;
	
	@Value("${lastname}")
	private String lastname;
	
	@Value("${company}")
	private String company;
	
	@Value("${address}")
	private String address;
	
	@Value("${city}")
	private String city;
	
	@Value("${postcode}")
	private String postcode;
	
	@Value("${phone}")
	private String phone;
	
	@Value("${email}")
	private String email;

	public String getBrowser() {
		return browser;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public String getPassword() {
		return password;
	}

	public String getSearch() {
		return search;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getCompany() {
		return company;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

}
