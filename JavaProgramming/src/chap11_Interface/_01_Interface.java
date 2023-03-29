package chap11_Interface;

import chap11_Interface.bulidings.Buliding;
import chap11_Interface.bulidings.Highbuliding;

public class _01_Interface {

	public static void main(String[] args) {
		//인터페이스는 인스턴스화가 불가능 하기때문에
		//상속받은 자식클래스를 인스터늣화해서 사용한다.
		Buliding bd = new Highbuliding();
		
		bd.build();
		bd.turnOnAircon();
		int price = bd.getParkingPrice(120);
		System.out.println("총 주차비는" + price + "원입니다");

	}

}
