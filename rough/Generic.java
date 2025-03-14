package rough;
class Dog<t>{
	t a;
	Dog(t b){
		a=b;
	}
	public void meth(){
		System.out.println(a);
	}
}
public class Generic {
	public static void main(String[]args){
		Dog<Integer> b=new Dog<Integer>(6);
		Dog<String> c=new Dog<String>("kishore");
		Dog<Double> d=new Dog<Double>(0.7);
		Dog<Character> e=new Dog<Character>('c');
		Dog<Boolean> f=new Dog<Boolean>(true);
		b.meth();
		c.meth();
		d.meth();
		e.meth();
		f.meth();
	}


}
