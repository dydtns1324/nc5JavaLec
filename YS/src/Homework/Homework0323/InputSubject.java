package Homework.Homework0323;

import java.util.Scanner;

public class InputSubject {

	
	public void inputSubjectInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 입력하세요");
		String subject = sc.next();
		System.out.println("점수를 입력하세요");
		int finalExam = sc.nextInt();
		
	}
}
