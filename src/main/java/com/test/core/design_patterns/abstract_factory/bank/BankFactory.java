package com.test.core.design_patterns.abstract_factory.bank;

import com.test.core.design_patterns.abstract_factory.AbstractFactory;
import com.test.core.design_patterns.abstract_factory.loan.Loan;

/**
 * 
 * @author User
 *
 */
public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}

		if (bank.equalsIgnoreCase("HDFC")) {
			return new BankHDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new BankICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}

		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}

}// End of the BankFactory class.