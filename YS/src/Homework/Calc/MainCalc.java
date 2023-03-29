package Homework.Calc;

public class MainCalc {

	public static void main(String[] args) {
		Calc[] answer = new Calc[4];
		
		
		answer[0] = new Add();
  		answer[1] = new Div();
  		answer[2] = new Sub();
  		answer[3] = new Mul();

  		answer[0].setValue(10, 5);
        answer[1].setValue(10, 5);
        answer[2].setValue(10, 5);
        answer[3].setValue(10, 4);
  		
  	    System.out.println(answer[0].calculate());
  	    System.out.println(answer[1].calculate());
  	    System.out.println(answer[2].calculate());
  	    System.out.println(answer[3].calculate());
 		
  	
  	   
		  								

	}

}
