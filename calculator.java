package OverLoading;

public class calculator {

	public void add(int a, int b) {
		System.out.println("Adding Two integers Numbers " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("Adding Three integers Numbers " + (a + b + c));

	}

	public void mul(double a, double b) {
		System.out.println("Multiply Two double Numbers " + (a *  b));
	}

	public void mul(float a, float b) {
		System.out.println("Multiply Two float Numbers " + (a * b));

	}

	public static void main(String[] args) {

		calculator cal = new calculator();
		cal.add(10, 20);
		cal.add(10, 20, 20);
		cal.mul(10.34, 11.46);
		cal.mul(10.3f, 12.3f);

	}

}
