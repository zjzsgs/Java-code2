package tieb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//ͳ����������ͬԪ�س��ֵĴ���
public class Test5 {
	public static void main(String[] args) {
		int[] nums = new int[1000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer integer : nums) {
			Integer num = map.get(integer);
			map.put(integer, num == null ? 1 : num + 1);
		}
		Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + "������" + entry.getValue() + "��");
		}
	}
}
