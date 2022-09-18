
public class DataTypes {

	public static void main(String[] args) {
		
		
		int sayi= 12;   // 4 byte(32 bit) hafızada yer kaplar. (-2, 147, 483, 648) to (2, 147, 483, 647) aralığındaki değerleri alabilir
		
		//sayi = "Ankara" değişikliği yapılamaz. Sayısal değer yerine metinsel ifade değişikliği söz konusu olamaz. Ancak değişkenin de veri tipi değişirse olur. 
		
		System.out.println(sayi); //Çıktı 12 olarak verecektir.
		
		String metineDonusturme=String.valueOf(sayi); //Burada String.valueof komutu ile tip değişikliği ile stringe dönüştü
		
		
		System.out.println(sayi+1); //Çıktı 13 verecektir. Ve tip hala sayısal tip olan int korunacaktır.
		System.out.println(metineDonusturme+1);  //Sonuç 121 gelecektir. Ve metinsel tip olan string olarak korunacaktır.

				
				/* byte(1), short(2), int(4), long(8) veri tipleri tam sayı için kullanılır. Float(4) ve double(8) ondalıklı ifadeler için kullanılır.
				 * Float onluk kısım 0-7 arasında haneye sahip ise
				 * Double onluk kısmı 0-16 arasında haneye sahip ise*/ 
		
		char tekKarakterTutma = 'A';  //Tek krarkter tutma. Karakter dizisi tutulmaz ve tek tırnak ile kullanılması zorunludur. 
		
		boolean dogruGosterimi= true; // 1 bytelık yer tutar.Sadece true veya false döndürür. 
		boolean yanlısGosterimi= false; 

		System.out.println(dogruGosterimi); 
		System.out.println(yanlısGosterimi);
		System.out.println(((Object)tekKarakterTutma).getClass().getSimpleName()); //Char tip sorgulama
	}

}
