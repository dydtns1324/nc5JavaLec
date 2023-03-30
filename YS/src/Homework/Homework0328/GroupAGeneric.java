package Homework.Homework0328;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAGeneric<K,V> {   // 해당클래스를 Key와 Value를 타입으로받는 K,V로 명시 
	                                // 제네릭의 형태는 T든 E든 문자열이든 상관없지만 암묵적인 룰을 지키는게 중요.
  	private Map<K,V> memMap;        // Map<String,String>... <<이 아닌 Map<K,V>로 명시한다.
			
	 
	 public GroupAGeneric(Map<K,V> memMap) { //해당 클래스의 생성자로써 인스턴스가 생성될 때 
		this.memMap = memMap;				 //해당변수인 memMap을 초기화시키는 역할
		 
	 }

	public Map<K,V> getMemMap() {	// Map형태의 멤버정보를 불러오기위한 메소드
		return memMap;
	}

	public void setMemMap(Map<K,V> memMap) {
		this.memMap = memMap;
	}
	
	public Entry<K,V> getCaptain() {
		for (Entry<K,V> entry : memMap.entrySet()) { //Entry를 활용하여 위 memMap의 정보를 entry로 전달
			if(entry.getValue().equals("조장")) {     // 해당 memMap의 정보가 전달된 entry의 Value가 "조장"과 문자열이 같을시 
				return entry;						 // entry를 리턴,
			}
		} return null;								// 조장이 없을시 null
	}
}



