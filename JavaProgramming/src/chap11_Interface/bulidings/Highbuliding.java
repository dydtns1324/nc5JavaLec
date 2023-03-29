package chap11_Interface.bulidings;

//클래스가 인터페이스를 상속받을때는 implements 키워드를 사용한다.
//인터페이스를 상속받아 추상메소드중 일부만 구현하려면 추상클래스로 선언하여야한다 *******************
public /*abstract*/ class Highbuliding implements Buliding {

	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("고층 건물을 짓는다.");
		
	}

	@Override
	public void turnOnAircon() {
		// TODO Auto-generated method stub
		System.out.println("에어컨을 가동하다.");
		
	}

	@Override
	public int getParkingPrice(int time) {
		// TODO Auto-generated method stub
		int totalPrice = time * 1000;
		return totalPrice;
	}
	
	
	
	
	

}
