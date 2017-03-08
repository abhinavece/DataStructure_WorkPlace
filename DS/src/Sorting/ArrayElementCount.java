package Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayElementCount {
	
	public static void main(String[] args) {
		int[] array = {1,1,2,2,3,3,4,5,5,6,6};
		int result =singleNumber(array);
		System.out.println(result);
	}
	
	public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        Set<Integer> set = map.keySet();
        for(int i: set){
        	if(map.get(i)==1){
        		return i;
        	}
        }
        return -1;
    }

}
