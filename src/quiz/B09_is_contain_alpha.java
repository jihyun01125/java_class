package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	// ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���
	// ������ false�� ���
	
	public static void main(String[] args) {
		System.out.print("�˻� �� ���� > ");
		String str = new Scanner(System.in).nextLine();
		
		// "a123456"
		// "123456a"
		
		boolean result = false;		
		// str.length()�� �ѹ��� ȣ���ϴ� ��� 
		for (int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				result = true;
				break; // ������ �ݺ����� ������
			}			
		}
		System.out.println(result);
	}
}











