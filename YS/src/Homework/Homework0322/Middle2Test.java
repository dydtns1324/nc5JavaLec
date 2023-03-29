package Homework.Homework0322;

import java.util.Scanner;

import Homework.Business.BusinessMan;
import Homework.Business.bonusMan;
import Homework.Business.hireYearMan;
import Homework.Business.workDayMan;

public class Middle2Test {

	
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		
		 
	   BusinessMan hireyear = new hireYearMan(1000, "John", 30000000);
	   BusinessMan bonusman = new bonusMan(2000, "Tony", 67500000 , 12000000);
	   BusinessMan workday = new workDayMan(3000, "Kang ", 85000, 20);
	   
	   
	   System.out.println("*** 메뉴 선택 ***");
	   System.out.println("1. 정규직 저장");
	   System.out.println("2. 임시직 저장");
	   System.out.println("3. 계약직 저장");
	   System.out.println("4. 전체 정보 출력");
	   System.out.println("5. 월급 계산 출력");
	   System.out.println("6. 프로그램 종료");
	   
	   
	  
	      
	     
	  while(true)  {	
		 
		   int input = sc.nextInt();
		  switch(input) {
		 
		    case 1 :
			  		  
		       bonusman.showEmployeeInfo();
		       bonusman.getMonthDay();
		  		break;
		  		
		    case 2 :    
		    	
		       hireyear.showEmployeeInfo();
	           hireyear.getMonthDay();
	            break;
	   	   	   
		    case 3 : 
		    	
		       workday.showEmployeeInfo();
	           workday.getMonthDay();
	            break;
	           
		    case 4 :
		    	
		       bonusman.showEmployeeInfo();
			   bonusman.getMonthDay();
			   
			   System.out.println("-----------------------");
			   
			   hireyear.showEmployeeInfo();
			   hireyear.getMonthDay();
			   
			   System.out.println("-----------------------");
			   
			   workday.showEmployeeInfo();
			   workday.getMonthDay();
		        break;
		       
		    case 5 : 
		    	
		       hireyear.finalPay();
		       System.out.println("----------------------");
		       workday.finalPay();
		       System.out.println("----------------------");
		       bonusman.finalPay();
		       break;
		       
		    case 6 : 
		    	System.out.println("프로그램을 종료합니다");
		    	System.exit(0);
		    	
		    default :
		    	System.out.println("잘못된 입력입니다.");
		    	
		  }
	  }
	
	}
}
