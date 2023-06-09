package chap01_java;

public class _01_HelloJava {

	public static void main(String[] args) {
		//System : 현재 사용중인 운영 체제
		//out : 운영체제에서 사용중인 출력장치(모니터)
		//println() : 괄호안의 내용을 출력한 후 라인을 변경해라
		//            다음 명령은 다음줄부터 출력된다.
		//ln = line의 약자
		//print() : 출력 후에 줄바꿈 없음.
		//printf() : 형식 지정 출력방식
		//형식 : %d = 정수 , %f = 실수, %c = char(캐릭터) = 문자,
		// %n = 줄바꿈
		System.out.println("Hello Java");
		System.out.printf("%d %n %f %n %c", 
				            1,  3.14,  'A');

	}

}
