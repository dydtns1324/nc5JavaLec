package chap07_inherit.Animal;

import java.util.Scanner;

public class Whale extends Animal {
	public String food;
	public String color;
	public boolean hasfur;
	
			
	public Whale(String food, String color, boolean hasfur ,
		   int age, int size , int legCnt , boolean hasWing) {
		
	   super(age,size,legCnt,hasWing);
		
		
		this.food = food;
		this.color = color;
		this.hasfur = hasfur;
		
	}
	
	
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isHasfur() {
		return hasfur;
	}

	public void setHasfur(boolean hasfur) {
		this.hasfur = hasfur;
	}
	
	public void printWhaleInfo(Whale whale) {
	    System.out.println("고래의 정보 입니다.");
	    System.out.println(" 고래의 색상 :" + whale.getColor());
	    System.out.println(" 고래의 털 유무 : " + whale.isHasfur());
	    System.out.println(" 고래의 나이 :" + whale.getAge());
	    System.out.println(" 고래의 크기 :" + whale.getSize());
	    System.out.println(" 고래의 다리갯수 : " + whale.getLegCnt());
	    System.out.println(" 고래의 날개유무 : " + whale.isHasWing());
	   
	}

	public void whalelife() {
		String hasfur = "털";
		System.out.println("고래는 " + food + "을 먹으며 살아갑니다.");
		System.out.println("그리고 색갈은 대부분이" + color +"를 띄며,");
		System.out.println(hasfur + "이 없고");
		System.out.println("성격은 온순합니다.");
		
	}
	
	public void whaleGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("고래 게임을 시작합니다!" + " 사용자가 입력한 숫자만큼 고래가 도망칩니다");
		
		int total = 0;
		while(total < 1000) {	
		int input = sc.nextInt();
	    if(input < 1000) {
	    	total += input;
	    	System.out.println("고래가 " + input + "M 만큼 도망갔습니다!!" +
	    	"현재" + total +"M 만큼 이동했습니다.");	    	
	    }else {
	   System.out.println("입력값이 너무 큽니다");
	   }
	 }
			System.out.println("합 1000미터가 넘었으므로 게임을 종료합니다");
  }
}

		
		
		

	
	
	

