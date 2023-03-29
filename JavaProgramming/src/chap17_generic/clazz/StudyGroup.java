package chap17_generic.clazz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudyGroup<T> {
	private List<T> groupList = new ArrayList<T>();
	


	public List<T> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<T> groupList) {
		this.groupList = groupList;
	}
	
	public T getGroup(int index) {
		return groupList.get(1);
		
	}
	public List<String> getCap() {
		List<String> capList =
				new ArrayList<String>();
		for (T t : groupList) {
            // T 타입의 객체에서 조장의 이름을 가져오는 로직
            // 예시로 각각의 객체를 String 타입으로 변환하여 적용
            String captain = t.toString() + " 조장";
            capList.add(captain);
		
		
		}
		return capList;
	}
	public List<String> getMembers() {
		List<String> memList =
				new ArrayList<String>();
		for ( T t : groupList) {
			String member = t.toString() + " 조원";
			memList.add(member);
		}
		return memList;
	}

}
