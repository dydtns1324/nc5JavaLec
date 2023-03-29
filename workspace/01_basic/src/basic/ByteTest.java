package basic;

public class ByteTest {

	public static void main(String[] args) {
		System.out.println("hello Java");
		System.out.println();
		System.out.println('A'<'B');
		System.out.println('A' + 3);
		System.out.println((char)('A' + 3));
		System.out.println();
		
		System.out.println(2 + 5);
		System.out.println('2' + '5'); // 50+53
		System.out.println('2'-48 + '5'-48); // 103을 7로 만들기
		System.out.println('2'-48 + '5'-'0'); // '0'=48
		System.out.println('2'-'0' + '5'-'0'); // '0'=48
				

	}

}
/*
bit								한글
- 정보의 최소 단위
- 0 또는 1						- 자음 또는 모음

byte
- 영문자 또는 숫자 또는 특수문자
- 1byte = 8bit

	컴파일	  기계어(2진수)			ASCII문자코드
'A' ---------- 0100 0001 ---------- 65
'B' ---------- 0100 0010 ---------- 66
'C' ---------- 0100 0011 ---------- 67
'a' ---------- 0110 0001 ---------- 97
5 ------------ 0000 0101 ---------- 5
0 ------------ 0000 0000 ---------- 0
'0'----------- 0011 0000 ---------- 48
*/