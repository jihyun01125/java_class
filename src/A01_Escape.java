
public class A01_Escape {

	public static void main(String[] args) {
		
		// # Escape ����
		//	- Ư���� ����� ���� ����
		//	- �׳� ����Ϸ��� �ϸ� ������ ����� ���ڵ�
		//	- �տ� \(��������)�� ���� ���ڴ� Escape ���ڷ� �����Ѵ�
		//	- �� ���ڰ� ������ �ϳ��� ���ڷ� �νĵȴ� 
		
		// \n : �ٹٲ��� ����� ���� Ư�� ���� (linebreak, linefeed, newline ..)
		System.out.println("�ȳ��ϼ���!\n��\n��\n��\n��\n��.");	
		
		// \t : TabŰ�� ����� ���� Ư�� ����
		System.out.println("�ȳ��ϼ���!\t�ݰ����ϴ�.");
		System.out.println("�̸�\t������\t�ֱ���������");
		System.out.println("ȫ�浿\tA��\tNo");
		System.out.println("�Ӳ���\tO��\tYes");		
		
		// \\ : �׳� �������ø� ����ϰ� ���� �� ����Ѵ�
		//	ex> C:\Program Files\Java\jdk�� ����ϰ� ���� ���
		System.out.println("C:\\Program Files\\Java\\jdk");
		
		// \" : �׳� ū����ǥ�� ����ϰ� ���� �� ����Ѵ�
		//	ex> ������ "����"���� �Դ´�
		System.out.println("������ \"����\"���� �Դ´�");
		
		// \' : �׳� ��������ǥ�� ����ϰ� ���� �� ����Ѵ�
		System.out.println("��ħ�� \'���\'�ϰ� �Ծ�ֶ�");
		System.out.println("��ħ�� '���'�ϰ� �Ծ�ֶ�");
		System.out.println('\'');
	}
	
}





