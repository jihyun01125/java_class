package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	// ����ڰ� ���ڸ� �Է����� ��
	
	// 1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
	
	// 2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ�
	//    �� �� �� ������ ����غ����� 
	public static void main(String[] args) {
		
		System.out.print("���� > ");
		int user = new Scanner(System.in).nextInt();
		
		int start = 10;
		int end = user;
		
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		int sum = 0;
		for (int i = start; i <= end; ++i) {
			System.out.println(i);
			sum += i;
		}
		
		int start2 = 1;
		int end2 = user;
		
		if (start2 > end2) {
			int temp = start2;
			start2 = end2;
			end2 = temp;
		}
		
		int count = 0;
		System.out.print("[");
		for (int i = start2; i <= end2; ++i) {			
			if (i % 3 == 0) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.print("]\n");
		System.out.println("Q1. 10������ ���� - " + sum);
		System.out.println("Q2. 3�� ����� ���� - " + count + "��");
	}
}











