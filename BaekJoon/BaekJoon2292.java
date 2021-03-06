package hello;

import java.util.Scanner;

public class BaekJoon2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //  N¹øÂ° ¹æ.
		int range = 2;
		int x=1;
		
		while(N >= range) {
			range = range + (6*x);
			x++;
		}
		if(N == 1) {
			x = 1;
		}
		System.out.println(x);
	}
}
