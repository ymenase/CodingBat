package string1;

public class String1 {
	// helloName
	// Given a string name, e.g. "Bob", return a greeting of the form "Hello
	// Bob!".
	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	// makeAbba
	// Given two strings, a and b, return the result of putting them together in
	// the order abba,
	// e.g. "Hi" and "Bye" returns "HiByeByeHi".
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	// makeTags
	// The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
	// italic text.
	// In this example, the "i" tag makes <i> and </i> which surround the word
	// "Yay".
	// Given tag and word strings, create the HTML string with tags around the
	// word, e.g. "<i>Yay</i>".
	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	// makeOutWord
	// Given an "out" string length 4, such as "<<>>", and a word, return a new
	// string
	// where the word is in the middle of the out string, e.g. "<<word>>".
	// Note: use str.substring(i, j) to extract the String starting at index i
	// and going up to but not including index j.
	public String makeOutWord(String out, String word) {
		String outSubstr = out.substring(0, 2);
		String outSubstr2 = out.substring(2);
		String result = outSubstr + word + outSubstr2;
		return result;
	}

	// Given a string, return a new string made of 3 copies of the last 2 chars
	// of the original string.
	// The string length will be at least 2.
	public String extraEnd(String str) {
		String ns = str.substring(Math.max(0, str.length() - 2));
		return ns + ns + ns;

	}

	// Given a string, return the string made of its first two chars, so the
	// String "Hello" yields "He".
	// If the string is shorter than length 2, return whatever there is, so "X"
	// yields "X",
	// and the empty string "" yields the empty string "".Note that str.length()
	// returns the length of a string.
	public String firstTwo(String str) {
		if (str.length() >= 2) {
			String first = str.substring(0, 2);
			return first;
		}
		return str;
	}

	// Given a string of even length, return the first half. So the string
	// "WooHoo" yields "Woo".
	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	// Given a string, return a version without the first and last char, so
	// "Hello" yields "ell".
	// The string length will be at least 2.
	public String withoutEnd(String str) {
		String without = str.substring(1, (str.length() - 1));
		return without;
	}

	// Given 2 strings, a and b, return a string of the form short+long+short,
	// with the shorter string on the outside
	// and the longer string on the inside. The strings will not be the same
	// length, but they may be empty (length 0).
	public String comboString(String a, String b) {
		if (a.length() > b.length()) {
			return b + a + b;
		}
		return a + b + a;
	}

	// Given 2 strings, return their concatenation, except omit the first char
	// of each.
	// The strings will be at least length 1.
	public String nonStart(String a, String b) {
		String nonStart = a.substring(1) + b.substring(1);
		return nonStart;
	}

	// Given a string, return a "rotated left 2" version where the first 2 chars
	// are moved to the end.
	// The string length will be at least 2.
	public String left2(String str) {
		String left2 = str.substring(2) + str.substring(0, 2);

		return left2;

	}

	// Given a string, return a "rotated right 2" version where the last 2 chars
	// are moved to the start.
	// The string length will be at least 2.
	public String right2(String str) {
		String right2 = str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
		return right2;
	}

	// Given a string, return a string length 1 from its front, unless front is
	// false,
	// in which case return a string length 1 from its back. The string will be
	// non-empty.
	public String theEnd(String str, boolean front) {
		if (front == true) {
			return str.substring(0, 1);
		} else {
			return str.substring(str.length() - 1);
		}
	}

	// withouEnd2
	// Given a string, return a version without both the first and last char of
	// the string.
	// The string may be any length, including 0.
	public String withouEnd2(String str) {
		if (str.length() > 1) {
			return str.substring(1, str.length() - 1);
		}

		else {
			return "";
		}
	}

	// middleTwo
	// Given a string of even length, return a string made of the middle two
	// chars,
	// so the string "string" yields "ri". The string length will be at least 2.
	public String middleTwo(String str) {
		if (str.length() == 2) {
			return str;
		}
		int half = str.length() / 2 - 1;
		return str.substring(half, half + 2);
	}

	// endsLy
	// Given a string, return true if it ends in "ly".
	public boolean endsLy(String str) {
		if (str.endsWith("ly") == true) {
			return true;
		}
		return false;
	}

	// nTwice
	// Given a string and an int n, return a string made of the first and last n
	// chars from the string.
	// The string length will be at least n.
	public String nTwice(String str, int n) {
		return (str.substring(0, n) + str.substring(str.length() - n));
	}

	// twoChar
	// Given a string and an index, return a string length 2 starting at the
	// given index.
	// If the index is too big or too small to define a string length 2, use the
	// first 2 chars.
	// The string length will be at least 2.
	public String twoChar(String str, int index) {
		if (index <= str.length() - 2 && index >= 0)
			return str.substring(index, index + 2);
		return str.substring(0, 2);
	}

	// middleThree
	// Given a string of odd length, return the string length 3 from its middle,
	// so "Candy" yields "and". The string length will be at least 3.
	//
	// middleThree("Candy") → "and"
	// middleThree("and") → "and"
	// middleThree("solving") → "lvi"

	public String middleThree(String str) {
		int len = str.length() / 2;
		return str.substring(len - 1, len + 2);
	}

	// hasBad
	// Given a string, return true if "bad" appears starting at index 0 or 1 in
	// the string, such as with "badxxx" or
	// "xbadxx" but not "xxbadxx". The string may be any length, including 0.
	// Note: use .equals() to compare 2 strings.
	public boolean hasBad(String str) {
		int len = str.length();
		if ((len == 3) & str.equals("bad")) {
			return true;
		} else if (len >= 4) {
			if (str.substring(0, 3).equals("bad")) {
				return true;
			}
			return str.substring(1, 4).equals("bad");
		}
		return false;

	}

	// atFirst
	// Given a string, return a string length 2 made of its first 2 chars.
	// If the string length is less than 2, use '@' for the missing chars.
	public String atFirst(String str) {
		int len = str.length();
		if (len >= 2) {
			return str.substring(0, 2);
		} else if (len == 1) {
			return (str.charAt(0) + "@");
		} else {
			return "@@";
		}
	}

	// lastChars
	// Given 2 strings, a and b, return a new string made of the first char of a
	// and
	// the last char of b, so "yo" and "java" yields "ya". If either string is
	// length 0
	// use '@' for its missing char.
	public String lastChars(String a, String b) {
		if (a.length() == 0) {
			a = "@";
		}
		if (b.length() == 0) {
			b = "@";
		}
		return a.substring(0, 1) + b.substring(b.length() - 1, b.length());

	}

	// conCat
	// Given two strings, append them together (known as "concatenation") and
	// return the result.
	// However, if the concatenation creates a double-char, then omit one of the
	// chars, so "abc" and "cat" yields "abcat".
	public String conCat(String a, String b) {
		String result = "";

		if (a.length() == 0) {
			return b;
		}
		if (b.length() == 0) {
			return a;
		}
		if (a.charAt(a.length() - 1) == (b.charAt(0))) {
			result = a + b.substring(1);
			return result;
		}
		return a + b;
	}

	// lastTwo
	// Given a string of any length, return a new string where the last 2 chars
	// if present, are swapped, so "coding" yields "codign".
	public String lastTwo(String str) {
		if (str.length() < 2) {
			return str;
		} else {
			return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
		}
	}

	// seeColor
	// Given a string, if the string begins with "red" or "blue" return that
	// color string
	// otherwise return the empty string.
	public String seeColor(String str) {
		if (str.startsWith("red")) {
			return "red";
		}
		if (str.startsWith("blue")) {
			return "blue";
		}
		return "";
	}

	// Given a string, return true if the first 2 chars in the string also
	// appear
	// at the end of the string, such as with "edited".
	public boolean frontAgain(String str) {
		int len = str.length();

		if (len >= 2) {
			return str.substring(0, 2).equals(str.substring(len - 2, len));
		}
		return false;
	}

	// minCat
	// Given two strings, append them together (known as "concatenation") and
	// return the result.
	// However, if the strings are different lengths, omit chars from the longer
	// string so it is the
	// same length as the shorter string. So "Hello" and "Hi" yield "loHi". The
	// strings may be any length.
	public String minCat(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		if (lenA >= lenB)
			return (a.substring(lenA - lenB) + b);
		else
			return (a + b.substring(lenB - lenA));
	}

	// extraFront
	// Given a string, return a new string made of 3 copies of the first 2 chars
	// of the original string.
	// The string may be any length. If there are fewer than 2 chars, use
	// whatever is there.
	public String extraFront(String str) {

		if (str.length() < 2) {
			return str + str + str;
		}

		if (str.length() == 1) {
			return str.substring(0, 1);
		}

		String strNew = str.substring(0, 2);
		String result = strNew + strNew + strNew;
		return result;

	}

	// without2
	// Given a string, if a length 2 substring appears at both its beginning and
	// end,
	// return a string without the substring at the beginning, so "HelloHe"
	// yields "lloHe".
	// The substring may overlap with itself, so "Hi" yields "". Otherwise,
	// return the original string unchanged.
	public String without2(String str) {

		if (str.length() < 2) {
			return str;
		}

		if (str.length() == 2) {
			return "";
		}

		String without2 = str.substring(2);

		if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
			return without2;
		}

		return str;
	}

	// deFront
	// Given a string, return a version without the first 2 chars. Except keep
	// the first char
	// if it is 'a' and keep the second char if it is 'b'. The string may be any
	// length. Harder than it looks.
	public String deFront(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() >= 2) {
			if (str.charAt(0) == 'a' && str.charAt(1) == 'b')
				return str;
			if (str.charAt(0) == 'a')
				return "a" + str.substring(2);
			if (str.charAt(1) == 'b')
				return str.substring(1);
			return str.substring(2);
		}
		if (str.length() == 1 && str.charAt(0) == 'a')
			return str;
		return "";
	}

}
