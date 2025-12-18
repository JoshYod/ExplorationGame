import java.util.*;

abstract class NPC extends Basics{

    String name = "";
    boolean discovered = false;

    public void run(){
	System.out.println();
	while(true){
		System.out.println("-=-=-" + name + "-=-=-");
		System.out.print("""
				1. Talk
				0. Leave
				"""
				);
		String choice = getChoice();
		if(choice.equals("1")){
			startDialogue();
		}//end if
		else if(choice.equals("0")){
			break;
		}//end elif
		else{
			runError("ENTER A VALID OPTION");
		}//end else
	}//end while
    }//end run

    abstract public void startDialogue();
    
}//end abstract
