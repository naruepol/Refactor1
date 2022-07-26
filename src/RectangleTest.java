import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testGetArea() {
		Rectangle r1 = new Rectangle(6,5);
		assertEquals(30,r1.getArea());
		Rectangle r2 = new Rectangle(2,4);
		assertEquals(8,r2.getArea());	
	}

	@Test
	void testFindMax() {
		Rectangle r3 = new Rectangle(1,1);
		assertEquals(23,r3.findMax(7,23));
	}

}
