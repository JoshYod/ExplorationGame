import java.util.*;

public class Program extends Basics{

	public static void main(String[] args){
		Program program = new Program();
		program.start();
	}//end main

	public void start(){

		System.out.println("""
		\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
================================================================================
|||||| ||   || |||||||  ||     |||||| ||||||   ||||  |||||| |||||| |||||| ||  ||
||      || ||  ||    || ||     ||  || ||   || ||  ||   ||     ||   ||  || ||| ||    
||||     |||   |||||||  ||     ||  || ||||||  ||||||   ||     ||   ||  || ||||||
||      || ||  ||       ||     ||  || ||   || ||  ||   ||     ||   ||  || || |||    
|||||| ||   || ||    	|||||| |||||| ||   || ||  ||   ||   |||||| |||||| ||  ||    

||||||  ||||  ||    || ||||||
||     ||  || |||||||| ||
|| ||| |||||| || || || ||||
||  || ||  || ||    || ||
|||||| ||  || ||    || ||||||                                  Pre-Release V0.01
================================================================================
			"""	);//EXPLORATION GAME

		while(true){
			System.out.println("""
					=====MAIN MENU=====
					1. Begin
					2. Test
					0. Quit
					""");
			String choice = getChoice();
			if(choice.equals("1")){
				System.out.println("Currently not available");
			}//end if
			else if(choice.equals("2")){
				System.out.println("Initializing test instance");
				DavesHouse dh = new DavesHouse();
				dh.run();
			}//end elif
			else if(choice.equals("0")){
				System.out.println("Thanks for playing!");
				break;
			}//end elif
			else{
				runError("ENTER A VALID OPTION");
			}//end else
		}//end while

	}//end start
	
	

}//end class
