package base;

public class StringAppend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "b";
		String s3 = "c";
		String s4 = "d";
		String s5 = "a"+"b";
		String s6 = s1+"b";
		System.out.println(s5=="ab");//true   Java�ڱ���ʱ��ȥ���Ӻţ�ֱ�ӽ���������Щ���������Ľ��
		System.out.println(s6=="ab");//false
		System.out.println(s5==s6);//false
		
		String str = "a"+"b"+"c"+"d";// ֻ����һ������
		System.out.println(str=="abcd");//true  
	}

}
