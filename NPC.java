import java.util.*;

abstract class NPC extends Basics{

    String name = "";
    boolean discovered = false;

    abstract public void run();

    abstract public void startDialogue();
    
}//end abstract
