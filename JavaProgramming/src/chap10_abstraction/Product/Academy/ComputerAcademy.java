package chap10_abstraction.Product.Academy;

public class ComputerAcademy extends Academy {
	
	
    public void teaChing() {
		
		System.out.println("컴퓨터학원은" + studentCnt + "명의 학생을 가리키고있다");
		
	}

	public  void homeWorking() {
		System.out.println("컴퓨터학원은" + studentCnt + "명의 학생이 숙제를 하고있다.");
		
	}

	public  void rest() {
		System.out.println("컴퓨터학원은 " +studentCnt + "명의 학생이 쉬고있다.");
		
	}

	public  void attend(int number) {
		System.out.println("오늘 컴퓨터학원에는 " + studentCnt +"명의 학생들이 출석했지만 "
				+ number + "명 만큼의 학생들이 조퇴하였다.");
		
	}
	
	public void moveTo(int studentCnt) {
		System.out.println("컴퓨터학원에서 영어학원으로" + studentCnt + "명 만큼 이동했다.");
		
		
	}

}