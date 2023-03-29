class NumberTest2 {
             public static void main(String[] args) {
                         System.out.println(26 / 3); //8
                         System.out.println(26.0 / 3); //8.666666
                         System.out.println(26/3); //8
                         System.out.println(26.0/3); //8.666666
                         System.out.println(String.format("%4.2f", 26.0/3) );
                         System.out.println(String.format("%10.2f", 26.0/3) );
                         System.out.println(String.format("%.2f", 26.0/3) );
             }
}

/*
정수(소수점이 없음)
실수(소수점이 있음)

변환문자
%d, %5d
%f, %전체자리수.소수이하자리수f
8.67( 소수점 포함 총 4자리 , 소수점 이하 2자리)
%4.2f
%c
%s
*/