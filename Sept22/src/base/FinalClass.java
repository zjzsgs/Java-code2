package base;
/*final */class SupParent{}//final修饰的类不能继承
class FinalParent extends SupParent{
	int i;
	public final void TestFinal(){
		System.out.println("Parent Final");
	}
	public void TestFinal(int i){} 
}
public class FinalClass extends FinalParent {
//	public void TestFinal(){}//final声明的类不能重写
	
	public void TestFinal(int i){}//
	
}
