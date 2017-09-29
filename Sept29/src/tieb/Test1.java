package tieb;

import java.util.Scanner;
//循环打印的三种方法
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("选择哪种方法：");
		int mark = scanner.nextInt();
		if (mark == 1) {
			System.out.println(loopsum1());
		} else if (mark == 2) {
			System.out.println(loopsum2());
		} else {
			System.out.println(loopsum3());
		}
	}

	private static int loopsum1() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	private static int loopsum2() {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		return sum;
	}

	private static int loopsum3() {
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		return sum;
	}
}
