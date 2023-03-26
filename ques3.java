import java.util.*;

public class Main {
	
	public static void solution(int[] arr, int k){
		//write your code here
		HashMap<Integer,Integer>rfmap = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
		    int rem = arr[i]%k;
		    if(rfmap.containsKey(rem)){
		        int fre = rfmap.get(rem);
		        rfmap.put(rem,fre+1);
		    }
		    else{
		        rfmap.put(rem,1);
		    }
		}
		for(int i = 0; i < arr.length; i++){
		    int rem = arr[i]%k;
		    if(rem == 0){
		        int fre = rfmap.get(rem);
		        if(fre%2==1){
		            System.out.println(false);
		            return;
		        }
		    }
		    else if(2*rem == k){
		        int fre = rfmap.get(rem);
		        if(fre%2==1){
		            System.out.println(false);
		            return;
		        }
		    }
		    else{
		        int fre = rfmap.get(rem);
		        int kfre = rfmap.get(k-rem);
		        if(fre != kfre){
		           System.out.println(false);
		            return; 
		        }
		    }
		}
		System.out.println(true);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		solution(arr,k);
	}

}
