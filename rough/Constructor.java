package rough;


class TDog{
	int a;

	TDog(int b){
		a=b;
	}
	public void meth(){
		System.out.println(a);
	}
}	

public  class Constructor {
	public static void main(String[]args){
		TDog b=new TDog(6);
		

		b.meth();
	}
}
