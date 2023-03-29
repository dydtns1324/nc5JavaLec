package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import chap06_class.Car.Car;

public class _07_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Car>cList = new ArrayList<Car>();
		
		Car car = new Car("현대","제네시스","은색",5000);
		cList.add(car);
		
		//Itrtator로 요소들 받아오기
		Iterator it = cList.iterator();
		
		while ( it.hasNext()) {
			Car c = (Car)it.next();
			c.carInfo();
			if(c.company.equals("현대"))
				it.remove();
	
		}
	 			
		ListIterator<Car> lit = cList.listIterator();
		lit.next();
		
		while ( lit.hasPrevious()) {			
				lit.previous();
				
				Car c = new Car("쉐보레","카마로","노란색",40);
				
				lit.set(c);
			}
				
		for(Car c : cList) {
			c.carInfo();
		}
	}

}
