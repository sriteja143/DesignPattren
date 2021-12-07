package com.constructional.factory;

public class GoldLoan extends Loan {

	@Override
	void getRate() {
		intrestRate = 8;
	}

	@Override
	void setTimeInMonths(int time) {
		timeInMonths=time;
	}

}
