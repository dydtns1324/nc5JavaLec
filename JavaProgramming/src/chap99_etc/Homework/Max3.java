package chap99_etc.Homework;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3 {
	public static void main(String[] args) {
		Scanner mmm = new Scanner(System.in);

		System.out.println("세 정수의 최소값과 최대값 그리고 중앙값까지 구한후 셋의 합을 구합니다.");
		System.out.print("a의 값：");	int a = mmm.nextInt();
		System.out.print("b의 값：");	int b = mmm.nextInt();
		System.out.print("c의 값：");	int c = mmm.nextInt();
		int min = a;
		if (b < min) min = b;
        if (c < min) min = c;
	    
        int max = b;
        if( a > max) max = a;
        if( c > max) max = c;
         
        int middle = 0;                // 중앙값을 더해주기위해 변수를 0으로 초기화
        
        if(min == a && max == b) {     // 
           middle += c;				   // 중앙값을 구하기위해 최소값과 최대값을 제외한 나머지 수를 도출
           							   // 
       }else if(min == b && max == c) {//
    	   middle += a;				   // 그리고 middle이라는 중앙값 변수에 +=로 담아줌.
    	   							   //
       }else {						   //
    	   middle += b;
       }
        
        
        int total = min + middle + max;
       
		System.out.println("최소값은 " + min + "입니다.");
		System.out.println("중앙값은 " + middle + "입니다.");
		System.out.println("최대값은 " + max + "입니다.");
		System.out.println("최소값과 중앙값과 최대값을 합친 값은 "+ total + "입니다." );
	}
}