package Homework.Homework0323;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		MainPage main = new MainPage();
		
		CommonStat com = new ComStudent();		
		
		InputStudentInfo stuInfo = new InputStudentInfo();
		
		main.firstPage();
		
		while(true) {
			
	    int input = sc.nextInt();
	    
		switch(input) {
		
		case 1 : main.inputInfoPage();
		break;
		
			
		
		case 2 : stuInfo.searchStudentInfo();
		break;
		
		case 3 : 
		}
		
			
		
		
		
	}

  }
}
