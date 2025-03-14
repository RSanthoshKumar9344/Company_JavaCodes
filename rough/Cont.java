package rough;

 class Aw {
	int a;//3
	Aw(int b){
		a=b;
	}
	void meth(){
		System.out.println(a);
	}
	String s="";
	Aw(String b1){
		s=b1;
	}
	void meth1(){
		System.out.println(s);
	}

}
public class Cont {
   public static void main(String[] args){ 
	   Aw a=new Aw(3);
       a.meth();
       Aw b=new Aw("ss");
       b.meth1();
   }
   }