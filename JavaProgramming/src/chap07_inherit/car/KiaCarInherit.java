package chap07_inherit.car;

public class KiaCarInherit extends Car {
		public String company;
		public String model;
		public String color;
		public int price;
		

		
		public void speedUp() {
			System.out.println("엑셀을 올린다.");
		}
		
		public void speedDown() {
			System.out.println("브레이크를 밟는다.");
		}
}
