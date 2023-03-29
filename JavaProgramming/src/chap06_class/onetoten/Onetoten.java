package chap06_class.onetoten;

public class Onetoten{
      
      public int sum = 0;
      public int sum2 = 0;
      public int sum3 = 0;
      
      public void printNumber() {
    	     
    	 for( int i = 1; i <= 10; i++) {
    		  sum += i;    		     	 
      } //  System.out.println(sum);
      
      
      }public void printNumber2() {
 	     for( int i = 1; i <= 5; i++) {
	    	 sum2 += i;
	    	 sum3 = sum + sum2;
	      
 	  }   System.out.println(sum3 + 5);
      }
      
      //public void () {
      	
      }
