//Basics.java

import java.util.*;

public class Basics{
	
	private final String RESET = "\u001B[0m";
	private final String RED = "\u001B[31m";
	private final String GREEN = "\033[1;32m";

	private Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		Basics basics = new Basics();
		basics.enterToContinue();
		basics.runError("This is a test error message");
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

	public String runDialogue(String text){
		return text;
	}//end runDialogue

}//end class
