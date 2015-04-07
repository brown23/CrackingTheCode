/**
 * <pre>
 * Used JavaSE 1.7 
 * Space complexity: O(1) 
 * Time complexity: O(n^2) due to the nested loop
 * </pre>
 * 
 * @version 1.0
 * @author Jason Brown
 * 
 */

public class UniqueChar {
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
	 * TODO look at how to lower the time complexity of this method
	 * HINT:  What is the total set of ASCII or UNICODE characters
	 * ACII:  There are 128 unique characters UNICODE: Depends on the version
	 * 
	 * 
	 * @link http://www.asciitable.com/
	 * @link http://babelstone.blogspot.com/2005/11/how-many-unicode-characters-are-there.html
	 * @param one
	 * @return boolean
	 * </pre>
	 */
	public boolean isUniqueChar(String one) {

		for (int i = 0; i < one.length(); i++) {
			for (int j = (i + 1); j < one.length(); j++) {
				if (one.charAt(i) == one.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}
}
