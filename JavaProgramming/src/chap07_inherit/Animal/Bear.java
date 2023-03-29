package chap07_inherit.Animal;

public class Bear extends Animal{
	
		public String meat;
		public String color;
		public String doAttack;
			   
				
       public Bear(int age ,int size , int legCnt, boolean hasWing ,
    		       String meat , String color, String doAttack)  {
    	          
    	   super(age,size,legCnt,hasWing);
    	   this.meat = meat;
    	   this.color = color;
    	   this.doAttack = doAttack;
			        	   
       }


	public String getMeat() {
		return meat;
	}


	public void setMeat(String meat) {
		this.meat = meat;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getDoAttack() {
		return doAttack;
	}


	public void setDoAttack(String doAttack) {
		this.doAttack = doAttack;
	}          

	public void printBearInfo(Bear bear) {
		System.out.println("곰의 색상 :" + bear.color);
		System.out.println("곰의 날개 유무 :" + bear.hasWing);
		System.out.println("곰의 나이 :" + bear.age);
		
	}
			
}
	
	


