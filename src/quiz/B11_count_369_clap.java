package quiz;

import java.util.Scanner;

public class B11_count_369_clap {
	
	// ����ڷκ��� ���� �ϳ��� �Է¹ް� 
	// �ش� ���ڱ��� 369������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������	
	public static void main(String[] args) {
		// # ���ڸ� ����ϴ� ���
		// System.out.print("369 > ");
		
		// # ���α׷� ����ð� ����
//		long start_time = System.currentTimeMillis();
//		
//		int user = 99999999;// new Scanner(System.in).nextInt();
//		int clap = 0;
//		
//		boolean debugMode = false;
//		
//		for (int i = 1; i <= user; ++i) {
//			int check = i;
//			
//			if (debugMode) {
//				System.out.printf("%d : ", i);
//			}
//			
//			while (check != 0) {				
//				int digit = check % 10;
//				
//				if (digit % 3 == 0 && digit != 0) {
//					++clap;
//					if (debugMode) {
//						System.out.print("¦");
//					}
//				}
//				check /= 10;
//			}	
//			if (debugMode) {
//				System.out.println();
//			}
//		}
//		System.out.println(clap + "ȸ");
//		
//		long end_time = System.currentTimeMillis();
//		
//		System.out.println("�ɸ� �ð� : " + (end_time - start_time));
		
		// # ���ڿ��� ����ϴ� ���
		int user = 99999999;
		int clap = 0;
		
		long start_time = System.currentTimeMillis();
		
		for (int i = 1; i <= user; ++i) {
			String check = "" + i;			
			int len = check.length();
			
			for (int j = 0; j < len; ++j) {
				if (check.charAt(j) == '3' || 
						check.charAt(j) == '6' || 
						check.charAt(j) == '9') {
					++clap;					
				}				
			}
		}		
		System.out.println(clap);
		long end_time = System.currentTimeMillis();
		System.out.println("�ɸ� �ð� : " + (end_time - start_time));
	}
}
