package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //생성
		
		
		System.out.print("a의 값을 입력 : ");
		int a= scan.nextInt();
		
		String result;
		if(a>=50) result = a + "는 50보다 크거나 같다";
		else result = a + "는 50보다 작다";

		System.out.println(result);
	}

}
