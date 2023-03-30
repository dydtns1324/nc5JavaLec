package Homework.Homework0329;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		Scanner sc = new Scanner(System.in);
//		for( int i = 0; i < 3; i++) {
//		String str = sc.next();
//		
//		System.out.println(str);
//		}	
//		
		//2.
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		char c = '/';
//		
//		
//		switch(c) {
//		case '+' : System.out.println(a + b);
//		break;
//		case '-' : System.out.println(a - b);
//		break;
//		case '*' : System.out.println(a * b);
//		break;
//		case '/' : System.out.println(a / b);
//		break;
//		default :
//			System.out.println("잘못된 연산자 입니다.");
//			
//		
//		}
		//3.
//		final double PI = 3.14;
//		
//		int harfCircle = 20;
//		double harfCircleweight = harfCircle*harfCircle*PI;
//		double harfCircleRound = 2*PI*harfCircle;
//		System.out.println(harfCircleweight);
//		System.out.println(harfCircleRound);
		
		//4.
//		double avg = 0.0;
//		int sum = 0;
//		
//		for(int i = 0; i < 5; i++) {
//			int input = sc.nextInt();
//			
//			sum += input;
//			avg = sum / 5;
//										
//		}										
//		System.out.println(sum);
//		System.out.println(avg);	
//	}
//
//}
		//5.
//		int n = sc.nextInt();
//		for (int i = n; i <= n; i++) {
//			for(int j = 1; j <= 9; j++) {
//								
//				System.out.println(i + "*" + j + " = " + i*j);	
//		}   
//	}     
		
		//6.
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//										
//		int max = a;
//		if( b > a)  
//			max = b;
//			
//	    if( c > b) 
//		    max = c;
//		 	   
//	    
//	    int min = b;
//	    if( a < b)   
//	    	min = a;
//	    
//	    if( a > c)
//	    	min = c;
//	       
//	    	    
//	    int center = b;	    
//	    if(max == a && min == b || max == b && min == a)
//	    	center = c;
//	    if(max == b && min == c || max == c && min == b)
//	    	center = a;
//		   
//			    
//	    System.out.println("최대값 : " + max);
//	    System.out.println("최소값 : " + min);
//	    System.out.println("중앙값 : " + center);
		
//		int n = sc.nextInt();//Integer.parseInt(sc.nextLine());
//		
//		long result = 1L;
//		
//		for( int i = 1; i <= n; i++) {
//			result = result * i;
//			System.out.println(result);
//		}
//		
		//8.
//		int count = 0;
//		for(int i = 0; i < 10; i++) {
//			int input = sc.nextInt();
//			if ( input < 2 || input > 30) {
//				System.out.println("잘못된 입력입니다.");	
//				continue;
//			}
//			boolean isPrime = true;
//	        for (int j = 2; j < input; j++) {
//	            if (input % j == 0) {
//	                isPrime = false;	                
//	                break;
//	            }
//	        }
//	        if(isPrime) {
//	        	count++;
//	        	
//	        }
//					  
//				
//		}
//		System.out.println("소수의 개수 : " + count);
		
		//형변환 1.
		
//		String a = sc.next();
//		String b = sc.next();
//		
//		
//		
//	    System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
//		
//		
		//형변환 2.
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		double result = a / b;
//		
//		System.out.println(result);
//		
		//형변환 3.
		
//		double a = sc.nextDouble();
//		
//		System.out.println((int)a);
		
		//형변환 4.
		
//		double a = sc.nextDouble();
//		
//		double result = a*a;
//		
//		System.out.println(String.valueOf(result));
//		
		//형변환 5.
		
//		int iNum = 10;
//		long lNum = 20;
//		
//		int plate = iNum; // 10을 미리담아놈
//		
//		iNum = (int)lNum; // inum에 20을 넣음
//		lNum = plate; // 담아놨던 10을 lnum에 넣음.
//					
//		System.out.println(iNum);
//		System.out.println(lNum);	
		
		//형변환 6.
		
//		String a = sc.next();
//		String b = sc.next();
//									
//		char c = a.charAt(0);
//		char d = b.charAt(0);
//		
//		System.out.println("첫번째 문자의 유니코드값 : " + (int)c);
//		System.out.println("두번째 문자의 유니코드값 : " + (int)d);
//		
		
		
		//연산자1.
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
		
		//연산자2.
//		int a = 20;
//		
//		System.out.println(++a);
//		System.out.println(++a);
//		System.out.println(a);
//		System.out.println(a--);
//		System.out.println(--a);
//		System.out.println(a--);
//		System.out.println(a++);
//		System.out.println(a);
		
		//연산자3.
						
//		for(int i = 0; i < 5; i++) {
//		int input = sc.nextInt();
//		if(input % 14 == 0) {
//			System.out.println("2와 7의 공배수입니다.");
//		}else {
//			System.out.println("2와 7의 공배수가 아닙니다.");
//		}
//		
//		}
		
		//연산자4.
		
//		String str = "Hello";
//		String input = sc.next();
//		
//		if(input.equals(str)){
//			System.out.println("사용자가 입력한 문자열과 Hello가 일치합니다.");
//			
//		}else {
//			System.out.println("사용자가 입력한 문자열과 Hello가 일치하지 않습니다");
//		}
//		
		
		//연산자5.
						
//		for(int i = 0; i < 5; i++) {
//		int a = sc.nextInt();
//		String str = a % 2 == 0 ? "짝수" : "홀수";
//		
//		System.out.println(str);
//		}		
		
		//연산자6.
		
//		for(int i = 0; i < 5; i++) {				
//		int a = sc.nextInt();
//		
//		String str = a > 100 ? "100보다 큼" : a < 100 ? "100보다 작음" :
//			"100과 같음";
//		System.out.println(str);
//		}
		
		//연산자7.
		
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);	
		
		//연산자8.
//		String str = sc.next();
//		int a = sc.nextInt();
//		
//		System.out.println("입력한 문자열은" + str + "이고");
//		System.out.println("입력한 숫자는 " + a + "입니다.");
//		
		
		//조건문1.
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if( a > b) {
//			System.out.println(a);
//		}else {
//			System.out.println(b);
//		}
		
		//조건문2.
		
//		int a = sc.nextInt();
//		
//		if ( a > 0) {
//			System.out.println("양수입니다.");
//		}
//		else if ( a == 0) {
//			System.out.println("양수도 음수도 아닌 숫자 0 입니다");
//		}
//		else {
//			System.out.println("음수입니다.");
//		}
		
		//조건문3.
//		while(true) {
//		
//		String str = sc.next();
//		
//		switch(str) {
//		case "Java" :
//			System.out.println("좋아하는 언어입니다.");
//			break;
//		case "Python" :
//			System.out.println("공부중인 언어입니다.");
//			break;
//			
//		case "종료" :
//			System.exit(0);
//			
//		default :
//			System.out.println("다른 언어를 입력하세요");
//			break;			
//		}
//	  }				
		
		//조건문4.
		
//		int a = sc.nextInt();
//		
//		int result = a % 3;
//		
//		
//		switch(result) {
//		case 0 : 
//			System.out.println("3의 배수입니다");
//			break;
//		default :
//			System.out.println("3의 배수가 아닙니다.");
//		}
			
		
		//조건문5.
//		int a = sc.nextInt();
//		
//		if ( a % 2 == 0) {
//			System.out.println("짝수입니다.");		
//		} else {
//			System.out.println("홀수입니다.");
//		}
		
		
		//조건문6.
				
//	   int[] intArr = new int[5];
//	   	  
//	   int max = intArr[0];
//	   for(int i = 0; i < intArr.length; i++) {
//		   int answer = sc.nextInt();
//		   intArr[i] = answer;
//		   
//	  
//	   for( int j = 1; j < intArr.length; j++) {
//		   if( intArr[j] > max) {
//			   max = intArr[j];
//		   }
//		   
//	     }
//	      		   		 		   		   	   
//	   }System.out.println(max); 
		
		
		//조건문7.
//		String str = sc.next();
//		
//		if(str.equals("Yes")) {
//			System.out.println("예");
//		}else if (str.equals("No")) {
//			System.out.println("아니오");
//		}else {
//			System.out.println("잘못입력하셨습니다.");
//		}
	   						
		//조건문8.
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if(a==b) {
//			System.out.println("두 수가 같습니다.");
//		}else if(a>b) {
//			System.out.println("첫번째 수가 더 큽니다.");
//		}else if(b>a) {
//			System.out.println("두번째 수가 더 큽니다.");
//		}else {
//			System.out.println("잘못된 입력입니다.");
//		}
//		
		
		//조건문9.
//		int jjacksu = 0;
//		int holsu = 0;
//
//		for(int i = 0; i < 3; i++) {
//			int a = sc.nextInt();
//		
//			if(a % 2 == 0) {				
//				jjacksu++;
//		   }else if(a % 2 != 0) {			    
//			    holsu++;
//		   }if (jjacksu == 3) {
//			   System.out.println("모두 짝수입니다.");
//		   }else if (holsu == 3) {
//			   System.out.println("모두 홀수입니다.");
//		   }
//		}				
//		  System.out.println("짝수의 개수 : " + jjacksu);
//		  System.out.println("홀수의 개수 : " + holsu);			
		
		//반복문1.
//		int sum = 0;
//		for(int i = 0; i <= 10; i++) {
//			sum += i;
//			
//			System.out.println(sum);
//		}
		
		//반복문2.
		
//		int a = 2;
//		int sum = 1;
//		for(int i = 0; i <= 10; i++) {
//			sum *= a;
//			System.out.println(sum);
//		}
		
		//반복문3.
		
//			int a = sc.nextInt();			
//	        for (int i = 2; i <= a; i++) {
//	        	boolean isPrime = true;
//	        	for(int j = 2; j <= i - 1; j++) {
//	        		
//	        	if (i % j == 0) {
//	        	     isPrime = false;
//	        	     break;	        		
//	        	}	        	
//	           }
//	        	if(isPrime) {
//	        		System.out.println(i);
//	        	}
//	        }
		
		//반복문4.
		
//		int n = sc.nextInt();
//
//		for(int i = 1; i <= n; i++){
//			if(n % i == 0){
//			System.out.println(n + "의 약수는 " + i);	
//		    }
//		}
		
		//반복문5.
		
//		int[] intArr = new int[10];
//		int[] reverseArr = new int[10];
//
//				
//		for (int i = 0; i < intArr.length; i++) {	
//			intArr[i] = sc.nextInt();
//		}
//		
//		for( int j = intArr.length - 1; j >= 0; j--) {			
//			reverseArr[j] = intArr[j];
//			System.out.println(reverseArr[j]);
//			
//		}
		
		//반복문6.
		
//		String str = sc.next();
//		String reverse = "";
//		
//		for( int i = str.length()-1; i >= 0; i--) {
//			reverse = reverse + str.charAt(i);
//			
//					
//		}System.out.println(reverse);
		
		//반복문7.
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int tempA = a;
//		int tempB = b;
//		
//		while( b != 0) {
//			int r = a % b;
//			a = b;
//			b = r;
//			
//		}
//		
//		int gcd = a;
//		int lcm = tempA * tempB / gcd;
//		
//		System.out.println(gcd + " " + lcm);
		
		//반복문8.
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 1; j <= i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
//		for ( int i = 0; i < 5; i++) {
//			for(int j = 2; j <= i+1; j++) {
//				System.out.print(" ");
//			}						
//		for ( int k = 4; k >= i; k--) {
//			System.out.print("*");
//				
//		    }
//		System.out.println(" ");
	
		
		//반복문9.
		
//		String str = sc.next();
//		int sum = 0;
//		while(true) {
//			try {
//			int input = sc.nextInt();								
//			sum += input;
//			System.out.println(sum);						
//		}catch (InputMismatchException i) {
//			str = sc.next();
//			if(str.equals("q"))
//				System.exit(0);
//		    }						
//		  }
		
		int[] intArr = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
			
			if(intArr[i] % 2 == 0) {
			  sum += intArr[i];
		  }else if (intArr[i] % 2 != 0) {
			 i--;		
		  }
			System.out.println(sum);
		}		
	  }		
	} 		
					

				
	


			
	
			
 

