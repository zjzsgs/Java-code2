package base;

public class Try {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Try t = new Try();
		System.out.println(t.test());
	}

	@SuppressWarnings("finally")
	private int test() {
		try{
			System.out.println("1");
			return 2;
		}finally{
			System.out.println("3");
			return 4;
			
		}
	}

}
