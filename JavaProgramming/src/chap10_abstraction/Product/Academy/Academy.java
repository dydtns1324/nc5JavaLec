package chap10_abstraction.Product.Academy;

public abstract class Academy {
	
	public int classCnt;
	public int studentCnt;
	public int teacherCnt;
	
public abstract void teaChing();

public abstract void homeWorking();

public abstract void rest();

public abstract void attend(int number);

public void moveTo(int studentCnt) {
	System.out.println("학원에서 학원으로" + studentCnt + "명 만큼 이동했다.");
	
	
}

	


}
