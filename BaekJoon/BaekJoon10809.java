package hello;

import java.util.Scanner;

public class BaekJoon10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++) {  // 초기화
			arr[i] = -1;
		}
		
		for(int i=0; i<S.length(); i++) {  // 알파벳을 배열의 인덱스로 표현
			char ch = S.charAt(i);
			if(arr[ch-'a'] == -1) {
				arr[ch-'a'] = i;
			}
		}
		
		for(int i=0; i<arr.length; i++) {  // 출력
			System.out.println(arr[i]);
		}
	}
}


//  같은 문자 예외 처리