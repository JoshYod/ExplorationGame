run:	Program.class
	java Program

Program.class: Program.java
	javac Program.java

runDave: Dave.class
	java Dave

Dave.class: Dave.java NPC.class
	javac Dave.java

NPC.class: NPC.java
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
