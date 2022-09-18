
public class AlternativeReCap {

	public static void main(String[] args) {
		
		/* İç  içe dögü ile hazırlanışı(alternatif)*/
	
		int number1 = -20, number2 = -17, number3 = -18;

        if(number2 >= number1) {
            if(number2 >= number3) //n2 değeri n3'e eşit veya büyük ondan büyükse buraya gelir, aksi takdirde 16. satıra direkt olarak gidecektir.
                System.out.println(number2 + " en büyük sayıdır."); //Burası true olduğu için dönecektir.
            else
                System.out.println(number3 + " en büyük sayıdır.");
        } 
        else {
            if(number3 >= number1)
                System.out.println(number3 + " en büyük sayıdır.");
            else
                System.out.println(number1 + " en büyük sayıdır.");

        }

	}
}
