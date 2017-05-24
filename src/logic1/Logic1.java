package logic1;

public class Logic1 {
	// cigarParty

	// When squirrels get together for a party, they like to have cigars. A
	// squirrel party is successful when the number of cigars is between 40 and
	// 60, inclusive.
	// Unless it is the weekend, in which case there is no upper bound on the
	// number of cigars. Return true if the party with the given values is
	// successful, or false otherwise.
	//
	// cigarParty(30, false) → false
	// cigarParty(50, false) → true
	// cigarParty(70, true) → true

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (cigars >= 40 && cigars <= 60) {
			return true;
		} else if (isWeekend == true && cigars >= 40) {
			return true;
		}
		return false;

	}

	// dateFashion

	// You and your date are trying to get a table at a restaurant. The
	// parameter "you" is the stylishness of your clothes, in the range 0..10,
	// and "date" is the
	// stylishness of your date's clothes. The result getting the table is
	// encoded as an
	// int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8
	// or more,
	// then the result is 2 (yes). With the exception that if either of you has
	// style of
	// 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
	//
	// dateFashion(5, 10) → 2
	// dateFashion(5, 2) → 0
	// dateFashion(5, 5) → 1

	public int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			return 0;
		} else if (you >= 8 || date >= 8) {
			return 2;
		} else {
			return 1;
		}

	}

	// squirrelPlay

	// The squirrels in Palo Alto spend most of the day playing. In particular,
	// they play if the temperature is between 60 and 90 (inclusive). Unless it
	// is
	// summer, then the upper limit is 100 instead of 90. Given an int
	// temperature and a
	// boolean isSummer, return true if the squirrels play and false otherwise.
	//
	// squirrelPlay(70, false) → true
	// squirrelPlay(95, false) → false
	// squirrelPlay(95, true) → true

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if ((temp >= 60 && temp <= 100) && isSummer == true) {
			return true;
		} else if (temp >= 60 && temp <= 90) {
			return true;
		} else {
			return false;
		}
	}

	// sortaSum

	// Given 2 ints, a and b, return their sum. However, sums in the range
	// 10..19 inclusive, are forbidden, so in that case just return 20.
	//
	// sortaSum(3, 4) → 7
	// sortaSum(9, 4) → 20
	// sortaSum(10, 11) → 21
	//

	public int sortaSum(int a, int b) {
		int sum = 0;
		if ((a + b < 10) || (a + b > 19)) {
			sum = a + b;
			return sum;
		}

		return 20;
	}

	// alarmClock

	// Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a
	// boolean indicating if we are on vacation, return a string of the form
	// "7:00"
	// indicating when the alarm clock should ring. Weekdays, the alarm should
	// be "7:00"
	// and on the weekend it should be "10:00". Unless we are on vacation --
	// then on
	// weekdays it should be "10:00" and weekends it should be "off".
	//
	// alarmClock(1, false) → "7:00"
	// alarmClock(5, false) → "7:00"
	// alarmClock(0, false) → "10:00"

	public String alarmClock(int day, boolean vacation) {
		if (vacation == true) {
			if (day > 0 && day < 6) {
				return "10:00";
			} else {
				return "off";
			}
		} else {
			if (day > 0 && day < 6) {
				return "7:00";
			} else {
				return "10:00";
			}
		}

	}

	// love6
	//
	// The number 6 is a truly great number. Given two int values, a and b,
	// return true if either one is 6. Or if their sum or difference is 6. Note:
	// the function Math.abs(num) computes the absolute value of a number.
	//
	// love6(6, 4) → true
	// love6(4, 5) → false
	// love6(1, 5) → true

	public boolean love6(int a, int b) {
		if (a == 6 || b == 6) {
			return true;
		}
		if (a + b == 6) {
			return true;
		}
		if (Math.abs(a - b) == 6) {
			return true;
		} else {
			return false;
		}
	}

}
