package quiz;

public class B11_reverse_number {

	// ����ڷκ��� ������ �ϳ� �Է¹ް� 
	// �� ������ ���� �ڸ����� ������� ����غ����� 
	
	// 123456789 -> 987654321
	
	public static void main(String[] args) {		
		
		int user = 123456789;		
		
		int reversed = 0;
		
		while (true) {
			// System.out.print(user % 10);			
			reversed += user % 10;
			
			user /= 10;			
			
			if (user <= 0) {
				break;
			}
			reversed *= 10;
		}
		System.out.println(reversed);
	}
	
}









