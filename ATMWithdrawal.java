package com.servlet.cor.atm;

public class ATMWithdrawal {
	protected static CurrencyDispenserHandler hundredDispender = new HundredDispender();
	protected static CurrencyDispenserHandler fiveHundredDispender = new FiveHundredDispender();
	protected static CurrencyDispenserHandler remainderDispender = new Remainder();
	protected static CurrencyDispenserHandler dispanserChain;

	static {
		fiveHundredDispender.setNextDispender(hundredDispender);
		hundredDispender.setNextDispender(remainderDispender);
		dispanserChain = fiveHundredDispender;	
	}
	
    public static void withdraw(WithdrawalAmount amount){
        if(amount != null){
            dispanserChain.dispense(amount);
        }
    }
    
    public static void main(String args[]) {
    	withdraw(new WithdrawalAmount(2100));
    }
}
