package chap15_usefulClass;

public class _07_stringBuffer02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder(100);
		StringBuilder sb2 = new StringBuilder("bitcamp");
		
		sb1.append("navercloud");
		
		//capacity()와 length의 차이점
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		//delete()와 insert()
		StringBuilder sb3 = sb2.delete(3, 7);
		System.out.println(sb3);
		
		sb3 = sb3.insert(3, "camp");
		System.out.println(sb3);
		//reverse();
		sb1 = sb1.reverse();
		System.out.println(sb1);
		
		//setCharAt()
		sb3.setCharAt(3, 'C');
		System.out.println(sb3);
		
		//setLength()
		sb3.setLength(10);
		System.out.println(sb3);
		
						
		
		
		
	}

}
