package chap04_controllstatement;
import java.util.Scanner;

public class _06_infiniteWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 객체
	    Scanner sc = new Scanner(System.in);
        // 스캐너를 사용 할 때
	    // next 메소드를 혼용하여 사용하는것은 좋지 않다.
	    //nextInt, nextLine << 좋지않다.
	    //하나의 next 메소드만 사용해서 형변환을 해주는것이 좋다.
	    
	    while(true) {	    
	    System.out.println("1은 종료, 나머지는 계속 반복");
	    String inputStr = sc.nextLine();		
		
		
		if(inputStr.equals("1")) {
			System.out.println("종료 되었습니다");
			break;
		}
		
		System.out.println(inputStr);
		
	}

}
}