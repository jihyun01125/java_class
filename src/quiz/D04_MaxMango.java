package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import myobj.fruit.Mango;

public class D04_MaxMango {
	// ������ Į�θ��� �絵�� �������� �����Ǵ� ���� Ŭ������ �ϳ� �����ϰ�
	// 100���� ���� �ν��Ͻ� �� ���� Į�θ��� ���� ���� �����غ�����
	
	// �� ���� Į�θ��� ���� ��� �� ���� �絵�� ���� �ν��Ͻ��� �����ؾ� �� 
	
	public static void main(String[] args) {
		
		List<Mango> mangos = new ArrayList<>(100);
		
		for (int i = 0; i < 100; ++i) {
			mangos.add(new Mango());
		}
		
		Mango most_delicious = Collections.max(mangos);
		
		System.out.println("���� ���ִ� ������ Į�θ� : " + most_delicious.calorie);
		System.out.println("���� ���ִ� ������ �絵 : " + most_delicious.sweet);
	}
}










