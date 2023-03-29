package Homework.Business;

public class workDayMan extends BusinessMan{
	
	    int workday;

	    public workDayMan(int businessNumber, String name, int pay , int workday, int type) {
		super(businessNumber, name, pay,type);
		this.workday = workday;
		
	}

	    
	    @Override
		public void showEmployeeInfo() {
	    	System.out.println("********임시직********");
	    	System.out.println("사번 : " + businessNumber);
			System.out.println("이름 : " + name);
			System.out.println("일급 : " + pay +"원");
		}
	    
		@Override
		public double getMonthDay() {
			 
			salary = pay * workday;
			
			System.out.println(name + "의 월급은 20일 근무 기준 " + salary + "원입니다.");
			
			return salary;
			
		}


		@Override
		public double finalPay() {
			salary = pay * workday;
			tax = (int)(salary * 0.13);
			total = salary - tax;
			System.out.println(name + "사원의 월급 계산 내역입니다.");
			System.out.println("1일 수당 :" + pay);
			System.out.println("월간 근무일수 :" + workday);
			System.out.println("급여 : " + salary);
			System.out.println("공제액 : " + tax);
			System.out.println("실 수령액 : " + total );
			return 0;
			
		}

		

}
