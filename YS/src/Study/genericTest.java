package Study;

public class genericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		generic<String,String> a = new generic<String,String>();
		
		
		a.set("10","10");
		
		
		
		System.out.println(a.getFirst());
		// 반환된 변수의 타입 출력
		System.out.println(a.getFirst().getClass().getName());
		
		System.out.println(a.getSecond());
		// 반환된 변수의 타입 출력
		System.out.println(a.getSecond().getClass().getName());
		System.out.println();
		
		// 제네릭 메소드의 타입 출력			//이 값에 따라 타입이 바뀜
		System.out.println(a.genericMethod(3).getClass().getName());		
		System.out.println(a.genericmethod2('a').getClass().getName());
		System.out.println(a.genericmethod3(3.0).getClass().getName());
	}

}
