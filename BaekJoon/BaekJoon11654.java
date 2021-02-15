package hello;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		int result = num.charAt(0);
		
		System.out.println(result);
	}
}