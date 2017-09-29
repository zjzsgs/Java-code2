package tieb;

import java.util.Arrays;
import java.util.Random;
//随机生成数组，排序并打印数组 Arrays
public class Test4 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i]=random.nextInt(1000);//确定随机数的范围
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
