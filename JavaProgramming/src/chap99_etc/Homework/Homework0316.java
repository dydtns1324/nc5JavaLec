package chap99_etc.Homework;

import java.util.Random;

public class Homework0316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Basic 1번문제
//		int[] arr = new int[10];
//		
//		
//		
//		
//		for(int i =0; i < arr.length; i++) {
//			arr[i] = (i + 1) * 3;
//		}
//			
//		for(int i = arr.length -1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
//	}
//}
		
		
		  // Basic 2번문제
		
//		 int[] arr = new int[10];
//		 
//		 Scanner sc = new Scanner(System.in);
//		 
//		 int answer = 0;
//		 
//		 for( int i = 0; i < arr.length; i++) {
//			 arr[i] = sc.nextInt();
//			 answer += arr[i];
//			System.out.println(answer);
//			
//		 }
//		
//	}
//}     
		  // Basic 3번문제
		
//		int[] arr = new int[10];
//		
//		Random R = new Random();
//		
//		int answer = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//		 arr[i] = R.nextInt(10) + 1 ;
//		 answer += arr[i];
//		 
//		}
//		System.out.println(answer);
//		
//	}
//}  		
		
		// Basic 4번문제
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = new int[10];
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();		
//			     
//		    			
//		}for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 5 == 0) {
//				System.out.println(arr[i]);
//			}
//		}
//			
//		}
//		
//		
//		
//		
//	}
//	  
		
		  // Middle 1번문제
		
		 int[] arr = new int[20];
		 
		 Random R = new Random();
		 
		 
		 for( int i = 0; i < arr.length ; i++) {
			  			 
			 arr[i] = R.nextInt(101);
			 
			//System.out.println(arr[i]);	 
			 System.out.println(arr[i] + " 저장된 난수 ");
			 
		 }for( int i = 0; i < arr.length; i++) {
			 if ( i % 2 == 0) {
				 System.out.println(arr[arr.length - i - 1] + " 인덱스가 홀수 ");
			 }else {
				 System.out.println(arr[i] +  " 인덱스가 짝수  ");
			 }
		 }
		  
			 
		}
	}
	
		  	//Middle 2번 문제
		

