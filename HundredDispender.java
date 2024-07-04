package com.servlet.cor.atm;

public class HundredDispender extends CurrencyDispenserHandler {
	public HundredDispender() {
		super();
	}
	@Override
	public void dispense(WithdrawalAmount curr) {
		if(curr != null) {
			double amount = curr.getAmount();
			double remainder = amount;

			if(amount >= 100) {
				int count = (int) (amount / 100);
				remainder = amount % 100;
				System.out.printf("Dispensing '%d' Rs.100 currency notes.\n", count);
			}

			if(remainder > 0 && this.nextDispensor != null){
				this.nextDispensor.dispense(new WithdrawalAmount(remainder));
			}
		}
	}
}
