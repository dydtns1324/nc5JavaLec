package Homework.Homework0323;

public interface Student {
	//해당 학생의 과목과 점수배열이 있는데
	//과목이랑 점수를 하나씩 저장해주는 메소드	
	void saveInfo();
	
	//학번,이름,평균점수 출력하는 메소드
	void printInfo();
	
	//점수배열을 이용해서 평균점수를 구하는 메소드
	double getAvg();
	
	
	public void initSubScore(int cnt);
	
	public int getSno();
	
	public StringBuffer getName();

	void searchStudentInfo();

}
