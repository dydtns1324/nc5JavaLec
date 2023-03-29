package if_;

import java.text.DecimalFormat;
import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //생성	
		
		String name = "홍길동"; // =String name = "홍길동";
		String position = "부장";
		int basepay = 4000000;
		int extrapay = 200000;
		int total = basepay + extrapay;
		
		int tax = (int)(basepay>=4000000 ? total*0.03 : total*0.02);
		int salary = total - tax;
		
		DecimalFormat df = new DecimalFormat(); //생성
		System.out.println("이름 입력 : " + name);
		System.out.println("직급 입력 : " + position);
		System.out.println("기본급 입력 : " + basepay);
		System.out.println("수당 입력 : " + extrapay);
		
		System.out.println("\t"+"*** "+name+"의 월급 명세서 ***"+"\t");
		System.out.println("직급 : " + position);
		System.out.println("기본급" + "\t" 
							+ "수당" + "\t" 
							+ "합계" + "\t" 
							+ "세금" + "\t"  
							+ "월급"  );
		System.out.println(basepay + "\t" 
							+ extrapay + "\t" 
							+ total + "\t" 
							+ tax + "\t"  
							+ salary  );

	}

}


/*
[문제] 월급 계산
- 이름, 직급, 기본급, 수당을 입력하여 합계, 세금과 월급을 계산하시오
- name, position, basePay, extraPay, total, tax, salary
- 세금은 기본급이 4백만원 이상이면 3%, 아니면 2%

합계 = 기본급 + 수당
세금 = 합계*0.03 또는 0.02
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4000000
수당 입력 : 200000


*** 홍길동 월급 명세서 ***
직급 : 부장
기본급		수당		합계		세금		월급
4000000		200000	4200000
*/