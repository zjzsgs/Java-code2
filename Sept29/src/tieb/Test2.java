package tieb;

import java.util.Scanner;
//˫��ѭ����ӡ
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뵹���ǵı߳���");
		int l = scanner.nextInt();
		printTri(l);
	}

	private static void printTri(int l) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
