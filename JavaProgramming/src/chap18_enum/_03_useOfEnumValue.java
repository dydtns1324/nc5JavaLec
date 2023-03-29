package chap18_enum;

import chap18_enum.enums.ValueMonth;

public class _03_useOfEnumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum 객체를 만들 때 생성자가 자동으로 호출
		//호출한 상수 값이 생성자의 매개변수로 들어가서
		//선언되어 있는 변수에 대입된다.
		ValueMonth mar = ValueMonth.MAR;
		
		
		System.out.println(mar.getMonthValue());
		
		//여러형태의 enum 객체 생성	
		ValueMonth jan = ValueMonth.JAN;		// enum클래스명 변수명 = enum클래스명.상수명
		ValueMonth feb = ValueMonth.valueOf("FEB"); // enum클래스명 변수명 = enum클래스명.valueOf "상수명"
		ValueMonth apr = Enum.valueOf(ValueMonth.class, "MAR"); // enum클래스명.변수명 = Enum.valueOf
		
		System.out.println("jan : " + jan);
		System.out.println("feb : " + feb);
		System.out.println("apr : " + apr);
		
		//enum 객체 배열
		ValueMonth[] vmArr = ValueMonth.values(); //enum클래스명[] 변수명 = enum클래스명.values
		for(ValueMonth v : vmArr) { // v라는 변수를만들어 vmArr의 정보를 전달
			System.out.println(v.name() + " 은 " + v.ordinal() + " 의 인덱스에 있다");
		}
		
		
	}

}
