package chap99_etc.Homework;

import java.util.Random;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		//basic 
		//1.
		//10부터 1까지 거꾸로 while문으로 출력
		
//		int i = 10;
//		
//		while (i >= 1) {
//			System.out.println(i);
//			i--;
//		}
//		
//
//	}
//
//}      
		
		//2. 10부터 1까지 거꾸로 do while문으로 출력
		
//		int i = 10;
//		
//	 do {System.out.println(i);}
//		while ( --i >= 1 );
//	     
		
		
//		//3. 10부터 1까지 거꾸로 for문으로 출력
//		
//		for (int i = 10; i >= 1; i--) {
//			  
//			  System.out.println(i);
//		}
//		
//		
		 //4. 1~100까지 합을 while문으로 출력
//		int answer = 0;
//		int i = 1;
//		
//		while( i <= 100 ) {
//			answer += i;
//			i++;     
//        
//		}
//		 System.out.println(answer);
//		
		//5. 1~100까지의 합을 do while문으로 출력
		
//		 int answer = 0;
//		 int i = 1;
//		 
//		 do { answer += i ;
//		 } while (++i < 101);			
//			 
//			 System.out.println(answer);
//			 
		
		
		//6. 1~100까지의 합을 for문으로 출력
		
//		  int answer = 0;
//		  for(int i = 1; i < 101; i++) {
//			  answer += i;
//			  
//			  
//		  }System.out.println(answer);
		
		  
		
		
		  //middle 1.while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
		  //while문 내에 조건문을 넣어주면 됨
		  
//		  int i = 1;
//		  
//		  while(i <= 10 ) {		
//			  if(i % 2 == 0) {
//				 System.out.println(i);
//			    
//			     
//			  }  i++; 
//			     
			 
		
		
		   // 2. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고
		   //그 출력된 숫자들의 합을 구하시오
			 
//		 int sum = 0;
//		
//		 for(int i = 1; i < 1001; i++) {
//			 if(i % 14 == 0) {			 
//			 sum += i;
//			 
//			 }
//		 }    System.out.println(sum);
//				 
		
		   // 3. 구구단을 이렇게 출력하시오
		   // 2x1=2 3x1=3.... 9x1=9...
		   // 2x9=18....9x9=81
		
//          for( int i = 2; i <= 9; i++) {
//        	  for(int j = 1; j <= 9; j++) {
//        		  System.out.print(i + " * " + j + " = " + i * j + "\t");
//         }        System.out.println();
//          }
		
		
		    //4. 가위바위보 게임을 만드시오
		    //com 변수에 0~2까지의 랜덤값을 발생시킨후
		    //(0:가위, 1:바위 , 2:보)
		    //사용자가 가위,바위,보를 입력하여 com과의 승무패를 출력하시오
		  
	
		  
		  Scanner sc = new Scanner(System.in);
		  
		  Random R = new Random();
		
		  int computerChoice = R.nextInt(3);
		  
		  String myChoice = sc.next();
		  
	//	  System.out.println(computerChoice);
		  
		  System.out.println("가위,바위,보 중 하나를 입력하세요");
		  
		 if( myChoice.equals("가위")) {
			 System.out.println("비겼습니다!!");
		 }
		  
	}
	
	
	
}
		
		 
		
		


