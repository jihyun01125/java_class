package quiz;

public class C01_functionQuiz {

	// # ���� �Լ��� �����غ�����
	// 	1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 	2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 	3. ���ڸ� �� �� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	// 	4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
	// 	5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ� 
	//	   factorial : (n)*(n-1)*(n-2) ... 3*2*1
	// 	6. ���� �ΰ�(a, b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
	//	   (0������ 1�� ��ȯ�ؾ���, Math.pow ����)
	public static boolean checkEng(char ch) {	
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');		
	}
	
	public static boolean checkMul3(int num) {
		return num % 3 == 0;
	}
	
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	
	public static boolean isPrime(int num) {	
		if (num == 1) {
			return false;
		}
		
		double sqrt = Math.sqrt(num);
		
		for (int i = 2; i <= sqrt; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int factorial(int num) {
		int result = 1;
		
		for (int i = num; i > 0; --i) {
			result *= i;
		}
		
		return result;		
	}
	
	// ��� �Լ� : �ڱ� �ڽ��� �θ��� �Լ� (���� ������, �б� ����, �Ӹ� ����)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}		
		return num * recursive_factorial(num - 1);		
	}	
	
	public static int recursive_pow(int a, int b) {
		if (b == 0) {
			return 1;
		}		
		return a * recursive_pow(a, b - 1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPrime(3));
		
		for (int i = 1; i < 10; ++i) {
			System.out.println(i + "! : " + factorial(i));
		}
		
		System.out.println(recursive_factorial(5));
		System.out.println(recursive_pow(2, 10));
		
	}
	
}










