package method;

import java.util.Random;

public class Method01 {

	public static void main(String[] args) {
		System.out.println( "큰 값 = " + Math.max(25, 36) ); //36
		System.out.println( "작은 값 = " + Math.min(25, 36) ); //25
		System.out.println();
		
		//난수 - 컴퓨터가 무작위로 발생하는 수, 0<= 난수<1
		System.out.println( Math.random());
		
		Random r = new Random(); //생성
		System.out.println( r.nextDouble());
		System.out.println( r.nextInt());
		System.out.println( r.nextInt(100)); //0~99
		System.out.println( r.nextInt(26)); //0~25
		System.out.println( r.nextInt(26) + 65); //65 ~ 90
		System.out.println( (char)(r.nextInt(26) + 65 ) ); //형변환 숫자를 문자로 표기
	}

}
