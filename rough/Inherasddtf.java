package rough;

class Afg{
	void d(){
		System.out.println("Dhanush");
	}
}
class B extends Afg{
	void f(){
		System.out.println("Santhosh");

		
	}
}
class c extends B{
	void g(){
		System.out.println("kodi");
	}
	
}
class D extends c{
	void h(){
		System.out.println("Santa");
	}
}
public class Inherasddtf {
	public static void main(String[]args){
		D hk=new D();
		hk.d();
		hk.f();
		hk.g();
		hk.h();
	}

}
