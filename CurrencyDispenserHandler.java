package com.servlet.cor.atm;

public abstract class CurrencyDispenserHandler {
protected CurrencyDispenserHandler nextDispensor;
	
	public void setNextDispender (CurrencyDispenserHandler nextDispensor) {
		this.nextDispensor = nextDispensor;
	}
	
	public abstract void dispense (WithdrawalAmount amount);
}
