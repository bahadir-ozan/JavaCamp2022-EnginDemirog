
public class ArkadasSayılar {

	public static void main(String[] args) {
		/*bölenlerin toplamı birbilerini veren sayılara denir. 220'nin bölenleri toplamı(220 hariç) 284 tür. 
		 * 	284'ün bölenlerininin toplamı ise 220'dir.																			*/
		
		int sayı1=220;
		int sayı2= 284; 
		int toplam1= 0; 
		int toplam2= 0; 
		
		for (int i =1 ; i <sayı1; i++) {
			if(sayı1%i==0) {
				toplam1 = toplam1+i;
				
			}
		}
		System.out.println(toplam1); 
		
		
		for(int i =1 ; i<sayı2 ; i++) {
			if(sayı2%i==0) {
				toplam2= toplam2 + i;
			}
		}
		System.out.println(toplam2); 
		
		if  (sayı1== toplam2  && sayı2==toplam1) //&& and operatörüdür. || veya operatörüdür.
			{
				System.out.println(toplam1+ " ve "+ toplam2 +" arkadaş sayıladır."); 
			}else 
			System.out.println(toplam1+ " ve "+ toplam2+  " arkadaş sayı değildir.."); 		
		
	}

}
