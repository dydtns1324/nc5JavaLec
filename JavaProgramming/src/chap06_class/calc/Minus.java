package chap06_class.calc;

public class Minus extends Calc {
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
			
		}public int min(){
			result = Num1 - Num2;
			return result;
		}
		public int min(int a, int b) {
			return ( a * a ) - ( b * b );
		}
        
}
