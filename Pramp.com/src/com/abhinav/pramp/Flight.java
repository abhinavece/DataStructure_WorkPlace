package com.abhinav.pramp;

public class Flight {
	
	public static void main(String[] args) {
		
		int[][][] cordinate = { { { 0, 2, 10 }, { 3, 5, 0 }, { 9, 20, 6 }, { 10, 12, 15 }, 
			{ 10, 10, 8 } } };
			
	int energy = 0;
	int fuel = 0;
	
	
	for(int i=1; i<5; i++){
		    energy = energy + (cordinate[0][i-1][2]-cordinate[0][i][2]);
		    if(energy<0){
		    	fuel = fuel-energy;
		    	energy =0;
		    }
		}
    System.out.println("fuel required is: "+fuel);

	}
	
}
