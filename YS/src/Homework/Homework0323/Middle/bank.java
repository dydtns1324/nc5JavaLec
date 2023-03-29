package Homework.Homework0323.Middle;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstMoney = 10000;
		
		double rate = 0.1;
		
		int years = 10;
		
		for ( int i = 1; i <= years; i++) {
			double rateMoney = firstMoney * rate;
			firstMoney += rateMoney;
			
		}
		
		System.out.println("10년후 복리이자 : " + firstMoney);
	}

}
