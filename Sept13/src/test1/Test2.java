package test1;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=2,b=1,c=0,sum=0;
		for(int i=1;i<=10;i++){
		sum+=a/b;
		c=a+b;
		b=a;
		a=c;
		}
		System.out.println("ºÍÎª"+sum);
	}

}
