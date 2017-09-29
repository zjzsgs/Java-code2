package base;

import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class While_Flag {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int id;
		boolean flag = true;
		while (flag) {
			try {
				System.out.println(" ‰»ÎID£∫");
				flag = false;
				id	= scanner.nextInt();
			} catch (Exception e) {
				System.out.println("«Î ‰»Î ˝◊÷£°");
				flag = true;
			}
		}
		
	}
}
