package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.SpeedCalculator;

class SpeedCalculatorTester {
	SpeedCalculator n = new SpeedCalculator();

	@Test
	void test() {
		assertEquals(n.Speed(1.0), 10.0, " ");
	}

}
