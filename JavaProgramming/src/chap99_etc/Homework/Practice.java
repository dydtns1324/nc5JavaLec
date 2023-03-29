package chap99_etc.Homework;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
//		String str = "dBEfIZ";
//		
//		String result = "";
//		
//		
//		for (int i = str.length() -1; i >= 0; i--) {
//			
//			char ch = str.charAt(i);
//			
//		
//			
//		 if( str.charAt(i) == 'Z' ) {
//				
//			 result += 'a';
//																			
//	}    else if (str.charAt(i) == 'I') {
//		
//		     result += 'j'; 
//		        
//	}    else if (str.charAt(i) == 'f')
//		
//		     result += 'E';
//		
//		 else if (str.charAt(i) == 'E') {
//				
//			 result += 'f';
//			 
//	}    else if (str.charAt(i) == 'B') {
//				
//			 result += 'c';
//	}    else
//		
//			 result += 'C';				
//	
//}
//		
//		System.out.println(result);
        
		
//		String str = "가A나B다C라D";
//		char ch;
//		int kCnt = 0;
//		int eCnt = 0;
//		
//		for (int i = 0; i < str.length(); i++){
//			ch = str.charAt(i);
//			
//		if(ch >=44032 && ch <=55203) {				 
//			kCnt++;
//		}else if ( ch >= 32 && ch <= 126) {
//			eCnt++;						
//									
//			}
//		
//				
//		} 
//		
//	        System.out.println(kCnt + eCnt);
//		 
//		
//		
         Scanner sc = new Scanner(System.in);
         int H = sc.nextInt();
         int M = sc.nextInt();
         
         if ( M < 45) {
             H = H - 1;
             M = 60 - (45 - M);
             
        	 if (H < 0) {
        		 H = 23;
        		 
        	 }
        	 System.out.println(H + " " + M);
        	 
       	 } else {
       		 System.out.println(H);
       	 }
        
         }
           
       	 
       	  
     }
         
    
		
		
	



