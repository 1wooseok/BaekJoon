package hello;

import java.util.Scanner;

class hello {
	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i=0; i<C; i++) {
			int sum=0;
			int mean=0;
			int good_student = 0;
			double pro = 0;
			int N = sc.nextInt();
			int[] arr = new int[N];	
			
			for(int k=0; k<N; k++) {
				int score = sc.nextInt();
				arr[k] = score;
			}
			
			for(int p=0; p<arr.length; p++) {
				sum = sum + arr[p];
			}
			mean = sum/arr.length;
			
			for(int j=0; j<N; j++) {
				if(arr[j] > mean) {
					good_student++;
				}
			}			
			System.out.format("%.3f%%%n", (double)good_student / (double)N * 100.0);
		}			
	}
}


