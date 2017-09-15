package test1;

public class Test {

	/**
	 * 将分数序列倒着看，观察可以得出：
	 * 后一项的分子是前一项的分母，前一项的分子是后一项的分子分母之和
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
		System.out.println("最后10项之和为："+sum);
	}

}
