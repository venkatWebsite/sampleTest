package sampleTest;



public class PrimeNumber {


	public static void main(String[] args) {

	for(int i = 2 ; i<10 ; i++) {
		boolean flag = true;
		for(int j = 2 ; j<i-1 ; j++) {
			if(i%j == 0) {
				flag=false;
				break;
			}
			
		}
		if(flag=true) {
			System.out.println(i);
		}
		
	}
		
	
		}



}
