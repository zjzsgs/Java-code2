package base;

public class InitRun {
	public static void main(String[] args){
		ThreadClass t1 = new ThreadClass();
		t1.start();
		RunnableClass r = new RunnableClass();
		new Thread(r).start();
	}
}
class ThreadClass extends Thread{}
class RunnableClass implements Runnable{
// 实现Runnable接口的线程类必须重写其run()方法否则报错
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
