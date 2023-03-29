package chap18_enum;

import chap18_enum.enums.RGB;

public class rgbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RGB red = RGB.RED;
		RGB green = RGB.valueOf("GREEN");
		RGB blue = Enum.valueOf(RGB.class, "BLUE");
		
		RGB[] rgbArr = RGB.values();
		
		for(RGB r : rgbArr) {
			System.out.println(r.getColor() 
					+ "(" + r.getRedN() + ", "
					+ r.getGreenN() +", "
					+ r.getBlueN() +")" 
					+ "의 인덱스는 " + r.ordinal());						
		}
	}

}
