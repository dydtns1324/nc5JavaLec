package chap07_inherit.Animal;

public class Animal {
	public int age;
	public int size;
	public int legCnt;
	public boolean hasWing;
	
	
	public Animal() {
		
	}
	
	public Animal(int age, int size , int legCnt
			, boolean hasWing) {
		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = hasWing;
		
	}
		
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLegCnt() {
		return legCnt;
	}

	public void setLegCnt(int legCnt) {
		this.legCnt = legCnt;
	}

	public boolean isHasWing() {
		return hasWing;
	}

	public void setHasWing(boolean hasWing) {
		this.hasWing = hasWing;
	}
	public void eat() {
		System.out.println("식사를 한다.");
		
	}
	
	

}
