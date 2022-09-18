
public class WorkingWithStrings {

	public static void main(String[] args) {
		
		
		String theMessage= "I wanna travel around the world";
		
		System.out.println("Eleman Sayısı: "+theMessage.length() ); //dizinin uzunluğunu gösteren komut .length()
		System.out.println("4. eleman: "+ theMessage.charAt(3));		//karakter dizisinin istenilen indisteki elemanını çağıran komut: .charAt(i)
		System.out.println(theMessage.concat(".Why not? Maybe one day!"));
		System.out.println(theMessage.startsWith("w")); //mesaj D ile mi başlıyor? False dönecek.		
		System.out.println(theMessage.endsWith("d"));	//mesaj d ile mi bitiyor?	True döner
		System.out.println(theMessage.indexOf("wan")); //istenilen bir karakterin indeksini veya sıralı karakter grubunun başladığı indeksi gösterir. 
		System.out.println(theMessage.lastIndexOf("d")); //enson d'yi aradı ve 30. indiste buldu
	}

}
