
public class DoWhileLoop {

	public static void main(String[] args) {
		
		String[] dersler= {"Mat", "Bio", "Fizik", "Türkçe", "Yabancı Dil"};
		
		int i=dersler.length-1;  //Tersten yazdırma
		
		do {
			
			System.out.println(dersler[i]);
			i--;
			
		}while (i >= 0);
		
		System.out.println("Döngü Bitirildi");
		
		/* NOT: DoWhile ile While arasındaki temel fark, koşul uymasa bile do döngüdü bir kere dahi olsa çalışır. */
	}
}
