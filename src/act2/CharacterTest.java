package act2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharacterTest {

	@Test
	void test_getName() {
		Character character = new Character("ててん", "男");
		assertEquals(character.getName(), "ててん");
	}
	
	@Test
	void test_getGender() {
		Character character = new Character("ててん", "男");
		assertEquals(character.getGender(), "男");
	}
}
