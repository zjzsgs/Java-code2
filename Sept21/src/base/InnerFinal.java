package base;

public class InnerFinal {
//	static String str;//局部内部类可以访问全局静态变量
	private String name="name";
	public static void main(String[] args) {
		final String str = "java";//局部内部类只能访问final局部变量
		long begin = System.currentTimeMillis();
		System.out.println(begin);
		//内部类中访问局部变量 必须要写final 否则编译时会报错
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(str+" "+i);//str必须final 不然编译不通过
//					System.out.println(name);
					System.out.println();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("休息0.1秒");
						e.printStackTrace();
					}
				}
			}
		}).start();
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(end-begin);
	}
}
