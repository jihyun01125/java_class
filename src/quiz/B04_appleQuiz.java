package quiz;

// Ctrl + Shift + O : �ڵ� import
import java.util.Scanner;

public class B04_appleQuiz {

	// ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	
	// ����ڰ� ����� ������ �Է��ϸ� ����� ��� ��� ���� �ʿ���
	// �ٱ����� ������ ����غ�����.
	public static void main(String[] args) {
		// ���� �տ� final : ������ �Ұ����� ������ �ȴ�
		final double BASKET_SIZE = 13;
		
		System.out.print("��� > ");
		int appleCount = new Scanner(System.in).nextInt();
		
		if (appleCount < 0) {
			System.out.println("0 �̻��� ���ڸ� �Է��ϼž� �մϴ�.");
		} else {
			int needBasket = (int) Math.ceil(appleCount / BASKET_SIZE);
			System.out.printf("�ʿ��� �ٱ��ϴ� %d�� �Դϴ�.\n", needBasket);
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}





