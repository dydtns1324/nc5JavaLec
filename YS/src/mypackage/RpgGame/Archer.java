package mypackage.RpgGame;

public class Archer extends Character {
	
			public int attack;
	
	
	public Archer(String name, int level,int power, int defense, int HP, int MP) {
		super(name, level,power, defense, HP, MP);
	
	}

	public void normalAttack() {
		  System.out.println("기본 공격을 날립니다.");
		  
	  }
	  
	  public void running() {
		  System.out.println("캐릭터가 달립니다.");
		  
	  }
	  
	  public int skill1() {
		  System.out.println(name +"가 레인애로우를 사용합니다");
		  attack = level * 200 + power;
		  
		  skillDamege = attack * 45;
		  skillDamegePercent = 140;
		  
		  damege = skillDamege * skillDamegePercent / 100;		  
		  System.out.println(name + "가 적에게 " + damege + "데미지를 입혔습니다!");
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
