package base;

public class Label {
	public static void main(String[] args) {
		label:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 7; j++) {
					if(j==2){
						break;//�ж�jѭ�� i+1
					}
					if(j==3){
						continue;//���� ִ��j=4
					}
					if(j==1){
						continue label;//�����ⲿ ����ִ��
					}
					if(j==0){
						break label;//�����ⲿ ��ֹ
					}
					System.out.println(i*j);
				}
			}
	}
}
