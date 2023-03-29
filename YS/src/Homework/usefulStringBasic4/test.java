package Homework.usefulStringBasic4;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String contain = sc.next();
            
        	if(str.contains(contain)) {
        		System.out.println("사용자가 입력한 " + str +"는 " + contain +"를 포함합니다");
        		
         } else {
        	    System.out.println("포함하지 않습니다.");
      }         	
   }
}


