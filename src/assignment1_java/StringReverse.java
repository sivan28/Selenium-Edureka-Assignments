package assignment1_java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scn.nextLine();
		
		String newStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			 newStr+= str.charAt(i);
		}
		System.out.println("Here is the reversed string "+ newStr );
	}
}
