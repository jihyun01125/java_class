package quiz;

import java.util.Scanner;

public class B10_NextPrime {

	// ����ڷκ��� ���ڸ� �Է¹����� 
	// �Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ����غ�����
	
	public static void main(String[] args) {
		System.out.print("���� > ");
		int user = new Scanner(System.in).nextInt();
		
		for (int i = user; true; ++i) {			
			int count = 0;
			int sqrt = (int)Math.sqrt(i);
			for (int j = 2; j <= sqrt; ++j) {						
				if (i % j == 0) {
					++count;
				}				
			}
			if (count == 0) {
				System.out.printf("'%d'�� ���� �Ҽ���'%d'�Դϴ�.\n", 
						user, i);
				break;
			}
		}
		
	}
}
