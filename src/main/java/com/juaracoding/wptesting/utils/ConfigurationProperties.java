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
	private String myusername;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${searchglass}")
	private String searchglass;
	
	@Value("${firstname}")
	private String firstname;
	
	@Value("${lastname}")
	private String lastname;
	
	@Value("${company}")
	private String company;
	
	@Value("${selectcountry}")
	private String selectcountry;
	
	@Value("${address1}")
	private String address1;
	
	@Value("${address2}")
	private String address2;
	
	@Value("${city}")
	private String city;
	
	@Value("${selectstate}")
	private String selectstate;
	
	@Value("${postcode}")
	private String postcode;
	
	@Value("${phone}")
	private String phone;
	
	@Value("${additional}")
	private String additional;
	
	
	
	public String getSearchGlass() {
		return searchglass;
	}
	
	public String getBrowser() {
		return browser;
	}
	
	public String getUsername() {
		return myusername;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
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
	
	public String getSelectCountry() {
		return selectcountry;
	}
	
	public String getAddress1() {
		return address1;
	}
	
	public String getAddress2() {
		return address2;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getSelectState() {
		return selectstate;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAdditional() {
		return additional;
	}

}
