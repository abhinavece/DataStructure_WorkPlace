package MajorityElement.iDeserve.com;

public class Deserve {
	public static void main(String[] args) {
		int[] array = {2,6,2,2,6,2,2,8,2,1};
		Integer x = findMajorityElement(array);
		System.out.println(x.toString());
	}
	public static Integer findMajorityElement(int[] array){
		for(int i=0; i<array.length; i++){
			int count=0;
			for(int j=0; j<array.length; j++){
				if(array[i]==array[j]){
					count++;
				}
			}
			if(count>=array.length/2){
				return array[i];
			}
		}
		return null;
	}

}
