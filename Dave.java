import java.util.*;

class Dave extends NPC{

    public static void main(String[] args){
        System.out.println("Dave");
	Dave dave = new Dave();
	dave.run();
    }//end main

    Dave(){
	name = "Dave";
    }//end constructor


    public void startDialogue(){
        while(true){
		System.out.println("""
				------------------------------
				1. What is this place?
				2. Who are you?
				0. Leave
				"""
				);
		String choice = getChoice();
		if(choice.equals("0")){
			break;
		}//end if
		else if(choice.equals("1")){
			System.out.println("This is my house... what are you doing here?");
			enterToContinue();
		}//end elif
		else if(choice.equals("2")){
			System.out.println("I could be asking you the same question.");
			enterToContinue();
		}//end elif
		else{
			runError("ENTER A VALID OPTION");
		}//end else
	}//end while
    }//end startDialogue

}//end class
