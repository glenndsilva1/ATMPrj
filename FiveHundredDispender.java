package com.servlet.cor.atm;

public class FiveHundredDispender extends CurrencyDispenserHandler {
	public FiveHundredDispender() {
		super();
	}

	@Override
	public void dispense(WithdrawalAmount withdraw) {
		if (withdraw != null) {
			double amount = withdraw.getAmount();
			double remainder = amount;

			if(amount >= 500){
				int count = (int) (amount / 500);
				remainder = amount % 500;
				System.out.printf("Dispensing '%d' Rs.500 currency notes.\n", count);
			}

			if(remainder > 0 && this.nextDispensor != null) {
				this.nextDispensor.dispense(new WithdrawalAmount(remainder));
			}
		}

	}

}
