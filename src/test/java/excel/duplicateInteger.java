package excel;

import java.util.HashSet;
import java.util.Set;

public class duplicateInteger {

	public static void main(String[] args) {

		String a= "priya venkat";
		int b = 123 , rem,revs=0;
		
		//String Reversal
		int len= a.length();

		String rev = "";

		for (int i= len-1; i>=0 ; i--) {

			rev= rev + a.charAt(i);


		}

		System.out.println(rev);	

		//Integer reversal

		while(b !=0)
		{
			rem = b%10;
			revs=revs*10+rem;
			b=b/10;
		}

		System.out.println(revs);
		
		//Duplicates in string char
		
		char[] charr =a.toCharArray();
		
		
		
		for(int i=0 ; i<a.length();i++) {
			for (int j=i+1 ; j<a.length() ; j++) {
				
				if(charr[i]==charr[j]) {
					System.out.print(charr[j]);
				}

			}
			
			
		}

	}
	
	
	

	
	
	
	
}
