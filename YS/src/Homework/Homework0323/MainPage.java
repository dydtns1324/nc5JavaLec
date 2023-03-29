package Homework.Homework0323;

import java.util.Scanner;

public class MainPage {
	
	  Scanner sc = new Scanner(System.in);
	  ComStudent com = new ComStudent();
	  InputSubject subject = new InputSubject();
	
	 public void firstPage() {
		System.out.println("-------학적관리-------");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 검색");
		System.out.println("3. 학생 정보 전체출력");
		System.out.println("4. 학과별 성적 순위");
		System.out.println("5. 종료");
		
	}
	     
		 
		  
		  public void inputInfoPage() {
		
	               		 		   		   	     
	       System.out.println("------학생정보 입력------");
	       System.out.println("1. 기본정보 입력");
	       System.out.println("2. 과목정보 입력");
	    
	     int input = sc.nextInt();
	     
	     
	     switch(input) {
	     case 1 : 
	    	 System.out.println("-----기본정보 입력------");
	    	 com.saveInfo();
	    	 break;
	    	 
	     case 2 :
	    	 System.out.println("-----과목정보 입력------");
	    	 subject.inputSubjectInfo();
	    	 break;
	     
	      }
	              	 
	    } 
		
		
		

	}

