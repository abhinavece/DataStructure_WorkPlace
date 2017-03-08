package ToggleBit.BitShift.iDeserve.com;

public class BitShift {
	public static void main(String[] args) {
		int num = 50;
		System.out.println(toggleBits(num));
	}

	public static int toggleBits(int num) {
		int solution =0;
		if(num==0){
			return 1;
		}
		int nextBitSet =1;
		while(num != 0){
			int lastBit = (num&1);
			if(lastBit ==0){
				solution = solution | nextBitSet;
			}
			nextBitSet = nextBitSet<<1;
			num = num>>>1;
		}
		return solution;
	}
}	