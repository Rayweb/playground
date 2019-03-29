package codewar;

public final class persistence {
    public static void main(String[] args) {
        Long result = 39L;
        while(result > 10){
            result = getNumber(result);
        }
        System.out.println(result);
    }
    public static Long getNumber(long n) {
        String numbers[] = Long.toString(n).split("");
        Long result = Long.parseLong(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
           result = result * Integer.parseInt(numbers[i]);
        }
		return result;
	}
}
