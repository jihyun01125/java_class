package quiz;

public class B05_CheckWord {
	
	// ����ڷκ��� �ܾ �ϳ� �Է¹ް�
	// ù ��° ���ڿ� ������ ���ڰ� ��ġ�ϸ� "OK"�� ���
	// �ƴ϶�� "NOT OK"�� ����غ�����
	
	public static void main(String[] args) {
		String word = "";
		
		// null : �ƹ����� ���� ����
		if (word == null || word == "") {
			System.out.println("�ܾ �ùٸ��� �ʽ��ϴ�.");
			return;
		}
		
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length() - 1);
		
		if (first_letter == last_letter) 
			System.out.println("OK");
		else
			System.out.println("NOT OK");		
	}
	
}




