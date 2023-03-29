package chap17_generic.clazz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GroupA{

	 private Map<String, String> memMap =
			 new HashMap<String,String>();
	 
	 public GroupA() {
		 this.memMap.put("박선준", "조장");
		 this.memMap.put("김용순", "조원");
		 this.memMap.put("이완재", "조원");
		 this.memMap.put("동효준", "조원");
		 this.memMap.put("문다원", "조원");
		 
	 }

	public Map<String, String> getMemMap() {
		return memMap;
	}

	public void setMemMap(Map<String, String> memMap) {
		this.memMap = memMap;
	}
	
	public Entry<String,String> getCaptain() {
		for (Entry<String,String> entry : memMap.entrySet()) {
			if(entry.getValue().equals("조장")) {
				return entry;
			}
		} return null;
	}
}


