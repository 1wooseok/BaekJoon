package hello;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = sc.next(); 
		
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);   
			int num = (int)ch;
			
			if(arr[num-97] == -1) {
				arr[num-97] = i;
			}
		}	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}	
	}
}

