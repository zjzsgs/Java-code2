package tieb;

import java.util.ArrayList;
import java.util.List;

//ÖÊÊıÅĞ¶Ï
public class Test6 {
	public static void main(String[] args) {
		List<Integer> list = isPrime(50, 100);
		System.out.println(list);
	}

	private static List<Integer> isPrime(int i, int j) {
		List<Integer> list = new ArrayList<Integer>();
		here: // ÀàËÆgoto
		for (int k = i; k <= j; k++) {
			int s = (int) Math.sqrt(k);
			for (int m = 2; m <= s; m++) {
				if (k % m == 0) {
					continue here;
				}
			}
			list.add(k);
		}
		return list;
	}
}
