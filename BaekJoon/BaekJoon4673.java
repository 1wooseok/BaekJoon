package hello;

public class lab {
 
    public static void main(String[] args) {         
        int[] arr = new int[10001];
        
    	for(int i=1; i<arr.length+1; i++) {   //1 - 10000 까지 배열
    		int result = converter(i);
    		if(result <= 10000) {
    			arr[result] = 1;
    		}
    	}
    	for(int i=1; i<arr.length; i++) {   //1 - 10000 까지 배열
    		if(arr[i] != 1) {
    			System.out.println(i);
    		}
    	}
    }
    
    public static int converter(int i) {
    	int result = i;
    	while(i > 0) {
    		result += i%10;
    		i = i/10;
    	}
    	return result;
    }
}

	
		


