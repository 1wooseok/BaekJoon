package hello;

import java.util.Scanner;

public class BaekJoon10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++) {  // �ʱ�ȭ
			arr[i] = -1;
		}
		
		for(int i=0; i<S.length(); i++) {  // ���ĺ��� �迭�� �ε����� ǥ��
			char ch = S.charAt(i);
			if(arr[ch-'a'] == -1) {
				arr[ch-'a'] = i;
			}
		}
		
		for(int i=0; i<arr.length; i++) {  // ���
			System.out.println(arr[i]);
		}
	}
}


//  ���� ���� ���� ó��