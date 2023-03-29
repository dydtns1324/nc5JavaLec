package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class _05_linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList와 LinkedList 속도 비교
		
		//순차적 데이터 넣기 속도 비교
		List<String> aList = new ArrayList<String>();
		List<String> lList = new ArrayList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for ( int i = 0; i < 1000000; i++) {
			lList.add(String.valueOf(i));
			
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList에 순차적으로 데이터를 추가하는데 걸린 시간 : " +
		(endTime - startTime) + "나노초 입니다.");
		
		System.out.println("---------------------");
		
		//contains 메소드 속도 비교
		startTime = System.nanoTime();
		
		System.out.println(aList.contains("900000"));
		
		endTime = System.nanoTime();
		
		System.err.println("ArrayList에서 값 900000을 찾는데 걸린 시간 : " +
		 (endTime - startTime));
		
		System.out.println("--------------------");
		
		//get(int index) 
        startTime = System.nanoTime();
		
		System.out.println(lList.get(80000));
		
		endTime = System.nanoTime();
		
        startTime = System.nanoTime();
		
		for ( int i = 1000; i < 5000; i++) {
			lList.add(String.valueOf(i));
			
		}
		
		endTime = System.nanoTime();
	}   

}
