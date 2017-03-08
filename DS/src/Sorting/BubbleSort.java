package Sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] array = {2,6,4,8,9,11,44,5,22};
		bubbleSort(array);
		
	}
	
	public static void bubbleSort(int[] array){
		int n = array.length;
		for(int i=0; i<n-1; i++){
			for(int j=i; j<n-i-1; j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i: array){
			System.out.println(i);			
		}
	}

}
