package base;

import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		Map map = new HashMap();
		String s1 = "1";
		String s2 = 1+"";
		String s3 = s1+"";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		map.put(s1,1);
		map.put(s2,2);
		map.put(s3,3);
		System.out.println(s1);
		System.out.println(map.get(s1));
		
		map.put(4, 4);
		map.put(4, 5);
		map.put(4L, 6);
		System.out.println(map);
	}
}
