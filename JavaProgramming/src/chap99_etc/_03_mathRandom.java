package chap99_etc;

public class _03_mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 난수발생 첫번째 방식
		//Math.random() 사용
		//0 <= Math.random() < 1 사이의 난수를 발생
		System.out.println(Math.random());
		
		//2. 1 <= 난수 < 11
		//0 <= rand < 10
		//1 <= rand + 1
		int rand =(int)(Math.random() * 10) + 1;
		System.out.println(rand);
		
		
		//3. 1~45 까지 난수 발생기
		
		int random =(int)(Math.random() * 45) + 1;
		System.out.println(random);
		
		//4. 200~299까지 난수 발생기
		int random2 =(int)(Math.random() * 100) + 200;
		System.out.println(random2);
		
		//a~b까지 랜덤
		//(int) (Math.random() * (b - a + 1)) + a
		// 즉 a는 최대범위값, b는 최소범위값이다.
		// 최대범위값에서 최소범위값을 뺀 후 +1을 더해준다.
		
		
		
	}

}
