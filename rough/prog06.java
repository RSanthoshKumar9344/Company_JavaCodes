package rough;


//interface A{
//	public void meth();
//}
//class B implements A{
//	public void  meth(){
//		System.out.println("santa");
//	}
//}
//public class prog06 {
//    public static void main(String[] args) {
//    	B a=new B();
//    	a.meth();
//    	
//    }
// }   	

	
interface A{
	public void meth();
}
public class prog06 {
    public static void main(String[] args) {
    	A a=()->System.out.println("santa");
    	a.meth();
    }
}   	

	
    


