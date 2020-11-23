package quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {

	// 1���� 45������ �ߺ����� ���� ���� 6���� �̷���� HashSet�� �����غ�����
	public static Set<Integer> generate() {
		Random ran = new Random();
		
		Set<Integer> lotto = new HashSet<>();
				
		// Set�� �ߺ����� �߰����� �ʱ� ������ �˾Ƽ� ���̰� �þ�� �ʴ´�
		while (lotto.size() < 6) {
			lotto.add(ran.nextInt(45) + 1);		
		}
		
		return lotto;
	}
	
	public static void main(String[] args) {
		System.out.println(generate());
	}	
}









