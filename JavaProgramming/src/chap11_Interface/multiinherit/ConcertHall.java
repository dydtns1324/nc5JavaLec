package chap11_Interface.multiinherit;

public interface ConcertHall {
	// 인터페이스에선 변수를 잘 사용하지않고 기능메소드만 사용한다. ( 추상 )
	void printSchedule(int month);
	
	int getTicketPrice(int people);
	
	void getRemainSeat();
		
	
	

}
