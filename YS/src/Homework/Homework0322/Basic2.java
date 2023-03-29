package Homework.Homework0322;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int GaCount = 0;
		int BaCount = 0;
		int total = 0;
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
	      if(ch == '가') {
			GaCount++;
					 			
		} else if(ch == '바'){
			BaCount++;							 
	}		
}			 
		  total = BaCount + GaCount;
		  
		   if(total == 0) {
			  System.out.println("현재 문자열에서 '가' '바' 는 존재하지않습니다.");
		 } else {
		   	 	 		   
		   System.out.println("현재 문자열에서 '가' 의 개수는 "+ GaCount +"개 입니다.");
		   System.out.println("현재 문자열에서 '바' 의 개수는 "+ BaCount +"개 입니다.");
		   System.out.println("입력된 문자열에서 가와 바 개수의 합은 " + total + "개입니다.");
        }
    }
}