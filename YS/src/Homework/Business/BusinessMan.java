package Homework.Business;

public abstract class BusinessMan {
	   public int businessNumber;
	   public String name;
	   public int pay;
	   public int salary;
	   public int tax;
	   public int total;
	   public int type; // 1. 정규직 2. 계약직 3. 임시직
	   	 
	   public abstract double getMonthDay();
	   
	   public abstract void showEmployeeInfo();
	   
	   public abstract double finalPay();
	   	   
	   
	   public BusinessMan(int businessNumber, String name, int pay, int type) {
		   this.businessNumber = businessNumber;
		   this.name = name;
		   this.pay = pay;
		   this.type = type;
		   
		
		   
	 }

}
