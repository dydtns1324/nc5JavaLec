package Homework.Homework0322;

import java.util.Scanner;

public class Basic1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.next();
		
		int middle = str.length() / 2;
		// System.out.println(middle);
		 
		if (str.length() % 2 == 0) {
		 System.out.println(str.charAt(middle - 1) + "" + str.charAt(middle));
		 
		}else {
		 System.out.println(str.charAt(middle));
		}
		
		
	}

}
