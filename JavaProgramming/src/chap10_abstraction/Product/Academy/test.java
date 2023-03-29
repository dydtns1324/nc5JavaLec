package chap10_abstraction.Product.Academy;

public class test {

	public static void main(String[] args) {
		
		Academy english = new EnglishAcademy();
		Academy computer = new ComputerAcademy();
       
		english.studentCnt = 30;				
		english.attend(10);
		
				
		
		computer.studentCnt = 30;
		computer.attend(20);
		
		english.moveTo(20);
		computer.moveTo(20);
		
		
	}

}
