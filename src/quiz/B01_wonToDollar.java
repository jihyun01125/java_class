package quiz;

import java.util.Scanner;

public class B01_wonToDollar {

	// �ѱ� ���� �Է��ϸ� 
	// �޷� ���Ž� �󸶸� �ް� �Ǵ��� ������ִ� ���α׷��� ��������
	// (ȯ���� �˻�, �Ҽ� ��° �ڸ����� ���, ȯ�� ������ 1.75%)
	
	public static void main(String[] args) {
		
		System.out.print("�󸶸� ȯ���Ͻðڽ��ϱ�? ");
		int won = new Scanner(System.in).nextInt();
		
		double ex_fee_rate = 0.0175;
		
		// ������ ���� ��
		double dollar = won / 1138.96;
		double ex_fee = dollar * ex_fee_rate;
		
		// ������ ���� ��
		dollar = dollar - ex_fee;
		
		System.out.printf("%d������ %.2f�޷��� �����߽��ϴ�.\n",
				won, dollar);
		System.out.printf("(������ : %.2f �޷�)\n", ex_fee);
	}
	
}










