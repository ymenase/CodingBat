package string2;

public class String2 {
	
	public static void main(String[] args){
		String2 s2 = new String2();
		s2.catDog("catdog");
		
	}
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

}
