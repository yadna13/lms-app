class Home {
	private int x;

	public Home(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Home [x=" + x + "]";
	}

}

public class A extends Home {

	public A(int a) {
		super(a);
	}

	public A() {
		this(100);
	}
}
