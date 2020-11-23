package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	// ����ڷκ��� �ܾ �ϳ� �Է¹ް�
	// �ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
	// ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ�����
	
	// �� ABBA, MADAM, BORROWORROB ó�� �¿��Ī�� �ܾ
	//   ȸ���̶�� �Ѵ�
	public static void main(String[] args) {
		
		System.out.print("input word > ");
		String word = new Scanner(System.in).nextLine();
		
		// # StringBuilder.reverse() 
		// 	- ���±��� ������ ���ڿ��� �Ųٷ� �������ش� 
		StringBuilder strb = new StringBuilder(word);		
		String reverse = strb.reverse().toString();		
		
		int half = word.length() / 2;
		
		boolean palin = true;
		
		for (int i = 0; i < half; ++i) {
			if (word.charAt(i) != reverse.charAt(i)) {
				palin = false;
				break;
			}
		}
		System.out.println(palin ? "PALINDROME" : "NOT PALINDROME");
		
//		boolean palin = true; 
//		
//		for (int i = 0, len = word.length(); i < len / 2; ++i) {
//			
//			char ch1 = word.charAt(i);
//			char ch2 = word.charAt(len - 1 - i);
//			
//			if (ch1 != ch2) {
//				palin = false;
//				break;
//			}
//		}
//		
//		if (palin) {
//			System.out.println("PALINDROME");
//		} else {
//			System.out.println("NOT PALINDROME");
//		}
	}
}

















