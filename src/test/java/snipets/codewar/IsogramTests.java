package snipets.codewar;

import org.junit.Test;
import snipets.codewar.isogram.Isogram;
import snipets.codewar.isogram.IsogramRay;

import static org.junit.Assert.assertEquals;

public class IsogramTests {

	@Test
	public void IsogramTestRay() {
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
