package ElectronicDevice;

public class LgTv implements Tv {

	int lastchannel = 1; 
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("LGTV의 화면이 보입니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LGTV의 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LGTV의 전원을 끕니다.");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("LGTV에서 큰 소리가 들립니다.");
		
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LGTV를" + channel + "채널로 돌립니다.");
		
		lastchannel = channel;
	}
	
	

}
