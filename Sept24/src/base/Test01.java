package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入集合的大小以及需要的最大数的个数：");
		int num = scanner.nextInt();
		int max = scanner.nextInt();
		System.out.println("随机生成"+num+"个0到100的数字：");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			list.add((int) (Math.random()*100));
		}
		Collections.sort(list);
		System.out.println("排序之后得到的是：");
		System.out.println(list);
		System.out.println("得到的最大的"+max+"个数是：");
		for (int i = 0; i < max; i++) {
			System.out.print(list.get(num-i-1)+"  ");
		}
	}
}
