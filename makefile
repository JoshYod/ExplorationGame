run:	Program
	java Program

Program: Program.java
	javac Program.java

clean:
	rm *.class

save:
	git add *
	git commit *
	git push origin main
