ANTLR_HOME=../../antlr-3.0b4
CP=".;$(ANTLR_HOME)/lib/antlr-2.7.6.jar;$(ANTLR_HOME)/lib/antlr-3.0b4.jar;$(ANTLR_HOME)/lib/stringtemplate-2.3b9.jar"
ANTLR_TOOL=org.antlr.Tool
all: generate build
generate:
	java -classpath  $(CP) $(ANTLR_TOOL) html.g
build:
	javac -classpath  $(CP) *.java
run:
	java -classpath  $(CP) Main test.html
clean:
	rm -f *.tokens
	rm -f *.class
	rm -f HtmlDoc*.java
	rm -f *~
	rm -f *.lexer.g
