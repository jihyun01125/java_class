package quiz;

import java.util.Random;

public class B12_tempPassword {

	// ���� 4�ڸ��� �ӽ� ��й�ȣ ���ڿ��� �����ϴ� ���α׷��� ��������
	// (��й�ȣ�� �����ϴ� ���� - ���ĺ� �빮��, ����)
	public static void main(String[] args) {		
		// String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";		
		StringBuilder temp_password = new StringBuilder();		
		Random ran = new Random();
		
		for (int i = 0; i < 40; ++i) {
			char ch;					
			// true�϶� ��� �߰�, �ƴϸ� ���� �߰�
			if (ran.nextBoolean()) {
				ch = (char)(ran.nextInt(26) + 'A');
			} else {
				ch = (char)(ran.nextInt(10) + '0');
			}
									
			temp_password.append(ch);
		}
		
		System.out.println(temp_password);
	}
}







