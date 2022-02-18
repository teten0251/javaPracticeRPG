package act3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test_plus() {
		Calculator calc = new Calculator(100, 10);
		assertEquals(calc.plus(100, 10), 110);
	}
	
	@Test
	void test_minus() {
		Calculator calc = new Calculator(100, 10);
		assertEquals(calc.minus(100, 10), 90);
	}
	
	@Test
	void test_multiply() {
		Calculator calc = new Calculator(100, 10);
		assertEquals(calc.multiply(100, 10), 1000);
	}
	
	@Test
	void test_devide() {
		Calculator calc = new Calculator(100, 10);
		assertEquals(calc.devide(100, 10), 10);
	}
	
	@Test
	void test_surplus() {
		Calculator calc = new Calculator(100, 10);
		assertEquals(calc.surplus(100, 10), 0);
	}

}
