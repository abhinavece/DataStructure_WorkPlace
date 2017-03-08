package PivotElement.iDeserve.com;

public class PivotElement {
	public static void main(String[] args) {
		int[] array = {78, 82, 99, 10, 23, 35, 49, 51, 60}; ///
		System.out.println("Hello");
		System.out.println(findPivotElementIndex(array));
	}
	
	public static int findPivotElementIndex(int[] array){
		int start=0;
		int end = array.length-1;
		int N = array.length;
		while(start <= end){
			int mid = start + (end-start)/2;
/*			int next = (mid + 1)%N;
			int prev = (mid+N-1)%N;
			*/
			if(array[end]>array[start]){
				return start;
			}
			
			/*else if(array[mid]<array[next] && array[mid]<array[prev] ){
				return mid;
			}*/
			if(array[mid]>array[mid+1]){
				return mid+1;
			}
			else if(array[mid]<array[end]){
				end = mid-1;
			}else if(array[mid]>array[start]){
				start = mid+1;
			}
			
		}
		return -1;
	}
}
