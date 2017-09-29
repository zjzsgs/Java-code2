package dual_equals;

/**
 * 3. 字符串缓冲池
 *  原来，程序在运行的时候会创建一个字符串缓冲池当使用 s2 = "Monday"
 * 这样的表达是创建字符串的时候，程序首先会在这个String缓冲池中寻找相同值的对象
 * ，在第一个程序中，s1先被放到了池中，所以在s2被创建的时候，程序找到了具有相同值的 s1 将s2引用s1所引用的对象"Monday"
 * 第二段程序中，使用了 new
 * 操作符，他明白的告诉程序："我要一个新的！不要旧的！"于是一个新的"Monday"Sting对象被创建在内存中。他们的值相同，
 * 但是位置不同，一个在池中游泳一个在岸边休息。哎呀，真是资源浪费，明明是一样的非要分开做什么呢？
 * 
 * @author Administrator
 * 
 */
public class Test3 {
	public static void main(String[] args) {
		String s1 = "Mon";
		String s2 = new String("Mon");
		s2 = s2.intern();
		// s1和s2引用两个不同的对象
		if (s1 == s2) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}
		if (s1.equals(s2)) {
			System.out.println("equals");
		} else {
			System.out.println("!equals");
		}
		// 检查字符串池里是否存在"abc"这么一个字符串，如果存在，就返回池里的字符串；如果不存在，该方法会
		// 把"abc"添加到字符串池中，然后再返回它的引用。
		// 所以s2后来就指向s1的地址了
	}
}
