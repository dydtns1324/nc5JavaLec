package chap03_operator;

public class _03_logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 관계연산자
		//두 수의 크기를 비교하거나 두 수의 동일여부를 판단
		int num1 = 110;
		int num2 = 215;
		
		System.out.println("num1 < num2 : " + (num1 < num2));//true
		
		
		System.out.println("num1 >= num2 : " + (num1 > num2)); //false		
			
	
		System.out.println("num1 == num2 : " + (num1 == num2));//false
		
		
		//String 값의 동일 여부를 판단할 때 ==는 사용하지 않는다.
		//==을 사용해버리면 같은값인지 비교하는게 아닌
		//같은 객체를 참조하고있는지를 비교한다.
		//값의 동일여부를 비교하려면 .equals() 메소드를 사용
		String str1 = new String ("hello");
		String str2 = new String ("hello");
		
		//같은 객체를 참조하는지의 여부 ( == )
		System.out.println(str1 == str2);
		
		
		//값의 동일여부 비교
		System.out.println(str1.equals(str2));
		
		
		//2. 논리연산자(&&, || , !)
		int num3 = 10;
		int num4 = 33;
		
		System.out.println("num1 < num2 && num3 / num4 == 0 : " +
		                   (num1 < num2 && num3 / num4 == 0)); //true
		
		
		System.out.println("false || num2 < 100 : " +
                (false || num2 < 100)); //false
		
		
		System.out.println("!(num4 > 2000 : " +
                !(num4 > 2000)); //!false
		
		
		
		
		
		
		
		
	}
	
	

}
