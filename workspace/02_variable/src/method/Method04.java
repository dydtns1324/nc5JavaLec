package method;

import java.util.Scanner;

class SungJuk{
	String name; //필드, 초기화(null)
	int kor, eng, math, tot;
	double avg;
	
	public void setData(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	
	public void calc() {
		tot = kor + eng + math;
		avg = tot/3;
		
	}
	
	public void display() {
		System.out.println(name + "\t"
							+ kor + "\t"
							+ eng + "\t"
							+ math + "\t"
							+ tot + "\t"
							+ avg);
	}
}



//----------------------
public class Method04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		// 1. 이름, 국어, 영어, 수학을 입력
		// 2. 메소드 호출 : 데이터 전달하는 메소드 호출
		// 3. 총점과 평균을 계산하는 메소드 호출
		// 4. 출력하는 메소드 호출
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();				
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();
		
		SungJuk s = new SungJuk(); //클래스 생성 + 생성자 호출
		s.setData(name, kor, eng, math);
		s.calc();
		s.display();

		
	}

}



/*
[문제] 이름, 국어, 영어, 수학을 입력받아서 총점과 평균을 구하시오

클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg
메소드 : setData(?,?,?,?)
		calc - 총점과 평균을 계산
		display

*/