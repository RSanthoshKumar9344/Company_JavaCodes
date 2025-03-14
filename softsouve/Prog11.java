package softsouve;
	class superClass{
		void superClassMethod(Number n) {
			System.out.println("From super Class");
		}
	}
	class subclass extends superClass{
		void superClassMethod(Double d) {
			System.out.println("From sub Class");
		}
	}
	public class Prog11{
		public static void main(String[]args){
			subclass sub=new subclass();
			sub.superClassMethod(123321);
		}
	}

//ans: Frome super Class
