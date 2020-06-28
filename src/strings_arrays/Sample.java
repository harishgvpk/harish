package strings_arrays;

public class Sample {
	private int a=5;
	static int b=7;

	public void sample() {
		System.out.println(a);
	}
	public static void  sample1() {
		System.out.println(b);
	}
	static void method() {
		System.out.println("java");
	}
	static void method(String name) {
		System.out.println(name);
	}
	static int method(int a, int b) {
		return a + b;
	}
	public static int minFunction(int m, int n) {
		int min;
		//m=15;
		// n=8;
		if (m > n)
			min = n;
		else
			min = m;

		return min; 
	}
	protected void finalize( ) {
		System.out.println("Hello");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		++s.a;
		s.sample();
		s1.sample();
		++s2.b;
		s2.sample1();
		s3.sample1();
		method();
		method();
		method();
		method();
		method("hari");
		System.out.println(method(5,9));
		System.out.println(s.minFunction(6, 8));
        s.finalize();
	}

}
