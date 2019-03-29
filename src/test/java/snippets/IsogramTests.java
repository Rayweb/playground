package snippets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsogramTests {

	@Test
	public void IsogramTestRay() {
		Isogram isogram = new Isogram();
		assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
		assertEquals(true, isogram.isIsogram("isogram"));
		assertEquals(false, isogram.isIsogram("moose"));
		assertEquals(false, isogram.isIsogram("isIsogram"));
		assertEquals(false, isogram.isIsogram("aba"));
		assertEquals(false, isogram.isIsogram("moOse"));
		assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
		assertEquals(true, isogram.isIsogram(""));
	}
	@Test
	public void IsogramTestOmar() {
		Isogram isogram = new Isogram();
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
