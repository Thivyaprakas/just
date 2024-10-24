package tryandfail;

import java.util.Scanner;

public class Input_from_user {

	public static void main(String[] args) {
		
		System.out.println("enter your phone number");
		Scanner obj1 = new Scanner(System.in);
		long ph = obj1.nextInt();
		System.out.println("my phone number is "+ ph);
		
	}

}
