package rough;
class M{
   public  void  meth1(int a){
	   int mass=a;
	   System.out.println(mass);
   }
public  void  meth1(int a,int b){
	 int mass=a+b;
	   System.out.println(mass);
   }
public  void  meth1(int a,int b,int c){
	 int mass=a+b+c;
	   System.out.println(mass);
}
public  void  meth1(int a,int b,int c,int d){
	 int mass=a+b+c+d;
	   System.out.println(mass);
}
public  void  meth1(int a,int b,int c,int d,int e){
	 int mass=a+b+c+d+e;
	   System.out.println(mass);
}
}

public class ksnkq {
	public static void main(String[]args){
		M a=new M();
		a.meth1(3);
		a.meth1(1,3);
		a.meth1(3,6,5);
		a.meth1(4,6,2,5);
		a.meth1(4,6,7,2,5);

	}

}
