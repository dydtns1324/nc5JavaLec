package chap11_Interface.multiinherit;

// 인터페이스끼리의 상속은 extends 를 사용한다. ******* 그외에 클래스와 인터페이스의 상속은 implements를 사용한다
public interface MultiflexStadium extends Stadium, ConcertHall {
	
	void playSortsAndConcert();
	
	

}
