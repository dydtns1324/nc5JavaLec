package variable;

public class SungJuk {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int kor = 90;
		int eng = 85;
		int math = 100;
		
		int tot= kor+eng+math;
		double avg = tot/3.0;
		//String ang = String.format("%2f", tot/3.0);
		

		System.out.println("이름   국어   영어   수학   총점   평균");
		System.out.println(name + "\t" 
						+ kor + "\t" 
						+ eng + "\t" 
						+ tot + "\t"  
						+ String.format("%.2f", tot/3.0)  );
	

	}

}