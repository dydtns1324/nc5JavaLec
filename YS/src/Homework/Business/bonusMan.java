package Homework.Business;

public class bonusMan extends BusinessMan {
	
	    double bonus;
	    

	    public bonusMan(int businessNumber, String name, int pay, int bonus,int type) {
		super(businessNumber, name, pay,type);
		this.bonus = bonus;
		
		
	}

	    @Override
		public void showEmployeeInfo() {
	    	System.out.println("********정규직********");
	    	System.out.println("사번 : " + businessNumber);
			System.out.println("이름 : " + name);
			System.out.println("연봉 : " + pay+"원");
			
		}
	    
		@Override
		public double getMonthDay() {
			
		salary = (int) (pay / 12 + bonus / 12);
		
		System.out.println(name + " 의 월급은 " + salary + " 원 입니다.");
			
		return salary;					
					
	    
	  }

		@Override
		public double finalPay() {
			
			salary = (int) (pay / 12 + bonus / 12);
			tax = (int)(salary * 0.13);
			total = salary - tax;
			System.out.println(name + "사원의 월급 계산 내역입니다.");
			System.out.println("급여 : " + salary);
			System.out.println("공제액 : " + tax);
			System.out.println("실 수령액 : " + total );
			return 0;
			
		}
		

		

}
