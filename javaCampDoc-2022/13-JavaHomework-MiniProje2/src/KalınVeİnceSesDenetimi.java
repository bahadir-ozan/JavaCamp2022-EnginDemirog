

public class KalınVeİnceSesDenetimi {

	public static void main(String[] args) {
		
		char harf= 'A';
		
		switch(harf) {
			
		case 'A':
		case 'I':
		case 'O':
		case 'U': 
				System.out.println(harf + " kalın sesli harf"); 
				break; 
				default: 
					System.out.println(harf+" kalın sesli harf değil."); 		
		}
	}
}
