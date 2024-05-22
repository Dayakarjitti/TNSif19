package Exceptionhandlingconcept;

public class Testmultiplecatchblocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        int a[]=new int a[5];
        a[5]=14/0;
        
	    }
		catch(ArrayIndexOutOfBoundsException e) 
		{
		System.out.println(ArrayIndexOutOfBoundsException occured e); 
		}
		catch(ArithmeticException e)
		{
			System.out.println(ArithmeticException occured );
		}
		catch(Exception e)
	}
}