package com.abhinav.BinarySearch;

public class FirstOccurance {
	public static void main(String[] args) {
		int[] array = {2,4,5,7,10,10,10,10,18,20};
		int firstOccurance= findOccurance(array,10, false);
		int lastOccurance = findOccurance(array,10, true);
		System.out.println(firstOccurance);
		System.out.println(lastOccurance);
		System.out.println("Nos of repeatation: "+ ((lastOccurance-firstOccurance)+1));
	}

	private static int findOccurance(int[] array, int num, boolean isLastOccurance) {
		int start = 0;
		int end = array.length-1;
		int index=0;
		while(start<=end){
			int mid = start + (end-start)/2;
			if(array[mid]==num){
				index = mid;
				if(isLastOccurance==false){
					end = mid-1;					
				}else{
					start = mid+1;
				}
			}
			else if(array[mid]>num){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return index;
	}

}
