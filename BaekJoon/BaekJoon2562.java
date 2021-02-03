package hello;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int index = 0;
		int arr[] = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.print(index);	
	}
}
