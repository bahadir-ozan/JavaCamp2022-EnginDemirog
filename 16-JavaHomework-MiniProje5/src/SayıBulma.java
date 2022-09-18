
import java.util.Scanner;

public class SayıBulma {

	public static void main(String[] args) {
		
	  int[] sayılar= new int[] {1,2,3,4,5}; 
	  
	  Scanner sayıGir= new Scanner(System.in); 
	  System.out.println("Dizide aranacak sayıyı giriniz: "); 
	  int arananSayı= sayıGir.nextInt(); 
	  int i =0;
	  			
	boolean varMı=false; 
	 for(int sayi: sayılar){
		 if(sayi==arananSayı) {
	  				
		 varMı=true;
	  	}
	  }
	 
	 if (varMı)
		System.out.println("Bu sayı dizide mevcut.");
	else 
		System.out.println("Bu sayı dizide mevcut değil.");
	}
}
