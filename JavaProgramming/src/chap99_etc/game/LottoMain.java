package chap99_etc.game;

import java.util.Arrays;
import java.util.Random;

public class LottoMain {

	public static void main(String[] args) {
		
		int[] selectNumber = new int[6];
		//Random random = new Random(3); // seed가 같으면 나오는 숫자도 같다. 그래서 보통은 비워둔다.
		
		Random random = new Random(); // seed 값을 사용하지 않으면 보통 timestemp - 컴퓨터 안에 있는 시계(long)
		
		// 번호 선택
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			
			// 중복이 되는 경우의 처리문
			if (i != 0) { // 배열의 인덱스가 0이 아니면
				for (int j = 0; j < i; j++) { // 인덱스 0(j) 부터 i의 값까지의 인덱스번호를 비교한다.
					if (selectNumber[i] == selectNumber[j]) { // 값이 같으면 중복된 숫자이므로
						i--; // 이전 인덱스로 간다. (이전 인덱스에 랜덤값을 다시넣는다) 
						break;

					} // if(selectNumber[i] == selectNumber[j]) end
				} // for j end
			} // if(i != 0) end
		} // for i end

		System.out.println();

		int[] winningNumber = new int[6]; // 당첨 번호 배열
		random = new Random(5); // 당첨번호 시드는 비워둬도 되지만 비우나 시드를 넣으나
								// 어차피 1등은 힘들다....
		
		// 당첨번호의 값을 생성하는 반복문
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
		}
		
		System.out.println();

		// 선택된 로또 번호를 오름차순으로 정렬시킨다.
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		System.out.println("선택 번호 : " + Arrays.toString(selectNumber)); // 선택 번호 출력
		System.out.println("당첨 번호 : " + Arrays.toString(winningNumber)); // 당첨 번호 출력
		boolean result = Arrays.equals(selectNumber, winningNumber); // 선택번호와 당첨번호 비교 (1등인지 아닌지)
		System.out.print("당첨 여부: ");
		if (result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
		
		// 랜덤 선택 번호(i)와 내가 선택한 로또번호(j)가 몇개나 같은지 카운트하는 프로그램
		int i = 0;
		int j = 0;
		int cnt = 0;

		// i와 j가 6이 아니여야 한다.
		while (i != 6 && j != 6) {
			
			//i 25 26 27 28 29 30
			//j 24 25 
			
			// 로또 번호 한개 맞히면 cnt 1증가
			if (selectNumber[i] == winningNumber[j]) {
				cnt++;
				i++; // 다음 인덱스로 넘어간다
				j++; // 다음 인덱스로 넘어간다
			} else if (selectNumber[i] > winningNumber[j]) {
				j++; // 내가찍은번호가 당첨번호보다 크면 당첨번호 인덱스를 올린다.
					 // 내가찍은번호가 당첨번호의 다음인덱스보다 또 크다면 당첨번호 인덱스를 올린다.
					 // 당첨번호 인덱스가 6까지 갈때동안 내가찍은번호가 계속 높다면 당첨번호인덱스에는 내가찍은 번호가 하나도없는것이다!!
			} else {
				i++;
			}

		} // while end
		
		System.out.println("맞힌 개수 : " + cnt);

	}// main end
}// class end
