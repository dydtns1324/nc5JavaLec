package Homework.Printer;

import java.util.Scanner;

public class PrinterMain {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 RazerPrinter razer = new RazerPrinter();
		 InkJetPrinter inkjet = new InkJetPrinter();
		 
		 razer.setPrinterInfo("Samsung","White", 2022);
		 inkjet.setPrinterInfo("LG","Black", 2022);
		 
		System.out.println("레이저 프린터 정보를 확인하시려면"+" 시작" + "을 입력하세요" ); 
		System.out.println("그렇지 않으면" + " 종료" + "를 입력하세요");
		while(true) {
		razer.power();		
		if(razer.power.equals("레이저")) {
		razer.PrintInfo();
		
		
		
	 } 
		inkjet.power();
		if(inkjet.power.equals("잉크제")) {
		inkjet.PrintInfo();
		
	 }
		
		
		
		

}
}}