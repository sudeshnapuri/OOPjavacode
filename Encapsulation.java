package com.qa.qacommunity3;

public class Encapsulation {

	private String memorableWord;
	private int passportNumber;
	private double bankBalance;
	private float savingsBalance;
	private long accountNumber;
	
	
//	GETTERS
	public String getMemorableWord() {
		return memorableWord;
	}
	
	public int getPassportNumber() {
		return passportNumber;
	}
	
	public double getBankBalance() {
		return bankBalance;
	}
	
	public float getSavingsBalance() {
		return savingsBalance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	
//	SETTERS
	public void setMemorableWord(String memorableWord) {
		this.memorableWord = memorableWord;
	}
	
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	public void setSavingsBalance(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
// CONSTRUCTORS
	public Encapsulation(String memorableWord, int passportNumber, double bankBalance, float savingsBalance,
			long accountNumber) {
		super();
		this.memorableWord = memorableWord;
		this.passportNumber = passportNumber;
		this.bankBalance = bankBalance;
		this.savingsBalance = savingsBalance;
		this.accountNumber = accountNumber;
	}

	public Encapsulation() {
		super();
	}
	
//	TOSTRING METHOD
	@Override
	public String toString() {
		return "Encapsulation [memorableWord=" + memorableWord + ", passportNumber=" + passportNumber + ", bankBalance="
				+ bankBalance + ", savingsBalance=" + savingsBalance + ", accountNumber=" + accountNumber + "]";
	}
		
}
