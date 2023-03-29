package chap07_inherit.Animal;

import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Whale whale = new Whale("크릴","흰색", false, 10, 25, 0 , false);
		Bear bear = new Bear(12 ,5 ,4 ,false ,"고기","갈색","공격성이있다");
			
		
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("동물을 선택하세요");
            System.out.println("1. 고래");
            System.out.println("2. 곰");
            System.out.println("3. 호랑이");
            System.out.println("8. 종료");
            
          
	        	       
	        int number = 0;
	        while (number != 8) {
	           
	            number = sc.nextInt();

	            switch (number) {
	                case 1:	               
	                	whale.printWhaleInfo(whale);
	                    whale.whalelife();

	                    System.out.println("고래 게임을 시작하시려면 5를 입력하세요");
		
                      	   break;
                      
	                 case 2:
		                 System.out.println("곰의 정보 입니다.");
		                 bear.printBearInfo(bear);
		                 break;
		                  
	                 case 5: whale.whaleGame();	                         
	                      }  
	                         
	                     
                             
	                 }
	        }
	}




	        
	                    			
	


	
	
	

	
