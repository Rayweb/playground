package snippets;

public final class App {

    public static void main(String[] args) {
        System.out.println(solution(125));
    }

    public int solution(int A, int B) {
       int max = 0; 
       for (var i = B; B > A; B--) {
         int times = getTimes(B);
         if(times > max){
             max = times;
         }
       }
       return max;
    }

    public static int getTimes(double value) {
		int times = 0;
		do {
			value = Math.sqrt(value);
			times++;
		} while (value == (int) value);
		return times;
	}
}