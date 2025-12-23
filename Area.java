//Area.java

import java.util.ArrayList;

abstract class Area extends Basics{

	ArrayList<Area> connectedAreas = new ArrayList<>();
	ArrayList<NPC> npcs = new ArrayList<>();

	String name = "";

	boolean discovered = false;

	abstract public void run();

	abstract void displayOptions(){
		while(true){
			System.out.println("-===-<" + name + ">-===-");
			System.out.print("""
					1. Travel
					2. Interact with NPCs
					3. View Inventory
					0. QUIT
					"""
					);
			String choice = getChoice();
			switch (choice) {
				case "1" -> {

				}//end case
				case "2" -> {

				}//end case
				case "3" -> {

				}//end case
				case "0" -> {
					
				}//end case
				default -> runError("ENTER A VALID OPTION");
			}//end switch
		}//end while
	}//end displayOptions

}//end Area