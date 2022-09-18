
public class ReCap {

	public static void main(String[] args) {
		
		//Sayılardan en büyüğünü bulma örneği 
		
		int n1 = -20, n2 = 25, n3 = 19;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " en büyük sayı");

        else if (n2 >= n1 && n2 >= n3) //bu blok true dönecektir.
            System.out.println(n2 + " en büyük sayı");

        else
            System.out.println(n3 + " en büyük sayı");

	}

}
