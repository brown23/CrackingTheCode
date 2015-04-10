/**
 * <pre>
 * Used JavaSE 1.7 
 * Space complexity: O(1) 
 * Time complexity: O(n) newer version removes one loop
 * </pre>
 * 
 * @version 2.0
 * @author Jason Brown
 * 
 */

public class UniqueChar {

	static final int ASCII_TOTAL = 128;

	public static void main(String[] args) {
		String a = "ABCD"; // true
		String b = "abcd"; // true
		String c = "abac"; // false
		String d = "!@#$"; // true
		String e = "!@#!"; // false
		String f = a + b; // true

		UniqueChar u = new UniqueChar();

		System.out.println(u.isUniqueChar(a));
		System.out.println(u.isUniqueChar(b));
		System.out.println(u.isUniqueChar(c));
		System.out.println(u.isUniqueChar(d));
		System.out.println(u.isUniqueChar(e));
		System.out.println(u.isUniqueChar(f));
	}

	public UniqueChar() {

	}

	/**
	 * <pre>
	 * 
	 * @link http://www.asciitable.com/
	 * @link http://babelstone.blogspot.com/2005/11/how-many-unicode-characters-are-there.html
	 * @param one
	 * @return boolean
	 * </pre>
	 */
	public boolean isUniqueChar(String one) {

		if (one.length() > ASCII_TOTAL) {
			return false;
		}

		// only need a buffer to hold the total values of the string
		// not the entirety of the ASCII table
		boolean[] buffer = new boolean[ASCII_TOTAL];

		// only need one loop!
		// get the value of character at a given index
		// check that index of the buffer
		// if the buffer is already set to true then we do not have a unique
		// index
		// else set the buffer to true
		for (int i = 0; i < one.length(); i++) {
			int index = one.charAt(i);
			if (buffer[index] == true) {
				return false;
			}
			buffer[index] = true;
		}

		return true;
	}
}
