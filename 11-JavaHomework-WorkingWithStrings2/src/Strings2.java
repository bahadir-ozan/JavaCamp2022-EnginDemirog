
public class Strings2 {
	
	public static void main(String[] args) {
		
		String message= "Bahadır Ozan Ozbey"; 
		
		System.out.println(message.replace('a', 'e')); 
		
		/* Yeni mesaj şekline dönüştüme */
		
		String message2= "Ozan";
		String newMessage=message2.replace("Ozan", "Ozbey");
		
		System.out.println("Replaced Message is " +newMessage); 
	
		/* bir dizinin için bir parçasını okuma: .substring(a, b). Eğer b yani bitiş belirtilmezse son indekse kadar yazar*/ 
		
		System.out.println(message.substring(5, 10)); //10. indeks yazılmaz. Son olarak (b-1). indeks yazılır. Dokuzuncu indeks okundu.
		
		/*for döngüsü ile belirli yerlerden bölme*/
		
		for(String wordsInSentence: message.split(" ")) { //Parçalayarak yazdı. Çünkü her space tuşunu gördüğünde bölme gerçekleştirdi.
			
			System.out.println(wordsInSentence); 
			
		}
		/* Büyük ve küçük harf dönüşümü */
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		/*Boşlukları kaldırma .trim() komutu ile gerçekleştirilir.*/
		
	}

}
