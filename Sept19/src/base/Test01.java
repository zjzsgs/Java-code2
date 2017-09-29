package base;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(test());
	}

	private static int test() {
		try {
			System.out.println("1");
			return 2;
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			System.out.println("3");
//			return 4;
		}
		return 4;
	}
}
