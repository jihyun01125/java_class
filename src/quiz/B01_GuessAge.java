package quiz;

import java.util.Scanner;

public class B01_GuessAge {

	// ����ڷκ��� ������ �⵵�� �¾ �⵵�� �Է¹�����
	// �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �⵵�� �Է� > ");
		int thisYear = sc.nextInt();
		System.out.print("�¾ �⵵�� �Է� > ");
		int birthYear = sc.nextInt();
		
		int age = thisYear - birthYear + 1;
		System.out.printf("����� ���̴� %d�� �Դϴ�.\n", age);
		
	}
	
}










