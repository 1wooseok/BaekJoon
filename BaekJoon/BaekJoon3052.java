package hello;

import java.util.Scanner;

public class BaekJoon3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		boolean[] arr = new boolean[42];
		
		for(int i=0; i<10; i++) {
			int a = (sc.nextInt()%42);
			if(arr[a] == false) {
				arr[a] = true;
				count++;
			} 
		}
		System.out.println(count);
	}
}
