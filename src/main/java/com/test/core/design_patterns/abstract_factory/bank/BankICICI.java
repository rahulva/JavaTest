package com.test.core.design_patterns.abstract_factory.bank;

public class BankICICI implements Bank {

	private final String BNAME;

	BankICICI() {
		BNAME = "ICICI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
