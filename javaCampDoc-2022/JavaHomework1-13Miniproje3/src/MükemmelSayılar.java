
public class MükemmelSayılar {

	public static void main(String[] args) {
		//Pozitif bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayılar denir.(kendisi hariç
		
			int sayımız= 6; 
			int toplam=0;
			 for(int i=1;  i<sayımız; i++) {
				 if(sayımız%i==0) {
					 
					 toplam = toplam +i; 
					 System.out.println(toplam);
				 }
				 
			 }
			 if (toplam==sayımız)
				 System.out.println("Mükemmel sayıdır.");
			 else 
				 System.out.println("Mükemmel sayı değildir.");
	}

}
