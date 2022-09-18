
public class WhileLoop {

	 public static void main(String[] args) {
	        int[] numbers = {2, 4, 6, 8, 10}; //Tanımlanan dizimiz
	        
	        int index = numbers.length -1; //Dizinin uzunluğundan 1 çıkartırsak elimizdeki indeks sayısını buluruz. İndek bu sayıdan itibaren başlatılıp azaltıralarak yazıdırılır.
	        
	        while (index >= 0) {
	            
	        	System.out.println(numbers[index]);
	            
	            index--; //Azaltma işlemi
	        } 
	    }
	}