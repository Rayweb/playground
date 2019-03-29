package snippets;

public class FindOnes2 {

	public static void main(String[] args) {
		String someString = "1010";
		char someChar = '1';
		int count = 0;
		  
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		System.out.println(count);
	}

}
