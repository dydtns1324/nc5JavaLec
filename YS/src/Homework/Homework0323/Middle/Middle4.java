package Homework.Homework0323.Middle;

import java.math.BigInteger;
import java.util.Scanner;

public class Middle4 {
        public static void main(String[] args) {
        	
        	Scanner sc = new Scanner(System.in);
        	
        	while(true) {                   // 계속 입력해야하기 떄문에 무한루프 while문
        		
        	int input = sc.nextInt();
        	
        	System.out.println("입력한 값 : " + input + " 입력한 값까지의 합 " +"1~"+input +" = "
        	                   + add(BigInteger.valueOf(input)));
        	      	   //팩토리얼 메소드로 연결            //입력값 input의 값을 BigInteger로 변환
        	
        	}
   }
                                            //아래 매개변수는 위에서 넣은 input값을 매개변수로 받음
		private static BigInteger add(BigInteger valueOf) {
			if(valueOf.intValue() == 1) {   // 위에서 넣은값이 BigInteger타입이기때문에 intValue로 변환(?) 
				                            // 변환된후 위에서 입력한 값이 1일 경우
				return BigInteger.ONE;      // BigInteger.ONE = 정수 1과 같으므로 1로 반환
				                       
			}else {
				
				return valueOf.add(add(valueOf.subtract(BigInteger.ONE)));
			}   // 재귀메소드는 숫자 1로 돌아가려는성질을 말함
			    // 그래서 입력값이 만약 10 이라면 10부터 1까지 지나오면서 값이 더해짐
			    // 위 코드에서 valueOf.add는 입력한값이 1로 떨어질때까지 지나친 숫자들을 모두 + 연산
			    // valueOf.subtract(BigInteger.ONE 이 코드는 안에있는 숫자가 1이기때문에
			    // 입력한 값이 2일경우 1을뺀 1이 +1 // 입력한값이 3일경우 1을뺀 2가 +2 2에서 1을뺀 1이 +1
			    // 이런식으로 재귀반복하면서 10을 입력하면 1+2+3+4+5+6+7+8+9+10 = 55 가 됨
		       
		}
}
