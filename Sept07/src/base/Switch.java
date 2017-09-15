package base;

public class Switch {

	/**
	 * switch的选择因子 short byte char int 等整型 
	 * 枚举类型 enum 使用时不需要带类型名 
	 * jdk1.7后 boolean和String
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
//		switch(str){		}//jdk1.7支持

	}

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

}
