import java.util.Arrays;

public class Permutation {

	public boolean isPermutation(String one, String two) {

		if (one.length() != two.length()) {
			return false;
		} else if (one.equals(two)) {
			return true;
		}

		char[] cOne = sortStringIntoCharArray(one);
		char[] cTwo = sortStringIntoCharArray(two);

		if (Arrays.equals(cOne, cTwo)) {
			return true;
		}

		return false;
	}

	private char[] sortStringIntoCharArray(String s) {
		char[] retArray = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			retArray[i] = s.charAt(i);
		}

		Arrays.sort(retArray);

		return retArray;
	}

	public static void main(String[] args) {
		String A = "abcdabcd123";
		String B = "123abcdabcd";
		String C = "abcdabcd12";

		Permutation p = new Permutation();

		System.out.println(p.isPermutation(A, B)); // expect true
		System.out.println(p.isPermutation(B, B)); // expect true
		System.out.println(p.isPermutation(C, B)); // expect false
		System.out.println(p.isPermutation(B, A)); // expect true
		System.out.println(p.isPermutation(A, C)); // expect false

	}
}
