package Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode389 {
	public static void main(String[] args) {
		String s= "abcd";
		String t= "abcde";
		char result = findTheDifference(s,t);
		System.out.println(result);
	}
	
	public static char findTheDifference(String s, String t) {
		if(s.length()==t.length()){
			return ' ';
		}
		Map<Character, Integer> hm1 = getMapObject(s);
		Map<Character, Integer> hm2 = getMapObject(t);
		
		Set<Character> s1 = hm1.keySet();
		Set<Character> s2 = hm2.keySet();
				
		for(char c: s2){
			if(hm1.get(c) != hm2.get(c)){
				return c;
			}
		}
		return ' ';
	}

	private static HashMap<Character, Integer> getMapObject(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] sArray = s.toCharArray();
		for(char c: sArray){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		return (HashMap<Character, Integer>) map;
	}

}
