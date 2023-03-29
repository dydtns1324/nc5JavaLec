package chap04_controllstatement;

public class _03_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int grade = 93;
		
		switch (grade) {
			case "1" : 
				System.out.println("점수는 90점" + " 이상입니다");
				break; // 일치하는 조건을 만나면 switch문을 종료
			case "2" :
				System.out.println("점수는 90점" + " 미만 80점 이상입니다");
				break;
			case "3" :
				System.out.println("점수는 80점" + " 미만 70점 이상입니다");
				break;
			default :
				System.out.println("점수는 70점 미만입니다.");
				break;
						
				
		
		}
		
		
		
		
		
		
		
		
		
	}

}
