package chap11_Interface.bulidings;

public interface Buliding {
	//모든 변수는 자동으로 상수화된다.
	
	String price = "expensive";
	int floors = 120;
	
	//메소드는 자동으로 추상화됨
	void build();
	
	void turnOnAircon();
	
	int getParkingPrice(int time);
	
	
	
	
		
	

}
