package theLoverChoice;

import java.util.Scanner;

public class countWords {

	
//	public class Solution {
		public static int countWords(String str) {	
			if(str.length() == 0){
				return 0;
			}
			int count = 0;
			for(int i = 0; i < str.length();i++){
				if(str.charAt(i) == ' '){
					count++;
				}
			}
			return count+1;
		}
//	}

	
	public static void main(String[] args) {			
				Scanner sr= new Scanner(System.in);
				String str = sr.nextLine();
				if(str==null)
				{
					str="";
				}
				int count = countWords(str);
				System.out.println(count);					
	}

}
