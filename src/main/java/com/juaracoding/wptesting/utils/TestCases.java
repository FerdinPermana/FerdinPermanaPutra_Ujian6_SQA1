package com.juaracoding.wptesting.utils;

public enum TestCases {

//	T1("Testing Register"),
	T2("Login"),
	T3("Testing Add to Cart menu"),
	T4("Testing Proceed to Checkout");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
