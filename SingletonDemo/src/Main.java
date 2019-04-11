
public class Main {

	public static void main(String[] args) {
		SingleTonClassEarly s1 = SingleTonClassEarly.getInstance();
		SingleTonClassEarly s2 = SingleTonClassEarly.getInstance();
		
		SingleTonClassLate s3 = SingleTonClassLate.getInstance();
		SingleTonClassLate s4 = SingleTonClassLate.getInstance();

		s1.print();
		s2.print();
		s3.print();
		s4.print();
		
		System.out.println("s1: " + s1);
		System.out.println("s1: " + s2);
		System.out.println("s1: " + s3);
		System.out.println("s1: " + s4);
	}

}



// Used to create singleton but create object since beginning
class SingleTonClassEarly {
	private static SingleTonClassEarly s = new SingleTonClassEarly();
 	private SingleTonClassEarly() {
		System.out.println("Hi from constructor early!");
	}
	public void print() {
		System.out.println("Hello world");
	}
	public static SingleTonClassEarly getInstance() {
		return s;
	}
	
}



// Check condition create object only when called
class SingleTonClassLate {
	private static SingleTonClassLate s = null;
	private SingleTonClassLate() 
	{
		System.out.println("Hi from constructor late!");
	}
	public void print() {
		System.out.println("Hello world");
	}
	public static SingleTonClassLate getInstance() {
		if(s == null)
			s = new SingleTonClassLate();
		return s;
	}
	
}
