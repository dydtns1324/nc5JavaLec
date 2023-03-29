package chap10_abstraction.Product.Product;

public class SamsungTV extends Tv{

	public void powerOn() {
		System.out.println("삼성티비 전원 켜기");
		
	}
	
	public void powerOff() {
		System.out.println("삼성티비 전원 끄기");
		
	}
    
	public void operate(int channel) {
		System.out.println("삼성티비 채널" + channel + "로 변경");
		
		lastChannel = channel;
	
		
		
}
}