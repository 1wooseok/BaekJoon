package hello;

import java.util.Scanner;

public class lab {
 
    public static void main(String[] args) {         
    	Scanner sc = new Scanner(System.in);
    	
    	int[] arr = new int[26];   //¾ËÆÄºª °³¼ö
    	
    	String str = sc.next();
    	int max = -1;
    	int max2 = 0;
    	char aa = 'a';
    	
    	for(int i=0; i<str.length(); i++) {
    		char ch = str.charAt(i);
    		if(ch >= 97) {
    			arr[ch-'a']++;
    		} else {
    			arr[ch-'A']++;
    		}
    	}
    	for(int i=0; i<arr.length; i++) {
    		if(max == arr[i]) {
    			aa = '?';
    		} else if(arr[i] > max) {
    			max = arr[i];
    			max2 = i;
    			aa = (char)(i+65);
    		}
    	}
    	System.out.println(aa);
    }
}
	


