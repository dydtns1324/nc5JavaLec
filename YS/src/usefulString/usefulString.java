package usefulString;

import java.util.Scanner;

public class usefulString {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	
		  str = str.replace  ("비", "")
	                 .replace("트", "")
	                 .replace("네", "")
	                 .replace("이", "")
	                 .replace("버", "")
	                 .replace("클", "")
	                 .replace("라", "")
	                 .replace("우", "")
	                 .replace("드", "");
	        
	        System.out.println(str);
	    }
	}