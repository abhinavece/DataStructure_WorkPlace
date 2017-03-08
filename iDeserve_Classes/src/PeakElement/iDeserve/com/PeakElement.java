package PeakElement.iDeserve.com;

public class PeakElement {
	
	public static void main(String[] args) {
		
		int[] arr = {40,10, 20, 5, 45, 50, 65, 90, 35, 25};
		
		for(int i=1; i<arr.length-1; i++){
			if(arr[i]>arr[i-1] && arr[i]> arr[i+1]){
				System.out.println(arr[i]);
			}
		}
	}
}
