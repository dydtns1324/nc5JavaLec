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
����(�Ҽ����� ����)
�Ǽ�(�Ҽ����� ����)

��ȯ����
%d, %5d
%f, %��ü�ڸ���.�Ҽ������ڸ���f
8.67( �Ҽ��� ���� �� 4�ڸ� , �Ҽ��� ���� 2�ڸ�)
%4.2f
%c
%s
*/