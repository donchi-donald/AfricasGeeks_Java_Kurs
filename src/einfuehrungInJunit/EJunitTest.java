package einfuehrungInJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EJunitTest {

	@Test
	void testadd() {
		assertEquals(4, EJunit.add(3, 1));
	}
	
	@Test
	void testmul() {
		assertEquals(4, EJunit.mul(3, 1));
	}
	
	@Test
	void testmul2() {
		assertEquals(3, EJunit.mul(3, 1));
	}

}
