package chap05_Array;

import java.util.Random;
import java.util.Scanner;

public class _04_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 String[] rsp = {"가위","바위","보"};
//		 
//		  char[] game = new char[10];
//		  
//		  Scanner sc = new Scanner(System.in);
//		 
//		  Random R = new Random();
//		  
//		  int com = R.nextInt(3);
//		 
//		  
//		  //가위,바위,보 10판진행
//		  //배열에 각 판의 승무패 저장
//		  //배열에 각 저장된 승,무,패를 세서 몇승 몇무 몇패인지 출력
//		  for(int i = 0; i <= 10; i++) {
//			  
//		  }
//		  System.out.println("가위,바위,보 중에서 하나를 입력하십시오.");
//		 
//		  
//		  while(true) {
//		   String me = sc.next();
//		   
//		    if(me.equals("그만")) {
//				  System.out.println("게임을 종료합니다");
//				  break;
//		    } 
//		    
//		      if(me.equals("가위")){
//		      if(com == 0) System.out.println("비겼습니다!");
//		    	else if (com == 1) System.out.println("졌습니다");
//		    	else if System.out.println("이겼습니다");
//		        
//	                 
//		    }else if(me.equals("바위")) {
//		    	if(com == 0) System.out.println("이겼습니다!");
//		    	else if (com == 1) System.out.println("비겼습니다!");
//		    	else System.out.println("졌습니다");
//		    }else if(me.equals("보")) {
//		    	if (com == 0) System.out.println("졌습니다");
//		    	else if (com == 1) System.out.println("이겼습니다");
//		    	
//		    	else System.out.println("비겼습니다!");
//		    }else {
//		    		System.out.println("잘못된 입력입니다.");
//		    		continue;
//		    	
//		  }  System.out.println("컴퓨터 : " + rsp[com]);
//		  }
//		  
//		     
//		   sc.close();
//	}    
//}
//           import java.util.Random;		
		 
		  //가위,바위,보 10판진행
		  //배열에 각 판의 승무패 저장
		  //배열에 각 저장된 승,무,패를 세서 몇승 몇무 몇패인지 출력
		        
				
				Scanner sc = new Scanner(System.in);
				Random R = new Random();
				
				int com = R.nextInt(3);
				char[] game = new char [10];
				
				
				System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
				
				int inputNum = 0;
				
				
						
				
					
                 	
               
               for(int i = 0; i < 10; i++) {         
            	String input = sc.nextLine();
                  
				if(input.equals("가위")) {
					inputNum = 0;
				} else if(input.equals("바위")) {
					inputNum = 1;
				} else if(input.equals("보")) {
					inputNum = 2;
				}
				
				if(com == inputNum) { 
					game[i] = 'd';
					System.out.println("비겼습니다.");
					
				}  else { game[i] = 'w';
					if((inputNum == 0 && com == 1) ||
						(inputNum == 1 && com == 0) ||
						(inputNum == 2 && com == 2)) {
						System.out.println("이겼습니다.");
					} else { game[i] = 'l';
						System.out.println("졌습니다.");
					}
				}
                } int wcnt = 0;
                  int dcnt = 0;
                  int lcnt = 0;
              for( int i = 0; i < game.length; i++) {
            	  if(game[i] == 'w') {
            		  wcnt++;
            	  }else if ( game[i] == 'd') {
            		  dcnt++;
            		  
            	  }else if ( game[i] == 'l') {
            		  lcnt++;
            	  }
              }  System.out.println(wcnt + "승" + dcnt + "무" + lcnt + "패");
	}

}		
				
				
			

		

//
//		
		
	


