package hello;

import java.util.Scanner;

public class BaekJoon1316 {
 
    public static void main(String[] args) {         
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int group_ch = 0;
    	
    	for(int i=0; i<n; i++) {
        	String str = sc.next();
        	for(int k=0; k<str.length()-1; k++) {
            	char ch = str.charAt(k);
            	char next = str.charAt(k+1);   // ���� ����.
            	char[] arr = new char[str.length()]; // �ߺ��� �ִ��� Ȯ���ϱ� ���� , ���ڰ� �ٲ𶧸� �迭�� �־���. 
            	if(ch != next) { // �������ڿ� �ٸ����� ���ǹ� ����  ex) happy ���� 3��° p�� ���� ����.
            		if(isptr(next, arr)) {  //���� ���ڰ� �迭�� �ִ��� �˻� (boolean ��ȯ)
            			return;    //�� �ܾ�� �׷� �ܾ �ƴϱ� ������ ���ǹ��� ������ �����ܾ�� �Ѿ�� ����.
            		}
            		arr[i] = ch;
            	}
        	}
        	group_ch++;
    	}
    	System.out.println("fianl : " + group_ch);
    }
    
    public static boolean isptr(char next, char[] arr) {
    	for(int p=0; p<arr.length; p++) {
    		if(arr[p] == next) {
    			return true;
    		}
    	}
    	return false;
    }
}

	
		


