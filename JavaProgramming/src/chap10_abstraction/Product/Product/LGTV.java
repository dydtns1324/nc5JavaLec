package chap10_abstraction.Product.Product;

public class LGTV extends Tv {
	public void powerOn() {
		System.out.println("lgTv 켜기");
		
	}
	
	public void powerOff() {
		System.out.println("lgTv 켜기 ");
		
	}
    
	public void operate(int channel) {
		System.out.println("lgTv 채널" + channel + "로 변경");
		
		
		lastChannel = channel;
		
	}
}
