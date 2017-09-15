package base;

public class Error {
	/*
	 * 问题： 1. if(username.equals(“wpc”)){
	 * 
	 * } 2. int x = 1; return x==1?true:false;
	 */
	// String username;
	public static void main(String[] args) {
		method1();

		boolean bool = method2();
		System.out.println(bool);

		String string = method3();
		System.out.println(string);
	}

	// 用equals比较时变量是放在前面还是后面
	public static void method1() {
		String username = null;

		// 第一个if如果username在前面,若为null的话会报空指针异常
//		 if (username.equals("wpc")) {// 如果username在编译时发现真的是null就会给出警告提示信息
//		 System.out.println("wpc");
//		 }

		// 如果放后面即使没有赋初值，运行时也不会报空指针异常
		if ("wpc".equals(username)) {
			System.out.println("wpc");
		}
	}

	public static boolean method2() {
		int x = 1;
		return x == 2 ? true : false;// 代码冗余
		// return x == 1;// 如果相等就返回true不等就返回false(就没必要用三目运算符了)
		// return "xx"=="xx";
	}
	
	public static String method3() {
		int x = 1;
		return x == 1 ? "正确" : "错误";
	}

	// 比较字符串的内容还可以用==和compareTo()
	public static boolean method4() {
		String string = "xxx";
		String string2 = "xxx";
		return string.equals(string2);// 相等返回true

	}

	public static int method5() {
		String string = "xxx";
		String string2 = "xxx";
		return string.compareTo(string2);// 相等才返回0
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		super.clone();//因为首先要把父类中的成员复制到位，然后才是复制自己的成员。
		// clone 有缺省行为，super.clone();
		return super.clone();
	}
}