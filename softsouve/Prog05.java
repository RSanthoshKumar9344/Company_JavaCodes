package softsouve;
public class Prog05 {
   public static void stringReplace (String t){
        t=t.replace('j', 'c');
	}
   public static void StringBuffer (StringBuffer t){
       t=t.append("c");
	}
   public static void main(String[] args) {
    String ts= new String("java");//java
    StringBuffer tb= new StringBuffer ("java");//javac
     stringReplace(ts);
     StringBuffer(tb);
   System.out.println(ts + tb);
   }
}
//Ans: javajavac