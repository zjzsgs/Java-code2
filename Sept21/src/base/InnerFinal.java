package base;

public class InnerFinal {
//	static String str;//�ֲ��ڲ�����Է���ȫ�־�̬����
	private String name="name";
	public static void main(String[] args) {
		final String str = "java";//�ֲ��ڲ���ֻ�ܷ���final�ֲ�����
		long begin = System.currentTimeMillis();
		System.out.println(begin);
		//�ڲ����з��ʾֲ����� ����Ҫдfinal �������ʱ�ᱨ��
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(str+" "+i);//str����final ��Ȼ���벻ͨ��
//					System.out.println(name);
					System.out.println();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("��Ϣ0.1��");
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
