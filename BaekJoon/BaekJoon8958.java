package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N]; 
		
		//sc = new Scanner(System.in);
		
		for(int i=0; i<N; i++) {
			String ox = sc.next();
			int score = 0;
			int acc = 0;
			for(int k=0; k<ox.length(); k++) {
				if(ox.charAt(k) == 'O') {					
					acc++;
					score = score + acc;
				} else {
					acc = 0;
				}
			}
			arr[i] = score;

		}
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
	}
}


