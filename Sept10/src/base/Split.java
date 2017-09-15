package base;

import java.util.StringTokenizer;

public class Split {

	/**
	 * 以-分割的字符串转成数组
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String orgStr = "2017-12-23";
		
		String[] str = orgStr.split("-");// 正则表达式
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);

		StringTokenizer tokener = new StringTokenizer(orgStr, "-");//把"-"作为分割标志，然后把分割好的字符赋予StringTokenizer对象。
		String[] result = new String[tokener.countTokens()];//通过StringTokenizer 类的countTokens方法计算在生成异常之前可以调用此 tokenizer 的 nextToken 方法的次数。
		int i = 0;
		while (tokener.hasMoreTokens()) {//看看此 tokenizer 的字符串中是否还有更多的可用标记。
			result[i++] = tokener.nextToken();
		}
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		System.out.println(orgStr.length());//String.length()
		System.out.println(result.length);//Array.length

	}

}
