public class Triangle {
	private int a, b, c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isEquilateral() {
		return a == b && a == c && b == c;
	}

	public boolean isIsosceles() {
		return a == b || a == c || b == c;
	}

	public boolean isScalene() {
		return a != b && a != c && b != c;
	}
}
