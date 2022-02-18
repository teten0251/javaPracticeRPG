package act2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InnTest {

	@Test
	void test_getName() {
		Inn inn = new Inn("ヒュッテ", "10000");
		assertEquals(inn.getName(), "ヒュッテ");
	}

}
