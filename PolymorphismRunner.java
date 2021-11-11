package com.qa.qacommunity3;

public class PolymorphismRunner {
	
	public static void main(String[] args) {

	Milk milk = new Milk();
	System.out.println("==========MILK==========");
	milk.alternatives();
	milk.product();
	
	milk.healthy();
	milk.sources();
	
	
	Dairy dairyMilk = new Milk();
	System.out.println("==========DAIRY==========");
	((Milk)dairyMilk).alternatives();
	((Milk)dairyMilk).product();
	
	dairyMilk.healthy();
	dairyMilk.sources();
	
	
	
	Object objectMilk = new Milk();
	System.out.println("==========OBJECT==========");
	((Milk) objectMilk).alternatives();
	((Milk) objectMilk).product();
	
	((Milk) objectMilk).healthy();
	((Dairy) objectMilk).sources();
	
	
	}
}
