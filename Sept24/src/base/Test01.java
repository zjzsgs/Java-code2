package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뼯�ϵĴ�С�Լ���Ҫ��������ĸ�����");
		int num = scanner.nextInt();
		int max = scanner.nextInt();
		System.out.println("�������"+num+"��0��100�����֣�");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			list.add((int) (Math.random()*100));
		}
		Collections.sort(list);
		System.out.println("����֮��õ����ǣ�");
		System.out.println(list);
		System.out.println("�õ�������"+max+"�����ǣ�");
		for (int i = 0; i < max; i++) {
			System.out.print(list.get(num-i-1)+"  ");
		}
	}
}
