package crackingCode.string;


/**
*
*khaitq on 8 oct. 2017
*
*     Write a method to replace all spaces in a string with ‘%20’.
*/

public class ReplaceSpace {

	public static void main(String[] args) {

		
	}
	
	public static String replaceSpaceChar(String s) {
		
		
		int length = s.length();
		
		for (int i = 0; i < s.length(); i ++) {
			
			char c = s.charAt(i);
			
			if (c == ' ') {
				length += 2;
			}
		}
		
		for (int i = length -1 ; i > 0; i--) {
			
			
		}
		
		
		return s;
	}

}


