import java.util.*;

class Dave extends NPC{

    private String name = "Dave";
    private Scanner input = new Scanner(System.in);


    public static void main(String[] args){
        System.out.println("Dave");
	Dave dave = new Dave();
	dave.run();
    }//end main

    public void run(){
        while(true){
		System.out.println("-=-=-<Dave>-=-=-");
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
