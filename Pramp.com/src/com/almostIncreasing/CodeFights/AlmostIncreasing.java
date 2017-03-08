package com.almostIncreasing.CodeFights;

public class AlmostIncreasing {
	public static void main(String[] args) {
		int[] arr = {1,3,2,1};
		checkAlmostIncreasing(arr);
	}
	public static void checkAlmostIncreasing(int[] arr){
		int count=0;
		for(int i=0, j=1; j<arr.length; j++){
			if(arr[i]>=arr[j]){
				++count;
				if(j>1){
					continue;
				}
			}
			i=j;
		}
		if(count>1){
			System.out.println("This is not almost increasing array.");
		}else{
			System.out.println("Almost increasing Array :)");
		}
	}
}
