package ElectronicDevice;

public class test {

	public static void main(String[] args) {
		
		Tv samsung = new SamsungTv();
		samsung.powerOn();
		samsung.show();
		samsung.sound();
		samsung.changeChannel(3);
		samsung.powerOff();
		samsung.powerOn();
		samsung.reset();
		
		Tv lgtv = new LgTv();
				
		lgtv.powerOn();
		lgtv.show();
		lgtv.sound();
		lgtv.changeChannel(7);
		lgtv.powerOff();
		lgtv.reset();
		
		//static 메소드를 사용하려면
		//static 메소드가 선언된 클래스나 인터페이스를 사용하여 호출해야한다.
		ElectronicDevice.warn();
		
		//static 메소드는 상속받은 자식클래스나 인터페이스에서의 호출은 불가능하다.
	
	
	}
}
