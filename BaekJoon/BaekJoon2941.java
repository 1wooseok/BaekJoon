package hello;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String str = sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			str = str.replace(arr[i], "a");
		}
		System.out.println(str.length());
	}
}

