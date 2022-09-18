
public class ForLoop {

	public static void main(String[] args) {
		String[] isimler={"Ahmet", "Mehmet", "Çağrı", "Kemal", "Can"};//Dizi tanımlaması 
		
		for( int i=0; i<isimler.length; i+=2) // dizinin sıfırıncı, ikinci, dördüncü, altıncı şekilinde ardışık 2 olarak elemanları yazdıracaktır.
		System.out.println(isimler[i]);  
		
		for( int i=1; i<isimler.length; i+=2) // dizinin bitinci, üçüncü, beşince, yedinci şekilinde ardışık 2 olarak elemanları yazdıracaktır.
		System.out.println(isimler[i]);  
		

	}

}
