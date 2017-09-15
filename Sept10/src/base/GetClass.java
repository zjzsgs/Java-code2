package base;

import java.util.Date;

public class GetClass extends Date{
	public static void main(StringAppend[] args) {
		new GetClass().test();
	}

	private void test() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getName());//base.GetClass
		System.out.println(super.getClass().getSuperclass().getName());//java.util.Date
		
	}
}
