package Demo_OverLoading;

/**
 * @author Giang
 *
 */
public class DemoOverloading {
	/*
	 * compute two number
	 * @param a int
	 * @param b int
	 */
	public int sum(int a, int b) {
		return a + b;
	}

	/*
	 * compute two number
	 * @param a double
	 * @param b double
	 */
	public double sum(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		DemoOverloading obj = new DemoOverloading();
		System.out.println(obj.sum(20.5, 10.6)); 
		System.out.println(obj.sum(10, 10));
	}

}
