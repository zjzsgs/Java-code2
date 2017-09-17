package base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//ʹ��ExecutorService��Callable��Futureʵ���з��ؽ�����߳�
//jdk1.5֮��
@SuppressWarnings("unchecked")
public class ExecutorTest {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		System.out.println("����ʼ���У�");
		Date date1 = new Date();
		//�̶��߳���Ŀ
		int taskSize = 5;
		// �����̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(taskSize);
		// �����ж������ֵ������
		List<Future> list = new ArrayList<Future>();

		for (int i = 0; i < taskSize; i++) {
			Callable c = new MyCallable(i + "");
			// ִ�����񲢻�ȡFuture����
			Future f = pool.submit(c);
			list.add(f);
		}
		// �ر��̳߳�
		pool.shutdown();
		// ��ȡ���в��������ִ�н��
		for (Future f : list) {
			System.out.println(">>>" + f.get().toString());// �׳��쳣
		}
		Date date2 = new Date();
		System.out.println("----�����������----����������ʱ�䡾"
				+ (date2.getTime() - date1.getTime()) + "���롿");
	}
}

class MyCallable implements Callable<Object> {
	private String taskNum;

	MyCallable(String taskNum) {
		this.taskNum = taskNum;
	}

	@Override
	public Object call() throws Exception {
		System.out.println("����������  " + taskNum);
		Date dateTemp1 = new Date();
		Thread.sleep(1000);
		Date dateTemp2 = new Date();
		long time = dateTemp2.getTime() - dateTemp1.getTime();
		System.out.println("������ֹ��  " + taskNum);
		return taskNum + "���񷵻����н��,��ǰ����ʱ�䡾" + time + "���롿";
	}
}
