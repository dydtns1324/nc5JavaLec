package chap05_Array;

public class _03_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chArr = {'B','c','T','p','P','i'};
		char[] convertArr = new char[6];
		
		//BcTpPi 를
		//bCtPpI 로 바꿔야한다
		
		//소문자는 대문자로, 대문자는 소문자로 변경후 convertArr에 저장
		
		
		for (int i = 0; i < chArr.length; i++) {
			
		     if(chArr[i] == 'B') {
		    	convertArr[0] = 'b';			 
		 }	 else if(chArr[i] == 'c') {
			    convertArr[1] = 'C';
			 if(chArr[i] == 'T') {
				convertArr[2] = 't';
		    }else if(chArr[i] == 'p') {
				convertArr[3] = 'P';
		    }else if(chArr[i] == 'P') {
				convertArr[4] = 'p';
		    }else if(chArr[i] == 'i') {
				convertArr[5] = 'I';
				System.out.println(convertArr[5]);
				
			 }else {
				
				
				
			 }
		 }
		}
	}
}
			
		 
		     
		 
	


		  
		
		
	


