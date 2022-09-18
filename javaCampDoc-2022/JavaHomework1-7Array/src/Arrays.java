
public class Arrays {

	public static void main(String[] args) {
		
		
		String[] ogrenciler= new String[4];  
		
		ogrenciler[0]="Engin"; 
		ogrenciler[1]= "Derin"; 
		ogrenciler[2]= "Bahadır";
		ogrenciler[3]= "Salih";
		
		
		for(int i=0; i<ogrenciler.length; i++) {
		
			System.out.println(ogrenciler[i]);
		
		}
		
		/* Pratikte kullanılan alttaki yöntemdir.*/
		
		for (String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		
		}
		
	}
		

}
