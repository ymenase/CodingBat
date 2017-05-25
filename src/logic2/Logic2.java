package logic2;

public class Logic2 {
	
	//makeBricks
	//We want to make a row of bricks that is goal inches long. We have a number of
	//small bricks (1 inch each) and big bricks (5 inches each). Return true if it is
	//possible to make the goal by choosing from the given bricks. This is a little
	//harder than it looks and can be done without any loops.


	public boolean makeBricks(int small, int big, int goal) {
	  int totalInchesSmall = small; //3 inches
	  int totalInchesBig = big * 5; //5 inches
	  int remainder;

	  if (totalInchesSmall + totalInchesBig == goal){
	    return true;
	  }
	  if (totalInchesSmall + totalInchesBig < goal){
	    return false;
	  }
	  remainder = goal % 5;
	  if (remainder <= small) {
	    return true;
	  }

	  return false;

	}


	//loneSum
	// Given 3 int values, a b c, return their sum. However, if one of the values
	//is the same as another of the values, it does not count towards the sum.
	public int loneSum(int a, int b, int c) {
	 int sum = a + b + c;

	  if (a == b) {
	    sum = c;
	  }
	  if (a == c) {
	    sum = b;
	  }
	  if (b == c) {
	    sum = a;
	  }
	  if (a == b && b == c){
	    sum = 0;
	  }

	  return sum;
	}

	//luckySum
	//Given 3 int values, a b c, return their sum. However, if one of the values is 13
	//for example, if b is 13, then both b and c do not count.

	public int luckySum(int a, int b, int c) {
	  int sum = a + b + c;

	  if(a == 13) {
	    return 0;
	  }

	  if(b == 13) {
	    return a;
	  }

	  if(c == 13) {
	    return a + b;
	  }

	  return sum;

	}

	//noTeenSum
	// Given 3 int values, a b c, return their sum. However, if any of the values is a
	// teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15
	// and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n)
	// {"that takes in an int value and returns that value fixed for the teen rule.
	// In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
	// Define the helper below and at the same indent level as the main noTeenSum().

	public int noTeenSum(int a, int b, int c) {
	  int res=0;
	  res = res + fixTeen(a);
	  res = res + fixTeen(b);
	  res = res + fixTeen(c);

	  return res;
	}

	public int fixTeen(int n) {
	  if (n > 12 && n < 20) {
	    if (n==15 || n == 16) {
	      return n;
	    }
	    return 0;
	  }
	  return n;
	}

	//closeFar
	// Given three ints, a b c, return true if one of b or c is "close" (differing from
	// a by at most 1), while the other is "far", differing from both other values by 2
	// or more. Note: Math.abs(num) computes the absolute value of a number.

	public boolean closeFar(int a, int b, int c) {
	  if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2){
	    return true;
	  }
	  else if (Math.abs(a - c) <= 1 && Math.abs(b - a) >= 2 && Math.abs( b - c) >= 2){
	    return true;
	  }
	  return false;
	}

	//blackjack
	// Given 2 int values greater than 0, return whichever value is nearest to 21
	//without going over. Return 0 if they both go over.
	//
	// blackjack(19, 21) → 21
	// blackjack(21, 19) → 21
	// blackjack(19, 22) → 19

}
