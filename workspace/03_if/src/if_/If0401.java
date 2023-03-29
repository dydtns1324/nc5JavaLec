package if_;

import java.util.Random;
import java.util.Scanner;

public class If0401 {

	public static void main(String[] args) {
		
		// int a = (int)(Math.random()*100+1); // 1~100
		
		Random r = new Random();
		Scanner scan= new Scanner(System.in); //생성	
		
		int a = r.nextInt(100) + 1; //1~100
		int b = r.nextInt(100) + 1;
		
		
		System.out.print(a + "+" + b + "=");
		int dab = scan.nextInt();
	
		
		if(dab==a+b) System.out.println("딩동댕");
		else System.out.println("틀렸다..정답은" + (a+b));


	}

}

/*
[문제] 합 맞추기 프로그램
- 1 ~ 100 사이에 난수를 2개(a, b) 발생한다.
- 난수를 보고 합을 입력한다
- 맞으면 "딩동댕" , 틀리면 "틀렸다... 정답은"

[실행결과]
a     b    dab
36 + 78 = 100
틀렸다.. 정답은 114
------------------
a     b
12 + 50 = 62
딩동댕
*/