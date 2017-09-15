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
//		静态变量每创建一次实例就会+1
//		实例变量每创建一个实例对象就会分配一个
		VariantTest v = new VariantTest();
		VariantTest v1 = new VariantTest();
		VariantTest v2 = new VariantTest();
	}
}