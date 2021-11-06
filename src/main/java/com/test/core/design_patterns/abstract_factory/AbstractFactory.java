package com.test.core.design_patterns.abstract_factory;

import com.test.core.design_patterns.abstract_factory.bank.Bank;
import com.test.core.design_patterns.abstract_factory.loan.Loan;

public abstract class AbstractFactory {

	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}
