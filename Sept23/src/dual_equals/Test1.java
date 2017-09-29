package dual_equals;

public class Test1 {
	public static void main(String[] args) {
		String str1 = "Mon";
		String str2 = "Mon";
		if (str1==str2) {
//			输出：s1 == s2说明：s1 与 s2 引用同一个 String 对象 -- "Monday"!
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		//输出相等 
	}
}
