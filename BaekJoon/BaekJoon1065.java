package hello;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(discriminant(n));
	}
	
	public static int discriminant(int n) {
		int count=0;
		for(int i=1; i<n+1; i++) {
			if(i<10) {
				count++;
			} else if(i >= 10 && i < 100) {
				count++;

			} else if(i >= 100 && i < 1000) {
				if((i/100)-(i%100/10) == (i%100/10)-(i%100%10)) {
				//if(Math.abs((i/100)-(i%100/10)) == Math.abs((i%100/10)-(i%100%10))) {
					System.out.println("�Ѽ� = "+ i);
					count++;
				}
			}
		}
		return count;
	}
}
//424
//�������� = �����ϴ� �ΰ����� ���� ������ ���� |100�ڸ��� - 10�ڸ���| == |10�ڸ��� - 1�ڸ���| 
//						731			(i/100)-(i%100/10)   ==  (i%100/10)-(i%100%10)