package codewar;

import java.time.Instant;

public class Main {
	static String MAX_VALUE;
	static {
		MAX_VALUE =Integer.toBinaryString(Integer.MIN_VALUE);
	}
	
	public static void main(String[] args) {
		Long start = Instant.now().toEpochMilli();
		FindOnesX.byFor(MAX_VALUE);
		Long end = System.currentTimeMillis();
		System.out.println("Total time: for"+(end-start));
		start = System.currentTimeMillis();
		FindOnesX.byLambda(MAX_VALUE);
		end = System.currentTimeMillis();
		System.out.println("Total time: lambda"+(end-start));
		start = System.currentTimeMillis();
		FindOnesX.byRegex(Integer.MIN_VALUE);
		end = System.currentTimeMillis();
		System.out.println("Total time: regex"+(end-start));
		start = System.currentTimeMillis();
		FindOnesX.byBitShift(-1);
		end = System.currentTimeMillis();
		System.out.println("Total time: bitshift"+(end-start));
		
	}

}
