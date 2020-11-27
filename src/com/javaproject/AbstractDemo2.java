package com.javaproject;

public class AbstractDemo2 extends AbstractDemo{

	@Override
	void bank() {
		System.out.println("worst bank in the world");		
	}
	public static void main(String[] args) {
		AbstractDemo ob = new AbstractDemo2();
		ob.bank();
		ob.loan();
		ob.creditCard();
		
		
	}

}
