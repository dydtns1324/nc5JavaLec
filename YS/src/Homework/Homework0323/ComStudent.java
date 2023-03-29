package Homework.Homework0323;

import java.util.Scanner;

public class ComStudent extends CommonStat{
	
	    int studentNumber;
	    StringBuffer name;
	    String department;
	    String[] subject = new String[3];
	     int[] finalExam = new int[3];
	  
	
	
	
	public void saveInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번 : ");	
		studentNumber = sc.nextInt();
		
		System.out.println("이름 : ");
		name = new StringBuffer(sc.next());
		
		System.out.println("학과 : ");
	    department = sc.next();
								
		
	}
	
	public void printInfo() {
		
		System.out.println("학번 : " + studentNumber);
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + department);
	    
		
	}
	
	public double getAvg() {
		
		return 0;
	}
	
	public void searchStudentInfo(int studentNumber) {		
		
		}
    		
    	
     }




