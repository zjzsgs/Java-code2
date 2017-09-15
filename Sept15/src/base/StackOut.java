package base;
//栈内存溢出
public class StackOut {
	public static void main(String[] args) {
		new StackOut().test();
	}
	private void test() {
		//重复引用 
		test();
	}
}
