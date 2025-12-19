//Area.java

import java.util.ArrayList;

abstract class Area extends Basics{

	ArrayList<Area> connectedAreas = new ArrayList<>();
	ArrayList<NPC> npcs = new ArrayList<>();

	String name = "";

	boolean discovered = false;

	public void run();

	abstract void displayOptions(){}//end displayOptions

}//end Area
