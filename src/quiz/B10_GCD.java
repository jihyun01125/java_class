package quiz;

public class B10_GCD {

	// �� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ����� 
	// �� �ִ����� : �� ������ ����� �� ���� ū �����	
	public static void main(String[] args) {
//		1. ������ �� �ڿ��� a, b�� �־�������. ���� ū ���� a��� ����
		
//		2. a�� b�� ���� �������� n �̶�� �ϸ� (a%b = n)
//		   n�� 0�϶�, b�� �ִ� �����(GCD)�Դϴ�.

//		3. ���� n�� 0�� �ƴ϶��, 
// 		   a�� b���� �ٽ� �ְ� 
//		   b�� n�� ���� �� �� �ٽ� 2.�� ������ �ݺ�
		int a = 100;
		int b = 50;

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int n = -1;		
		for (; n != 0;) {
			n = a % b;
			a = b;
			b = n;
		}
		System.out.println("�ִ� ������� " + a + "�Դϴ�.");
		

		
//		// num1�� �� ũ�� ���� �ٲ۴�
//		if (num1 > num2) {
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//		
//		int gcd = 1;
//		for (int i = num1; i > 0; --i) {			
//			if (num1 % i == 0 && num2 % i == 0) {
//				gcd = i;
//				break;
//			}			
//		}
//		System.out.printf("'%d'�� '%d'�� �ִ������� '%d'�Դϴ�.\n", 
//				num1, num2, gcd);
	}
}














