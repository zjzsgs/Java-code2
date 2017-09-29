package tieb;

import java.util.Scanner;

//判断输入字符串是否是回文字符串
public class Test3 {
	public static void main(String[] args) {
		System.out.println("请输入回文字符串：");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		boolean flag = checkStr(string);
		if (flag) {
			System.out.println("输入的字符串是回文字符串");
		} else {
			System.out.println("输入的字符串不是回文字符串");
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
