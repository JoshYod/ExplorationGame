run: Program.class
	java Program

Program.class: Program.java DavesHouse.class
	javac Program.java

runDavesHouse: DavesHouse.class
	java DavesHouse

runDave: Dave.class
	java Dave

DavesHouse.class: DavesHouse.java Area.class Dave.class
	javac DavesHouse.java

Dave.class: Dave.java NPC.class
	javac Dave.java

Area.class: Area.java Basics.class
	javac Area.java

NPC.class: NPC.java Basics.class
	javac NPC.java

runBasics: Basics.class
	java Basics

Basics.class: Basics.java
	javac Basics.java

clean:
	rm *.class

save:
	git add *
	git commit *
	git push origin main

cleanSave:
	make clean
	git add *
	git commit -a
	git push origin main
