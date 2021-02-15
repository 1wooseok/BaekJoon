package hello;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int N = sc.nextInt();
		String num = sc.next();
		sc.close();
		
		for(int i=0; i<N; i++) {
			int result = converter(num, i);
			sum += result;
		}
		System.out.println(sum);
	}
	
	public static int converter(String str, int i) {
		int ascii = Character.getNumericValue(str.charAt(i));
		return ascii;
	}
}

 