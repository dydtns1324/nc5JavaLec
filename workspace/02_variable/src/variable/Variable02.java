package variable;

public class Variable02 {

	public static void main(String[] args) {
		// 320, 258의 합을 구하시오
		System.out.println(320+258);
		
		int c = 320;
		int d = 258;
		System.out.println(c + d);
		
		// 320, 258의 데이터를 변수에 저장하여 합, 차, 곱, 몫을 구하시오
		short a = 320;
		short b = 258;
		short sum = (short)(a + b); //형변환
		//int sum = a + b;
		
		//결과는 int형으로 나옴
		
		System.out.println(a);
		System.out.println(a + " + " + b + " = " + sum);
		
		short sub = (short)(a - b);
		
		int mul = a*b;
		
		double div = (double)a / b; //강제형변환 / 자동형변환
	
		
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + String.format("%.2f",div));
		
	}

}
