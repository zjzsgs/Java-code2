package dual_equals;

public class Test2 {
	public static void main(String[] args) {
		String s1 = "Mon";
		String s2 = new String("Mon"); 
		//s1��s2����������ͬ�Ķ���
		if (s1==s2) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}
		if (s1.equals(s2)) {
			System.out.println("equals");
		} else {
			System.out.println("!equals");
		}
	}
}
