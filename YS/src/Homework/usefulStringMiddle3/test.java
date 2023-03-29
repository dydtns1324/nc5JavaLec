package Homework.usefulStringMiddle3;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(i % 3 == 0) {
			
			 System.out.println(ch = '3');
				
			}
			
			
			 System.out.println(ch);
		} 
		
		
	}

}
