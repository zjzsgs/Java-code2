package base;

public class Integ {
	public static void main(String[] args) {
		int i=0;
		Integer j = i;//�Զ�װ��
		Integer k= new Integer(i);
		System.out.println(i==j);
		System.out.println(j.equals(i));
	}
}
