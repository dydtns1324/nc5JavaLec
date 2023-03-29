package chap17_generic.clazz;

import java.util.Map;
import java.util.Map.Entry;

public class StudyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GroupA group = new GroupA();
		
		Map<String, String> memberMap = group.getMemMap();
		Entry<String, String> captain = group.getCaptain();
		
		System.out.println("비트캠프 육쪽마늘 스터디그룹");
		for(Entry<String, String> entry : memberMap.entrySet()) {
			System.out.println("멤버 : " + entry.getKey()+ " " + entry.getValue());
		}
		
		System.out.println("조장 : " + captain.getKey());
		
		
	}

}
