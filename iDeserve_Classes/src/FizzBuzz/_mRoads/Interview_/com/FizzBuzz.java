package FizzBuzz._mRoads.Interview_.com;

public class FizzBuzz {
	public static void main(String[] args) {
		for(int i=1; i<=20; i++){
			if(i%15==0){
				System.out.print("FizzBuzz"+" ");
			}else if(i%3==0){
				System.out.print("Fizz"+" ");
			}else if(i%5==0){
				System.out.print("Buzz"+ " ");
			}else{
				System.out.print(i+ " ");
			}
		}
	}
}
