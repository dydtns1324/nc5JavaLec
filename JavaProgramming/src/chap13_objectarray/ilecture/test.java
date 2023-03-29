package chap13_objectarray.ilecture;

public class test {

	public static void main(String[] args) {
	     
		ILecture[] ilecArr = new ILecture[5];
		
		ilecArr[0] = new Programming("파이썬", 30, 45);
		ilecArr[1] = new English("영어", 25, 50);
		ilecArr[2] = new Mathmetics("수학", 20, 50);
		try {
			  for(int i = 0; i < ilecArr.length; i++) {
		        	ilecArr[i].proceedLecture();
			  }  	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
      
        
		

	}

}
