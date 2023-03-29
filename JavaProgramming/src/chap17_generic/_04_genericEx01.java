package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Number상속 받는 T
		//리턴타입 List<T> getEven(List<T> list)
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i =0; i < 10; i++) {
			intList.add(i + 1);
		}
		
		System.out.println(_04_genericEx01.getEven(intList));
		
	}

        public static <T extends Number> List<T> getEven(List<T> list){
              	
        	List<T> evenList = new ArrayList<T>();
        	       	
        	for (T t : list) {
        		if(t.intValue() % 2 == 0) {
        			evenList.add(t);
        		}
        		
        	}
        	return evenList;
       } 
}    	

