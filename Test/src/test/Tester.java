package test;

import static org.junit.jupiter.api.Assertions.*;
import main.Sq;

import org.junit.jupiter.api.Test;

class Tester {

	Sq test = new Sq();
	@Test
	void test() {
		assertEquals(test.sq(3), 9, "3 * 3 = 9");
	}

}
