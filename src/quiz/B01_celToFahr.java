package quiz;

import java.util.Scanner;

public class B01_celToFahr {
	// ����ڷκ��� ���� �µ��� �Է¹����� 
	// ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� �������� 
	// (��ȯ ������ �˾Ƽ� �˻�, ����� �Ҽ� ù° �ڸ�����)
	
	public static void main(String[] args) {		
		
		// sc�� �ٽ� ������� ���� �����̱� ������ ���� �������� �ʴ´�
		System.out.print("������ �µ� > ");
		double cel = new Scanner(System.in).nextDouble();
		double fahr = (cel * 9 / 5) + 32;
		
		System.out.printf("��ȯ�� �µ��� %.1f���Դϴ�.\n", fahr);
		System.out.printf("���� �µ��� %.1f�ɿ����ϴ�.\n", cel);
	}
	
}








