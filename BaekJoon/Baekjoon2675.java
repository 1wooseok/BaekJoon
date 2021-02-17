package hello;

import java.util.Scanner;

class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
	
		for(int i=0; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.next();

			for(int k=0; k<S.length(); k++) {	
				char CH = S.charAt(k);
				for(int p=0; p<R; p++) {
					System.out.print(CH);
				}
			}
			System.out.println();         //개행 및 버퍼초기화
			sc.close();
		}
	}
}


