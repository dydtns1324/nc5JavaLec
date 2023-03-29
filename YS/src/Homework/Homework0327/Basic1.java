package Homework.Homework0327;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);						
		ArrayList<Integer> list = new ArrayList<>(); 
			
		for ( int i = 0; i < 5; i++) {			
			int input = sc.nextInt(); // 반드시 for문 안에있어야 입력을 반복함
			list.add(input);			
		}		
		System.out.println(list);
	}

}
