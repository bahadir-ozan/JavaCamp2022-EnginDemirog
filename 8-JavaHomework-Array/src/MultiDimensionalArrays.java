
public class MultiDimensionalArrays {
	
	public static void main(String[] args) {
		
		String[][]sehirler = new String [2][2]; 
		
		sehirler[0][0]= "Mersin"; 
		sehirler[0][1]= "Adana"; 
		sehirler[1][0]= "Antalya"; 
		sehirler[1][1]= "Erzurm"; 
		
		
		for (int i=0; i<=1; i++) {
			for(int j=0; j<=1;j++) {
					
					System.out.println(sehirler[i][j]);
				
				
				
			}
	  }
	}
}
