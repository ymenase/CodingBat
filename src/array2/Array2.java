package array2;

public class Array2 {
		
	//countEvens
	//Return the number of even ints in the given array. 
	public int countEvens(int[] nums) {
		  int counter = 0;
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] % 2 == 0 || nums[i] == 0 ){
		      counter++;
		    }
		  }
		    return counter;
		}
	
	//bigDiff
	//Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) 
	//and Math.max(v1, v2) methods return the smaller or larger of two values.
	public int bigDiff(int[] nums) {
		  int min = Integer.MAX_VALUE;
		  int max = Integer.MIN_VALUE;
		  for (int i = 0; i < nums.length; i++){
		    min = Math.min(nums[i], min);
		    max = Math.max(nums[i], max);
		  }
		  return max - min;
		}

	//centeredAverage
	//	Return the "centered" average of an array of ints, which we'll say is the mean average of the 
	//	values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. 
	//	You may assume that the array is length 3 or more.
	public int centeredAverage(int[] nums) {
		  int min = Integer.MAX_VALUE;
		  int max = Integer.MIN_VALUE;
		  int sum = 0;
		  
		  for (int i = 0; i < nums.length; i++){
		    sum += nums[i];
		    min = Math.min(nums[i], min);
		    max = Math.max(nums[i], max);
		  }
		  sum = sum - min - max;
		  int average = sum/(nums.length - 2);
		  return average;
		}

	
	//sum13
	//Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come 
	//immediately after a 13 also do not count.
	public int sum13(int[] nums) {
		  int sum = 0;
		  if (nums.length == 0) {
		    return 0;
		  }
		  
		  for (int i = 0; i < nums.length; i++){
		    if (nums[i] == 13) {
		      i++;
		    }
		    else {
		      sum += nums[i];
		    }
		  }
		  return sum;
		  
		}

	//sum67
	//Return the sum of the numbers in the array, except ignore sections of numbers starting with 
	//a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
	public int sum67(int[] nums) {
		  int sum = 0;
		  boolean flag = false;
		  
		  if (nums.length == 0){
		    return 0;
		  }
		  
		  for (int i = 0; i < nums.length; i++){
		    if (flag == true) {
		      if (nums[i] == 7) {
		        flag = false;
		      }
		    }
		    
		   else{
		     if (nums[i] == 6) {
		        flag = true;
		      }
		      else{
		        sum += nums[i];
		      }
		   }
		    
		  }
		  return sum;
		}

	//has22
	//Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
	public boolean has22(int[] nums) {
		  for (int i = 0; i < nums.length - 1; i++){
		    if ((nums[i] == 2) && (nums[i+1] == 2)) {
		      return true;
		    }
		  }
		    return false;
		}

	//lucky13
	//Given an array of ints, return true if the array contains no 1's and no 3's.
	public boolean lucky13(int[] nums) {
		  for (int i = 0; i < nums.length; i++) {
		    if ((nums[i] == 1) || (nums[i] == 3)){
		      return false;
		    }
		  }
		  return true;
		}

	//sum28
	//Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
	public boolean sum28(int[] nums) {
		  int sum = 0;
		  for (int i = 0; i < nums.length; i++){
		    if (nums[i] == 2) {
		      sum += nums[i];
		    }
		  }
		    if (sum == 8) {
		      return true;
		    }
		  return false;
		}

	//more14
	//Given an array of ints, return true if the number of 1's is greater than the number of 4's
	public boolean more14(int[] nums) {
		  int count1 = 0;
		  int count4 = 0;
		  
		  for (int i = 0; i < nums.length; i++){
		    if (nums[i] == 1) {
		      count1++;
		    }
		    if (nums[i] == 4){
		      count4++;
		    }
		  }
		  return count1 > count4;
		}

	//fizzArray
	//Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
	//The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement 
	//for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. 
	//The syntax to make a new int array is: new int[desired_length]
	public int[] fizzArray(int n) {
		  int[] newArray = new int[n];
		  
		  for (int i = 0; i < n; i++){
		    newArray[i] = i;
		  }
		  return newArray;
		}
	
	//only14
	//Given an array of ints, return true if every element is a 1 or a 4.
	public boolean only14(int[] nums) {
		  for (int i = 0; i < nums.length; i++){
		    if (!((nums[i] == 4) || (nums[i] == 1))){
		      return false;
		    }
		  }
		      return true;
		}

	//fizzArray2
	//Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. 
	//through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. 
	//The syntax to make a new string array is: new String[desired_length] 
	public String[] fizzArray2(int n) {
		  String[] newArray = new String[n];
		  
		  for (int i = 0; i < n; i++){
		    newArray[i] = String.valueOf(i);
		  }
		  
		  return newArray;
		  
		}

	//no14
	//Given an array of ints, return true if it contains no 1's or it contains no 4's.
	public boolean no14(int[] nums) {
		  boolean flag1 = true;
		  boolean flag4 = true;
		  
		  for (int i = 0; i < nums.length; i++){
		    if (nums[i] == 1) {
		      flag1 = false;
		    }
		    if (nums[i] == 4) {
		      flag4 = false;
		    }
		  }
		  return flag1 || flag4;
		  
		}
	
	//isEverywhere
	//We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. 
	//Return true if the given value is everywhere in the array.
	
	public boolean isEverywhere(int[] nums, int val) {
		  for (int i = 1; i < nums.length; i++){
		    if (!((nums[i] == val) || (nums[i-1] == val))){
		      return false;
		    }
		  }
		  return true;
		}

	//either24
	//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
	public boolean either24(int[] nums) {
		  boolean flag2 = false;
		  boolean flag4 = false;
		  
		  for (int i = 0; i < nums.length - 1; i++) {
		    if ((nums[i] == 2) && (nums[i+1] == 2)) {
		      flag2 = true;
		    }
		    if ((nums[i] == 4) && (nums[i+1] == 4)) {
		      flag4 = true;
		    }
		  }
		  return flag2 ^ flag4;
		}
	
	//matchUp
	//	Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in
	//	nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
	public int matchUp(int[] nums1, int[] nums2) {
		  int counter = 0;
		  
		  for (int i = 0; i < nums1.length; i++){
		    if (Math.abs(nums1[i] - nums2[i]) <= 2 && (nums1[i] != nums2[i])){
		      counter++;
		    }
		  }
		  return counter;
		}
	
	//has77

//	Given an array of ints, return true if the array contains two 7's next to each other, 
//	or there are two 7's separated by one element, such as with {7, 1, 7}.

	
	public boolean has77(int[] nums) {
		  for (int i = 0; i < nums.length-1; i++) {
		    if ((nums[i] == 7) && (nums[i+1] == 7)){
		      return true;
		    }
		  }
		  for (int i = 0; i < nums.length-2; i++) {
		    if ((nums[i] == 7) && (nums[i+2] == 7)){
		      return true;    
		    }
		  }
		  return false;
		}



}
