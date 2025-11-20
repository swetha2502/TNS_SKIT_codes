package com.codes;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		Payment payment;
		
		payment= new UpiPayment();
		payment.makePayment();
		
		
		payment=new CardPayment();
		payment.makePayment();
	}

}
