import java.util.*;

abstract class NPC extends Basics{

    private Scanner input = new Scanner(System.in);	
    String name = "";
    boolean discovered = false;

    abstract public void run();

    abstract public void startDialogue();
    
/*    public String getChoice(){
	    System.out.print("Enter your choice: ");
	    return input.nextLine();
    }//end getChoice
*/
}//end abstract
