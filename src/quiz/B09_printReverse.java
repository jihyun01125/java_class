package quiz;

import java.util.Scanner;

public class B09_printReverse {

	// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
	public static void main(String[] args) {
		System.out.print("���� > ");
		String sentence = new Scanner(System.in).nextLine();
		
		
		// # ���� �������� ���ڿ��� ���� �ϼ���ų �� �ִ� (������)
		// String str = "hello";
		// str += ", world!";
		
		// # StringBuilder�� += ��� append() �Լ��� ���� ���ڿ��� �����
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		// �� ����� �� �ڿ� String���� ��ȯ�ؼ� ����ϸ� �ȴ�
		String build_result = str.toString();
		System.out.println(build_result);
		
		// �Ųٷ� ���� ���ڿ��� ������ ����
		StringBuilder reverse = new StringBuilder();
		for (int i = sentence.length() - 1; i >= 0; --i) {
			reverse.append(sentence.charAt(i));
		}
		System.out.println(reverse);
	}
	
}






