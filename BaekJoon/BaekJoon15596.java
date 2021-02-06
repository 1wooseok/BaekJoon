package hello;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

	}
	
	public static int d(int n) {
		int result=0;
		
		if(n < 100) {
			result = n + n/10 + n%10;     

		} else if(n < 1000 && n > 99) {
			result = n + n/100 + (n%100)/10 + n%10;   // 1000 юлго

		} else if(n < 10000 && n > 999) {
			result = n + n/1000 + (n%1000)/100 + (n&100)/10 + n%10;

		}
		return result;
	}
}

