package Homework.Business;

public class hireYearMan extends BusinessMan{
		    

	    public hireYearMan(int businessNumber, String name, int pay, int type) {
		super(businessNumber, name, pay,type);
		
	   }
	    public void showEmployeeInfo() {
	    	System.out.println("********계약직********");
	    	System.out.println("사번 : " + businessNumber);
			System.out.println("이름 : " + name);
			System.out.println("연봉 : " + pay+"원");
	    		  	    	
	  }
		
		@Override
		public double getMonthDay() {
			
			salary = pay / 12;
			System.out.println(name + " 의 월급은 " + salary + "원입니다.");
			return salary;
			
			
	   
	}

		
		@Override
		public double finalPay() {
			salary = pay / 12;
			tax = (int)(salary * 0.13);
			total = salary - tax;
			System.out.println(name + "사원의 월급 계산 내역입니다.");
			System.out.println("급여 : " + salary);
			System.out.println("공제액 : " + tax);
			System.out.println("실 수령액 : " + total );
			return 0;
			

		}
	
		}


