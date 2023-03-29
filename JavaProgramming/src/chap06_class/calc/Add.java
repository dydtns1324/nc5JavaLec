package chap06_class.calc;

public class Add extends Calc {
        //멤버 변수
		private int Num1;
		private int Num2;
		private int result;
		
		
		public int getNum1() {
			return Num1;
		}
		public void setNum1(int num1) {
			this.Num1 = num1;
		}
		public int getNum2() {
			return Num2;
		}
		public void setNum2(int num2) {
			this.Num2 = num2;
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		public int add() {
			result = Num1 + Num2;
			return result;
		}
		
		//오버라이딩 : 부모클래스에 존재하는 메소드를 재정의
		public int add(int a, int b) {
			return (a * a) + (b * b) ;
		}
	
}
