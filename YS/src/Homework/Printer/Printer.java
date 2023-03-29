package Homework.Printer;

import java.util.Scanner;

public class Printer {
	
	        Scanner sc = new Scanner(System.in);
	        
          
			public String name;
			public String color;
			public String power;
			
			public int year;			
			public int level = 100;
					    					
						
			public void power() {
													
				
				power = sc.next();					
				
				if(power.equals("시작")) {
					
				System.out.println("프린터가 활성화 되었습니다");
				System.out.println("레이저 또는 잉크제를 입력하세요.");
							
				}else if(power.equals("종료")) {		
					
				System.out.println("프린터가 종료 되었습니다");														
				System.exit(0);
				
				}else if(power.equals("레이저")){
				 
				
				}else if(power.equals("잉크제")) {
					
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}   
																		  
			
			public void setPrinterInfo(String name, String color, int year) {
				this.name = name;
				this.color = color;
				this.year = year;				
			
				
			}
			
			public void PrintInfo() {
				System.out.println("이름 : " + name);
				System.out.println("색상 : " + color );
				System.out.println("제작년도 : " + year);
			}   
			

			
				
			
			
		
			
			
}
