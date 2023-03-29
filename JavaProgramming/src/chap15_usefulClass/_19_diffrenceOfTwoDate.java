package chap15_usefulClass;

import java.util.Calendar;

public class _19_diffrenceOfTwoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.set(2011, 2, 11);
		d2.getTimeInMillis();
		
		//getTimeInMill() : long타입으로 지정된 날짜를
		//                  밀리세컨드로 리턴
		
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		System.out.println(diff);
		System.out.println("d2부터 d1까지" +(diff / (1000))
		           + "초가 지났습니다."); 

		
		System.out.println("d2부터 d1까지" +(diff / (1000 * 60 ))
				           + "분이 지났습니다."); 
		
		System.out.println("d2부터 d1까지" +(diff / (1000 * 60 * 60))
		                    + "시간이 지났습니다."); 
		
		System.out.println("d2부터 d1까지" +(diff / (1000 * 60 * 60 * 24 ))
		                    + "일이 지났습니다.");
		
		System.out.println("d2부터 d1까지" +(diff / ((long)1000 * 60 * 60 * 24 * 30 ))
		                    + "달이 지났습니다."); 
		
		System.out.println("d2부터 d1까지" +(diff / ((long)1000 * 60 * 60 * 24 * 30 * 12))
		                    + "년이 지났습니다."); 
		
		
		int second = 1000;
		int minute = second * 60;
		int hour = minute * 60;
		int dayNum = hour * 24;
		long monthNum = ((long)dayNum * 30);				
		long yearNum = ((long)monthNum * 12);
	
		long year = diff / yearNum;
		diff = diff % (yearNum);
		long month = diff / monthNum;
		diff = diff % monthNum;
		long day = diff / dayNum;
		diff = diff % dayNum;		
		System.out.println(year +" "+ month + " " + day);
		
     //   System.out.println(diff / month);


   
	}

}
