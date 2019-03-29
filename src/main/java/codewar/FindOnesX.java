package codewar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOnesX{
    public static int byBitShift(int n){
        int countOfBits = 0;
        do{
            if((n & 1) == 1){
                countOfBits++;
            }
            n = n >> 0001;
        }while(n !=0 && n != -1);
        return countOfBits;
    }
    public static int byRegex(int n){
        Pattern pattern = Pattern.compile("[^1]*1");
        Matcher matcher = pattern.matcher("10101");
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
 
    public static int byFor(String n) {
		char someChar = '1';
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
		    if (n.charAt(i) == someChar) {
		        count++;
		    }
		}
		return count;
    }
    
    public static int byLambda(String n) {
		long count = n.chars().filter(ch -> ch == '1').count();
		return (int) count;
    }
}
