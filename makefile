run:	Program
	java Program

Program: Program.java
	javac Program.java

save:
	git add *
	git commit *
	git push origin main
