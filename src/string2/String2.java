package string2;

public class String2 {
	
	//doubleChar
	//Given a string, return a string where for every char in the original, there are two chars.
	//doubleChar("The") → "TThhee"
	//doubleChar("AAbb") → "AAAAbbbb"
	//doubleChar("Hi-There") → "HHii--TThheerree"
	public String doubleChar(String str) {
		  String result = "";
		  
		  for (int i = 0; i < str.length(); i++){
		    result += Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
		  }
		  return result;
		}

	//countHi
	//Return the number of times that the string "hi" appears anywhere in the given string.
	//countHi("abc hi ho") → 1
	//countHi("ABChi hi") → 2
	//countHi("hihi") → 2
	public int countHi(String str) {
		  int counter = 0;
		  for (int i = 0; i < str.length() - 1; i++){
		    if (str.charAt(i) == 'h') {
		      if (str.charAt(i + 1) == 'i'){
		        counter++;
		      }
		    }
		  }
		  return counter;
		}

	
	//catDog
	//	Return true if the string "cat" and "dog" appear the same number of times in the given string.
	//	catDog("catdog") → true
	//	catDog("catcat") → false
	//	catDog("1cat1cadodog") → true
	public boolean catDog(String str) {
		int catCount = 0;
		int dogCount = 0;
		
		if (str.equals("cat") || str.equals("dog")){
			return false;
		}
		
		for (int i = 0; i < str.length() - 2 ; i++){
			if (str.substring(i, i + 3).equals("cat")){
				catCount++;
			}
			if (str.substring(i, i + 3).equals("dog")){
				dogCount++;
			}
			System.out.print(str.substring(i, i + 3));
		}
		return dogCount == catCount;
	}
	
	//countCode
	public int countCode(String str) {
		  int counter = 0;
		  
		  for (int i = 0; i < str.length() - 3; i++){
		    if (str.substring(i, i + 2).equals("co") && (str.charAt(i+3) == 'e')){
		      counter++;
		    }
		  }
		  return counter;
		}

	//endOther
	public boolean endOther(String a, String b) {
		  if (a.length() >= b.length()){
		    if (a.toLowerCase().substring((a.length()) - (b.length())).equals(b.toLowerCase())){
		      return true;
		    }
		  }
		  else{
		     if (b.toLowerCase().substring((b.length()) - (a.length())).equals(a.toLowerCase())){
		      return true;
		    }
		  }
		  return false;
		}
	
	//xyzThere
	public boolean xyzThere(String str) {
		  
		  if (str.startsWith("xyz")){
		    return true;
		  }
		  
		  for (int i = 0; i < str.length() - 3; i++){
		    if (str.charAt(i) != '.'){
		      if (str.substring(i + 1, i + 4).equals("xyz")){
		        return true;
		      }
		    }
		  }
		  return false;
		}

	//bobThere
	//	Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
	//	bobThere("abcbob") → true
	//	bobThere("b9b") → true
	//	bobThere("bac") → false
	public boolean bobThere(String str) {
		  for (int i = 0; i < str.length() - 2; i++){
		    if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
		      return true;
		    }
		  }
		  return false;
		}

	//xyBalance
	//We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
	//xyBalance("aaxbby") → true
	//xyBalance("aaxbb") → false
	//xyBalance("yaaxbb") → false

	public boolean xyBalance(String str) {
		  int countX = 0;
		  int countY = 0;
		  boolean flag = true;
		  
		  for (int i = 0; i < str.length(); i++){
		    if (str.charAt(i) == 'x'){
		      flag = false;
		    }
		    if (str.charAt(i) == 'y'){
		      flag = true;
		    }
		  }
		  return flag;
		  
		}

	
	

}
