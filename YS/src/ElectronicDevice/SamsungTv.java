package ElectronicDevice;

public class SamsungTv implements Tv {
      
	int lastChannel = 1;
	  
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv의 화면이 보인다");
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv의 전원을 킵니다. 현재 채널은 "+ lastChannel+ " 입니다");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv의 전원을 끕니다");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv에서 노래소리가 들립니다.");
		
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv를 " + channel +"채널로 돌립니다.");
		
		lastChannel = channel;
	
	}

}
