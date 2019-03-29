package codewar;

public final class Binary {

    public static void main(String[] args) {
        int bits = countBits(1234);
        System.out.println(bits);
    }
    public static int countBits(int n){
        String binaryRepresentation = Integer.toString(n,2);
        System.out.println(binaryRepresentation);
        long count = binaryRepresentation.chars().filter(ch -> ch == '1').count();
        return (int)count;
	}
}
