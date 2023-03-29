package Homework.Homework0322;

import java.util.Scanner;

public class Advanced3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);
		   
		   StringBuilder builder = new StringBuilder(); // 스트링 빌더 객체생성인데 쓰면 굉장히 편하다고함
		   												// 알아두시면 좋을듯
		   
		   String str = sc.next();     // 문자열 입력값 선언
		   int number = sc.nextInt();  // 정수값 선언
		    
		
		
		   for(int i = 0; i < str.length(); i++) {
			  char ch = str.charAt(i);              // 문자열의 문자 확인
			  
			    if(Character.isUpperCase(ch)) { // 대문자인경우에
				  ch += number; // 입력받은 정수값만큼 증가
				  
				if(ch >= 'Z') {  // 'Z'보다 아스키코드값이 커지는 경우에
				   ch -= 26;     // Z의 아스키코드는 90, A의 아스키코드는 65이므로 25+1 = 26 값을 넣어줌 
				                 // (순환처리)
				}
			  
			  } else if(Character.isLowerCase(ch)) { // 소문자일때		  
				  ch -= number; // 입력받은 값만큼 정수 감소
				  
				if(ch <= 'a' ) {  // 'a' 보다 아스키코드값이 작아지는 경우
				   ch += 26;      // + 26을 넣어줌
				    		
				}  
				
		     }    builder.append(ch); // 위에있는 스트링빌더의 변수명.append(추가해줄문자열ch);
		      
			   	  
		}      System.out.println(builder.toString()); // 결과출력
	}	
}
