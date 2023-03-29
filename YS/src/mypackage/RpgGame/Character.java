package mypackage.RpgGame;

public class Character {
	
	  public String name;
	  public int level;	 
	  public int power;
	  public int defense;
	  public int HP;
	  public int MP;
	  public int damege;
	  public int skillDamegePercent;
	  public int skillDamege;
	  
	  public Character(String name, int level, int power ,int defense, int HP, int MP) {
	        this.name = name;
	        this.power = power;
	        this.level = level;	       
	        this.defense = defense;
	        this.HP = HP;
	        this.MP = MP;
	        
	  }
	  
	  public void normalAttack() {
		  System.out.println("기본 공격을 날립니다.");
		  
	  }
	  
	  public void running() {
		  System.out.println("캐릭터가 달립니다.");
		  
	  }
	  
	  public int skill1() {
		  System.out.println(name + "가 1번스킬을 사용합니다.");
		  
		  return damege;
	  }
	  
	  public void skill2() {
		  System.out.println("캐릭터가 2번스킬을 사용합니다");
	  }
	  
	  public void skill3() {
		  System.out.println("캐릭터가 3번스킬을 사용합니다.");
	  }
	  
	  public void jump() {
		  System.out.println("캐릭터가 점프합니다.");
		  
	  }
	  
	  public void levelUp() {
		  System.out.println("캐릭터의 레벨이 올랐습니다!");
		  
	  }

}
