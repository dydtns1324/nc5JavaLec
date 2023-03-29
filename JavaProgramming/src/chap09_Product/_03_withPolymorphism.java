package chap09_Product;

import chap10_abstraction.Product.Product.SamsungTV;
import chap10_abstraction.Product.Product.Tv;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성을 이용하여 Tv 바꾸기
		Tv tv = new SamsungTV();
		
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();
		
		
	}

}
