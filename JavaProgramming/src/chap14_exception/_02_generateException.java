package chap14_exception;

public class _02_generateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			ArrayIndexOutOfBoundsException aie =
//			new ArrayIndexOutOfBoundsException(1);
//			throw aie;
//			
			
			//1. NullpointerException
//			NullPointerException ne =
//					new NullPointerException("null입니다.");
//			
//			throw ne;
//			
			//2. ArithmeticException
			ArithmeticException ae =
					new ArithmeticException("분모가 0일 수 없습니다.");
			
			throw ae;
			
		} catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch(Exception e) {      // 위에있는 예외처리 필터들을 모두 통과할시 마지막 에러를 잡아줌.
			// 마지막 catch문은 위에 선언한 catch문들을
			// 다 통과한 나머지 예외들을 처리할 수 있게
			// 모든 예외를 처리할수있는 최상위클래스이다.
			// Exception <
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
