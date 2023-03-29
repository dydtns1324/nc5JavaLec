package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
		// 게임 룰 : 컴퓨터가 3개의 랜덤값을 가지고
		//         사용자가 3개의 숫자를 입력(중복불가능)
		//         컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를
		//         비교하는 데 숫자만 같으면 볼로 카운팅
		//         숫자와 위치까지 모두 같으면 스트라이크로 판정
		//         몇 스트라이크 몇 볼인지 출력
		//         3 스트라이크 달성시 몇회만에 맞췄는지 출력 후 게임종료
	    //         다시 게임 진행할지 물어보기 ( 1. 진행 2. 종료 )
	// 스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;
	
	//몇번 맞췄는지 세어줄 변수
	private int gameCnt = 0;

	
	//컴퓨터 랜덤값 담아줄 배열
	int[] computer = new int[3];
	
	//사용자 입력값
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	//게임 시작 메소드
	public void start() {
		while(true ) {
		generateRandom();
		
		//컴퓨터 배열 확인
		System.out.println(computer[0]+ "," + computer[1] + "," + computer[2]);
		
		while ( true ) {
			strike = 0;
			ball = 0;
			
			getUserInput();
			
			//사용자 입력값 확인
			System.out.println(user[0] + "," + user[1] + ", " + user[2]);
			if(judgetStrike()) {
				break;				
			}else {
				continue;
			
			}
		}   if(reGame()) {
			   continue;
		}   else {
			  break;
		}
		}
			
		
	}
	 
	 //컴퓨터 랜덤 값 3개 생성해주는 메소드
	public void generateRandom() {
		for ( int i = 0 ; i < computer.length; i++) {
			computer[i] = (int)(Math.random() * 4);
			
			//중복체크
			if( i > 0) {			
			if(checkDuplicate(computer, i)) {
			 i--;
			}continue;
		 }
		}
	}
			
				
			
			 
		
		//중복체크 필수
	
	 
	 //중복값 체크 메소드
	public boolean checkDuplicate(int[] arr, int num) {
		  boolean isDuplicated = false;
		  
		  for(int i = 0; i < num; i++) {
			  //현재 배열에 저장된 값과
			  //현재 배열에 저장된 값의 인덱스 -1 까지의 값들을 비교
			  if (arr[num] == arr[i]) {
				  isDuplicated = true;
			  }
		  }
		  
		  return false;
	}
	
	//유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		for(int i = 0; i < user.length; i++) {
			user[i] = sc.nextInt();
			
			if(i > 0) {
				if(checkDuplicate(user, i)) {
					
				
					i--;
				continue;
				}
			}
		}   gameCnt++;
	}//중복체크 필수
	
	
	//스트라이크 볼 판정하는 메소드
	public boolean judgetStrike() {
		for(int i = 0; i < computer.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(computer[i] == user[j]) {
					if(i == j) {
						strike++;
						
					}else {
						ball++;
					}
				}
			}
		}
		System.out.println(strike + " 스트라이크," + ball + " 볼");
		if(strike == 3) {
			System.out.println(gameCnt + "회만에 맞추셨습니다");
		}  
		return true;
	}
	
	//재게임 여부
	public boolean reGame() {
		boolean isreGame = false;
		while(true) {
			int regame = sc.nextInt();
			
			if(regame == 1) {
				gameCnt = 0;
				isreGame = true;
				break;
			}else if(regame == 0) {
				break;
			}else {
				continue;
			}
		}
		 return isreGame;
	
	}
	}

