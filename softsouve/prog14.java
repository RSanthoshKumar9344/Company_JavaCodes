package softsouve;
public class prog14 {
    public prog14(){
	System.out.printf("1");
	new prog14(10);
	System.out.printf("5");
	}
	public prog14(int temp){
	System.out.printf("2");
	new prog14(10, 20);
	System.out.printf("4");
	}
	public prog14(int data, int temp)
	{
	System.out.printf("3");
	}
	public static void main(String[] args)
	{
		prog14 obj = new prog14();
	}
}


