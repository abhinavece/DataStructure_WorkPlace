package ArrayInsideArray;

public class ArrayInArray {
	
	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5};
		calculateArray(arr);
	}
	
	public static void calculateArray(int[] array){
		
		int[] newArray = new int[array.length];
		
		int result=1;
		for(int i=0; i<array.length; i++){
			result *= array[i];
		}
		
		for(int i=0; i<array.length; i++){
			newArray[i] = result/array[i];
		}
		
		for(int a: newArray){
			System.out.println(a);
		}
	}
}
