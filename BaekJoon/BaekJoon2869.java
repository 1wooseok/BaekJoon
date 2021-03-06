package hello;

import java.util.Scanner;

public class BaekJoon2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int curr = 0;
		int day = 0;
		
		while(curr < V) {
			curr = curr+A;
			day++;
			if(curr >= V) {
				break;
			}
			curr = curr-B;
		}
		System.out.println(day);
	}
}
