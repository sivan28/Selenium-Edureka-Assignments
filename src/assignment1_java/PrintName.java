package assignment1_java;
import java.util.Scanner;

public class PrintName {

	public static void main(String args[]) {
		printNameWithoutReturnType();
		String name = printNameWithReturnType();
		System.out.println("Your name (via return type) is "+ name);
	}
	
	public static void printNameWithoutReturnType() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the name of the user");
		String value = scn.nextLine();
		
		System.out.println("Your name is "+ value);
	}
	
	public static String printNameWithReturnType() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the name of the user");
		String value = scn.nextLine();
		
		System.out.println("Your name is "+ value);
		return value;
	}
}
