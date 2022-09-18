
public class Variables {

	public static void main(String[] args) {
		
			
			System.out.println("Öğrenci Sayısı: 2\n"); 
			
		/*Yerine, bir değişken ile tanımlamak daha kullanışlıdır. Çünkü bir kod bloğunda bu değişken binlerce kez kullanılabilir.  O halde tek tek el ile yazmak yerine bir değişkene atayıp, 
		   o değişkeni bir kere değiştirerek kullanmak hem hafıza alanından tasarruf ettirecek hemde temiz bir kod düzeni ile çalışırız.  */
			
			int ogrSayisi = 5; 
			String myVar = "Öğrenci Sayısı: ";
					
			System.out.println(myVar +ogrSayisi);
			System.out.println( myVar+ogrSayisi);
			System.out.println(myVar+ogrSayisi);
			System.out.println(myVar+ogrSayisi);

	}

}
