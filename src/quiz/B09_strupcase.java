package quiz;

import java.util.Scanner;

public class B09_strupcase {

	// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��������
	// �� ������ �Ѽյ��� �ʰ�, ���ο� ���ڿ��� �����Ǿ�� ��
	
	public static void main(String[] args) {
		
		StringBuilder strb = new StringBuilder();
		
		System.out.print("���� > ");
		String str = new Scanner(System.in).nextLine();
		
		for (int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				// �ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� ���
				// ch -= Math.abs('a' - 'A');
				// ch -= Math.abs('A' - 'a');
				// ch = (char)(ch - 'a' + 'A');
				ch -= 32;
			}
			strb.append(ch);
		}
		System.out.println(strb);
	}
}








