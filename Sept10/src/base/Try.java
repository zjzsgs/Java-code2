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
			return i+10;//��finally �ٵ�return ������finally��return�� �Ͳ���ִ�������return			
//			System.out.println("2");//����  ����ִ��
		}finally{
			System.out.println("3");
			++i;
			System.out.println(i);
			System.out.println("4");
			return i;
		}
	}
}
