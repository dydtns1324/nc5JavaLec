package Homework.Homework0323.Middle;

import java.util.Scanner;

public class Middle2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);					
		String str = "유용한 클래스는 많다. 다양한 라이브러리를 활용한다.";
		StringBuilder reversedStr = new StringBuilder(str).reverse();
		System.out.println(reversedStr);
							
			int N = sc.nextInt();
										
		    System.out.println(reversedStr.charAt(N));	
		
		
	}			
}


