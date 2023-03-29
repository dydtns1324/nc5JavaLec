package Homework.Homework0323.Middle;

public class Middle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer str = new StringBuffer(30);
		StringBuffer str2 = new StringBuffer("hello");
		
		str.append(str2);	
		
		
		for ( int i =str.length(); i < 30; i++) {
		
			if (( str.length() + 1 ) % 3 == 0){
				
			   str.append('b');
				
		   }  else if ((str.length() + 1) % 3 == 1) {
			   str.append('i');
			   
		   }  else {
			   str.append('t');
		   }
  
		}
		 System.out.println(str);
		  								
		
	}

}
