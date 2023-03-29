package chap09_Product;

import chap10_abstraction.Product.Product.LGTV;

public class _02_withoutPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성을 사용하지 않고 많은 전자기기 운용하기
		LGTV lgtv = new LGTV();
		
		
		lgtv.powerOn();
		lgtv.operate(13);
		lgtv.powerOff();
		lgtv.powerOn();
		
		
		
		
		
		
		
		
	}

}
