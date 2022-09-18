
public class Conditionals {

	public static void main(String[] args) {
		/* Örnek 1 */
		int sayi= 21; 
		
		if (sayi<20) { //False döner.
		
			System.out.println("Sayı 20 den küçüktür"); 
		}
		
		else { //True döner ve çalışır
			System.out.println("Sayı 20 den küçük değil ");
		}
		
		/* Örnek 2 */
		
		double sayi2= 25.1; 
		
		if  (sayi2 <=24 || sayi2 >=24) {
			
			System.out.println("Sayi2 24 den farklı"); //Bu çıktı olarak yazacaktır.
		}
		else if(sayi2==24) { 
			
			System.out.println("Sayi2 24 tür.");
		}
		
		else {
			System.out.println("Değişken Değeri ve Değişken Türünü Kontrol Ediniz");
		}

	}

}
