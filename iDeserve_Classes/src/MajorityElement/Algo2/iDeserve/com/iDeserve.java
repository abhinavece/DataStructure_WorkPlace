package MajorityElement.Algo2.iDeserve.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class iDeserve {
	public static void main(String[] args) {
		int[] array = {2,6,2,2,6,2,2,8,2,1};
		System.out.println("Hello");
		getMajorityElement(array);
	}
	
	public static void getMajorityElement(int[] array){
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i: array){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}else{
				map.put(i, 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		for(Integer i: set){
			if(map.get(i)>=array.length/2){
				System.out.println(i);
			}
		}
	}
	

}
