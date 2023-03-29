package chap06_class.animal;

public class Bird {
		//날개(int wing) , 
	    //색갈(String)
	    //새이름(String name)
		//크기(int size)
		//식습관(String food)
	
	
	    //날다(void fly
		//ex: 독수리(name)는 날개를 이용하여 하늘을 납니다.
		//운다(void cry)
		//ex: 독수리는 나무에 앉아 웁니다.
		//걷는다(void walk)
		//ex: 독수리는 땅을 걷는다
		//먹이를 먹는다 (void eat)
		//독수리는 고기(food)를 먹는다
	    public String name;	  
	  	public String color;
	  	public String food;
	  	public int wing;
	  	public int size;
	  	
	  	public Bird(String name) {
	  		this.name = name;
	  		
	  	}
	  	
	  	public Bird(String name, String color) {
	  		this.name = name;
	  		this.color = color;
	  	}

	  	public void fly() {
	  		
	  		System.out.println(name+"는" + wing +"개의" + color +"을 띤 날개를 이용하여 하늘을 날고있다.");
	  	}
	  			  		  	
	  	public void cry() {
	  		System.out.println(name+"는 나무에 앉아서 울기도한다");
	  	}
	  	
	  	public void walk() {
	  		System.out.println(name+"는 땅을 걷고있다가");
	  	}
	  	
	  	public void eat() {
	  		System.out.println(food+"을(를) 먹습니다.");
	  	}
	  	
	  	public void Info() {
	  		System.out.println(name + "는 크기가" + size + "이며" + wing +"개의 날개를 가지고있으며 몸의 색갈이"
	  		+color+"이고 주로"+food+"를 즐겨 먹습니다.");
	  		
	  		
	  	}
	  	
	  	
	  	
	  	
}	
