package rough;

//class ASd{
//	 void  meth1(int a){
//           int mass1=a;
//		   System.out.println(mass1);
//		    }
//	void  meth1(int a,int b){
//        int mass2=a+b;
//		   System.out.println(mass2);
//		    }
//	void  meth1(int a,int b,int c){
//        int mass3=a+b+c;
//		   System.out.println(mass3);
//		    }
//	void  meth1(int a,int b,int c,int d){
//        int mass4=a+b+c+d;
//		   System.out.println(mass4);
//		    }
//	public  void  meth1(int a,int b,int c,int d,int e){
//        int mass5=a+b+c+d+e;
//		   System.out.println(mass5);
//		    }
//}
//public class Varags {
//	public static void main(String[]args){
//			ASd a=new ASd();
//			a.meth1(3);
//			a.meth1(1,3);
//			a.meth1(3,6,5);
//			a.meth1(4,6,2,5);
//			a.meth1(4,6,7,2,5);
//	}
//}







class Ms{
	public  void  meth1(int...a){
           int[] m=a;//{3,6,5}
           int sum=0;
           for(int i=0;i<a.length;i++){
        	   sum=sum+m[i];
        	  
		    }
           System.out.println(sum);
	}
}
public class Varags {
	public static void main(String[]args){
			Ms a=new Ms();
			a.meth1(3);
			a.meth1(1,3);
			a.meth1(3,6,5);
			a.meth1(4,6,2,5);
			a.meth1(4,6,7,2,5);
			a.meth1(5,6,7,8,9,9,8,6,5,4,4,5,4,5,4,5,4,5,6);
     }
}
