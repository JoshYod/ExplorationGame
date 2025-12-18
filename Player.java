//Player.java

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Player extends Basics{

	private String name;
	private ArrayList<String> inventory = new ArrayList<String>();
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		Player player = new Player("test");
		player.start();
	}//end main
	
	public void start(){
		while(true){
			System.out.print("""
					1. Test Display Inventory
					0. Quit
					"""
					);
			String choice = getChoice();
			if(choice.equals("1")){
				inventory.add("Apple");
				inventory.add("Orange");
				inventory.add("Banana");
				displayInventory();
			}//end if
			else if(choice.equals("0")){
				break;
			}//end elif
			else{
				runError("ENTER A VALID OPTION");
			}//end else
		}//end while
	}//end main

	public Player(){
		System.out.print("Enter a name for your character:");
		name = input.nextLine();
	}//end constuctor
	
	public Player(String tempName){
		name = tempName;
	}//end constructor(1)
	
	public void displayInventory(){
		Iterator<String> it = inventory.iterator();
		int counter = 1;
		while(it.hasNext()){
			System.out.print("\n" + counter + ". " + it.next());
			counter++;
		}//end while
		System.out.println();
		inventory.clear();
		enterToContinue();
		System.out.println();
	}//end displayInventory	

}//end class
