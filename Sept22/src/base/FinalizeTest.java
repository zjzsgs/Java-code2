package base;

public class FinalizeTest {
	protected void finalize() throws Throwable{
		System.out.println("执行了finalize方法");
	}
	public static void main(String[] args) {
		FinalizeTest ft = new FinalizeTest();
		ft = null;
		System.gc();//GC在清理ft对象时调用了它的finalize()方法，因此才有了上面的输出结果。
	}
}
