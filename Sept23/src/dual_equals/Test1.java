package dual_equals;

public class Test1 {
	public static void main(String[] args) {
		String str1 = "Mon";
		String str2 = "Mon";
		if (str1==str2) {
//			�����s1 == s2˵����s1 �� s2 ����ͬһ�� String ���� -- "Monday"!
			System.out.println("���");
		}else{
			System.out.println("�����");
		}
		//������ 
	}
}
