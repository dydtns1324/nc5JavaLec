package chap02_variables;

public class _01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 변수란
		//좋아요 기능 예시
		//좋아요 개수
		int likecnt; 
		//로그인한 사용자가 좋아요 눌렀는지 여부
		boolean isUserLike;
		
		//2. 변수의 선언
		//2-1. 첫 글자는 문자 , $ , _ 만 허용
		int $price;  // O
  		int _bit;    // O
		int naverCloud; // O
// -----------------------------
//		int %bit; // X
//		int 2023year; // X
//		int @coding;  // X
		
		//카멜케이스 + 직관적 변수명
	    //좋아요 개수
		int likeCnt2;
		// 게시물 개수
		int boardCnt;
		//OS 출력장치의 출력횟수
		int osOutPrintCnt;
		
		// 변수명 대소문자 구분
		// 대소문자 구분을 통해 같은 의미의 변수를 여러개 생성가능		
 		int lunchTime;
		int LunchTime;
		int luNchTime;
		
		//3. 변수의 사용
		//변수에 값 대입 (저장)
		//최초 값 저장은 초기화라고 한다
		int likeCnt = 125;
		//변수의 선언과 동시에 초기화
		int studentCnt = 30;
		//상수를 제외한 변수는 값의 변경이다.
		studentCnt = 51;
		
		//초기화 되지 않은 변수를 사용할 경우 에러 발생
		
		int errorVal;
		// 변수가 초기화되지 않았다라는 에러가 발생한다.
		//System.out.println(errorVal);
		
		// 변수의 사용은 변수명을 통해 메소드에 저장된 값을
		// 가져와서 사용한다
		
		System.out.println(likeCnt);
		System.out.println(studentCnt);
		
		
		//실수 리터럴 10 = E or e
		//EX. 5E7 = 5 * 10^7
		
		
		//4. 이스케이프 문자
		//큰 따옴표나 작은 따옴표를 변수의 값으로 저장하거나
		//출력하고 싶을 때 사용한다
	    System.out.println("리터럴은 \"초기화\"코드에 자주 등장한다.");
	    System.out.println('\'');
	    
	    String tempStr = "aaaa \"bbbb\"";
	    
	    //탭 키만큼 공백줄 때  \t
	    //줄바꿈이 필요할 때는  \n
	    System.out.println("12시 50분부터 \t 점심시간 \n 맛점하세요.\n");
	    
	    
		
		
	
	}

}
