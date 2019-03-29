package codewar.isogram;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

	public static void main(String[] args) {
		System.out.println("false | " + Isogram.isIsogram("Dermatoglyphicsd"));
		System.out.println("true |" + Isogram.isIsogram("isogram"));
		System.out.println("false |" + Isogram.isIsogram("moose"));
		System.out.println("true |" + Isogram.isIsogram("thumbscrewjapingly"));
		System.out.println("true |" + Isogram.isIsogram(""));
	}

	public static boolean isIsogram(String word) {
		boolean result = true;
		Set<Character> chars = new HashSet<Character>();
		String lowerWord = word.toLowerCase();
		for (int i = 0; i < lowerWord.length(); i++) {
			if (chars.contains(lowerWord.charAt(i))) {
				result = false;
			} else {
				chars.add(word.charAt(i));
			}
		}
		return result;
	}
}
