package base;

public class _Final {
	final int j;
	
	public _Final(int j) {
		super();
		this.j = j;//final�������Գ�ʼ��ֻ���ڶ���ʱ��ֵ���߹��캯����
	}
	public void print(){
		System.out.println(j);
	}


	public static void main(String[] args) {
		final int i = 0;
//		i=i+1;//final���������Բ��ܱ�
		_Final f = new _Final(10);
		f.print();
	}
}
