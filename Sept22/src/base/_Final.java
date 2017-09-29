package base;

public class _Final {
	final int j;
	
	public _Final(int j) {
		super();
		this.j = j;//final声明属性初始化只能在定义时赋值或者构造函数中
	}
	public void print(){
		System.out.println(j);
	}


	public static void main(String[] args) {
		final int i = 0;
//		i=i+1;//final声明的属性不能变
		_Final f = new _Final(10);
		f.print();
	}
}
