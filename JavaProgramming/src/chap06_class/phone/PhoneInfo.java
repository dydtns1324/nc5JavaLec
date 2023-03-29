package chap06_class.phone;

public class PhoneInfo {
	
	public String[] name = new String [100];
	public String[] number = new String [100];
	int index = 0;
	int count = 0;
	
	
	public void insertPhoneNum(String name, String number) {
		this.name[index] = name;
		this.number[index] = number;
		index++;
		
		
	}
	
	
	public void printAllPhoneNum() {
		for(int i = 0; i < name.length; i++) {
			if(name[i] != null) {
				count = i + 1;
				System.out.println(count + "." + "이름 : "+ name[i] + " 번호 : " + number[i]);
			}
		}
		
	}
	
	
	
	public void printPhoneNum(int index) {
		if(name[index - 1] != null ) {
			System.out.println("이름 : " + name[index - 1] + "번호" + number[index - 1]);
		}else {
			System.out.println(" 없음 ");
		
		
		
		}
	}
}
	//이름 100개와 전화번호 100개를 담을수있는 배열
	
	//배열의 현재 인덱스를 담고 있을 변수
	
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum
	
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름 : 홍길동 , 전화번호 : 1234567
	//    이름 : 홍길동 , 전화번호 : 1234567
	//    ...............
	
	
	
	//전달받은 번호의 해당하는 이름과 전화번호를 출력하는 메소드
    //printPhoneNum
	//ex) 이름 : 홍길동3, 전호번호 : 3232423532

	
	
	
	
	
	

	
	
	
	
	
	
	
