package softsouve;
	import java.io.EOFException;
	import java.io.IOException;
	public class Prog9{
	public static void main(String[] args)
	{
	try{
	System.out.printf("1");
	int value = 10/0;
	throw new IOException();
	}
	catch(EOFException e)
	{
	System.out.printf("2");
	}
	catch(ArithmeticException e) {
	System.out.printf("3");
    }
	catch(NullPointerException e)
	{
	System.out.printf("4");
	}
	 catch(IOException e){
	System.out.print("5");
	 }
	catch(Exception e){
	System.out.printf("6");
	 }	
	}
}
	//ans: 13