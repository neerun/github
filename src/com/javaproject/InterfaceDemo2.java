package com.javaproject;

public class InterfaceDemo2 implements  InterfaceDemo {

	@Override
	public void bank() {
		System.out.println("wells fargo bank is best bank in the world");
		
	}

	@Override
	public void loan() {
		System.out.println("best loan provide in banking sector");
	}
		public static void creditCard() {
			System.out.println("Best features");
	}
	public static void main(String[] args) {
		
		InterfaceDemo ob = new InterfaceDemo2 ();
		ob.bank();
		ob.loan();
		
		//InterfaceDemo2 obj = new InterfaceDemo2();
	//	obj.creditCard();
		
		InterfaceDemo2.creditCard();
		
	}

}
