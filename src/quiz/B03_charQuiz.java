package quiz;

public class B03_charQuiz {

	/*
    	[ �˸��� ���ǽ��� �������� ]
    
		1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
	   	2. char�� ���� b�� �����̳� ���� �ƴ� �� true
		3. char�� ���� c�� ����('0' ~ '9')�� �� true
		4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
		5. char�� ���� e�� �ѱ��� �� true
		6. char�� ���� f�� �Ϻ����� �� true	
	*/	
	public static void main(String[] args) {
		char a = 'q';	
		System.out.println(a == 'q' || a == 'Q');
		char b = '\t';
		System.out.println(b != '\t' && b != ' ');
		System.out.println(!(b == '\t' || b == ' '));
		char c = '1';
		System.out.println(c >= '0' && c <= '9');
		
		char d = ']';
		System.out.println((d >= 'A' && d <= 'Z') || 
				(d >= 'a' && d <= 'z'));
		
		char e = '��';
		
		// Hangul Jamo : 0x1100 - 0x11FF
		// Hangul Syllables : 0xAC00 - 0xD7A3		
		System.out.println((e >= 0xAC00 && e <= 0xD7A3) ||
				(e >= 0x1100 && e <= 0x11FF));
		
		char f = '��';
		System.out.println((f >= 0x3041 && f <= 0x309F) ||
				(f >= 0x30A0 && f <= 0x30FF));
		// System.out.println((char)0x3093);
	}
		
}




