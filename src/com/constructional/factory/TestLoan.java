package com.constructional.factory;

public class TestLoan {
	public static void main(String[] args) {
		Loan loan = new HomeLoan();
		loan.getRate();
		loan.setTimeInMonths(12);
		loan.calculateAmount(100000);
		System.out.println(loan.intrestRate);
		
		
		System.out.println("=============================================");
		
		Loan goldloan = new GoldLoan();
		goldloan.getRate();
		goldloan.setTimeInMonths(12);
		goldloan.calculateAmount(100000);
	}
}
