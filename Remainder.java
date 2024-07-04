package com.servlet.cor.atm;

public class Remainder extends CurrencyDispenserHandler {
	public Remainder() {
		super();
	}

	@Override
	public void dispense(WithdrawalAmount withdraw) {
			double amount = withdraw.getAmount();
			double remainder = amount;
			System.out.printf("Dispensing Remaining currency notes. " +  remainder);
	}
}
