package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap06_class.Car.Car;

public class _09_listMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Car> carList = new ArrayList<Car>();
		
		
		carList.add(new Car ("현대","제네시스","흰색",5000));
		carList.add(new Car ("기아","모하비","흰색",5000));
		carList.add(new Car ("쉐보레","카마로","노랑색",5000));
		carList.add(new Car ("벤츠","E시리즈","흰색",6000));
		carList.add(new Car ("BMW","7시리즈","파란색",10000));
		
		//carList를 List<Map<String,Object>>로 변환
		
		List<Map<String,Object>> carMapList = new ArrayList();
		
		Map<String, Object> carMap = new HashMap<>();
        for (Car car : carList) {
            carMap.put("제조사명",car.company);
            carMap.put("모델명", car.model);
            carMap.put("색상",car.color);
            carMap.put("가격", car.price);
            
            carMapList.add(carMap);       
            }                           
            System.out.println(carMapList);
      }  
        
}  


