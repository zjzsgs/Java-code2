package base;

public class Test {
	public static void main(String[] args) {
		System.out.println(new T1());
	}
}
class T1{
	private Long[] arrLong = {10L};
	private Long onlyLong = 10L;
	public T1(){
		new T2(arrLong,onlyLong);
	}
	public String toString(){
		return arrLong[0]+","+onlyLong;
	}
}

class T2{
	private Long[] arrLong;
	private Long onlyLong;
	public T2(Long[] arrLong, Long onlyLong) {
		
		this.arrLong = arrLong;
		this.arrLong[0] = 20L;
		this.onlyLong = onlyLong;
		this.onlyLong = 20L;
	}
	
}