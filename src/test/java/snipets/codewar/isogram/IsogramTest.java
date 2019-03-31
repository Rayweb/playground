package snipets.codewar.isogram;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Isogram")
class IsogramTest {

	@Test
    /*TODO implement custom annotation for @test like @TestByAuthor("AuthorName") that gives
    ouput as below ("Author name as author")
    */
    @DisplayName("Ray as author")
	void rayTest() {
		Isogram isogram = new IsogramRay();
		assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
		assertEquals(true, isogram.isIsogram("isogram"));
		assertEquals(false, isogram.isIsogram("moose"));
		assertEquals(false, isogram.isIsogram("isIsogram"));
		assertEquals(false, isogram.isIsogram("aba"));
		assertEquals(false, isogram.isIsogram("moOse"));
		assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
		assertEquals(true, isogram.isIsogram(""));
	}
}
