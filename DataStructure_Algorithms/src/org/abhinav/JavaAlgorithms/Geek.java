package org.abhinav.JavaAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class Geek {
	
	public static void main(String[] args) {
		String str = "hello Abhinav  Kumar Singh, How are you.";
		
		removeDuplicate(str);
	}
	
	public static void removeDuplicate(String str){
		String s1 = str.toLowerCase().replaceAll("\\s", "");
		char[] arr = s1.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c: arr){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);				
			}
		}
		System.out.println(map);
		
	}

}
