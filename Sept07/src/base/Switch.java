package base;

public class Switch {

	/**
	 * switch��ѡ������ short byte char int ������ 
	 * ö������ enum ʹ��ʱ����Ҫ�������� 
	 * jdk1.7�� boolean��String
	 * 
	 * @param args
	 */
	static Day day;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 0;
		switch (b) {

		}
		char c = 'A';
		switch (c) {

		}
		int i = 12;
		switch (i) {

		}
		short s = 1;
		switch (s) {

		}
		
		switch(day){
		case SUNDAY:
		}
		
		String str ="ddf";
//		switch(str){		}//jdk1.7֧��

	}

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

}
