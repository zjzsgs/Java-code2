package base;
/**
 * 移位运算
 * cpu直接支持 效率最高
 * 左移几位代表乘  超过位数会变小
 * int最大值是2^31-1=2147483647在向左移会溢出变成负数
 * 
 * 右移代表除以，超过位数变成0
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
