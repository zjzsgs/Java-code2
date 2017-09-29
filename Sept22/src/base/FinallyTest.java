package base;

public final class FinallyTest {

	/**
	 * �������ڱ���return new ReturnClass();ʱ�������ֳ����������裬new ReturnClass()��return��
	 * ǰһ������������������finally����֮ǰ��ִ�е�
	 * ������һ��return�������finally����֮��ִ�еģ�Ҳ����˵finally�������ڳ����˳�����֮ǰ��ִ�еġ�
	 * ͬ����finally��������ѭ����������continue�����жϣ�break��֮ǰ��ִ�еġ�
	 * @return
	 */
	// ����return���
	public ReturnClass testReturn() {
		try {
			return new ReturnClass();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Return:ִ����finally���");
		}
		return null;
	}

	// ����continue���
	public void testContinue() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println(i);
				if (i == 1) {
					continue;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Continue:ִ����finally���");
			}
		}
	}

	// ����break���
	public void testBreak() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println(i);
				if (i == 1) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Break:ִ����finally���");
			}
		}
	}

	public static void main(String[] args) {
		FinallyTest ft = new FinallyTest();
		// ����return���
		ft.testReturn();
		System.out.println();
		// ����continue���
		ft.testContinue();
		System.out.println();
		// ����break���
		ft.testBreak();
	}
}

class ReturnClass {
	public ReturnClass() {
		System.out.println("ִ����return���");
	}
}