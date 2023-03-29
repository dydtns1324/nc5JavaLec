package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

import chap06_class.Car.Car;

public class _04_arrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용자가 문자열을 입력
		// 길이를 10 만큼 잘라서
		//ArrayList에 저장
		//남은 문자열의 길이가 10보다 작으면
		//남은 문자열을 ArrayList 에 저장
		//ex) abcdefghijklnmop
		// [abcdefghij] , [klnmop] 이런식으로.
		// 출력
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		ArrayList<String> list = new ArrayList<>();
		
		int leng = input.length();
		
		for ( int i = 0; i < leng; i+=10) {
		
			if ( i + 10 < leng) {			
				list.add(input.substring(i, 10 + i));
			}
			else {
				list.add(input.substring(i , leng));
			}
			System.out.println(list);
		}
	
			
			
		}
		
		
	
		
		
	}


