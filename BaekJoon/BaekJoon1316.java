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
            	char next = str.charAt(k+1);   // 다음 문자.
            	char[] arr = new char[str.length()]; // 중복이 있는지 확인하기 위함 , 문자가 바뀔때만 배열에 넣어줌. 
            	if(ch != next) { // 다음문자와 다를때만 조건문 실행  ex) happy 에서 3번째 p는 실행 안함.
            		if(isptr(next, arr)) {  //다음 문자가 배열에 있는지 검사 (boolean 반환)
            			return;    //이 단어는 그룹 단어가 아니기 때문에 조건문을 끝내고 다음단어로 넘어가기 위함.
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

	
		


