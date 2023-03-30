package Homework.Homework0328;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 일반적인 호출
//		GroupA group = new GroupA();
//		
//		Map<String, String> memberMap = group.getMemMap();
//		Entry<String, String> captain = group.getCaptain();
//		
//		System.out.println("비트캠프 육쪽마늘 스터디그룹");
//		for(Entry<String, String> entry : memberMap.entrySet()) {
//			System.out.println("멤버 : " + entry.getKey()+ " " + entry.getValue());
//		}
//		
//		System.out.println("조장 : " + captain.getKey());
		
		//제네릭을 활용한 호출
		
		Map<String,String> memberMap = new HashMap(); // 호출하려는 클래스의 생성자가 제네릭의 
													  // 형태이기 때문에
													  // 제네릭 K,V의 형태를 명시해주어야 한다.
		memberMap.put("박선준", "조장");
		memberMap.put("김용순", "조원");				   
		memberMap.put("이완재", "조원");				  //해당하는 생성자의 정보를 명시한 형태대로 입력한다.
		memberMap.put("동효준", "조원");  				 
		memberMap.put("문다원", "조원");
		
		//위 memberMap에 담긴 정보를 해당클래스의 인스턴스를 생성하여 변수 group에 인자를 전달.
		GroupAGeneric<String,String> group = new GroupAGeneric<>(memberMap);
		Map<String,String> getmemMap = group.getMemMap(); //getMemMap의 메소드의 형태를 지정
		Entry<String,String> captain = group.getCaptain(); // getCaptain 메소드의 형태를 지정
		
		System.out.println("비트캠프 육쪽마늘 스터디그룹");
		for(Entry<String,String> entry : getmemMap.entrySet()) {
			System.out.println("멤버 :" + entry.getKey()+ " " + entry.getValue());
			//위에서 저장된 getmemMap의 정보를 Entry에 전달하여
			//저장된 모든정보를 출력
		}
		System.out.println("조장 : " + group.getCaptain());
	}       //위 제네릭클래스의 메소드인 getCaptain 메소드를 호출하여 조장을 출력.

}
