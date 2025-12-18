//Basics.java

import java.util.*;

public class Basics{
	
	private final String RESET = "\u001B[0m";
	private final String RED = "\u001B[31m";
	private final String GREEN = "\033[1;32m";

	private Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		Basics basics = new Basics();
		basics.testMethods();
	}//end main

	protected void enterToContinue(){
		System.out.print("ENTER TO CONTINUE");
		input.nextLine();
	}//end enterToContinue

	protected void runError(String errorMessage){
		//final String RED = "\u001B[31m";
		//final String RESET = "\u001B[0m";
		System.out.println("=====ERROR=====\n" + RED + errorMessage + RESET);
		enterToContinue();
	}//end runError

	public String getChoice(){
		System.out.print("Enter your choice: ");
		return input.nextLine();
	}//end getChoice

	public void runDialogue(String text){
		System.out.println(GREEN + text + RESET);
	}//end runDialogue

	private void testMethods(){
		System.out.print("Do you want to test Basics methods? (Y)");
		String choice = input.nextLine();
		if(choice.equals("Y")){
			System.out.println("\nenterToContinue:");
			enterToContinue();
			System.out.println("\nrunError:");
			runError("This is a Test");
			System.out.print("\ngetChoice:\n");
			String testChoice = getChoice();
			System.out.println("Returned: " + testChoice);
			System.out.println("\nrunDialogue:");
			runDialogue("This is a test");
			System.out.println("\nEnd of Test");
		}//end if
	}//end testMethods


}//end class
