package if_;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //생성
		
		
		System.out.print("a의 값을 입력 : ");
		int a= scan.nextInt();
		System.out.print("b의 값을 입력 : ");
		int b= scan.nextInt();
		
		String result = a>b ? "큰값 = " + a : "큰값 = " + b ;
		System.out.println(result);
	}

}
/*
 */
[문제] 2개의 값을 입력하여 큰값을 출력하시오

[실행결과]
a의 값을 입력 : 25
b의 값을 입력 : 36
큰값 = 36
-----------------
a의 값을 입력 : 55
b의 값을 입력 : 30
큰값 = 55
*/