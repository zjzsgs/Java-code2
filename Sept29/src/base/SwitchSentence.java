package base;

import java.util.Scanner;

public class SwitchSentence {

	public static void main(String[] args) {
		while(true){
			int a=-1;
			try {
				System.out.println("�Ӽ�������һ��0����6��������");
				Scanner scanner = new Scanner(System.in);
				a = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("������Ĳ���������");
			}
			switch (a) {
			case 0:
				System.out.println("������������");
				break;
			case 1:
				System.out.println("����������һ");
				break;
			case 2:
				System.out.println("���������ڶ�");
				break;
			case 3:
				System.out.println("������������");
				break;
			case 4:
				System.out.println("������������");
				break;
			case 5:
				System.out.println("������������");
				break;
			case 6:
				System.out.println("������������");
				break;
			default:
				break;
			}
		}
	}

}
