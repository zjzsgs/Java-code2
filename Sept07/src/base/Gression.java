package base;
/**
 * ��λ����
 * cpuֱ��֧�� Ч�����
 * ���Ƽ�λ�����  ����λ�����С
 * int���ֵ��2^31-1=2147483647�������ƻ������ɸ���
 * 
 * ���ƴ�����ԣ�����λ�����0
 * 
 * @author Administrator
 *
 */
public class Gression {
	public static void main(String[] args) {
		int i=1<<2;
		System.out.println(i);
		int j=1>>2;
		System.out.println(j);
		int a = Integer.MAX_VALUE<<2;
		System.out.println(a);
		int b = Integer.MIN_VALUE<<2;
		System.out.println(b);
		System.out.println(Integer.MIN_VALUE);
	}
}
