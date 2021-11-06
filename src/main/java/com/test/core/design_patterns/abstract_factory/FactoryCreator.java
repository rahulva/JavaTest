package com.test.core.design_patterns.abstract_factory;

import com.test.core.design_patterns.abstract_factory.bank.BankFactory;
import com.test.core.design_patterns.abstract_factory.loan.LoanFactory;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		} else if (choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}

}
