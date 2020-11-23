
public class C08_innerClass {

	// Ŭ���� ���ο� Ŭ���� ����ϱ� 
	public static void main(String[] args) {
		AppleBox box = new AppleBox(20, false);
		
		System.out.println(box.box[0].color);
		
		// �ܺο��� �ٸ� Ŭ������ ���� Ŭ���� ����ϱ� (���� ����)
		AppleBox.Apple apple01 = new AppleBox(10, true).new Apple();
		
		System.out.println(apple01.color);
		System.out.println(apple01.size);
	}	
}

// # outer class 
//	- ���� �����ڿ� default�� public�� ����� �� �ִ�
class AppleBox {
	
	Apple[] box;
	private boolean mutation;
	
	public AppleBox(int size, boolean mutation) {
		this.mutation = mutation;
		box = new Apple[size];
		for (int i = 0; i < box.length; ++i) {
			// ���� Ŭ���� ������ �ڿ��̱� ������ this�� �����ϰ� ����� �� �ִ�
			box[i] = this.new Apple();
		}
	}
	
	// # inner class
	// 	- AppleBox�� �ν��Ͻ��� ����������� inner class Apple�� �������� �ʴ´�
	//	- ���� �����ڸ� �����Ӱ� ����� �� �ִ�
	//	- outer class�� �ʵ忡 ���� �޶����� Ŭ������ �ۼ��� �� �ִ� 
	//    (���� Ŭ���� �ۼ�)
	class Apple {
		String color;
		int size;
		
		public Apple() {
			if (mutation) {
				color = "�����"; 
			} else {
				color = "������";
			}
		}
	}
	
}







