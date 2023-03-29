package Homework.Homework0327;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Middle1 {

	public static void main(String[] args) {
		
		Map<String,Integer> student = new HashMap();
		
		student.put("Kim", 70 );
		student.put("Hwang", 85);
		student.put("Park", 45);
		student.put("Jang", 65);
		
	//	System.out.println(student);
		
		int maxScore = 0;
		String maxStudent = "";
		
		for (Map.Entry<String, Integer> highStudent : student.entrySet()) {
			
			String name = highStudent.getKey();
			int score = highStudent.getValue();		
						
			if (score > maxScore) {
				maxScore = score;
				maxStudent = name;				
			}
		}  System.out.println("가장 높은 점수의 학생 이름 : " + maxStudent);
		   System.out.println("해당하는 학생의 점수 : " + maxScore);
							 						
	}

}
