package base;

//import java.math.BigDecimal;
import java.util.Arrays;

public class StringNull {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s /*= null*/;
//		System.out.println("s="+s);//���벻��ͨ��
		
		int i;
//		System.out.println("i="+i);//int����ʼ�� �������
		
//		Java��ʹ��BigDecimal���и�������ȷ����
		
		double a=2.0;
		double b=1.1;
		double c=0.9;
		double d=1.2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a-b);
		System.out.println(a-d);
		System.out.println(a-c);
		System.out.println(a-b==c);
		
		
		String[] arrayStrings = new String[]{"10","20","30"};
		System.out.println(Arrays.toString(arrayStrings));
		System.out.println(arrayStrings.toString());

	}

}
