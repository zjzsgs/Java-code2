package base;
/**
 * &是位运算符或逻辑与
 * &&是短路运算符或逻辑与
 * @author Administrator
 *
 */
public class And {
	public static void main(String[] args) {
		System.out.println(1&0);//位运算
		System.out.println(false&&true);//短路
		System.out.println(false&true);//非短路
		
	}
}
