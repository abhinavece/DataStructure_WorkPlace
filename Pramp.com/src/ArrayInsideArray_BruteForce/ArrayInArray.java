package ArrayInsideArray_BruteForce;

public class ArrayInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] newArray = calculateNewArray(arr);
		for(int i: newArray){
			System.out.println(i);
		}
	}
	
	public static int[] calculateNewArray(int[] array){
		int n = array.length;
		
		int[] newArray = new int[n];
		for(int i=0; i<n; i++){
			int result =1;
			for(int j=0; j<n; j++){
				if(j==i){
					continue;
				}
					result *= array[j];
			}
			newArray[i]=result;
		}
		return newArray;
	}
}
