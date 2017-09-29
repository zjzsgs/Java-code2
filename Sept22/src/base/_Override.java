package base;
class Parent{
	public void m1(){System.out.println("1");}
	private void m2(){System.out.println("3");}
}
public class _Override extends Parent {
	public void m1(){
		System.out.println("2");
	}
	public void m2(){
		System.out.println("4");
	}
	public static void main(String[] args) {
		_Override o = new _Override();
		o.m1();
		Parent p = new _Override();
//		p.m2();
	}
}
