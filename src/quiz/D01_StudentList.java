package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import myobj.Student;

public class D01_StudentList {

	// �л� Ŭ������ ��ҷ� ���� ArrayList��(group) �����ϰ�
	// �л��� 30�� �߰��غ����� 
	
	// 1. 30���� ������ �ڵ����� �����ǵ��� �������� 
	
	// 2. ��� �л��� �� ������ ��� ������ ���غ�����
	
	// 3. �� ����� ���غ����� 
	
	// 4. �̸� ���� ��Ģ 
	//	 	�׽�Ʈ�л�0000
	//		�׽�Ʈ�л�0001
	//		�׽�Ʈ�л�0002
	
	public static void main(String[] args) {
		ArrayList<Student> group01 = new ArrayList<>();
		
		int num_of_students = 30;
		
		double sum = 0;
		for (int i = 0; i < num_of_students; ++i) {
			group01.add(new Student());
			sum += group01.get(i).getAvg();
		}		
		
		// println �Լ��� ��� �ش� ��ü�� toString() �޼��带 ȣ���Ѵ�
		System.out.println(group01);
		System.out.println("�� ��� : " + sum / (double)num_of_students);
	}
}















