package com.constructional.factory;

public class HomeLoan extends Loan {

	@Override
	void getRate() {
		intrestRate = 6;
	}

	@Override
	void setTimeInMonths(int time) {
		timeInMonths=time;
	}

}
