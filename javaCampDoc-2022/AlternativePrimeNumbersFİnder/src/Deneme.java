
import java.util.ArrayList;

public class Deneme {

	public static void main(String[] args) {
		
		System.out.println(findPrimes(1,100));
	}
		public static ArrayList<Integer>findPrimes(int start, int end) {
			
			ArrayList <Integer> primes = new ArrayList<Integer>(); 
			
			int number= 5 ;
			boolean prime= true; 
		
			int i=2; 
		while(i<= number/2 ) {
			if(number % i == 0) {
				prime= false; 
				break;
				}
				i++;
			}
			System.out.println(primes); 
			return null; 
		}
		
		
		

	}


