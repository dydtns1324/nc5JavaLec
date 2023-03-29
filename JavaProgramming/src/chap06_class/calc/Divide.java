package chap06_class.calc;

public class Divide {
	
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
		public int div(){
	    result = Num2 / Num1 + 1;
		return result;
			
	 
}
}
