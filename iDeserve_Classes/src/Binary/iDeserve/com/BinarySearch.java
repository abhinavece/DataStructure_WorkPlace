package Binary.iDeserve.com;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {2,4,9,10,23,35,49,51,60};
		System.out.println("Index of the element is: "+findBinarySearch(array, 35));
	}
	
	public static int findBinarySearch(int[] array, int element){
		int start=0;
		boolean bool =false;
		int end = array.length-1;
		while(start<=end){
			int mid = start + (end-start)/2;
			if(array[mid] == element){
				return mid;
			}else if(array[mid]>element){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
}
