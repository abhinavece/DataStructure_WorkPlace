package PeakElement.iDeserve.binaryMethod.com;

public class PeakElements {
	public static void main(String[] args) {
		int[] arr = {40,10, 20, 5, 45, 50, 65, 90, 35, 25};
		Integer peak = getPeakElement(arr);
		System.out.println(peak !=null ? "Peak element is: "+peak : "No peak element" );
	}
	
	public static Integer getPeakElement(int[] arr){
		
		int end = arr.length-1;
		int start =0,mid=0, result =0;
		
		while(end >= start){
			mid = (start + end)/2;
			
			if((arr[mid]==0 || (arr[mid] >= arr[mid-1]) && (mid==arr.length-1 || arr[mid]>= arr[mid+1]))){
				return arr[mid];
			}
			else if( mid >0  && arr[mid] < arr[mid-1] ){
				end  = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return null;
	}
	
	

}
