package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import myobj.fruit.NoMoreCalorieException;

public class Clazz {

	// # Ŭ���� Ŭ���� 
	//	- Ŭ������ ������ ���� �� �ִ� Ŭ����
	//	- ���ϴ� Ŭ������ �ҷ��� �ش� Ŭ������ �����ִ� ����, �޼��带 ����� �� �ִ�
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, NoMoreCalorieException {
		myobj.fruit.Apple apple01 = new myobj.fruit.Apple("red");
		
		Class c = null;
		Class c2 = apple01.getClass(); 	
	
		try {
			c = Class.forName("myobj.fruit.Apple");
		} catch (ClassNotFoundException e) {			
			System.out.println("Ŭ���� �̸��� Ʋ�Ƚ��ϴ�!");
			System.exit(0);
		}
		
		System.out.println("forName���� �ҷ��� Class�̸� : " + c.getName());
		System.out.println("forName���� �ҷ��� package�̸� : " + c.getPackageName());
		System.out.println("forName���� �ҷ��� simpleName : " + c.getSimpleName());
		
		System.out.println("�̰� �������̽��ΰ���? " + c.isInterface());
		System.out.println("�̰� �迭�ΰ���? " + c.isArray());
		System.out.println("�̰� �⺻���ΰ���? " + c.isPrimitive());
		
		Class c3;
		try {
			c3 = Class.forName("reflection.SimpleInterface");
			System.out.println("c3�� �������̽��ΰ���? " + c3.isInterface());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// Class Ÿ�� ������ ����� Ŭ�������� ���赵 ���·� �����ϰ� �ִ�
		//	���赵�� ������ ���1 : forName�޼��忡 ��Ű������ ��Ȯ�ϰ� �Է��Ѵ�
		//	���赵�� ������ ���2 : ������� �ν��Ͻ����� getClass()�޼��带 �����Ѵ� 
		
		// �� Ŭ������ � �����ڵ��� �ִ��� �˾Ƴ��� ��� 
		for (Constructor con : c.getConstructors()) {			
			System.out.println(con.getName());
			// Constructor.getParameterTypes() 
			//	- �ش� �����ڰ� ���޹޾ƾ� �ϴ� �Ű����� Ÿ�Ե��� �迭 ���·� ��ȯ�Ѵ�
			//	- �Ű������� Ÿ�Ե� Ŭ�����̱� ������, Ŭ���� Ÿ�� �迭�� ��ȯ�ȴ�
			printParameters(con.getParameterTypes());
		}
		
		// Ŭ���� �̸����� Ŭ������ �ҷ��µ� �����ڸ� ��� �ν��Ͻ��� ����
		Object apple02 = c.getConstructor(
				Class.forName("java.lang.String")
		).newInstance("red");
		
		((myobj.fruit.Apple)apple02).eat().eat().eat();
	}	
	
	private static void printParameters(Class[] parameters) {
		
		for (int i = 0; i < parameters.length; ++i) {
			System.out.printf("%d��° �Ķ������ Ÿ�� : %s(%s)\n", 
					i, 
					parameters[i].getSimpleName(),
					parameters[i].getName());
		}
		
	}
}
























