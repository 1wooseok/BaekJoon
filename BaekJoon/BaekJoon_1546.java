package hello;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double max=0;
		double sum=0;
		double mean=0;
		int N = sc.nextInt();
		
		double[] score = new double[N];
		double[] newScore = new double[N];
		
		for(int i=0; i<N; i++) {
			double myScore = sc.nextInt();
			score[i] = myScore;
			//sc = new Scanner(System.in);
		}
		
		System.out.print("score[] = [ ");
		for(int i=0; i<N; i++) {
			System.out.print(score[i]+" ");
		}
		System.out.println("]");
		
		for(int i=0; i<N; i++) {
			if(max < score[i]) {
				max = score[i];
			} 
		}
		System.out.println("MAX : "+max);
		
		for(int i=0; i<N; i++) {
			newScore[i] = score[i]/max*100;
		}
		System.out.print("newScore[] = [ ");
		for(int i=0; i<N; i++) {
			System.out.print(newScore[i]+" ");
		}
		System.out.println("]");
		
		for(int i=0; i<N; i++) {
			sum = sum + newScore[i];
		}		
		mean = sum/N;
		System.out.println(mean);
	}

}
