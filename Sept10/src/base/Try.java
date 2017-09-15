package base;

public class Try {
	public static void main(String[] args) {
		System.out.println(new Try().test());
	}

	@SuppressWarnings("finally")
	private int test() {
		int i=0;
		try{
			System.out.println("1");
			return i+10;//先finally 再到return 所以在finally中return后 就不会执行这里的return			
//			System.out.println("2");//报错  不会执行
		}finally{
			System.out.println("3");
			++i;
			System.out.println(i);
			System.out.println("4");
			return i;
		}
	}
}
