package base;

public class _Overload {
	public void m1() {
		System.out.println("1");
	}

	public void m1(int x) {
		System.out.println("2");
	}

	public void m1(int x, String y) {
		System.out.println("3");
	}

	public void m1(String y, int x) {
		System.out.println("4");
	}

	public static void main(String[] args) {
		_Overload o = new _Overload();
		o.m1();
		o.m1(1);
		o.m1(2, "ss");
		o.m1("ss", 3);
	}
}
