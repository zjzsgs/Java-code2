package base;

public class Round {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.round(11.2));//11
		System.out.println(Math.round(-11.2));//-11
		System.out.println(Math.round(11.6));//12
		System.out.println(Math.round(-11.6));//-12
		System.out.println(Math.round(-11.5));//-11  负数四舍五入倒着来 从小到大
	}

}
