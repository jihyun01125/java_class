package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	// ������ �Է¹����� �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.
	
	// 	90�� �̻�	: A���
	//	80�� �̻�	: B���
	//	70�� �̻�	: C���
	//	60�� �̻�	: D���
	//	�� �� 	: F���
	
	// �� ������ 0������ 100������ �ֽ��ϴ�.
	public static void main(String[] args) {
		System.out.print("���� > ");
		int score = new Scanner(System.in).nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("������ �̻��ؼ� ���α׷��� �����մϴ�.");			
			return; // main()�� ������
			// System.exit(0); // ���α׷��� �����Ѵ�
		}
		
		char grade = 'F';
		
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		
		System.out.printf("����� ���� : %d\n��� : %c\n", score, grade);
	}
}








