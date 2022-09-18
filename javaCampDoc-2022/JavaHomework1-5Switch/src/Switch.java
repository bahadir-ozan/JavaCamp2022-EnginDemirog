
public class Switch {

	public static void main(String[] args) {
		
		String grade= "Z";
		
				
				switch (grade) {
				
					case "DD" : 
						
						System.out.println("Koşullu Geçtiniz"); 
						break; 
					
					case "FF" :
						
						System.out.println(" Yoklamadan muaf kaldınız"); 
						break;
					case "Z" :
						
						System.out.println(" Yoklamadan muaf değilsiniz ve kaldınız");
						break;
					
					default: 
						
						System.out.println("Geçer notu aldınız "); //Türkiye'deki üniversitelerin kullanıdığı harf sistemindeki bir elemanın büyük harf(ler) şekilinde girildiği varsayılıyor.
					
				
				}

	}

}
