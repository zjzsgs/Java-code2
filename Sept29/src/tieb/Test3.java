package tieb;

import java.util.Scanner;

//�ж������ַ����Ƿ��ǻ����ַ���
public class Test3 {
	public static void main(String[] args) {
		System.out.println("����������ַ�����");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		boolean flag = checkStr(string);
		if (flag) {
			System.out.println("������ַ����ǻ����ַ���");
		} else {
			System.out.println("������ַ������ǻ����ַ���");
		}
	}

	private static boolean checkStr(String string) {
		if (string.length() == 0 || string.length() == 1) {
			return true;
		}
		if (string.charAt(0) != string.charAt(string.length() - 1)) {
			return false;
		}
		return checkStr(string.substring(1, string.length() - 1));
	}
}
