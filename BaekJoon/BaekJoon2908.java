package hello;

import java.util.Scanner;

public class lab {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int new_x = converter(x);
		int new_y = converter(y);
		
		if(new_x > new_y) {
			System.out.println(new_x);
		} else {
			System.out.println(new_y);
		}
	}
	
	static int converter(int n) {
		int new_n = (n/100) + ((n%100/10)*10) + ((n%100%10)*100);
		
		return new_n;
	}
}
