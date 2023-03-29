package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	//1~45까지 7개의 난수(중복제거)
	//7번째 숫자는 보너스 번호
	
	//사용자가 1~45까지 6개 숫자 선택
	
	// 1등 : 보너스 번호를 제외한 6개의 숫자가 모두 같을때
	// 2등 : 보너스 번호와 5개 번호가 일치할 때
	// 3등 : 보너스 번호를 제외한 5개의 숫자가 일치할 때
	// 4등 : 보너스 번호를 제외한 4개의 숫자가 일치할 때
	// 5등 : 보너스 번호를 제외한 3개의 숫자가 일치할 때
	
	//나머지는 꽝
	
	//몇등인지 출력
	
	public int Count = 0;
	public int r;
	public int input;
	
	
	
	
	public void RandomNum() {
	    Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int random;
		for(int i = 0; i < 6; i++) {
		random = r.nextInt(45)+1;
	    System.out.println(random);
	
	     
	}
		
		
	}
	
	public void inputNum() {
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0; i < 6; i++) {
		int input = sc.nextInt();
		}
		
		
	}
	
    
                    
       
    }  
		// TODO Auto-generated method stub

	

    		
    
    	
   

