package quiz;

public class B09_printAlphabet {

	// 1. �ݺ����� �̿��Ͽ� A���� Z���� ����غ����� 
	
	// 2. �ݺ����� �̿��Ͽ� z���� a���� ����غ����� 
	
	public static void main(String[] args) {
		
		for (char ch = 'A'; ch <= 'Z'; ++ch) {
			System.out.print(ch);
		}
		System.out.println();
		
		for (char ch = 'z'; ch >= 'a'; --ch) {
			System.out.print(ch);
		}
	
	}
	
}
