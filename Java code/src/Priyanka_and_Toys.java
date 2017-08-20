import java.util.Arrays;
import java.util.Scanner;

import javafx.util.Pair;


public class Priyanka_and_Toys {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int[] arr = new int[n];
		int cast = 0;
		
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);
		for(int i:arr){
			System.out.println(i);
		}
		
		for(int i=0;i<n-1;i++){
			cast++;
	        int k = i;
	        while(arr[i]-arr[k]<=4)
	        {
	            i++;
	        }
		}
		System.out.println(cast);
	}

}
