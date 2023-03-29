package chap05_Array;

public class _05_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] score = {100,84,92,65,71};
        
        
        int sum = 0;
        double avg;
        
        for(int s : score) {
        	System.out.println(s);
        	sum += s; 
        } System.out.println("스코어의 총 합 :" + sum); 
		  avg = sum / score.length;
		  System.out.println(avg);
		
		
	}

}
