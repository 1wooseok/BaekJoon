package hello;

import java.util.Scanner;

public class BaekJoon1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int i=1;
		
		if(C-B > 0) {
			while(i > 0) {
				if((C-B)*i > A) {
					System.out.println(i);
					break;
				}
				i++;
			}
		} else {
			System.out.println(-1);
		}
	}
}
