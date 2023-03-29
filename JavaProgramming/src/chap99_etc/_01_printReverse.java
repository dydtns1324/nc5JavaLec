package chap99_etc;

import java.util.Arrays;

public class _01_printReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AbcDeF";
		
		//대소문자 변환 된 문자열
		String capStr = "";
		
		
		//fEdCBa
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				
			}else if(Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
		     capStr = capStr + ch;
		  
		}
			System.out.println(capStr);
 	}
}




