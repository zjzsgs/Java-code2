package base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//使用ExecutorService、Callable、Future实现有返回结果的线程
//jdk1.5之后
@SuppressWarnings("unchecked")
public class ExecutorTest {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		System.out.println("程序开始运行！");
		Date date1 = new Date();
		//固定线程数目
		int taskSize = 5;
		// 创建线程池
		ExecutorService pool = Executors.newFixedThreadPool(taskSize);
		// 创建有多个返回值的任务
		List<Future> list = new ArrayList<Future>();

		for (int i = 0; i < taskSize; i++) {
			Callable c = new MyCallable(i + "");
			// 执行任务并获取Future对象
			Future f = pool.submit(c);
			list.add(f);
		}
		// 关闭线程池
		pool.shutdown();
		// 获取所有并发任务的执行结果
		for (Future f : list) {
			System.out.println(">>>" + f.get().toString());// 抛出异常
		}
		Date date2 = new Date();
		System.out.println("----程序结束运行----，程序运行时间【"
				+ (date2.getTime() - date1.getTime()) + "毫秒】");
	}
}

class MyCallable implements Callable<Object> {
	private String taskNum;

	MyCallable(String taskNum) {
		this.taskNum = taskNum;
	}

	@Override
	public Object call() throws Exception {
		System.out.println("任务启动！  " + taskNum);
		Date dateTemp1 = new Date();
		Thread.sleep(1000);
		Date dateTemp2 = new Date();
		long time = dateTemp2.getTime() - dateTemp1.getTime();
		System.out.println("任务终止！  " + taskNum);
		return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
	}
}
