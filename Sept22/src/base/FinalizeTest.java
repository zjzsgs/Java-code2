package base;

public class FinalizeTest {
	protected void finalize() throws Throwable{
		System.out.println("ִ����finalize����");
	}
	public static void main(String[] args) {
		FinalizeTest ft = new FinalizeTest();
		ft = null;
		System.gc();//GC������ft����ʱ����������finalize()��������˲������������������
	}
}
