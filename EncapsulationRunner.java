package com.qa.qacommunity3;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
//		SET VALUES USING SETTERS
		
		Encapsulation example = new Encapsulation();
		example.setAccountNumber(1234567890);
		example.setBankBalance(2345.62);
		example.setMemorableWord("cookies");
		example.setPassportNumber(8765432);
		example.setSavingsBalance(567.43f);

//		USING GETTERS PRINT OUT VALUES

		System.out.println(example.getMemorableWord());
		System.out.println(example.getPassportNumber());
		System.out.println(example.getBankBalance());
		System.out.println(example.getSavingsBalance());
		System.out.println(example.getAccountNumber());

//		INVOKE TOSTRING METHOD
		
		System.out.println(example);
		
		}
}
	
