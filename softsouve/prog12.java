package softsouve;
	class k{
		public k(int i) {
			System.out.println(1);
		}
		public k() {
			this(10);
			System.out.println(2);
		}
		void k() {
			k(10);
			System.out.println(3);
		}
		void k(int i) {
			System.out.println(4);
			
		}		
	}
	public class prog12{
		public static void main(String[]args) {
			new k().k(); 
		}
}
//ans :1243
