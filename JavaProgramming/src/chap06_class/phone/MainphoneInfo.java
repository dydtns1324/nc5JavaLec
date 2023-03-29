package chap06_class.phone;

import java.util.Scanner;

public class MainphoneInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneInfo phone = new PhoneInfo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----연락처를 입력하세요-----");	
		System.out.println("1. 연락처 입력하기");
		System.out.println("2. 저장된 연락처 목록 출력");
		System.out.println("3. 출력할 연락처 목록번호 ");
	    System.out.println("4. 종료");
		
		
		while(true) {
		
	
		int choice = sc.nextInt();
		
		
		if( choice == 1) {
			System.out.println ("  이름과 번호를 입력하세요   ");	

		
			
			String name = sc.next();
			String number = sc.next();
			phone.insertPhoneNum(name , number);			
					
	
		
	}   else if (choice == 2) {
		
	
		System.out.println("저장된 목록");
		
		phone.printAllPhoneNum();
		
	}   
	    else if(choice == 3) {
		System.out.println("출력할 정보의 번호를 입력하세요");
		
		int index = sc.nextInt();		
		phone.printPhoneNum(index);
		

	   }else if(choice == 4) {
			    break;
	   }
	    else {
		   System.out.println("잘못 입력하셨습니다");
	   }
		
		
		
	
		
	 
	
     
}
}
}
