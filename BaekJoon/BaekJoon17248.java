package hello;

import java.util.Scanner;

public class BaekJoon17248 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
				
		for(int i=0; i<t; i++) {
			int s = 1;
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			while(true) {
				if((x+(int)Math.pow(z, s)) >= y) {
					System.out.println(s);
					break;
				} else {
					s++;
				}
			}
			
		}
	}

}
