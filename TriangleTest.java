import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	private Triangle triangle;

	@Test
	public void testIsEquilateral() {
		triangle = new Triangle(6, 6, 6);
		assertTrue(triangle.isEquilateral());

	}

	@Test
	public void testIsIsosceles() {
		triangle = new Triangle(6, 6, 8);
		assertTrue(triangle.isIsosceles());
	}

	@Test
	public void testIsScalene() {
		triangle = new Triangle(6, 9, 8);
		assertTrue(triangle.isScalene());
	}
}
