package base;

/**
 * 使用final关键字修饰变量 是指引用变量不能变 不能重新new ，引用变量所指向的对象的内容是可以改变的。
 * @author Administrator
 *
 */
public class Final {
	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("ddfffgs");
//		sb = new StringBuffer("");
		sb.append("ssss");
		System.out.println(sb);
	}
	
	public final void ser(){
		
	}
	
	public final void ser(int a){
		
	}
	
}
