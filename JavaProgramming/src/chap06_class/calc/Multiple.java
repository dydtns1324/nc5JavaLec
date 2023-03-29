package chap06_class.calc;

public class Multiple extends Calc{
	 public int Num1;
	 public int Num2;
	 public int result;
	public int getNum1() {
		return Num1;
	}
	public void setNum1(int num1) {
		Num1 = num1;
	}
	public int getNum2() {
		return Num2;
	}
	public void setNum2(int num2) {
		Num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int Mul() {
		result = Num1 * Num2;
		return result;
	}
	 //오버로딩 : 같은 이름의 메소드를 매개변수만 조작하여
	 //		    다른 메소드로 만든다.
	 public int Mul(int a) {
		 return a*a;
	 }
	  public int mul(int a, int b) {
	   int i = 1;

	 for(int i = 0; i < b; i++) {
		 result *= a;
	 }
	 }
}
