package chap02_variables;

public class _10_typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자동형변환1 - 바이트 크기가 작은 변수를
		//바이트 크기가 큰 변수에 대입할때 자동으로
		//크기가 큰 변수의 자료형으로 변경된다.
		short sNum1 = 10;
		//short형인 sNum1이 int형으로 변환된후
		//iNum1에 대입
		int iNum1 = sNum1; // <<< 작은타입에서 큰타입으로 가는건 자동형변환
		
		
		//2. 자동형변환2 - 좀더 세밀한 표현 범위를 갖는
		//타입에 대입될때 자동 형변화이 일어난다.
		long lNum1 = 100000000000L;
		//long타입의 변수인 lNum1이 바이트 크기는 크지만
		//float가 더 세밀하고 표현범위가 넓기때문에
		//long타입의 변수는 float타입의 변수로 변환된다.
		float fNum1 = lNum1;
		
		
		//3. 강제형변환1 - 바이트가 크기가 큰 변수를 바이트
		//크기가 작은 타입으로 형변환 해야할 때 변환될 자료형을
		//반드시 명시해줘야한다.
		int uniCode = 65;
		char ch = (char)uniCode;
		
		
		//4. 강제 형변환에서 범위를 초과한 값을 변환 했을때
		long lNum2 = 32770L;
		short sNum2 =(short)lNum2;
		
		//short의 범위인 32,767을 초과하면 -32,768부터 다시 시작된다.
		//32,770은 3이 남기때문에 32767부터 3칸을 더 이동한다
		// -32768 -> -32767 -> -32766
		System.out.println(sNum2);
		
		
		//5. 연산에서의 형변환
		//피연산자중 바이트 크기가 작은 변수가
		//바이트 크기가 큰 자료형으로 변환된 후에
		//연산이 진행된다.			
		long result = lNum2 + iNum1;
		
		
		//강제 형변환을 통해 크기가 큰 변수를
		//크기가 작은 자료형으로 명시하여 변환한후에 연산한다.
		int result2=(int)lNum2 + iNum1;
		
		
		//6. 문자열 결합 연산에서의 형변환
		//문자열과 다른 모든 타입들을 + 연산하면
		//다른 모든 타입들은 문자열로 형변환 후
		//문자열 결합 연산이 진행된다.
		String str = "java";
		int version = 11;
		
		System.out.println(str + version);
		
		
		
		
		
	}

}
