package string3;

public class String3 {

	//countYZ
	//Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
	//countYZ("fez day") → 2
	//countYZ("day fez") → 2
	//countYZ("day fyyyz") → 2

	public int countYZ(String str) {
		  int count = 0;
		  char t = 'p';
		  for (int i = 0; i < str.length(); i++){
		    char currentChar = str.charAt(i);
		    if (currentChar == 'y' || currentChar == 'Y' || currentChar == 'z' || 
		      currentChar == 'Z'){
		        if (i != str.length()-1){
		          if (!Character.isLetter(str.charAt(i + 1))){
		        count++;
		          }
		        }
		        else{
		          count++;
		        }
		    }
		  }
		  return count;
		  
		}

	//withoutString
	//Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
	//withoutString("Hello there", "llo") → "He there"
	//withoutString("Hello there", "e") → "Hllo thr"
	//withoutString("Hello there", "x") → "Hello there"
	public String withoutString(String base, String remove) {
		  if (base.isEmpty()){
		    return "";
		  }
		  
		  String baseLower = base.toLowerCase();
		  String removeLower = remove.toLowerCase();
		  int baseChar = base.length();
		  int removeChar = remove.length();


		   if (baseLower.regionMatches(0, removeLower, 0, removeChar)){
		   return withoutString(base.substring(removeChar), remove);
		   }
		   else{
		     return base.substring(0,1) + withoutString(base.substring(1), remove);
		   }
		  
		 
		}
	
	//equalIsNot
	//	Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
	//	equalIsNot("This is not") → false
	//	equalIsNot("This is notnot") → true
	//	equalIsNot("noisxxnotyynotxisi") → true
	public boolean equalIsNot(String str) {
		  int countIs = 0;
		  int countNot = 0;
		  for (int i = 0; i < str.length()-1; i++){
		    if (str.charAt(i) == 'i' && str.charAt(i+1) == 's'){
		      countIs++;
		    }
		  }
		  
		  for (int i = 0; i < str.length()-2; i++){
		    if (str.charAt(i) == 'n' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 't'){
		      countNot++;
		    }
		  }

		  return countIs == countNot;
		}

	
	//gHappy
	//We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
	//gHappy("xxggxx") → true
	//gHappy("xxgxx") → false
	//gHappy("xxggyygxx") → false
		
	public boolean gHappy(String str) {
		  char prev = 'a';
		  boolean happy = true;
		  if (str.equals("gg") || str.isEmpty()){
		    return true;
		  }
		  
		  
		  for (int i = 0; i < str.length(); i++){
		      if (str.charAt(i) == 'g') {
		        if ((prev == 'g' || (i + 1 != str.length() && str.charAt(i + 1) == 'g'))){
		          happy = true;
		        } else{
		          happy = false;
		          break;
		        }
		      }
		    prev = str.charAt(i);
		  }
		  return happy;
		}

	

}
