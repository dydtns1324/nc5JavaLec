package Homework.Homework0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Map<String, String> map = new HashMap();
					
		for (char Bigch = 'A'; Bigch <= 'Z'; Bigch++) {
			int unicode = Bigch;
			map.put(String.valueOf(Bigch),String.valueOf(unicode));								
					
	}  	    System.out.println("대문자 알파벳=유니코드 : " + map);
	 		map.clear();  // 이전의 대문자들의 배열을 제거
	 		
		for( char smallch = 'a'; smallch <= 'z'; smallch++) {
			int unicode = smallch;
			map.put(String.valueOf(smallch), String.valueOf(unicode));
			
	}     	System.out.println("소문자 알파벳=유니코드 : " + map); 		
  }   
}

