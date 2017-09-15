package test;

import java.util.ArrayList;
import java.util.List;

class Thread1 extends Thread {
	List<String> list;

	public Thread1(List<String> list) {
		this.list = list;
	}

	@Override
	public  void run() {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if('a'==str.charAt(0)){
				list.remove(str);
			}
		}
		System.out.println(list.toString());
	}
}

class Thread2 extends Thread {
	List<String> list;

	public Thread2(List<String> list) {
		this.list = list;
	}

	@Override
	public  void run() {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if('b'==str.charAt(0)){
				list.remove(str);
			}
		}
		System.out.println(list.toString());
	}
}

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String[] str = { "a", "b", "c" };
		for (int i = 0; i < 10; i++) {
			list.add(str[(int) (Math.random() * 3)] + i);
		}
		System.out.println(list.toString());
		System.out.println("----------------------------------");
		// [c0, a1, a2, c3, b4, c5, a6, a7, b8, a9]
		Thread t1 = new Thread1(list);
		Thread t2 = new Thread2(list);
		t1.start();
		t2.start();
	}
}
