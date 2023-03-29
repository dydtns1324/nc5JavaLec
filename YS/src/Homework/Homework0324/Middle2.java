package Homework.Homework0324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle2 {

	public static void main(String[] args) throws ParseException {
		
		String[] days = {"일","월","화","수","목","금","토"};
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
		
		String day = sc.nextLine();
		
	    Date date = SDF.parse(day);
        cal.setTime(date);
        
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        System.out.println(days[dayOfWeek - 1]);
			
		
	}

}
