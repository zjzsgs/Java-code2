package base;

public class Error {
	/*
	 * ���⣺ 1. if(username.equals(��wpc��)){
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

	// ��equals�Ƚ�ʱ�����Ƿ���ǰ�滹�Ǻ���
	public static void method1() {
		String username = null;

		// ��һ��if���username��ǰ��,��Ϊnull�Ļ��ᱨ��ָ���쳣
//		 if (username.equals("wpc")) {// ���username�ڱ���ʱ���������null�ͻ����������ʾ��Ϣ
//		 System.out.println("wpc");
//		 }

		// ����ź��漴ʹû�и���ֵ������ʱҲ���ᱨ��ָ���쳣
		if ("wpc".equals(username)) {
			System.out.println("wpc");
		}
	}

	public static boolean method2() {
		int x = 1;
		return x == 2 ? true : false;// ��������
		// return x == 1;// �����Ⱦͷ���true���Ⱦͷ���false(��û��Ҫ����Ŀ�������)
		// return "xx"=="xx";
	}
	
	public static String method3() {
		int x = 1;
		return x == 1 ? "��ȷ" : "����";
	}

	// �Ƚ��ַ��������ݻ�������==��compareTo()
	public static boolean method4() {
		String string = "xxx";
		String string2 = "xxx";
		return string.equals(string2);// ��ȷ���true

	}

	public static int method5() {
		String string = "xxx";
		String string2 = "xxx";
		return string.compareTo(string2);// ��Ȳŷ���0
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		super.clone();//��Ϊ����Ҫ�Ѹ����еĳ�Ա���Ƶ�λ��Ȼ����Ǹ����Լ��ĳ�Ա��
		// clone ��ȱʡ��Ϊ��super.clone();
		return super.clone();
	}
}