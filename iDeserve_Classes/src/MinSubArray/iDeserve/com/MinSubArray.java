package MinSubArray.iDeserve.com;

public class MinSubArray {
	
	public static void main(String[] args) {
		
		int[] array = {2,3,3,4,1,1,-1,2};
		
		findMinSubArray(array,7);
	}
	
	public static void findMinSubArray(int[] array, int k){
		int min = Integer.MAX_VALUE;
		int start=-1;
		int end= -1;
		int n = array.length;

		for(int i=0; i<n; i++){
			int currentSum=0;
			for(int j=i; j<n && (j-i+1)<min; j++){ ///Understand (j-i+1)< min
				currentSum = currentSum+array[j];
				if(currentSum==k){
					start = i;
					end = j;
					min = end-start+1;
					break;
				}
			}
		}
		
		if(start== -1 || end == -1){
			System.out.println("No sub array with sum = "+k);
		}else{
			while(end>=start){
				System.out.print(array[start]+ " ");
				start++;
			}
		}
		
	}
	
}
