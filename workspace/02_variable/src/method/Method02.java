package method;

class Test{
	
	public void disp() { //구현
		System.out.println("non-static 메소드");
	}
	
	public static void output() { //구현
		System.out.println("static 메소드");
		
	}
	
}
//----------------------
public class Method02 {
	
	public static void main(String[] args) {
		Test.output(); //호출
		System.out.println();
		
		Test t = new Test();
		t.disp();
		

	}

}
