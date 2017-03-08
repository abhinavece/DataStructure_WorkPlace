package Sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] array = {2,6,4,8,9,11,44,5,22};
		selectionSort(array);
	}
	
	public static void selectionSort(int[] array){
		int n= array.length;
		for(int i=0; i<n-1; i++){
			int min_index = i;
			for(int j=i+1; j<n; j++){
				if(array[j]<array[min_index]){
					min_index=j;
				}
			}
			int temp = array[min_index];
			array[min_index] = array[i];
			array[i] = temp;
		}
		for(int i: array){
			System.out.println(i);
		}
	}

}
