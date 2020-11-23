package quiz;

public class B02_conditionQuiz01 {

	/*
		[ �˸��� �񱳿����� �������� ]
		    
		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		2. int�� ���� b�� ¦���� �� true		
		3. int�� ���� c�� 7�� ����� �� true
		4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
		5. int�� ���� d�� e�� ���̰� 30�� �� true		
		6. int�� ���� year�� 400���� ������ �������� true  
		   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		7. �μ��� ö������ 2�� ������ true
		8. �μ��� ö������ ������ 3�� ������ true  
 		9. boolean�� ���� powerOn�� false�� �� true
		10. ���ڿ� �������� str�� "yes"�� �� true
		11. �ﰢ�� A�� �����ﰢ���̸� true
	*/	
	public static void main(String[] args) {
		int a = 11;
		boolean result01 = a > 10 && a < 20;
		System.out.println(result01);
		
		int b = 4;
		System.out.println(b % 2 == 0);
		
		int c = 21;
		System.out.println(c % 7 == 0);
		
		int hour = -1;
		boolean result04 = !(hour < 0 || hour >= 24) && hour >= 12;
		System.out.println(result04);
		
		int d = 10, e = 40; 
		System.out.println(Math.abs(d - e) == 30);
		
		int year = 2020;
		System.out.println(year % 400 == 0 || 
				(year % 4 == 0 && year % 100 != 0));
		
		int m_age = 6, c_age = 4;
		System.out.println(c_age + 2 == m_age);
		
		int m_birth = 4, c_birth = 7;
		System.out.println(m_birth + 3 == c_birth);
		
		boolean powerOn = false;
		System.out.println(!powerOn);
		
		// �ҹ��ڷ� �����ϴ� Ÿ�� - ���� �����Ѵ�
		// �빮�ڷ� �����ϴ� Ÿ�� - �ּҸ� �����Ѵ� (������)		
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		String str4 = str;
		
		System.out.println(str == str2); // �ּҸ� ���� ��1
		System.out.println(str == str3); // �ּҸ� ���� ��2
		
		System.out.println(str.equals(str3)); // ���� ���� ��
		
		
		int a1 = 50, a2 = 40, a3 = 90;
		
		System.out.println(a1 + a2 + a3 == 180 && 
				(a1 == 90 || a2 == 90 || a3 == 90) &&
				(a1 != 0 && a2 != 0 && a3 != 0));
		
		int b1 = 3, b2 = 4, b3 = 5;
		
		System.out.println(
				b1 * b1 + b2 * b2 == b3 * b3 ||
				b1 * b1 + b3 * b3 == b2 * b2 ||
				b2 * b2 + b3 + b3 == b1 * b1
		);
	}
	
}














