package variable;

public class Variable01 {

	public static void main(String[] args) {
		boolean a;
		a = 25>36; // 오른쪽의 결과를 왼쪽의 변수에 저장해라 , 1bit - 참 :1, 거짓 : 0
		System.out.println(a);
		System.out.println();
		
		char b; //2byte=16bit
		b = 'A'; //'A'=65  0000 0000 0100 0001
		System.out.println(b);
		
		char c;
		c = 65;
		System.out.println(c);
		System.out.println();
		
		byte d; //(1byte = 8bit / 0~255, -128~+127)
		//d = 300; - error
		
		int e; //2진수 0000 0000 0000 0000 0000 0000 0100 0001 0x41 (16진수로 41 나옴)
		e = 65; //(4byte = 32bit)
		System.out.println(e);
		
		int f;
		f= 'A';
		System.out.println(f);
		System.out.println();
		
		float g;
		//g = 43.8; - error
		g = 43.8f; //43.8f 는 float형
		g = (float)43.8; //형변환 float로 잠시 분장
		
		//25 - int형
		//25L - long형
		//(long)25
		
	
	}

}
