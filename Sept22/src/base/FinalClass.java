package base;
/*final */class SupParent{}//final���ε��಻�ܼ̳�
class FinalParent extends SupParent{
	int i;
	public final void TestFinal(){
		System.out.println("Parent Final");
	}
	public void TestFinal(int i){} 
}
public class FinalClass extends FinalParent {
//	public void TestFinal(){}//final�������಻����д
	
	public void TestFinal(int i){}//
	
}
