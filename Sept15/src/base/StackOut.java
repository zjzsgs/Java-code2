package base;
//ջ�ڴ����
public class StackOut {
	public static void main(String[] args) {
		new StackOut().test();
	}
	private void test() {
		//�ظ����� 
		test();
	}
}
