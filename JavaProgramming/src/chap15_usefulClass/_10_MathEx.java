package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//사용자가 5개 정수 입력 - > 배열에 저장
		
		//Math.max와 Math.min을 이용하여
		//최소값, 최대값 구하기
		
		int[] input = new int[5];
		
		int max = input[0];
		int min = input[0];
		
		
		for( int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
				
			max = Math.max(max,input[i]);
			min = Math.min(min, input[i]);
		}	
			
		  System.out.println(max);
		  System.out.println(min);
		  
		  sc.close();			
		
		  
	}

}
