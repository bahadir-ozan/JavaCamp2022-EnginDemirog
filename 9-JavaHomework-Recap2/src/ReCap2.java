
public class ReCap2 {

	public static void main(String[] args) {
		
		double[] myList = {1,2,3,3,4};
		double sum=0;
		double maxValue = myList[0];
		 
		
		for (double number:  myList) {
			 if(maxValue<number) {
				 
				 maxValue=number; // number'dan gelen herbir değeri herbir döngüde o andaki değerine  yapıyor.
			 }
			
			 sum= sum + number ;
			 System.out.println("Value:  "+ number );
					 
		 }
		
		 	System.out.println("Result: "+ sum); 
		 	
		 	System.out.println("Max Value= "+ maxValue);
	}

}
