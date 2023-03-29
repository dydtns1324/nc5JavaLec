package chap15_usefulClass;

import java.math.BigInteger;

public class _15_bigInteger01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigInteger 객체 생성
		BigInteger bint1 = new BigInteger("1000"); // 두 코드 모두 valueOf()를 사용해도된다.
		BigInteger bint2 = new BigInteger("3000");
		
		//타입 변환
		String str = bint1.toString();
		int num = bint1.intValue();
		float fNum = bint1.floatValue();
		
		//연산
		System.out.println(bint1.add(bint2));
		System.out.println(bint1.subtract(bint2));
		System.out.println(bint1.multiply(bint2));
		System.out.println(bint1.divide(bint2));
		System.out.println(bint1.remainder(bint2));
	}

}
