import java.util.Scanner;



public class minimum_absolute_difference_in_an_array {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
			arr2[i] = arr[i];
		}
		
		int a = 0,b = 0;
		int count = 0;
		int min = 100000000;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]<0 && arr[j]<0){
					if(arr[i]>arr[j]){
						count = ((-1*arr[i])-arr[j]);
					}else{
						count = ((-1*arr[j])-arr[i]);
					}
				}else if(arr[i]<0 && arr[j]>=0){
					count = ((-1*arr[i])+arr[j]);
				}else{
					if(arr[i]>arr[j]){
						count = arr[i]-arr[j];
					}else {
						count = arr[j]-arr[i];
					}
				}
				
				if(count < min){
					min = count;
				}
			}
		}
		
		System.out.println(min);
		
	}

}
