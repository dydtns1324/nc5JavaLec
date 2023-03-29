package variable;

public class Variable03 {
	int a; //필드, 이미 초기화가 끝난 상태(값=0) , 인스턴스변수
	static int b; //필드, 초기화, 클래스변수

	public static void main(String[] args) {
		int a=10; //지역변수(local variable), 쓰레기값 (반드시 초기화 해야 한다)
		System.out.println("지역변수 a = " + a);
		
		//int a; error - Duplicate local variable a
		
		System.out.println("필드 b = " + Variable03.b );
		System.out.println("필드 b = " + b );
		
		Variable03 v = new Variable03(); //생성
		System.out.println("객체 v = " + v);
		System.out.println("지역변수 a = " + a );
		System.out.println("필드 a = " + v.a );
		System.out.println("필드 b = " + v.b );
	}

}
