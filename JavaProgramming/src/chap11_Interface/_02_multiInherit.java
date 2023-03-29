package chap11_Interface;

import chap11_Interface.multiinherit.MultiflexStadium;
import chap11_Interface.multiinherit.SeoulMultiflexStadium;

public class _02_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiflexStadium ms = new SeoulMultiflexStadium();
//      Stadium ms = new SeoulMultiflexStadium();
//      이 경우에는 앞에 변수가 Stadium 인터페이스의 변수이기 때문에
//      Stadium 인터페이스의 메소드 기능만 사용할수있다. 반대로
		
//      ConcertHall ms = new Seoul......
//      일 경우에는 ConcertHall의 메소드 기능만 사용할수있다
		
		
		ms.getSportsSchedule(3);
		int sportsPrice = ms.getSportsTicketPrice(2);
		ms.getSupportersItem(2);
		
		
		ms.getRemainSeat();
		int concertPrice = ms.getTicketPrice(5);
		
		ms.playSortsAndConcert();

	}

}
