package Homework.Homework0322;

import java.util.Arrays;
import java.util.Scanner;

public class Advanced1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] charArrays = str.toCharArray();
		
		Arrays.sort(charArrays);
		
		String str2 = new String(charArrays);
		
		System.out.println(str2);
		
			
			
			
		}
		
		
	}


