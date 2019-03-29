package snippets;

public class Bribes {

	public static void main(String[] args) {
		int[] q = { 2, 5, 1, 3, 4 };
		minimumBribes(q);
	}

	static void minimumBribes(int[] q) {
		int totalBribes = 0;
		for (int i = 0; i < q.length; i++) {
			int initialPosition = q[i];
			int currentPosition = i + 1;
			int bribes = 0;
			if (initialPosition > currentPosition) {
				bribes = initialPosition - currentPosition;
			}
			if (bribes > 2) {
				System.out.println("Too chaotic");
			} else {
				totalBribes = totalBribes + bribes;
			}
		}
		System.out.println(totalBribes);
	}
}
