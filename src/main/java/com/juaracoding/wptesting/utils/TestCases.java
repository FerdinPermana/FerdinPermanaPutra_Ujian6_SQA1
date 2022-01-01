package com.juaracoding.wptesting.utils;

public enum TestCases {

	T1("1. Login"),
	T2("2. AddCart product");
//	T3("3. AddCart Glass product")
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
