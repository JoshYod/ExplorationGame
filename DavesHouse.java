//DavesHouse.java

class DavesHouse extends Area{

	private String name = "Dave's House";

	public static void main(String[] args){
		System.out.println("initializing...");
		DavesHouse davesHouse = new DavesHouse();
		davesHouse.run();
	}//end main
	
	public void run(){
		while(true){
			System.out.println("-===-<" + name + ">-===-");
			System.out.print("""
					1. Talk to Dave
					"""
					);
			String choice = getChoice();
			if(choice.equals("1")){
				Dave dave = new Dave();
				dave.run();
			}//end if
			else if(choice.equals("q")){
				break;
			}//end elif
			else{
				runError("ENTER A VALID OPTION");
			}//end else
		}//end while	
	}//end run

}//end class
