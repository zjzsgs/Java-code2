package base;

public class Try {
	public static void main(String[] args) {
		int i=0;
		try{
			System.out.println("try");
			return;
//			i++;
//			int a=1/0;//��������쳣 ��ֱ������catch
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch");
		} finally{
			System.out.println("finally");
		}
		System.out.println(i);//return ��û�����
		
	}
}
