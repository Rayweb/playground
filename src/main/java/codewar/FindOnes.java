package codewar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOnes {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[^1]*1");
		Matcher matcher = pattern.matcher("10101");
		int count = 0;
		while (matcher.find()) {
			count++;
		}
        System.out.println(count);
	}

}
