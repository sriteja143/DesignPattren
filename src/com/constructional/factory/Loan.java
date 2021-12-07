package com.constructional.factory;

public abstract class Loan {

	protected double intrestRate;

	protected int timeInMonths ;

	abstract void getRate();
	abstract void setTimeInMonths(int time);

	public void calculateAmount(double amount) {
		System.out.println("amount      " + amount);
		System.out.println("timeInMonths      " + timeInMonths);
		System.out.println("intrestRate      " + intrestRate);
		System.out.println("Intrest amount  :: " + (amount * timeInMonths * (intrestRate / (100*12))));
	}

}
