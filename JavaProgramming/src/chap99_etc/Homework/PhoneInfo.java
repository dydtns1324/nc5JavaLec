package chap99_etc.Homework;

public class PhoneInfo {
       public String[] name = new String[100];
       public String[] phoneNum = new String[100];
       
       int i = 0;
       
       
       public void insertPhoneInfo(String name, String number) {
    	   this.name[i] = name;
    	   this.phoneNum[i] = number;
    	   i++;
    	    		//이름과 번호를 배열에 저장
       }
       
       				//모든 PhoneInfo 출력
       public void printAllPhoneInfo() {
    	   for( int j = 0; j < i; j++);
    		   System.out.println("이름 : " + this.name[i] + " 번호 : " + this.phoneNum[i]);
    	   }
    	  
       }
       
                    //번호에 해당하는 이름과 번호 출력
	   public void printPhoneInfo(int index) {
		   if(name[index - 1] != null ) {
			   
 	   
	   
	   
	   }	
	
}
