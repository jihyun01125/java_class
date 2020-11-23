package quiz;

public class B13_count_random_fruit {

	// 1. ũ�� 100�� �迭�� ���� ���� ���ڿ��� �����غ�����
	//	  �����ϴ� ���� : apple, banana, orange, peach, kiwi
	
	// 2. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ�����	
	public static void main(String[] args) {
		int size = 100;
		int fruit_kind;
		
		String[] fruitNames = 
			{"apple", "banana", "orange", "peach", "kiwi"};			
		fruit_kind = fruitNames.length;
		
		String[] fruitBox = new String[size];
		
		for (int i = 0; i < size; ++i) {
			fruitBox[i] = fruitNames[(int)(Math.random() * 5)];
		}
		
		// fruitBox�迭�� ����� �� ������ �� �� �����ߴ��� ��� �������
		int[] count = new int[5];
		
		for (int i = 0; i < size; ++i) {			
			for (int j = 0; j < fruit_kind; ++j) {				
				if (fruitNames[j].equals(fruitBox[i])) {
					count[j] += 1;
					break;
				}							
			}			
		}		
		
		// ���谡 ���� �� count�� ��� �ؾ� �Ѵ� 
		for (int i = 0; i < count.length; ++i) {			
			System.out.printf("%s : %dȸ\n", fruitNames[i], count[i]);			
		}
	
		// # enum�� ���� 
		int apple = 0;
		int banana = 1;
		int orange = 2;
		
		System.out.println("�������� ��ȣ : " + orange);
		System.out.println("�������� ��� ����? " + count[orange]);
		System.out.println("������ �̸� : " + fruitNames[orange]);		
	}
	
}









