package tieb;

import java.util.Arrays;
import java.util.Random;
//����������飬���򲢴�ӡ���� Arrays
public class Test4 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i]=random.nextInt(1000);//ȷ��������ķ�Χ
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
