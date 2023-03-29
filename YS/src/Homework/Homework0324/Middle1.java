package Homework.Homework0324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle1 {
												//중요
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
				
		System.out.println("yyyy-MM-dd 형식의 날짜를 입력하세요 ex : 2023-03-24 ");
		
		String input = sc.nextLine();		
	        	 	    	  	    	    	    	    			
	//	try {
			
			Date date = SDF.parse(input);
			cal.setTime(date);            // 여기서 setTime으로 초기화를 안해줄경우 현재날짜가 고정됨.
			cal.add(Calendar.DATE,3);
			
			String output = SDF.format(cal.getTime());
			
			System.out.println(output);
											
			
	//	} catch (ParseException e) {
		
			
		}
				

	}
		



