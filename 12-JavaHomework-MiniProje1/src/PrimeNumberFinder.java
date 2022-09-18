

/* Kod Bana ait değildir. İnternet aldım ve kendimde birkaç defa yazdım. Kaynak: https://www.educative.io/answers/how-to-check-if-a-number-is-prime-in-java*/

import java.util.Scanner; //Klavyeden giriş için yüklenmesi gereken kütüphane 

class PrimeNumberFinder {
   
    	public static void main(String[] args) {
    		
    		Scanner girilenDeger = new Scanner(System.in); 
    		System.out.println("Lütfen bir sayı giriniz");
    		int sayimiz= girilenDeger.nextInt(); //Girilen değer sayimiz değişkenine atandı. 
    		
    		girilenDeger.close(); //Scanner kapatma
    		
    		if (isPrime(sayimiz)) { //23. satırdan itibaren yazılan alt programdan returnler ile gelen true false değeri okunur. True olursa çalıştırılır.//int num=number yapılmış oldu.
    		
    			System.out.println(sayimiz+ " asal sayıdır.");

    	}else {
    		
    			System.out.println(sayimiz+ " asal sayı değildir."); 
    		
    		}
    	}
    	/* Alt program */
    	static boolean isPrime(int sayimiz) { //int sayimiz=sayimiz yapılmış oldu.(Tekrar atama yapıldı )
    		
    		if(sayimiz<=1) //Alt programda 1 'e eşit veya birden küçük denetimi
    			return false; //Çalışırsa isPrime(number) false dönecek ve 19. satır olan else koşuluna girecektir.
    		
    		  /*Hiçbir sayı kendisinin yarısından fazlasına bölünemez. Örneğin 10'u 6 ı bölemez. Yada 1000'i 501 bölemez.
    	       * O halde yarısından fazlasını kontrol etmek anlamsızdır. Yani döngü daha az dönecektir.*/
    		
    		for(int i=2; i<=sayimiz/2; i++) { 
    			if ((sayimiz%i)==0) //İ'nin herhangi bir değerinde kalan 0 gelirse 36. satır false dönecektir ve 19. satır çalışacaktır.
    				return false; 
    		}
    		return true; //35. satırın aksi gerçekleşirse 16. satır olan if bloğu çalışacaktır. 	
    	}
  
}
