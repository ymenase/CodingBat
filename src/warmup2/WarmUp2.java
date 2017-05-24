package warmup2;

public class WarmUp2 {
	// stringTimes

	// Given a string and a non-negative int n, return a larger string that is n
	// copies of the original string.
	//
	// stringTimes("Hi", 2) → "HiHi"
	// stringTimes("Hi", 3) → "HiHiHi"
	// stringTimes("Hi", 1) → "Hi"
	public String stringTimes(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}

	// frontTimes
	//
	// Given a string and a non-negative int n, we'll say that the front of the
	// string is the first 3 chars, or whatever is there if the string is less
	// than length 3. Return n copies of the front;
	//
	// frontTimes("Chocolate", 2) → "ChoCho"
	// frontTimes("Chocolate", 3) → "ChoChoCho"
	// frontTimes("Abc", 3) → "AbcAbcAbc"

	public String frontTimes(String str, int n) {
		int frontLen = 3;
		if (frontLen > str.length()) {
			frontLen = str.length();
		}

		String front = str.substring(0, frontLen);

		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + front;
		}
		return result;

	}

	// countXX
	// Count the number of "xx" in the given string. We'll say that overlapping
	// is allowed, so "xxx" contains 2 "xx".
	//
	// countXX("abcxx") → 1
	// countXX("xxx") → 2
	// countXX("xxxx") → 3

	int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx"))
				count++;
		}
		return count;

	}

	// doubleX
	// Given a string, return true if the first instance of "x" in the string is
	// immediately followed by another "x".
	//
	// doubleX("axxbb") → true
	// doubleX("axaxax") → false
	// doubleX("xxxxx") → true
	boolean doubleX(String str) {

		int i = str.indexOf("x");
		if (i == -1)
			return false;
		String x = str.substring(i);
		return x.startsWith("xx");

	}

	// stringbits
	// Given a string, return a new string made of every other char starting
	// with the first, so "Hello" yields "Hlo".
	//
	// stringBits("Hello") → "Hlo"
	// stringBits("Hi") → "H"
	// stringBits("Heeololeo") → "Hello"
	public String stringBits(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i = i + 2) {
			result += str.charAt(i);
		}

		return result;
	}

	// stringSplosion
	// Given a non-empty string like "Code" return a string like "CCoCodCode".
	//
	// stringSplosion("Code") → "CCoCodCode"
	// stringSplosion("abc") → "aababc"
	// stringSplosion("ab") → "aab"
	public String stringSplosion(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += str.substring(0, i + 1);
		}

		return result;
	}

	// last2

	// Given a string, return the count of the number of times that a substring
	// length 2 appears in the string and also as the last 2 chars of the
	// string,
	// so "hixxxhi" yields 1 (we won't count the end substring).
	//
	// last2("hixxhi") → 1
	// last2("xaxxaxaxx") → 1
	// last2("axxxaaxx") → 2

	public int last2(String str) {
		if (str.length() < 2) {
			return 0;
		}
		int count = 0;

		String sub = str.substring(str.length() - 2);

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals(sub)) {
				count++;
			}
		}

		return count;
	}

	// arrayCount9
	//
	// Given an array of ints, return the number of 9's in the array.
	//
	// arrayCount9([1, 2, 9]) → 1
	// arrayCount9([1, 9, 9]) → 2
	// arrayCount9([1, 9, 9, 3, 9]) → 3
	public int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		return count;
	}

	// array123
	//
	// Given an array of ints, return true if the sequence of numbers 1, 2, 3
	// appears in the array somewhere.
	//
	// array123([1, 1, 2, 3, 1]) → true
	// array123([1, 1, 2, 4, 1]) → false
	// array123([1, 1, 2, 1, 2, 3]) → true

	public boolean array123(int[] nums) {
		if (nums.length >= 3) {
			for (int i = 0; i < nums.length - 2; i++) {
				if ((nums[i] == 1 && nums[i + 1] == 2) && (nums[i + 2] == 3)) {
					return true;
				}
			}

		}
		return false;
	}

	// stringMatch

	// Given 2 strings, a and b, return the number of the positions where they
	// contain
	// the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since
	// the "xx",
	// "aa", and "az" substrings appear in the same place in both strings.
	//
	// stringMatch("xxcaazz", "xxbaaz") → 3
	// stringMatch("abc", "abc") → 2
	// stringMatch("abc", "axc") → 0

	public int stringMatch(String a, String b) {
		int len = (Math.min(a.length(), b.length()));
		int count = 0;

		for (int i = 0; i < len - 1; i++) {
			if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
				count++;
			}
		}
		return count;

	}

	// stringX

	// Given a string, return a version where all the "x" have been removed.
	// Except an "x" at the very start or end should not be removed.
	//
	// stringX("xxHxix") → "xHix"
	// stringX("abxxxcd") → "abcd"
	// stringX("xabxxxcdx") → "xabcdx"

	public String stringX(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
				result += str.substring(i, i + 1);
			}
		}
		return result;
	}

	// altPairs

	// Given a string, return a string made of the chars at indexes 0,1, 4,5,
	// 8,9 ... so "kittens" yields "kien".
	//
	// altPairs("kitten") → "kien"
	// altPairs("Chocolate") → "Chole"
	// altPairs("CodingHorror") → "Congrr"
	public String altPairs(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i += 4) {
			int end = i + 2;

			if (end > str.length()) {
				end = str.length();
			}
			result += str.substring(i, end);
		}
		return result;
	}

	// stringYak
	// Suppose the string "yak" is unlucky. Given a string, return a version
	// where all
	// the "yak" are removed, but the "a" can be any char. The "yak" strings
	// will not overlap.

	// stringYak("yakpak") → "pak"
	// stringYak("pakyak") → "pak"
	// stringYak("yak123ya") → "123ya"

	public String stringYak(String str) {
		// String result = "";
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length() - 2; i++) {
			if (sb.charAt(i) == 'y' && sb.charAt(i + 2) == 'k') {
				sb.replace(i, i + 3, "");
			}
		}
		return sb.toString();
	}

}
