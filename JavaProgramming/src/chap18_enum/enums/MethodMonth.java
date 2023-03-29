package chap18_enum.enums;

public enum MethodMonth {
	JAN(1),FEB(2),MAR(3),APR(4),MAY(5),JUN(6),JUL(7),AUG(8),
	SEP(9),OCT(10),NOV(11),DEC(12);
	
	private int monthValue;
	
	MethodMonth(int monthValue) {
		this.monthValue = monthValue;		
	}

	public int getMonthValue() {
		return monthValue;
	}
	
	public static void printMonth(int month) {
	  
		MethodMonth[] monthArr = values();
		for( int i = 0; i < monthArr.length; i++) {
			if ( monthArr[i].getMonthValue() == month) {
				System.out.println("입력한 달은 " +
						monthArr[i].getMonthValue()
						+"월 입니다.");				
		}				
	   }		
	  }  
	
	public void printAddMonth(int month) {
		if(this.getMonthValue() + month <= 12) {					
		System.out.println(month + "개월 뒤는 "
				+(this.getMonthValue() + month)
				+"월 입니다.");
	  } else {
		  int remain = this.getMonthValue() + month - 12;
	  		System.out.println(month + "개월 뒤는 "
				+(JAN.getMonthValue() + remain - 1)
				+"월 입니다.");
	  }
   }	
}
	
	
	

