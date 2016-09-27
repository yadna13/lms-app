
 class Wow {
	public static void go(short n) {System.out.println("short");}
	public static void go(Short n) {System.out.println("SHORT");}
	public static void go(Long n) {System.out.println(" LONG");}
	public static void go(long n) {System.out.println("p long LONG");}
	public static void main(String [] args) {
	Short y = 6;
	int z = 7;
	go(y);
	go(z);
 }
}
public class Yikes {

	public static void test(String str) {
		if (str == null | str.length() == 0) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
	}

	public static void go(Long n) {
		System.out.println("Long Long");
	}

	/*
	 * public static void go(long n){ System.out.println("PLong"); }
	 */

	public static void go(Integer n) {
		System.out.println("Interger Short");
	}

	public static void go(Short n) {
		System.out.println("Object Short");
	}

	public static void main(String[] args) {
		short y = 6;
		long z = 7;
		go(y);
		go(z);
		test(null);
	}

}
