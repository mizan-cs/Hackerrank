import java.util.Arrays;
import java.util.Scanner;


public class Mark_and_Toys {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,max;
		
		n = in.nextInt();  
		max = in.nextInt(); 
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		int ans = 0;
		for(int i=0;i<n;i++){
			if(arr[i]<=max){
				ans++;
				max = max-arr[i];
			}
		}
		
		System.out.println(ans);

	}

}
