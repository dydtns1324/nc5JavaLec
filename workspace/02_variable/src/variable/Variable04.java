package variable;

class Test{
	String name; //필드, 초기화(값=null)
	int age;
}
//-------------------
public class Variable04 {

	public static void main(String[] args) {
		Test t = new Test(); //생성
		System.out.println("객체 t = " + t);
		System.out.println("이름 = " + t.name);
		System.out.println("나이 = " + t.age);
		System.out.println();
		
		Test t2 = new Test();
		System.out.println("객체 t2 = " + t2);
		
		t2.name = "홍길동";
		t2.age = 25;
		System.out.println("이름 = " + t2.name);
		System.out.println("나이 = " + t2.age);
		System.out.println();
	}
	

}
