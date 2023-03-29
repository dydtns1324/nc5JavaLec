package variable;

import java.text.DecimalFormat;

public class Salary {

	public static void main(String[] args) {
		
/* 이름이 L(name)인 사람의 기본급(basePay)이 2500000일때 3.3% 세금(tax)과 월급(salary)을 계산하시오.

세금 = 기본급 * 3.3%(0.033)
월급 = 기본급-세금

*** L의 월급 ***
기본급 : 2500000원
세금   : 82500원
월급   : 2417500원

 */
	char name = 'L'; // =String name = "L";
	int basepay = 2500000;
	int tax = (int) (basepay*0.033);
	int salary = basepay - tax;
	
	
	DecimalFormat df = new DecimalFormat(); //생성
	System.out.println("*** "+name+"의 월급 ***");
	System.out.println("기본급 : " + df.format(basepay) +"원");
	System.out.println("세금 : " + df.format(tax) +"원");
	System.out.println("월급 : " + df.format(salary) +"원");

    }
}