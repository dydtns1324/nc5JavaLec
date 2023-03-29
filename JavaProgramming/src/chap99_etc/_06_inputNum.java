package chap99_etc;

import java.util.Random;
import java.util.Scanner;

public class _06_inputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("1~200사이의 숫자를 입력하세요. : ");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		//컴퓨터는 변수에 1~200 랜덤값
//		
//		Random R = new Random();
//		int com = R.nextInt(200) + 1;
//		System.out.println(com);
//
//        while (true) {
//            int user = sc.nextInt();
//            if( user == 201) {
//            	System.out.println("잘못입력하셨습니다. 게임을 종료합니다");
//            	break;
//            }   
//            if (user == com) {
//                System.out.println("맞췄습니다.");
//                System.out.println("게임을 계속 하시겠습니까? (Yes: 1, No: 0)");
//                
//                int newGame = sc.nextInt();
//                
//                if (newGame == 1) {
//                    System.out.println("새로운 게임을 시작합니다.");
//                    com = R.nextInt(200) + 1;
//                    System.out.println("1~200 사이의 숫자를 입력하세요:");
//                    System.out.println(com);
//                    continue;
//                } else if (newGame == 0) {
//                    System.out.println("게임을 종료합니다.");
//                    break;
//                }
//            } else if (user < com) {
//                System.out.println("틀렸습니다!");
//            } else {
//            	System.out.println("틀렸습니다!");
//            }
//            }
//        
//
//        sc.close();
//    }
//
//}
//		
	    
			
		
		//사용자 입력 정수 받기 nextInt}
		//201이면 while문 종료
		//com == input
	    //맞췄습니다.
		//계속 하시겠습니까?
		//1 => com=새로운 1~200까지의 난수, 다시 게임 시작
		//0 => 게임종료
        
			
		//틀렸습니다. 다시 입력하세요
		//입력값 다시 받도록
		System.out.println("500~2500까지의 숫자중 하나를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		
		Random R = new Random();
		int com = R.nextInt(2000) + 500;
		System.out.println(com);
		
		while(true) {
			int my = sc.nextInt();
			if(com == my) {
			System.out.println("맞췄습니다!! 게임을 계속 하시겠습니까? Yes : 1 No : 0");										
						
			} else if(my < com) { 
				System.out.println("틀렸습니다!!");
			 
			} else if(my > com) {
				System.out.println("틀렸습니다!!");
				
			}
				
								
		     int newgame = sc.nextInt();	
		     
			 if(newgame == 1) {				
				System.out.println("게임을 시작합니다. 500~2500 사이의 값을 맞춰보시오");
			} else if(newgame == 0) {
				System.out.println("게임을 종료합니다.");
			}
			}
			
	
	
	}
}
		
	


	

	
		
	
