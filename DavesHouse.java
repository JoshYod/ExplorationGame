//DavesHouse.java

class DavesHouse{

	private String name = "Dave's House";

	public static void main(String[] args){
		System.out.println("initializing...");
		DavesHouse davesHouse = new DavesHouse();
		davesHouse.run();
	}//end main
	
	public void run(){
		System.out.println("-===-<" + name + ">-===-");
	}//end run

}//end class
