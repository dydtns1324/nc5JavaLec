package Homework.Homework0323;

import java.util.Scanner;

public class InputStudentInfo {
	  Scanner sc = new Scanner(System.in);
	  ComStudent com = new ComStudent();
	  InputSubject subject = new InputSubject();
	  
	public void inputInfoPage() {
	
               
	   ComStudent com = new ComStudent();
	   InputSubject subject = new InputSubject();
	   
	   
       //Scanner sc = new Scanner(System.in);
       System.out.println("------학생정보 입력------");
       System.out.println("1. 기본정보 입력");
       System.out.println("2. 과목정보 입력");
    
     int input = sc.nextInt();
     
     
     switch(input) {
     case 1 : 
    	 System.out.println("-----기본정보 입력------");
    	 com.saveInfo();

     case 2 :
    	 System.out.println("-----과목정보 입력------");
    	 subject.inputSubjectInfo();
     
     
     }
              	 
    } 
	
	public void searchStudentInfo() {
		    System.out.println("검색할 학생의 학번을 입력하세요");
		    int studentNumber = sc.nextInt();
		    
		    if (com.studentNumber == studentNumber) {
		        com.printInfo();
		    } else {
		        System.out.println("해당 학생 정보를 찾을 수 없습니다.");
		    }
		}


}









