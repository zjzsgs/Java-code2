package base;

public class VariantTest{
	public static int staticVar = 0; 
	public int instanceVar = 0; 
	public VariantTest(){
		staticVar++;
		instanceVar++;
		System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
	}
	public static void main(StringAppend[] args) {
//		��̬����ÿ����һ��ʵ���ͻ�+1
//		ʵ������ÿ����һ��ʵ������ͻ����һ��
		VariantTest v = new VariantTest();
		VariantTest v1 = new VariantTest();
		VariantTest v2 = new VariantTest();
	}
}