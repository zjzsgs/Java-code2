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
// ʵ��Runnable�ӿڵ��߳��������д��run()�������򱨴�
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
