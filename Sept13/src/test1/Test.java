package test1;

public class Test {

	/**
	 * ���������е��ſ����۲���Եó���
	 * ��һ��ķ�����ǰһ��ķ�ĸ��ǰһ��ķ����Ǻ�һ��ķ��ӷ�ĸ֮��
	 */
	public static void main(String[] args) {
		int a=1,b=2;
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum += b/a;
			int temp = a+b;
			b=temp;
			a=b;
		}
		System.out.println("���10��֮��Ϊ��"+sum);
	}

}
