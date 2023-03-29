package chap09_Product;

public class AirCon extends ElectronicDevice {
	
	public int lastTemperature = 24;
	
	public void powerOn() {
		System.out.println("에어컨 전원을 켭니다" + "설정된 온도는" + lastTemperature);
		
	}

	public void powerOff() {
		System.out.println("에어컨 전원을 끕니다." + " 마지막 설정 온도는" + lastTemperature);
	}
	
	public void operate(int temperature) {
		changeTemperature(temperature);
	}
	
	public void changeTemperature(int temperature) {
		lastTemperature = temperature;
		System.out.println("온도를" + temperature + "로 설정합니다");
	}
}
