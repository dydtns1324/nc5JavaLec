package if_;



public class If7 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		result = ( (num1 += 10) < 0 && (num2 += 10) > 0);
		System.out.printf("result=%s%n", result);
		System.out.printf("num1=%d, num2=%d%n", num1, num2);
	}
}

/*
[문제] 가위 바위 보 게임
- 가위는 1, 바위는 2, 보자기는 3으로 설정한다.
- 컴퓨터는 1~3 까지의 난수를 발생한다.

[실행결과]
가위는 1, 바위는 2, 보자기는 3 입력 : 2

컴퓨터 : 가위,  나: 바위
이겼다.

*/