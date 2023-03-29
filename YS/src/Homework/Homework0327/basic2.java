package Homework.Homework0327;

import java.util.LinkedList;
import java.util.Scanner;

public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		LinkedList<Integer> list = new LinkedList<>();
						
		for ( int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			list.add(input);						
		}
		    list.set(3, 100);
		    list.set(4, 200);
		    System.out.println(list);										
	}

}
