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
	
	//specialEleven
	// We'll say a number is special if it is a multiple of 11 or if it is one
	// more than a
	// multiple of 11. Return true if the given non-negative number is special.
	//
	// specialEleven(22) → true
	// specialEleven(23) → true
	// specialEleven(24) → false
	public boolean specialEleven(int n) {
		if (n % 11 == 0 || n % 11 - 1 == 0) {
			return true;
		}
		return false;
	}
	
	//more20
	//Return true if the given non-negative number is 1 or 2 more than a multiple of 20
	//	more20(20) → false
	//	more20(21) → true
	//	more20(22) → true
	public boolean more20(int n) {
		  if (n % 20 - 1 == 0 || n % 20 - 2 == 0) {
		    return true;
		  }
		  return false;
		}
	
	//old35
	//Return true if the given non-negative number is a multiple of 3 or 5, but not both.
	//old35(3) → true
	//old35(10) → true
	//old35(15) → false
	public boolean old35(int n) {
		  if (n % 3 == 0 || n % 5 == 0) {
		    if (!(n % 3 == 0 && n % 5 == 0)) {
		      return true;
		    }
		  }
		  return false;
		}
	
//	Logic-1 > less20 
//	Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
	//So for example 38 and 39 return true, but 40 returns false.
//
//	less20(18) → true
//	less20(19) → true
//	less20(20) → false
	
	public boolean less20(int n) {
		  if ((n + 1) % 20 == 0) {
		    return true;
		  }
		  if ((n + 2) % 20 == 0) {
		    return true;
		  }
		  return false;
		}
	
	//nearTen 
//	Given a non-negative number "num", return true if num is within 2 of a multiple of 
//	10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. 
//
//	nearTen(12) → true
//	nearTen(17) → false
//	nearTen(19) → true

	//teenSum

	//Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. 
	//So if either value is a teen, just return 19.
	//teenSum(3, 4) → 7
	//teenSum(10, 13) → 19
	//teenSum(13, 2) → 19
	
	public int teenSum(int a, int b) {
		  int sum = a + b;
		  if ((a >= 13 && a <= 19) || (b >=13 && b<=19)){
		    return 19;
		  }
		  return sum;
		}

	//answerCell
	//Your cell phone rings. Return true if you should answer it. 
	//Normally you answer, except in the morning you only answer if it is your mom calling. 
	//In all cases, if you are asleep, you do not answer.
	//	answerCell(false, false, false) → true
	//	answerCell(false, false, true) → false
	//	answerCell(true, false, false) → false
	
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  if ((isMorning == true) && (isMom == true) && !isAsleep){
		    return true;
		  }
		  if (!isAsleep && !isMorning){
		    return true;
		  }
		 else return false;
		}

	//teaParty
	//We are having a party with amounts of tea and candy. Return the int outcome of the party 
	//encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. 
	//However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
	//
	//teaParty(6, 8) → 1
	//teaParty(3, 8) → 0
	//teaParty(20, 6) → 2
	public int teaParty(int tea, int candy) {
		  if (tea < 5 || candy < 5){
		    return 0;
		  }
		  
		  if (tea >= candy * 2 || candy >= tea * 2){
		    return 2;
		  }
		  if (tea >= 5 && candy >=5){
		    return 1;
		  }
		  
		  return 0;
		}
	
	//fizzString
	//Given a string str, if the string starts with "f" return "Fizz". 
	//If the string ends with "b" return "Buzz". If both the "f" and "b" 
	//conditions are true, return "FizzBuzz". In all other cases, return the 
	//string unchanged. 
//	fizzString("fig") → "Fizz"
//	fizzString("dib") → "Buzz"
//	fizzString("fib") → "FizzBuzz"
	public String fizzString(String str) {
		  if (str.startsWith("f") && str.endsWith("b")){
		    return "FizzBuzz";
		  }
		  if (str.startsWith("f")){
		    return "Fizz";
		  }
		  if (str.endsWith("b")){
		    return "Buzz";
		  } 
		  return str;
		}
	
	//twoAsOne
	//Given three ints, a b c, return true if it is possible to add two of the ints to 
	//get the third.
	//	twoAsOne(1, 2, 3) → true
	//	twoAsOne(3, 1, 2) → true
	//	twoAsOne(3, 2, 2) → false
	
	public boolean twoAsOne(int a, int b, int c) {
		  if (a + b == c) {
		    return true;
		  }
		  if (b + c == a){
		    return true;
		  }
		  if (a + c == b){
		    return true;
		  }
		  return false;
		}
	
	//inOrder
	//Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
	//However, with the exception that if "bOk" is true, b does not need to be greater than a.
	//inOrder(1, 2, 4, false) → true
	//inOrder(1, 2, 1, false) → false
	//inOrder(1, 1, 2, true) → true
	
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  if (bOk) {
		    return c > b;
		  }
		  return b > a && c > b;
		  
		}

	


}
