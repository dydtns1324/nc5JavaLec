package Homework.Homework0323;

public class MathStudent extends CommonStat{
	
	public int studentNumber;
	public StringBuffer name;
	public String[] subject;
	public int[] finalExam;
	
	public MathStudent(int sno, StringBuffer name) {
		
	}
	
	public void saveInfo(int index, String subject) {
		this.subject[index] = subject;
		
		
		
	}
	
	public void printInfo() {
	
		
	}
	
	public double getAvg() {
		
		return 0;
	}

}




